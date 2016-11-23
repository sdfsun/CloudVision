package com.vrcvp.cloudvision.view;

import com.baidu.location.BDLocation;
import com.vrcvp.cloudvision.bean.NoticeBean;
import com.vrcvp.cloudvision.bean.WeatherInfo;
import com.vrcvp.cloudvision.bean.resp.FindInfoResp;
import com.vrcvp.cloudvision.bean.resp.QueryAdvertiseResp;
import com.vrcvp.cloudvision.bean.resp.QueryNoticeResp;

/**
 * Main页面视图接口
 * Created by yinglovezhuzhu@gmail.com on 2016/9/16.
 */
public interface IMainView {

    /**
     * 时间更新
     * @param time 时间字符串
     */
    void onTimeUpdate(String time);

    /**
     * 百度定位信息更新
     * @param bdLocation 百度定位数据
     */
    void onBDLocationUpdate(BDLocation bdLocation);

    /**
     * 天气数据更新
     * @param weatherInfo 天气数据，为null说明更新失败
     */
    void onWeatherUpdate(WeatherInfo weatherInfo);

    /**
     * 公告设置改变
     * @param disabled 是否关闭， true 关闭，false 开启
     */
    void onNoticeSettingsChanged(boolean disabled);

    /**
     * 天气设置改变
     * @param disabled 是否关闭， true 关闭， false 开启
     */
    void onWeatherSettingsChanged(boolean disabled);

    /**
     * 公告数据更新
     * @param notice 公告内容
     */
    void onNoticeUpdate(NoticeBean notice);

    /**
     * 异步执行前
     *
     * @param key 关键字，用来区分是哪个异步线程
     */
    void onPreExecute(String key);

    /**
     * 取消异步任务
     *
     * @param key 关键字，用来区分是哪个异步线程
     */
    void onCanceled(String key);

    /**
     * 首页广告查询结果
     * @param result 广告数据
     */
    void onQueryAdvertiseResult(QueryAdvertiseResp result);

    /**
     * 公告查询结果
     * @param result 公告数据
     */
    void onQueryNoticeResult(QueryNoticeResp result);

    /**
     * 查找广告机信息结果
     * @param result 广告机信息结果数据
     */
    void onFindInfoResult(FindInfoResp result);
}
