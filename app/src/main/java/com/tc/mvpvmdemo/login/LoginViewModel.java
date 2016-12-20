package com.tc.mvpvmdemo.login;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.view.View;

import com.tc.mvpvmdemo.BR;

public class LoginViewModel extends BaseObservable {

    private String btnText;
    private View.OnClickListener btnClickListener;

    private String userName;
    private String password;

    @Bindable
    public String getBtnText() {
        return btnText;
    }

    public void setBtnText(String btnText) {
        this.btnText = btnText;
        notifyPropertyChanged(BR.btnText);
    }

    @Bindable
    public View.OnClickListener getBtnClickListener() {
        return btnClickListener;
    }

    public void setBtnClickListener(View.OnClickListener btnClickListener) {
        this.btnClickListener = btnClickListener;
        notifyPropertyChanged(BR.btnClickListener);
    }

    @Bindable
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        notifyPropertyChanged(BR.userName);
    }

    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(BR.password);
    }
}
