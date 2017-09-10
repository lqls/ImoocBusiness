package com.youdu.module.recommand;

import com.google.gson.Gson;

import java.util.List;

/**
 * Created by LQ on 2017/9/3.
 *
 * @描述
 */

class DataBean {
    public HeadBean head;
    public List<ListBean> list;

    public static DataBean objectFromData(String str) {

        return new Gson().fromJson(str, DataBean.class);
    }
}
