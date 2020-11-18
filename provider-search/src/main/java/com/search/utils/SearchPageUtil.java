package com.search.utils;

import com.common.pojo.ReqParam;
import com.common.pojo.RespBean;
import com.common.utils.PageUtil;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author xiaomi
 * @create 2020/11/17
 **/
public class SearchPageUtil<T> extends PageUtil {
    private static final long serialVersionUID = 1L;
    //当前页
    private int pageNum;
    //每页的数量
    private int pageSize;
    //总记录数
    private long total;
    //总页数
    private int pages;
    //结果集
    private List<T> list;
    //是否为第一页
    private boolean isFirstPage = false;
    //是否为最后一页
    private boolean isLastPage = false;

    public static Pageable getPageable(ReqParam param){
        if(param.getPageNum() == null || param.getPageNum() < 0){
            param.setPageNum(0);
        }
        if(param.getPageSize() == null|| param.getPageSize() <= 0){
            param.setPageSize(10);
        }
        return PageRequest.of(param.getPageNum(),param.getPageSize());
    }

    /**
     * 将SpringData分页后的list转为分页信息
     */
    public SearchPageUtil(Page pageInfo) {
        this.pages = pageInfo.getTotalPages();
        this.pageNum = pageInfo.getNumber()+1;
        this.pageSize=pageInfo.getSize();
        this.total=pageInfo.getTotalElements();
        this.list=pageInfo.getContent();
        this.isFirstPage = this.pageNum == 1;
        this.isLastPage = this.pageNum == pages;
    }

    /**
     * 分页数据
     * @param data
     * @param <T>
     * @return
     */
    public static <T> RespBean dataPage(Page data){
        return RespBean.success(new SearchPageUtil<T>(data));
    }
}
