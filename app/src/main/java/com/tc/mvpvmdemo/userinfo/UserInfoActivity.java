package com.tc.mvpvmdemo.userinfo;

import android.app.ProgressDialog;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.tc.mvpvmdemo.R;
import com.tc.mvpvmdemo.databinding.ActivityUserInfoBinding;

public class UserInfoActivity extends AppCompatActivity implements IUserInfo.IView {

    ActivityUserInfoBinding binding;
    UserInfoPresenter presenter;
    ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_user_info);
        UserInfoViewModel viewModel = new UserInfoViewModel();
        presenter = new UserInfoPresenter(this, viewModel);
        binding.setViewModel(viewModel);
        presenter.onViewInit();
    }

    @Override
    public void updateTitle(String title) {
        this.setTitle(title);
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
            dialog.dismiss();
        }
    }
}
