package com.huadi.feedBack.service.impl;

import com.huadi.feedBack.dao.FeedBackMapper;
import com.huadi.feedBack.model.FeedBackEntity;
import com.huadi.feedBack.service.FeedBackService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/6/27 0027.
 */
public class FeedBackServiceImpl implements FeedBackService {

    @Autowired
    private FeedBackMapper FBMapper;

    @Override
    public List<Map<String, Object>> selectList(Map<String, Object> m) {
        return null;
    }

    @Override
    public int selectCount(Map<String, Object> m) {
        return 0;
    }

    @Override
    public int add(Object o) {
        return 0;
    }

    @Override
    public int update(Object o) {
        return 0;
    }

    @Override
    public int deleteByPK(String id) {
        return 0;
    }

    @Override
    public int deleteByPKS(Map<String, Object> m) {
        return 0;
    }

    @Override
    public Object selectByPK(String id) {
        return null;
    }

    @Override
    public List<Map<String, Object>> selectByPKS(Map<String, Object> m) {
        return null;
    }

    @Override
    public <T> Object mapperMethod(T t, String methodName) {
        return null;
    }

    @Override
    public List<FeedBackEntity> selectFBHistoryByProjectId(int projectId) {
        return FBMapper.findHistoryByProjectId(projectId);
    }
}
