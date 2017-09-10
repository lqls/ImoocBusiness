package com.youdu.module.recommand;

import com.google.gson.Gson;

/**
 * Created by LQ on 2017/9/3.
 *
 * @描述
 */

class FooterBean {
    public String title;
    public String info;
    public String from;
    public String imageOne;
    public String imageTwo;
    public String destationUrl;

    public static FooterBean objectFromData(String str) {

        return new Gson().fromJson(str, FooterBean.class);
    }
}
