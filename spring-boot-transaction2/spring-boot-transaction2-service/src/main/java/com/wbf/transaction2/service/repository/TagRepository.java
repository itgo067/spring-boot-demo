/**
 * Copyright (c) 2017 Wantu, All rights reserved.
 */
package com.wbf.transaction2.service.repository;

import com.wbf.transaction2.dal.dto.TagDO;
import com.wbf.transaction2.dal.mapper.TagMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author wbf
 * @since 2017/5/2
 */
@Repository
public class TagRepository {

    @Autowired
    private TagMapper tagMapper;

    public long insert(TagDO tagDO) {
        tagMapper.insert(tagDO);
        return tagDO.getId();
    }

    public TagDO findByName(String name) {
        return tagMapper.findByName(name);
    }

    public void insertOther(TagDO tagDO) {
        tagMapper.insertOther(tagDO);
    }
}
