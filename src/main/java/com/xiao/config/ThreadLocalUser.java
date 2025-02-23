package com.xiao.config;

import com.xiao.dao.dto.CpcUser;

public class ThreadLocalUser {
    private static final ThreadLocal<CpcUser> me = new ThreadLocal<>();
    public void set(CpcUser user) {
        me.set(user);
    }
    public CpcUser get() {
        return me.get();
    }
}