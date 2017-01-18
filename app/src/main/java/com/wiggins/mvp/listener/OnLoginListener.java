package com.wiggins.mvp.listener;

/**
 * @Description 登录回调接口
 * @Author 一花一世界
 * @Time 2017/1/17 17:35
 */

public interface OnLoginListener {

    //用户名为空
    void onUsernameEmpty();

    //密码为空
    void onPasswordEmpty();

    //用户名错误
    void onUsernameError();

    //密码错误
    void onPasswordError();

    //登录成功
    void onSuccess();

    //登录失败
    void onFailure();
}
