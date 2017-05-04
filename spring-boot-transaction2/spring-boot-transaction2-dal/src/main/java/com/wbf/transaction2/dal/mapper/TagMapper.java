/*
 * *
 *  * Copyright (c) ${year} Wantu, All rights reserved.
 *
 */
package com.wbf.transaction2.dal.mapper;

import com.wbf.transaction2.dal.dto.TagDO;

/**
 * @author wbf
 * @since 16/9/7
 */
public interface TagMapper {

    int insert(TagDO record);

    TagDO findByName(String name);

    void insertOther(TagDO tagDO);
}
