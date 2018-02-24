package com.matai.dao;

import com.matai.model.website;

public interface IWebsiteDao {
    int deleteByPrimaryKey(Integer id);

    int insert(website record);

    int insertSelective(website record);

    website selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(website record);

    int updateByPrimaryKey(website record);
}