package com.youdu.module.recommand;

import com.google.gson.Gson;

/**
 * Created by LQ on 2017/9/3.
 *
 * @描述
 */

class ClickMonitorBean {
    public String ver;
    public String url;

    public static ClickMonitorBean objectFromData(String str) {

        return new Gson().fromJson(str, ClickMonitorBean.class);
    }
}
