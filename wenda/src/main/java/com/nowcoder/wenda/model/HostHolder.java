package com.nowcoder.wenda.model;

import org.springframework.stereotype.Component;


@Component
public class HostHolder {
    //为每一条线程都分配了一个User对象
    private static ThreadLocal<User> users = new ThreadLocal<User>();
    //根据当前线程找到当前线程保存关联的User对象
    public User getUser() {
        return users.get();
    }
    public void setUser(User user) {
        users.set(user);
    }
    public void clear() {
        users.remove();
    }
}
