package com.tc.mvpvmdemo.userinfo;

public interface IUserInfo {
    interface IView {
        void updateTitle(String title);//更新页面title

        void showDialog(String content);//显示弹窗

        void closeDialog();//关闭弹窗
    }

    interface IPresenter {
        void onViewInit();
    }
}