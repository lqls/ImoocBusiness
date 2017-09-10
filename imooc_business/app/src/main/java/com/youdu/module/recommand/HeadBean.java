package com.youdu.module.recommand;

import com.google.gson.Gson;

import java.util.List;

/**
 * Created by LQ on 2017/9/3.
 *
 * @描述
 */

class HeadBean {
    public List<String> ads;
    public List<String>     middle;
    public List<FooterBean> footer;

    public static HeadBean objectFromData(String str) {

        return new Gson().fromJson(str, HeadBean.class);
    }
}
