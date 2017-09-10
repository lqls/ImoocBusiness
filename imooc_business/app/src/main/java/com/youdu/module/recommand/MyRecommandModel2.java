package com.youdu.module.recommand;

import com.google.gson.Gson;

/**
 * Created by LQ on 2017/9/3.
 *
 * @描述
 */

public class MyRecommandModel2 {


    public String ecode;
    public String   emsg;
    public DataBean data;

    public static MyRecommandModel2 jsonToBean(String str) {

        return new Gson().fromJson(str, MyRecommandModel2.class);
    }
}
