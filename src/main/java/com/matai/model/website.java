package com.matai.model;

public class website {
    private Integer id;

    private String name;

    private String url;

    private Integer assortment;

    private String domain;

    private String useragent;

    private String savedir;

    private String cookie;

    private String referer;

    private String listurlregex;

    private String listxpath;

    private String titlexpath;

    private String contenturlregex;

    private String contentxpath;

    private String abstractxpath;

    private Integer status;

    private String datexpath;

    private String dateregex;

    private Integer sleeptime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getAssortment() {
        return assortment;
    }

    public void setAssortment(Integer assortment) {
        this.assortment = assortment;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain == null ? null : domain.trim();
    }

    public String getUseragent() {
        return useragent;
    }

    public void setUseragent(String useragent) {
        this.useragent = useragent == null ? null : useragent.trim();
    }

    public String getSavedir() {
        return savedir;
    }

    public void setSavedir(String savedir) {
        this.savedir = savedir == null ? null : savedir.trim();
    }

    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie == null ? null : cookie.trim();
    }

    public String getReferer() {
        return referer;
    }

    public void setReferer(String referer) {
        this.referer = referer == null ? null : referer.trim();
    }

    public String getListurlregex() {
        return listurlregex;
    }

    public void setListurlregex(String listurlregex) {
        this.listurlregex = listurlregex == null ? null : listurlregex.trim();
    }

    public String getListxpath() {
        return listxpath;
    }

    public void setListxpath(String listxpath) {
        this.listxpath = listxpath == null ? null : listxpath.trim();
    }

    public String getTitlexpath() {
        return titlexpath;
    }

    public void setTitlexpath(String titlexpath) {
        this.titlexpath = titlexpath == null ? null : titlexpath.trim();
    }

    public String getContenturlregex() {
        return contenturlregex;
    }

    public void setContenturlregex(String contenturlregex) {
        this.contenturlregex = contenturlregex == null ? null : contenturlregex.trim();
    }

    public String getContentxpath() {
        return contentxpath;
    }

    public void setContentxpath(String contentxpath) {
        this.contentxpath = contentxpath == null ? null : contentxpath.trim();
    }

    public String getAbstractxpath() {
        return abstractxpath;
    }

    public void setAbstractxpath(String abstractxpath) {
        this.abstractxpath = abstractxpath == null ? null : abstractxpath.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDatexpath() {
        return datexpath;
    }

    public void setDatexpath(String datexpath) {
        this.datexpath = datexpath == null ? null : datexpath.trim();
    }

    public String getDateregex() {
        return dateregex;
    }

    public void setDateregex(String dateregex) {
        this.dateregex = dateregex == null ? null : dateregex.trim();
    }

    public Integer getSleeptime() {
        return sleeptime;
    }

    public void setSleeptime(Integer sleeptime) {
        this.sleeptime = sleeptime;
    }
}