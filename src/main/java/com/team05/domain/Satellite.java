package com.team05.domain;

import java.io.Serializable;

/**
 * Created by dllo on 18/2/27.
 */
public class Satellite implements Serializable {
    private String bimsStoreId;
    private String bimsStoreName;
    private String manageStaffNo;
    private String manageStaffName;
    private String effectFlag;
    private String createStaffNo;
    private String createStaffName;
    private String createDate;

    public Satellite() {
    }

    public Satellite(String bimsStoreName, String manageStaffNo, String manageStaffName, String effectFlag, String createStaffNo, String createStaffName, String createDate) {
        this.bimsStoreName = bimsStoreName;
        this.manageStaffNo = manageStaffNo;
        this.manageStaffName = manageStaffName;
        this.effectFlag = effectFlag;
        this.createStaffNo = createStaffNo;
        this.createStaffName = createStaffName;
        this.createDate = createDate;
    }

    public String getBimsStoreId() {
        return bimsStoreId;
    }

    public void setBimsStoreId(String bimsStoreId) {
        this.bimsStoreId = bimsStoreId;
    }

    public String getBimsStoreName() {
        return bimsStoreName;
    }

    public void setBimsStoreName(String bimsStoreName) {
        this.bimsStoreName = bimsStoreName;
    }

    public String getManageStaffNo() {
        return manageStaffNo;
    }

    public void setManageStaffNo(String manageStaffNo) {
        this.manageStaffNo = manageStaffNo;
    }

    public String getManageStaffName() {
        return manageStaffName;
    }

    public void setManageStaffName(String manageStaffName) {
        this.manageStaffName = manageStaffName;
    }

    public String getEffectFlag() {
        return effectFlag;
    }

    public void setEffectFlag(String effectFlag) {
        this.effectFlag = effectFlag;
    }

    public String getCreateStaffNo() {
        return createStaffNo;
    }

    public void setCreateStaffNo(String createStaffNo) {
        this.createStaffNo = createStaffNo;
    }

    public String getCreateStaffName() {
        return createStaffName;
    }

    public void setCreateStaffName(String createStaffName) {
        this.createStaffName = createStaffName;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Satellite{" +
                "bimsStoreId='" + bimsStoreId + '\'' +
                ", bimsStoreName='" + bimsStoreName + '\'' +
                ", manageStaffNo='" + manageStaffNo + '\'' +
                ", manageStaffName='" + manageStaffName + '\'' +
                ", effectFlag='" + effectFlag + '\'' +
                ", createStaffNo='" + createStaffNo + '\'' +
                ", createStaffName='" + createStaffName + '\'' +
                ", createDate='" + createDate + '\'' +
                '}';
    }
}
