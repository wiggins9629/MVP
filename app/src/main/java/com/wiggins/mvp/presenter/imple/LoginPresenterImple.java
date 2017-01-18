package com.wiggins.mvp.presenter.imple;


import com.wiggins.mvp.R;
import com.wiggins.mvp.listener.OnLoginListener;
import com.wiggins.mvp.model.LoginModel;
import com.wiggins.mvp.model.imple.LoginModelImple;
import com.wiggins.mvp.presenter.LoginPresenter;
import com.wiggins.mvp.view.LoginView;


/**
 * @Description 负责完成登录界面View与Model之间的交互
 * @Author 一花一世界
 * @Time 2017/1/17 17:31
 */

public class LoginPresenterImple implements LoginPresenter {

    private LoginModel loginModel;
    private LoginView loginView;

    public LoginPresenterImple(LoginView loginView) {
        this.loginView = loginView;
        loginModel = new LoginModelImple();
    }

    @Override
    public void onLoginInfo() {
        String name = loginView.getName();
        String password = loginView.getPassword();
        loginModel.login(name, password, new OnLoginListener() {
            @Override
            public void onUsernameEmpty() {
                loginView.showToast(loginView.getContext().getResources().getString(R.string.name_not_empty));
            }

            @Override
            public void onPasswordEmpty() {
                loginView.showToast(loginView.getContext().getResources().getString(R.string.password_not_empty));
            }

            @Override
            public void onUsernameError() {
                loginView.showToast(loginView.getContext().getResources().getString(R.string.name_error));
            }

            @Override
            public void onPasswordError() {
                loginView.showToast(loginView.getContext().getResources().getString(R.string.password_error));
            }

            @Override
            public void onSuccess() {
                loginView.showToast(loginView.getContext().getResources().getString(R.string.login_successful));
                loginView.moveToIndex();
            }

            @Override
            public void onFailure() {
                loginView.showToast(loginView.getContext().getResources().getString(R.string.login_failed));
            }
        });
    }
}
