package com.huadi.feedBack.model;

import java.util.Date;

/**
 * Created by Administrator on 2017/6/27 0027.
 * QAMS的实体
 */
public class FeedBackEntity {

    private int id;//bug反馈ID
    private int projectId;//项目ID
    private String title;//bug标题
    private String content;//bug的内容以及操作描述
    private Date createDate;//创建日期
    private String createUserName;//创建用户的用户名
    private String replayUserName;//回复者的用户名
    private String replayContent;//回复的内容
    private Date replayDate;//回复的日期
    private String status;//反馈的状态

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public String getReplayUserName() {
        return replayUserName;
    }

    public void setReplayUserName(String replayUserName) {
        this.replayUserName = replayUserName;
    }

    public String getReplayContent() {
        return replayContent;
    }

    public void setReplayContent(String replayContent) {
        this.replayContent = replayContent;
    }

    public Date getReplayDate() {
        return replayDate;
    }

    public void setReplayDate(Date replayDate) {
        this.replayDate = replayDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "QualityAnalysis{" +
                "id=" + id +
                ", projectId=" + projectId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", createDate=" + createDate +
                ", createUserName='" + createUserName + '\'' +
                ", replayUserName='" + replayUserName + '\'' +
                ", replayContent='" + replayContent + '\'' +
                ", replayDate=" + replayDate +
                ", status='" + status + '\'' +
                '}';
    }
}
