/**
 * Copyright (c) 2017 Wantu, All rights reserved.
 */
package com.wbf.transaction2.service.service;

import com.wbf.transaction2.dal.dto.TagDO;
import com.wbf.transaction2.service.repository.TagRepository;
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
        try {
            doTask2();
        }catch (Throwable th) {
            th.printStackTrace();
        }
        //
        //        TagDO tagDO = new TagDO("test", "http://www.baidu.com", 1, new Date(), new Date());
        //        tagRepository.insert(tagDO);
        //        tagDO = new TagDO("test2", "http://www.baidu.com", 1, new Date(), new Date());
        //        //throw new RuntimeException("ddddd");
        //        //tagRepository.insert(tagDO);
        //        tagRepository.insertOther(tagDO);
        //        //tagRepository.findByName("test2");
    }

    private void doTask2() {
        doTask1();
    }

    @Transactional(rollbackFor = Exception.class)
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
