package com.tc.mvpvmdemo.userinfo;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class UserInfoModel implements Serializable {
    /**
     * head : string
     * headBackground : string
     * name : string
     * sex : int 1:男 2:女
     * nationality : int 1:中国 2:美国
     * specialty : string
     * advantage : string
     * createTime : long
     */

    @SerializedName("head")
    private String head;
    @SerializedName("headBackground")
    private String headBackground;
    @SerializedName("name")
    private String name;
    @SerializedName("sex")
    private int sex;
    @SerializedName("nationality")
    private int nationality;
    @SerializedName("specialty")
    private String specialty;
    @SerializedName("advantage")
    private String advantage;
    @SerializedName("createTime")
    private long createTime;

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getHeadBackground() {
        return headBackground;
    }

    public void setHeadBackground(String headBackground) {
        this.headBackground = headBackground;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getNationality() {
        return nationality;
    }

    public void setNationality(int nationality) {
        this.nationality = nationality;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getAdvantage() {
        return advantage;
    }

    public void setAdvantage(String advantage) {
        this.advantage = advantage;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }
}
