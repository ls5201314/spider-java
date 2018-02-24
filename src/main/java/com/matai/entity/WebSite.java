package com.matai.entity;

import java.io.Serializable;

/**
 * 采集的实体对象
 * @author lsp
 *
 */
public class WebSite implements Serializable{

	private static final long serialVersionUID = 1L;

	private int id;
	
	private String name;
	
	private String url;
	
	private int assortment;//分类:新闻、论坛、博客等
	
	private String domain;
	
	private String userAgent;
	
	private String saveDir; //保存采集结果的目录
	
	private String cookie;
	
	private String referer;
	
	private String listUrlRegex; // 列表的正则
	
	private String listXPath; // 列表的html路径
	
	private String titleXPath;

	private String contentUrlRegex; // 内容的正则

	private String contentXPath; // 内容的html路径
	
	private String abstractXPath; // 摘要的html路径
	
	private String dateXPath;
	
	private String dateRegex;
	
	private int status;
	
	private int sleepTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getAssortment() {
		return assortment;
	}

	public void setAssortment(int assortment) {
		this.assortment = assortment;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getUserAgent() {
		return userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	public String getSaveDir() {
		return saveDir;
	}

	public void setSaveDir(String saveDir) {
		this.saveDir = saveDir;
	}

	public String getCookie() {
		return cookie;
	}

	public void setCookie(String cookie) {
		this.cookie = cookie;
	}

	public String getReferer() {
		return referer;
	}

	public void setReferer(String referer) {
		this.referer = referer;
	}

	public String getListUrlRegex() {
		return listUrlRegex;
	}

	public void setListUrlRegex(String listUrlRegex) {
		this.listUrlRegex = listUrlRegex;
	}

	public String getListXPath() {
		return listXPath;
	}

	public void setListXPath(String listXPath) {
		this.listXPath = listXPath;
	}

	public String getContentUrlRegex() {
		return contentUrlRegex;
	}

	public void setContentUrlRegex(String contentUrlRegex) {
		this.contentUrlRegex = contentUrlRegex;
	}

	public String getContentXPath() {
		return contentXPath;
	}

	public void setContentXPath(String contentXPath) {
		this.contentXPath = contentXPath;
	}

	public String getAbstractXPath() {
		return abstractXPath;
	}

	public void setAbstractXPath(String abstractXPath) {
		this.abstractXPath = abstractXPath;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getTitleXPath() {
		return titleXPath;
	}

	public void setTitleXPath(String titleXPath) {
		this.titleXPath = titleXPath;
	}

	public String getDateXPath() {
		return dateXPath;
	}

	public void setDateXPath(String dateXPath) {
		this.dateXPath = dateXPath;
	}

	public String getDateRegex() {
		return dateRegex;
	}

	public void setDateRegex(String dateRegex) {
		this.dateRegex = dateRegex;
	}

	public int getSleepTime() {
		return sleepTime;
	}

	public void setSleepTime(int sleepTime) {
		this.sleepTime = sleepTime;
	}

	@Override
	public String toString() {
		return "WebSite [id=" + id + ", name=" + name + ", url=" + url + ", assortment=" + assortment + ", domain="
				+ domain + ", userAgent=" + userAgent + ", saveDir=" + saveDir + ", cookie=" + cookie + ", referer="
				+ referer + ", listUrlRegex=" + listUrlRegex + ", listXPath=" + listXPath + ", titleXPath=" + titleXPath
				+ ", contentUrlRegex=" + contentUrlRegex + ", contentXPath=" + contentXPath + ", abstractXPath="
				+ abstractXPath + ", dateXPath=" + dateXPath + ", dateRegex=" + dateRegex + ", status=" + status
				+ ", sleepTime=" + sleepTime + "]";
	}


}
