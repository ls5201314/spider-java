package com.matai.controller;


import com.matai.model.website;
import com.matai.service.IWebsiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.matai.entity.WebSite;

@Controller
@RequestMapping("website")
public class WebSiteController extends BaseController{

	@Autowired
	private IWebsiteService websiteService;

    @RequestMapping("/")
    String index(){
    	return "index";
    }

    @RequestMapping("/list")
    String list(){
 /*   	List<WebSite> webSite = webSiteMapper.getList();
    	for(WebSite site : webSite){
            Spider.create(new CommonSpider(site)).addUrl(site.getUrl()).addPipeline(new JsonFilePipeline(site.getSaveDir())).run();
    	}*/

    	return "list";
    }

    @RequestMapping("/add")
    String add(WebSite webSite){
    	webSite = new WebSite();
    	webSite.setName("钢易网资讯");
    	webSite.setContentXPath("//div[@class='lct']//div[@class='content']");
    	webSite.setContentUrlRegex("http://www\\.gtgqw\\.com/showgc\\w+\\.html");
    	webSite.setListUrlRegex("http://www\\.gtgqw\\.com/second/dongtai+\\.html");
    	webSite.setListXPath("//div[@class=\"left\"]");
    	webSite.setSaveDir("D:\\webmagic\\");
    	webSite.setTitleXPath("//div[@class='title']/h1");
    	webSite.setDateXPath("//div[@class='changgui']");
    	webSite.setDateRegex("\\d{4}-\\d{1,2}-\\d{1,2}");
    	webSite.setUrl("http://www.gtgqw.com/second/dongtai.html");
    	//webSiteMapper.add(webSite);

    	webSite = new WebSite();
    	webSite.setName("新浪博客");
    	webSite.setContentXPath("//div[@id='articlebody']//div[@class='articalContent']");
    	webSite.setContentUrlRegex("http://blog\\.sina\\.com\\.cn/s/blog_\\w+\\.html");
    	webSite.setListUrlRegex("http://blog\\.sina\\.com\\.cn/s/articlelist_1487828712_0_\\d+\\.html");
    	webSite.setListXPath("//div[@class=\"articleList\"]");
    	webSite.setSaveDir("D:\\webmagic\\");
    	webSite.setTitleXPath("//div[@class='articalTitle']/h2");
    	webSite.setDateXPath("//div[@id='articlebody']//span[@class='time SG_txtc']");
    	webSite.setDateRegex("\\((.*)\\)");
    	webSite.setUrl("http://blog.sina.com.cn/s/articlelist_1487828712_0_1.html");
    	webSite.setDomain("blog.sina.com.cn");
    	webSite.setUserAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_7_2) AppleWebKit/537.31 (KHTML, like Gecko) Chrome/26.0.1410.65 Safari/537.31");
    	webSite.setSleepTime(3000);
    	//webSiteMapper.add(webSite);

    	return "add";
    }
    
    @RequestMapping("/update")
    String update(WebSite webSite){
    	//webSiteMapper.update(webSite);
    	return "update";
    }

    @RequestMapping("/delete")
    String delete(WebSite webSite){
    	//webSiteMapper.deleteById(webSite.getId());
    	return "delete";
    }

	/**
	 * @api {get} /system/backupTime 查询所有备份时间选项
	 * @apiName getAllBackupTime
	 * @apiGroup BackupTime
	 * @apiVersion 1.0.0
	 * @apiSuccess {List} data 所有备份时间选项
	 */
	@GetMapping()
	public ResponseEntity<?> add() {
		website webSite = new website();
		webSite.setName("新浪博客");
		webSite.setContentxpath("//div[@id='articlebody']//div[@class='articalContent']");
		webSite.setContenturlregex("http://blog\\.sina\\.com\\.cn/s/blog_\\w+\\.html");
		webSite.setListurlregex("http://blog\\.sina\\.com\\.cn/s/articlelist_1487828712_0_\\d+\\.html");
		webSite.setListxpath("//div[@class=\"articleList\"]");
		webSite.setSavedir("D:\\webmagic\\");
		webSite.setTitlexpath("//div[@class='articalTitle']/h2");
		webSite.setDatexpath("//div[@id='articlebody']//span[@class='time SG_txtc']");
		webSite.setDateregex("\\((.*)\\)");
		webSite.setUrl("http://blog.sina.com.cn/s/articlelist_1487828712_0_1.html");
		webSite.setDomain("blog.sina.com.cn");
		webSite.setUseragent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_7_2) AppleWebKit/537.31 (KHTML, like Gecko) Chrome/26.0.1410.65 Safari/537.31");
		webSite.setSleeptime(3000);
        webSite.setStatus(1);
		return success(websiteService.insert(webSite));
	}

}
