package com.tc.mvpvmdemo.login;

import android.app.ProgressDialog;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.tc.mvpvmdemo.R;
import com.tc.mvpvmdemo.databinding.ActivityLoginBinding;
import com.tc.mvpvmdemo.userinfo.UserInfoActivity;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity implements ILogin.IView {

    ActivityLoginBinding binding;
    LoginPresenter presenter;
    ProgressDialog dialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        LoginViewModel viewModel = new LoginViewModel();
        presenter = new LoginPresenter(this, viewModel);
        binding.setViewModel(viewModel);
        presenter.onViewInit();
    }

    @Override
    public void updateTitle(String title) {
        this.setTitle(title);
    }

    @Override
    public void showToast(String content) {
        Toast.makeText(this, content, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showDialog(String content) {
        if (dialog == null) {
            dialog = new ProgressDialog(this);
        }
        dialog.setMessage(content);
        dialog.show();
    }

    @Override
    public void closeDialog() {
        if (dialog != null && dialog.isShowing()) {
            dialog.hide();
        }
    }

    @Override
    public void jumpToUserInfo() {
        Intent intent = new Intent(this, UserInfoActivity.class);
        startActivity(intent);
    }

}