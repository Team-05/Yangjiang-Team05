package com.team05.domain.personcenter;

/**
 * Created by dllo on 18/2/5.
 */
public class PersonCenter {
//    private String APP_ID,APP_TYPE,APP_DEPT_NAME,STATUS,FLOW_APP_STAFF_NAME,APPLY_DATE;
    private String appId,appType,appDeptName,status,flowAppStaffName,applyDate;

    public PersonCenter() {
    }

    public PersonCenter(String appType, String appDeptName, String status, String flowAppStaffName, String applyDate) {
        this.appType = appType;
        this.appDeptName = appDeptName;
        this.status = status;
        this.flowAppStaffName = flowAppStaffName;
        this.applyDate = applyDate;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public String getAppDeptName() {
        return appDeptName;
    }

    public void setAppDeptName(String appDeptName) {
        this.appDeptName = appDeptName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFlowAppStaffName() {
        return flowAppStaffName;
    }

    public void setFlowAppStaffName(String flowAppStaffName) {
        this.flowAppStaffName = flowAppStaffName;
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    @Override
    public String toString() {
        return "PersonCenter{" +
                "appId='" + appId + '\'' +
                ", appType='" + appType + '\'' +
                ", appDeptName='" + appDeptName + '\'' +
                ", status='" + status + '\'' +
                ", flowAppStaffName='" + flowAppStaffName + '\'' +
                ", applyDate='" + applyDate + '\'' +
                '}';
    }
}
