package com.tc.mvpvmdemo.userinfo;

import android.os.Handler;

import com.tc.mvpvmdemo.R;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UserInfoPresenter implements IUserInfo.IPresenter {
    private IUserInfo.IView mView;
    private UserInfoViewModel mViewModel;

    public UserInfoPresenter(IUserInfo.IView iView, UserInfoViewModel viewModel) {
        this.mView = iView;
        this.mViewModel = viewModel;
    }

    @Override
    public void onViewInit() {
        mView.updateTitle("用户信息");
        requestData();
    }

    private UserInfoModel mockTrump() {
        UserInfoModel trump = new UserInfoModel();
        trump.setHead("xxx.jpg");
        trump.setHeadBackground("xxxx.jpg");
        trump.setName("川普");
        trump.setNationality(2);
        trump.setSex(1);
        trump.setSpecialty("表情包");
        trump.setAdvantage("漂亮的女儿");
        trump.setCreateTime(System.currentTimeMillis());
        return trump;
    }

    private void requestData() {
        mView.showDialog("正在获取数据");
        //不建议这么用Handler，这里只是模拟网络请求的延迟
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mView.closeDialog();
                updateUi(mockTrump());
            }
        }, 2000);
    }

    private void updateUi(UserInfoModel model) {
        mViewModel.setName(model.getName());
        mViewModel.setHeadImageRes(R.mipmap.ic_head);
        mViewModel.setHeadBackgroundRes(R.mipmap.bg_trump);
        String sex;
        switch (model.getSex()) {
            case 1:
                sex = "男";
                break;
            case 2:
                sex = "女";
                break;
            default:
                sex = "不详";
        }
        mViewModel.setSex(sex);
        String nationality;
        switch (model.getNationality()) {
            case 1:
                nationality = "中国";
                break;
            case 2:
                nationality = "美国";
                break;
            default:
                nationality = "地球";
        }
        mViewModel.setNationality(nationality);
        mViewModel.setAdvantage(model.getAdvantage());
        mViewModel.setSpecialty(model.getSpecialty());
        mViewModel.setAdvantage(model.getAdvantage());
        mViewModel.setCreateTime(new SimpleDateFormat("yyyy.MM.dd HH:mm").format(new Date(model.getCreateTime())));
    }
}