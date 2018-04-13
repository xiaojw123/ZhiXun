package com.xiaojw.zhixun.net

import com.xiaojw.zhixun.bean.DoubanResponse
import com.xiaojw.zhixun.bean.MovcieDetail
import com.xiaojw.zhixun.bean.MoviceItem
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import rx.Observable

/**
 * Created by xiaojw on 2018/3/20.
 */
interface  Api {
    companion object {
       const val BASE_DOUBAN_URL = "https://api.douban.com/v2/movie/"
    }
    //上映
    @GET("in_theaters")
    fun  getMoviceTheaterList():Observable<DoubanResponse>
    //即将上映
    @GET("coming_soon")
    fun  getMoviceSoonList():Observable<DoubanResponse>;
    //TOP250
    @GET("top250")
    fun  getMoviceTopList():Observable<DoubanResponse>

    @GET("subject/{id}")
    fun getMovieDetail(@Path("id") id:Int):Observable<MovcieDetail>


}