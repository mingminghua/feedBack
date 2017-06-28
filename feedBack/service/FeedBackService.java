package com.huadi.feedBack.service;

import com.huadi.basic.service.IBaseServ;
import com.huadi.feedBack.model.FeedBackEntity;

import java.util.List;

/**
 * Created by Administrator on 2017/6/27 0027.
 * 反馈的service层
 */
public interface FeedBackService extends IBaseServ {

    List<FeedBackEntity> selectFBHistoryByProjectId(int projectId);//查询相应的项目的历史反馈bug记录

}
