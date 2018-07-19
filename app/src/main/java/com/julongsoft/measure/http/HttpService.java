package com.julongsoft.measure.http;


import com.julongsoft.measure.entity.HomeDataBean;
import com.julongsoft.measure.entity.PeriodDataForTypeBean;
import com.julongsoft.measure.entity.PeriodListData;
import com.julongsoft.measure.entity.SectionDetial;
import com.julongsoft.measure.entity.SectionTypeData;
import com.julongsoft.measure.entity.UserData;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Tao on 2016/11/16.
 */

public interface HttpService {

    /*基础url*/
//    public static final String baseUrl = "http://192.168.7.200:8089/plat/";
//    public static final String baseUrl = "http://60.8.218.156:8089/plat/"; //正式
    public static final String baseUrl = "http://60.8.218.156:7000/plat/"; //正式
//    public static final String baseUrl = "http://192.168.7.104:8083/plat/"; //测试
//    public static final String baseUrl = "http://60.8.218.142:8089/plat/"; //测试
//    public static final String baseUrl = "http://192.168.7.102:8090/plat/"; //测试


    /***
     * 登录接口
     * @param code 用户名
     * @param password  密码
     * @return
     */
    @POST("a/app/jlzf/login")
    Call<BaseResultData<UserData>> getLogin(@Query("code") String code,
                                            @Query("password") String password
    );

    /***
     * 修改密码
     * @return
     */
    @POST("a/app/jlzf/updatePass/{token}")
    Call<BaseResultData<String>> updatePassword(@Path("token") String token,
                                                @Query("body") String body
    );


    /***
     * 退出登录
     * @return
     */
    @POST("a/app/jlzf/loginOut/{token}")
    Call<BaseResultData<String>> exitLogin(@Path("token") String token
    );

    /***
     * 工作列表接口
     * @return
     */
    @POST("a/app/jlzf/period/list/{token}/{page}")
    Call<BaseResultData<PeriodListData>> getWorkListData(@Path("token") String token,
                                                         @Path("page") int page,
                                                         @Query("segmentId") String segmentId,
                                                         @Query("num") String num,
                                                         @Query("signState") String state
    );

    /***
     * 工作列表接口根据类型获取
     * @return
     */
    @POST("a/app/jlzf/change/list/{token}/{type}/{page}")
    Call<BaseResultData<PeriodDataForTypeBean>> getListDataForType(@Path("token") String token,
                                                                   @Path("type") int type,
                                                                   @Path("page") int page,
                                                                   @Query("segmentId") String segmentId,
                                                                   @Query("num") String num,
                                                                   @Query("state") String state

    );


    /***
     * 工作列表详情接口
     * @return
     */
    @POST("a/app/jlzf/period/detail/{token}/{id}")
    Call<BaseResultData<SectionDetial>> getWorkListDetial(@Path("token") String token,
                                                          @Path("id") int id
    );

    /***
     * 工作列表详情接口
     * @return
     */
    @POST("a/app/jlzf/change/detail/{token}/{type}/{code}")
    Call<BaseResultData<List<SectionTypeData>>> getWorkListDetialForType(@Path("token") String token,
                                                                         @Path("type") int type,
                                                                         @Path("code") String code
    );

    /***
     * 首页图表数据
     * @return
     */
    @POST("a/app/jlzf/period/chartInfo/{token}")
    Call<BaseResultData<List<HomeDataBean>>> getHomeData(@Path("token") String token
    );


    /***
     * 流程通过接口
     * @return
     */
    @POST("a/app/jlzf/period/sign/{token}/{periodId}/{id}")
    Call<BaseResultData<Boolean>> sign(@Path("token") String token,
                                       @Path("periodId") int periodId,
                                       @Path("id") int id,
                                       @Query("idea") String idea,
                                       @Query("repeal") int repeal
    );

    /***
     * 流程通过接口
     * @return
     */
    @POST("a/app/jlzf/change/sign/{token}/{id}/{code}")
    Call<BaseResultData<Object>> sign2(@Path("token") String token,
                                       @Path("id") int id,
                                       @Path("code") String code,
                                       @Query("idea") String idea,
                                       @Query("repeal") int repeal

    );

//    /***
//     * 流程通过接口
//     * @return
//     */
//    @POST("a/app/jlzf/change/sign/{token}/{id}/{code}")
//    Call<Object> sign3(@Path("token") String token,
//                       @Path("id") int id,
//                       @Path("code") String code,
//                       @Path("idea") String idea,
//                       @Path("repeal") int repeal
//
//    );

    /***
     * 签字通过接口
     * @return
     */
    @POST("a/app/jlzf/period/signResult/{token}")
    Call<BaseResultData<List<HomeDataBean>>> signResult(@Path("token") String token
    );
}
