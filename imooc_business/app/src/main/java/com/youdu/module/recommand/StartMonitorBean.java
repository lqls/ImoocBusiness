package com.youdu.module.recommand;

import com.google.gson.Gson;

/**
 * Created by LQ on 2017/9/3.
 *
 * @描述
 */

class StartMonitorBean {
    public String ver;
    public String url;

    public static StartMonitorBean objectFromData(String str) {

        return new Gson().fromJson(str, StartMonitorBean.class);
    }
}
