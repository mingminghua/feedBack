package com.huadi.feedBack.dao;

import com.huadi.feedBack.model.FeedBackEntity;

import java.util.List;

/**
 * Created by Administrator on 2017/6/28 0028.
 */
public interface FeedBackMapper {

    /**
     * 根据项目的ID精确查找反馈的记录
     * @param projectId
     * @return
     */
    List<FeedBackEntity> findHistoryByProjectId (int projectId);

    /**
     * 根据ID来删除反馈湖库
     * @param id
     * @return
     */
    int deleteFeedBack(int id);

}
