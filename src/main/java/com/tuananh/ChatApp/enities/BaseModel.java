package com.tuananh.ChatApp.enities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import java.util.Date;
@MappedSuperclass
public class BaseModel {
    @Column(name ="createBy")
    private String createBy;
    @Column(name ="createDate")
    private Date createDate;
    @Column(name ="updateBy")
    private String updateBy;
    @Column(name ="updateDate")
    private Date updateDate;

    public BaseModel() {}

    public BaseModel(String createBy, Date createDate, String updateBy, Date updateDate) {
        this.createBy = createBy;
        this.createDate = createDate;
        this.updateBy = updateBy;
        this.updateDate = updateDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
