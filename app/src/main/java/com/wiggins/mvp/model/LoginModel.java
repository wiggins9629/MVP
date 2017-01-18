package com.wiggins.mvp.model;

import com.wiggins.mvp.listener.OnLoginListener;

/**
 * @Description 登录操作接口
 * @Author 一花一世界
 * @Time 2017/1/17 16:17
 */

public interface LoginModel {

    void login(String name, String password, OnLoginListener onLoginListener);
}
