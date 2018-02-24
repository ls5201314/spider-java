package com.matai.spider;

import com.matai.entity.WebSite;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

/**
 * 通用的资讯采集器
 * @author lsp
 *
 */
public class CommonSpider implements PageProcessor {

	private WebSite webSite;
	private Site site = Site.me();
	
	public CommonSpider(WebSite webSite){
		this.webSite = webSite;
		site.setSleepTime(webSite.getSleepTime());
		if(null != webSite.getDomain()){
			site.setDomain(webSite.getDomain());
		}
		if(null != webSite.getUserAgent()){
			site.setUserAgent(webSite.getUserAgent());
		}
	}

	@Override
	public void process(Page page) {
		String listRegex = webSite.getListUrlRegex();
		String contentUrlRegex = webSite.getContentUrlRegex();
		String listXPath = webSite.getListXPath();
		String titleXPath = webSite.getTitleXPath();
		String contentXPath = webSite.getContentXPath();
		String dateXPath = webSite.getDateXPath();
		String dateRegex = webSite.getDateRegex();
        //列表页
        if (page.getUrl().regex(listRegex).match()) {
            page.addTargetRequests(page.getHtml().xpath(listXPath).links().regex(contentUrlRegex).all());
            page.addTargetRequests(page.getHtml().links().regex(listRegex).all());
            //文章页
        } else {
            page.putField("title", page.getHtml().xpath(titleXPath));
            page.putField("content", page.getHtml().xpath(contentXPath));
            page.putField("date",page.getHtml().xpath(dateXPath).regex(dateRegex));
        }
	}

	@Override
	public Site getSite() {
		return site;
	}

}
