package com.matai.service.impl;

import com.matai.dao.IWebsiteDao;
import com.matai.model.website;
import com.matai.service.IWebsiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebsiteServiceImpl implements IWebsiteService {

    @Autowired
    private IWebsiteDao websiteDao;

    @Override
    public int insert(website record) {
        return websiteDao.insert(record);
    }
}
