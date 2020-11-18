package com.common.utils;

import com.common.pojo.ReqParam;
import com.common.pojo.RespBean;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import lombok.Data;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@Data
public class PageUtil<T> implements Serializable {
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


    public PageUtil() {
    }

    /**
     *	 开始分页
     */
    public static void startPage(ReqParam param){
        CommonException.verifyObjects(param.getPageNum(),param.getPageSize());
        PageHelper.startPage(param.getPageNum()/param.getPageSize()+1,param.getPageSize());
    }
    public static void startPage(int pageNum,int pageSize){
        CommonException.verifyObjects(pageNum,pageSize);
        PageHelper.startPage(pageNum/pageSize+1,pageSize);
    }

    /**
     * 分页数据
     * @param data
     * @param <T>
     * @return
     */
    public static <T> RespBean dataPage(List<T> data){
        return RespBean.success(new PageUtil<T>(data));
    }

    /**
     * 	包装Page对象
     *
     * @param list
     */
    public PageUtil(List<T> list) {
        if (list instanceof Page) {
            Page page = (Page) list;
            this.pageNum = page.getPageNum();
            this.pageSize = page.getPageSize();

            this.pages = page.getPages();
            this.list = page;
            this.total = page.getTotal();
        } else if (list instanceof Collection) {
            this.pageNum = 1;
            this.pageSize = list.size();

            this.pages = 1;
            this.list = list;
            this.total = list.size();
        }
        if (list instanceof Collection) {
            //判断页面边界
            judgePageBoundary();
        }
    }

    /**
     * 	判定页面边界
     */
    private void judgePageBoundary() {
        isFirstPage = pageNum == 1;
        isLastPage = pageNum == pages;
    }
}