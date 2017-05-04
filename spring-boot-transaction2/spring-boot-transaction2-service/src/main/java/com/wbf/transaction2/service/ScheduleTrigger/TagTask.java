/**
 * Copyright (c) 2017 Wantu, All rights reserved.
 */
package com.wbf.transaction2.service.ScheduleTrigger;

import com.wbf.transaction2.service.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author wbf
 * @since 2017/5/2
 */
@Component
public class TagTask {

    @Autowired
    private TagService tagService;

    //@Scheduled(initialDelay = 1000, fixedDelay = 10000000)
    public void start() {
        tagService.doTask();
    }
}
