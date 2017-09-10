package com.youdu.module.recommand;

import com.google.gson.Gson;

import java.util.List;

/**
 * Created by LQ on 2017/9/3.
 *
 * @描述
 */

class ListBean {
    public int type;
    public String                  logo;
    public String                  title;
    public String                  info;
    public String                  price;
    public String                  text;
    public String                  from;
    public String                  zan;
    public String                  site;
    public String                  resource;
    public String                  adid;
    public String                  clickUrl;
    public List<String>            url;
    public List<ClickMonitorBean>  clickMonitor;
    public List<StartMonitorBean>  startMonitor;
    public List<MiddleMonitorBean> middleMonitor;
    public List<EndMonitorBean>    endMonitor;

    public static ListBean objectFromData(String str) {

        return new Gson().fromJson(str, ListBean.class);
    }
}
