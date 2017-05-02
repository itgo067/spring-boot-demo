/*
 * *
 *  * Copyright (c) ${year} Wantu, All rights reserved.
 *
 */
package com.wbf.spring.boot.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wbf
 * @since 16/9/6
 */
public class TagDO implements Serializable {

    private static final long serialVersionUID = 6842103628669912184L;

    private Long id;

    private String name;

    private String url;

    private int status;

    private Date gmtCreate;

    private Date gmtModify;

    public TagDO() {

    }

    public TagDO(String name, String url, int status, Date gmtCreate, Date gmtModify) {
        this.name = name;
        this.url = url;
        this.status = status;
        this.gmtCreate = gmtCreate;
        this.gmtModify = gmtModify;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }

    @Override
    public String toString() {
        return "TagDO{" + "id=" + id + ", name='" + name + '\'' + ", url='" + url + '\'' + ", status=" + status
               + ", gmtCreate=" + gmtCreate + ", gmtModify=" + gmtModify + '}';
    }
}
