package com.search.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.common.pojo.ReqParam;
import com.common.pojo.RespBean;
import com.common.utils.CommonException;
import com.search.mapper.SearchMapper;
import com.search.pojo.UserInfosBo;
import com.search.service.EsRepository;
import com.search.service.SearchService;
import com.search.utils.SearchPageUtil;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.aggregations.Aggregations;
import org.elasticsearch.search.aggregations.bucket.terms.ParsedLongTerms;
import org.elasticsearch.search.aggregations.metrics.ParsedSum;
import org.elasticsearch.search.sort.SortBuilders;
import org.elasticsearch.search.sort.SortOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.core.query.FetchSourceFilterBuilder;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchServiceImpl implements SearchService {
    @Autowired
    EsRepository esRepository;

    @Autowired
    ElasticsearchRestTemplate template;

    @Autowired
    SearchMapper searchMapper;

    @Override
    public RespBean delIndex(ReqParam param){
        return RespBean.success(template.deleteIndex(param.getName()));
    }

    @Override
    public RespBean findById(Integer id) {
        CommonException.verifyObjects(id);
        return RespBean.success(esRepository.findById(id));
    }

    @Override
    public RespBean findAllUser(ReqParam param) {
        if(!StringUtils.hasLength(param.getName())){
            return RespBean.success(SearchPageUtil.dataPage(esRepository.findAll(SearchPageUtil.getPageable(param))));
        }
        return RespBean.success(SearchPageUtil.dataPage(esRepository.findByUserName(param.getName(), SearchPageUtil.getPageable(param))));
    }

    @Override
    public RespBean findAllUserDiff(ReqParam param){
        // 构造查询条件
        NativeSearchQueryBuilder queryBuilder = new NativeSearchQueryBuilder();
        if(!StringUtils.isEmpty(param.getName())){
            queryBuilder.withQuery(QueryBuilders.matchQuery("userName", param.getName()));
        }
        queryBuilder.withSort(SortBuilders.fieldSort("id").order(SortOrder.DESC));
        queryBuilder.addAggregation(AggregationBuilders.terms("states").field("state")
                    .subAggregation(AggregationBuilders.sum("ids").field("id"))
                )
                //结果集过滤  这里设置不需要结果集(不添加包含与不包含,会自动生成length为0数组)
                .withSourceFilter(new FetchSourceFilterBuilder().build())
                ;
        SearchHits<UserInfosBo> searchHits = template.search(queryBuilder.build(),UserInfosBo.class);
        System.out.println(JSONObject.toJSONString(searchHits));
        Aggregations aggregations = searchHits.getAggregations();
        if(aggregations == null){
            return RespBean.success(searchHits);
        }
        ParsedLongTerms states = aggregations.get("states");
        System.out.println(JSONObject.toJSONString(states));
        states.getBuckets().forEach(buket -> {
            System.out.println(buket.getKey()+"_"+buket.getDocCount());
            ParsedSum sum = buket.getAggregations().get("ids");
            System.out.println(sum.getValue());
        });
        return RespBean.success(aggregations);
    }

    @Override
    public RespBean addUserAll() {
        List<UserInfosBo> userInfosBos = searchMapper.findAllUser();
        esRepository.saveAll(userInfosBos);
        return RespBean.success();
    }

    @Override
    public RespBean addUser(UserInfosBo userInfosBo) {
        CommonException.verifyObjects(userInfosBo);
        esRepository.save(userInfosBo);
        return RespBean.success();
    }

    @Override
    public RespBean addAllUser(List<UserInfosBo> UserInfosBoBos) {
        CommonException.verifyObjects(UserInfosBoBos);
        esRepository.saveAll(UserInfosBoBos);
        return RespBean.success();
    }

    @Override
    public RespBean delUser(UserInfosBo userInfosBo) {
        CommonException.verifyObjects(userInfosBo.getId());
        esRepository.delete(userInfosBo);
        return RespBean.success();
    }

    @Override
    public RespBean delAllUser(List<Integer> ids) {
        CommonException.verifyObjects(ids);
        List<UserInfosBo>  userInfosBos = new ArrayList<>();
        for(Integer id : ids){
            UserInfosBo userInfosBo = new UserInfosBo();
            userInfosBo.setId(id);
            userInfosBos.add(userInfosBo);
        }
        esRepository.deleteAll(userInfosBos);
        return RespBean.success();
    }
}
