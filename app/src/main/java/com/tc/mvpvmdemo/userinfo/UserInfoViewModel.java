package com.tc.mvpvmdemo.userinfo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.tc.mvpvmdemo.BR;

/**
 * Created by tiancheng on 16/12/16.
 */

public class UserInfoViewModel extends BaseObservable {

    private int headBackgroundRes;
    private int headImageRes;
    private String name;
    private String sex;
    private String nationality;
    private String specialty;
    private String advantage;
    private String createTime;

    @Bindable
    public int getHeadImageRes() {
        return headImageRes;
    }

    public void setHeadImageRes(int headImageRes) {
        this.headImageRes = headImageRes;
        notifyPropertyChanged(BR.headImageRes);
    }

    @Bindable
    public int getHeadBackgroundRes() {
        return headBackgroundRes;
    }

    public void setHeadBackgroundRes(int headBackgroundRes) {
        this.headBackgroundRes = headBackgroundRes;
        notifyPropertyChanged(BR.headBackgroundRes);
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
        notifyPropertyChanged(BR.sex);
    }

    @Bindable
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
        notifyPropertyChanged(BR.nationality);
    }

    @Bindable
    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
        notifyPropertyChanged(BR.specialty);
    }

    @Bindable
    public String getAdvantage() {
        return advantage;
    }

    public void setAdvantage(String advantage) {
        this.advantage = advantage;
        notifyPropertyChanged(BR.advantage);
    }

    @Bindable
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
        notifyPropertyChanged(BR.createTime);
    }
}
