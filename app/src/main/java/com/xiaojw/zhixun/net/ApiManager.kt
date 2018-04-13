package com.xiaojw.zhixun.net

import android.util.ArrayMap
import com.common.baseframe.net.HttpManager

/**
 * Created by xiaojw on 2018/3/20.
 */
object ApiManager {
    //    val TOP_MOVIE_URL = "http://api.douban.com/v2/movie/top250";
//    val HOT_MOVICE_URL = "https://api.douban.com/v2/movie/in_theaters";

    var map = ArrayMap<String, Api>()




    @JvmStatic fun getApi(baseUrl: String): Api? {
        var api:Api?
        if (map.containsKey(baseUrl)) {
            api = map.get(baseUrl);
        } else {
            api = HttpManager.getApi(Api::class.java,baseUrl);
            map.put(baseUrl, api)
        }
        return api;

    }


}