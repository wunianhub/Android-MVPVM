package com.tc.mvpvmdemo.login;

public interface ILogin {
    interface IView {

        void updateTitle(String title);//更新页面title

        void showToast(String content);//显示toast

        void showDialog(String content);//显示弹窗

        void closeDialog();//关闭弹窗

        void jumpToUserInfo();//跳转到用户信息页面
    }

    interface IPresenter {
        void onViewInit();
    }
}
