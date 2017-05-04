/**
 * Copyright (c) 2017 Wantu, All rights reserved.
 */
package com.wbf.spring.boot.controller;

import com.wbf.spring.boot.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wbf
 * @since 2017/5/4
 */
@RestController
public class HelloController {

    @Autowired
    private TagService tagService;

    @GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void hello() {
        tagService.doTask();
    }
}
