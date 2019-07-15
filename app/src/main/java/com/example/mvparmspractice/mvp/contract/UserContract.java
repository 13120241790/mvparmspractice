package com.example.mvparmspractice.mvp.contract;

import android.app.Activity;

import com.example.mvparmspractice.mvp.model.entity.User;
import com.jess.arms.mvp.IModel;
import com.jess.arms.mvp.IView;
import com.tbruyelle.rxpermissions2.RxPermissions;

import java.util.List;

import io.reactivex.Observable;

public interface UserContract {
    interface View extends IView {
        void startLoadMore();

        void endLoadMore();

        Activity getActivity();

        //申请权限
        RxPermissions getRxPermissions();
    }

    interface Model extends IModel {
        //Model层定义接口,外部只需关心Model返回的数据,无需关心内部细节,如是否使用缓存
        Observable<List<User>> getUsers(int lastIdQueried, boolean update);
    }
}
