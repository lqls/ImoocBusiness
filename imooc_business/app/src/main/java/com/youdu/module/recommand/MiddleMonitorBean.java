package com.youdu.module.recommand;

import com.google.gson.Gson;

/**
 * Created by LQ on 2017/9/3.
 *
 * @描述
 */

class MiddleMonitorBean {
    public String ver;
    public String url;
    public int    time;

    public static MiddleMonitorBean objectFromData(String str) {

        return new Gson().fromJson(str, MiddleMonitorBean.class);
    }
}
