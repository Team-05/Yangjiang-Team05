package com.team05.domain;

import java.io.Serializable;

/**
 * Created by dllo on 18/2/28.
 */
public class CheckManage implements Serializable{
    private String appId;
    private String appNo;
    private int    processinstId;
    private String appType;
    private String theme;
    private String applyDate;
    private String flowAppStaffNo;
    private String flowAppStaffName;
    private String appDeptId;
    private String appDeptName;
    private String busiappStaffNo;
    private String busiappStaffName;
    private String busiappDeptId;
    private String busiappDeptName;
    private String busiLinkDesc;
    private String dataOrgNo;
    private String appYM;
    private String printFlag;
    private String canPrintFlag;
    private String status;
    private String multiFlowFlag;
    private String effectFlag;
    private String createStaffNo;
    private String createStaffName;
    private String createDate;

    public CheckManage() {
    }

    public CheckManage(String appNo,
                       int processinstId, String appType, String theme,
                       String applyDate, String flowAppStaffNo, String flowAppStaffName,
                       String appDeptId, String appDeptName, String busiappStaffNo,
                       String busiappStaffName, String busiappDeptId, String busiappDeptName,
                       String busiLinkDesc, String dataOrgNo, String appYM,
                       String printFlag, String canPrintFlag, String status,
                       String multiFlowFlag, String effectFlag, String createStaffNo,
                       String createStaffName, String createDate) {
        this.appNo = appNo;
        this.processinstId = processinstId;
        this.appType = appType;
        this.theme = theme;
        this.applyDate = applyDate;
        this.flowAppStaffNo = flowAppStaffNo;
        this.flowAppStaffName = flowAppStaffName;
        this.appDeptId = appDeptId;
        this.appDeptName = appDeptName;
        this.busiappStaffNo = busiappStaffNo;
        this.busiappStaffName = busiappStaffName;
        this.busiappDeptId = busiappDeptId;
        this.busiappDeptName = busiappDeptName;
        this.busiLinkDesc = busiLinkDesc;
        this.dataOrgNo = dataOrgNo;
        this.appYM = appYM;
        this.printFlag = printFlag;
        this.canPrintFlag = canPrintFlag;
        this.status = status;
        this.multiFlowFlag = multiFlowFlag;
        this.effectFlag = effectFlag;
        this.createStaffNo = createStaffNo;
        this.createStaffName = createStaffName;
        this.createDate = createDate;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppNo() {
        return appNo;
    }

    public void setAppNo(String appNo) {
        this.appNo = appNo;
    }

    public int getProcessinstId() {
        return processinstId;
    }

    public void setProcessinstId(int processinstId) {
        this.processinstId = processinstId;
    }

    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    public String getFlowAppStaffNo() {
        return flowAppStaffNo;
    }

    public void setFlowAppStaffNo(String flowAppStaffNo) {
        this.flowAppStaffNo = flowAppStaffNo;
    }

    public String getFlowAppStaffName() {
        return flowAppStaffName;
    }

    public void setFlowAppStaffName(String flowAppStaffName) {
        this.flowAppStaffName = flowAppStaffName;
    }

    public String getAppDeptId() {
        return appDeptId;
    }

    public void setAppDeptId(String appDeptId) {
        this.appDeptId = appDeptId;
    }

    public String getAppDeptName() {
        return appDeptName;
    }

    public void setAppDeptName(String appDeptName) {
        this.appDeptName = appDeptName;
    }

    public String getBusiappStaffNo() {
        return busiappStaffNo;
    }

    public void setBusiappStaffNo(String busiappStaffNo) {
        this.busiappStaffNo = busiappStaffNo;
    }

    public String getBusiappStaffName() {
        return busiappStaffName;
    }

    public void setBusiappStaffName(String busiappStaffName) {
        this.busiappStaffName = busiappStaffName;
    }

    public String getBusiappDeptId() {
        return busiappDeptId;
    }

    public void setBusiappDeptId(String busiappDeptId) {
        this.busiappDeptId = busiappDeptId;
    }

    public String getBusiappDeptName() {
        return busiappDeptName;
    }

    public void setBusiappDeptName(String busiappDeptName) {
        this.busiappDeptName = busiappDeptName;
    }

    public String getBusiLinkDesc() {
        return busiLinkDesc;
    }

    public void setBusiLinkDesc(String busiLinkDesc) {
        this.busiLinkDesc = busiLinkDesc;
    }

    public String getDataOrgNo() {
        return dataOrgNo;
    }

    public void setDataOrgNo(String dataOrgNo) {
        this.dataOrgNo = dataOrgNo;
    }

    public String getAppYM() {
        return appYM;
    }

    public void setAppYM(String appYM) {
        this.appYM = appYM;
    }

    public String getPrintFlag() {
        return printFlag;
    }

    public void setPrintFlag(String printFlag) {
        this.printFlag = printFlag;
    }

    public String getCanPrintFlag() {
        return canPrintFlag;
    }

    public void setCanPrintFlag(String canPrintFlag) {
        this.canPrintFlag = canPrintFlag;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMultiFlowFlag() {
        return multiFlowFlag;
    }

    public void setMultiFlowFlag(String multiFlowFlag) {
        this.multiFlowFlag = multiFlowFlag;
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
        return "Check_Manage{" +
                "appId='" + appId + '\'' +
                ", appNo='" + appNo + '\'' +
                ", processinstId=" + processinstId +
                ", appType='" + appType + '\'' +
                ", theme='" + theme + '\'' +
                ", applyDate='" + applyDate + '\'' +
                ", flowAppStaffNo='" + flowAppStaffNo + '\'' +
                ", flowAppStaffName='" + flowAppStaffName + '\'' +
                ", appDeptId='" + appDeptId + '\'' +
                ", appDeptName='" + appDeptName + '\'' +
                ", busiappStaffNo='" + busiappStaffNo + '\'' +
                ", busiappStaffName='" + busiappStaffName + '\'' +
                ", busiappDeptId='" + busiappDeptId + '\'' +
                ", busiappDeptName='" + busiappDeptName + '\'' +
                ", busiLinkDesc='" + busiLinkDesc + '\'' +
                ", dataOrgNo='" + dataOrgNo + '\'' +
                ", appYM='" + appYM + '\'' +
                ", printFlag='" + printFlag + '\'' +
                ", canPrintFlag='" + canPrintFlag + '\'' +
                ", status='" + status + '\'' +
                ", multiFlowFlag='" + multiFlowFlag + '\'' +
                ", effectFlag='" + effectFlag + '\'' +
                ", createStaffNo='" + createStaffNo + '\'' +
                ", createStaffName='" + createStaffName + '\'' +
                ", createDate='" + createDate + '\'' +
                '}';
    }
}
