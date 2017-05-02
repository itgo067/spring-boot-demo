/**
 * Copyright (c) 2017 Wantu, All rights reserved.
 */
package com.wbf.spring.boot.service;

import com.wbf.spring.boot.dto.TagDO;
import com.wbf.spring.boot.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @author wbf
 * @since 2017/5/2
 */
@Service
public class TagServiceImpl implements TagService {

    @Autowired
    private TagRepository tagRepository;

     //@Transactional
    public void doTask() {
        doTask1();
        //
        //        TagDO tagDO = new TagDO("test", "http://www.baidu.com", 1, new Date(), new Date());
        //        tagRepository.insert(tagDO);
        //        tagDO = new TagDO("test2", "http://www.baidu.com", 1, new Date(), new Date());
        //        //throw new RuntimeException("ddddd");
        //        //tagRepository.insert(tagDO);
        //        tagRepository.insertOther(tagDO);
        //        //tagRepository.findByName("test2");
    }

    @Transactional
    private void doTask1() {
        TagDO tagDO = new TagDO("test", "http://www.baidu.com", 1, new Date(), new Date());
        tagRepository.insert(tagDO);
        tagDO = new TagDO("test2", "http://www.baidu.com", 1, new Date(), new Date());
        //throw new RuntimeException("ddddd");
        //tagRepository.insert(tagDO);
        tagRepository.insertOther(tagDO);
        //tagRepository.findByName("test2");
    }
}
