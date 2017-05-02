/**
 * Copyright (c) 2017 Wantu, All rights reserved.
 */
package com.wbf.spring.boot.ScheduleTrigger;

import com.wbf.spring.boot.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author wbf
 * @since 2017/5/2
 */
@Component
public class TagTask {

    @Autowired
    private TagService tagService;

    @Scheduled(initialDelay = 1000, fixedDelay = 10000000)
    public void start() {
        tagService.doTask();
    }
}
