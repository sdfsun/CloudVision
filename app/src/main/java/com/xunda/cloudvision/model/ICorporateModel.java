package com.xunda.cloudvision.model;

import com.xunda.cloudvision.bean.resp.QueryCorporateResp;
import com.xunda.cloudvision.bean.resp.QueryProductResp;
import com.xunda.cloudvision.bean.resp.QueryVideoResp;
import com.xunda.cloudvision.http.HttpAsyncTask;

/**
 * Corporate Model interface
 * Created by yinglovezhuzhu@gmail.com on 2016/9/19.
 */
public interface ICorporateModel {

    /**
     * 查询企业信息
     * @param callback 回调
     */
    void queryCorporateInfo(HttpAsyncTask.Callback<QueryCorporateResp> callback);

    /**
     * 查询推荐商品
     * @param callback 回调
     */
    void queryRecommendedProduct(HttpAsyncTask.Callback<QueryProductResp> callback);

    /**
     * 查询推荐视频
     * @param callback 回调
     */
    void queryRecommendedVideo(HttpAsyncTask.Callback<QueryVideoResp> callback);
}
