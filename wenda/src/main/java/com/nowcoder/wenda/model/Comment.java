package com.nowcoder.wenda.model;


import java.util.Date;

public class Comment {
    private int id;
    private int userId;
    private int entityId;   //评论的id（问题的/评论的）
    private int entityType; //评论的类型，是对问题的评论还是对评论的评论
    private String content;
    private Date createdDate;
    private int status; //评论的状态 正常/不正常(如被管理员删掉则是不正常的)

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getEntityId() {
        return entityId;
    }

    public void setEntityId(int entityId) {
        this.entityId = entityId;
    }

    public int getEntityType() {
        return entityType;
    }

    public void setEntityType(int entityType) {
        this.entityType = entityType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
