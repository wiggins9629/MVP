package com.wiggins.mvp.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.wiggins.mvp.R;
import com.wiggins.mvp.presenter.LoginPresenter;
import com.wiggins.mvp.presenter.imple.LoginPresenterImple;
import com.wiggins.mvp.view.LoginView;

/**
 * @Description mvp登录案例
 * @Author 一花一世界
 * @Time 2017/1/17 17:34
 */

public class LoginActivity extends Activity implements View.OnClickListener, LoginView {

    private LoginActivity mActivity = null;

    private EditText mEdtName;
    private EditText mEdtPwd;
    private Button mBtnLogin;

    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mActivity = this;
        loginPresenter = new LoginPresenterImple(this);

        initView();
        setListener();
    }

    private void initView() {
        mEdtName = (EditText) findViewById(R.id.edt_name);
        mEdtPwd = (EditText) findViewById(R.id.edt_pwd);
        mBtnLogin = (Button) findViewById(R.id.btn_login);
    }

    private void setListener() {
        mBtnLogin.setOnClickListener(this);
    }

    @Override
    public Context getContext() {
        return mActivity;
    }

    @Override
    public void moveToIndex() {
        Intent intent = new Intent(mActivity, MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void showToast(String msg) {
        Toast.makeText(mActivity, msg, Toast.LENGTH_LONG).show();
    }

    @Override
    public String getName() {
        return mEdtName.getText().toString().trim();
    }

    @Override
    public String getPassword() {
        return mEdtPwd.getText().toString().trim();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_login:
                loginPresenter.onLoginInfo();
                break;
        }
    }
}
