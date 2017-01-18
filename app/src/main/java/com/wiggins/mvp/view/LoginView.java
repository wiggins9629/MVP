package com.wiggins.mvp.view;

import android.content.Context;

/**
 * @Description 登录View接口
 * @Author 一花一世界
 * @Time 2017/1/17 16:18
 */

public interface LoginView {

    //上下文
    Context getContext();

    //登录成功后跳转到首页
    void moveToIndex();

    //Toast提示
    void showToast(String msg);

    //获取界面的用户名
    String getName();

    //获取界面的密码
    String getPassword();
}
