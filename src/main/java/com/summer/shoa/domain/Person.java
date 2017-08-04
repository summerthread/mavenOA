package com.summer.shoa.domain;

import java.io.Serializable;

/**
 * Created by p2p on 2017/8/4.
 */
public class Person implements Serializable {
    private Long pid;//标识符属性
    private String name;

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
