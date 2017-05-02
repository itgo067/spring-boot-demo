/*
 * *
 *  * Copyright (c) ${year} Wantu, All rights reserved.
 *
 */
package com.wbf.spring.boot.mapper;

import com.wbf.spring.boot.dto.TagDO;

/**
 * @author wbf
 * @since 16/9/7
 */
public interface TagMapper {

    int insert(TagDO record);

    TagDO findByName(String name);

    void insertOther(TagDO tagDO);
}
