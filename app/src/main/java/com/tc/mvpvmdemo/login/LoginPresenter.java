package com.tc.mvpvmdemo.login;

import android.os.Handler;
import android.view.View;

public class LoginPresenter implements ILogin.IPresenter {
    private ILogin.IView mView;
    private LoginViewModel mViewModel;

    public LoginPresenter(ILogin.IView view, LoginViewModel viewModel) {
        this.mView = view;
        this.mViewModel = viewModel;
    }

    @Override
    public void onViewInit() {
        mView.updateTitle("登录");
        mViewModel.setBtnText("sign in");
        mViewModel.setBtnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = mViewModel.getUserName();
                String password = mViewModel.getPassword();
                login(userName, password);
            }
        });
    }

    private void login(final String userName, final String password) {
        mView.showDialog("正在登陆\nuserName:" + userName + "\npassword:" + password);
        //不建议这么用Handler，这里只是模拟网络请求的延迟
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mView.closeDialog();
                mView.showToast("登陆成功");
                mView.jumpToUserInfo();
            }
        }, 2000);
    }
}
