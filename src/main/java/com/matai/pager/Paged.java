package com.matai.pager;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.github.pagehelper.Page;

import java.util.List;

/**
 * Created by shiweiliu on 2017/1/10.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Paged<T> {

    public static final String PAGE_SIZE = "10";

    private List<T> results;

    private Long count;

    private Integer next;

    private Integer previous;

    private Integer pageNum;

    private Integer pageSize;

    private Integer pages;

    public Paged(Page<T> page) {
        this.pageNum = page.getPageNum();
        this.pageSize = page.getPageSize();
        this.pages = page.getPages();
        this.results = page;
        this.count = page.getTotal();
        calcPage();
    }

    private void calcPage() {
        if (this.pageNum > 1) {
            this.previous = this.pageNum - 1;
        }

        if (this.pageNum < this.pages) {
            this.next = this.pageNum + 1;
        }
    }

    public List<T> getResults() {
        return results;
    }

    public void setResults(List<T> results) {
        this.results = results;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Integer getNext() {
        return next;
    }

    public void setNext(Integer next) {
        this.next = next;
    }

    public Integer getPrevious() {
        return previous;
    }

    public void setPrevious(Integer previous) {
        this.previous = previous;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

}
