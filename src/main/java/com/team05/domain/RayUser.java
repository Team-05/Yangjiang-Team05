package com.team05.domain;

/**
 * Created by dllo on 18/2/26.
 */
public class RayUser {

    private String staffName,orgName,passcardNo,rtRank,rtNo,EffectBegDate,EffectEndDate;

    public RayUser() {
    }

    public RayUser(String orgName, String passcardNo, String rtRank, String rtNo, String effectBegDate, String effectEndDate) {
        this.orgName = orgName;
        this.passcardNo = passcardNo;
        this.rtRank = rtRank;
        this.rtNo = rtNo;
        EffectBegDate = effectBegDate;
        EffectEndDate = effectEndDate;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getPasscardNo() {
        return passcardNo;
    }

    public void setPasscardNo(String passcardNo) {
        this.passcardNo = passcardNo;
    }

    public String getRtRank() {
        return rtRank;
    }

    public void setRtRank(String rtRank) {
        this.rtRank = rtRank;
    }

    public String getRtNo() {
        return rtNo;
    }

    public void setRtNo(String rtNo) {
        this.rtNo = rtNo;
    }

    public String getEffectBegDate() {
        return EffectBegDate;
    }

    public void setEffectBegDate(String effectBegDate) {
        EffectBegDate = effectBegDate;
    }

    public String getEffectEndDate() {
        return EffectEndDate;
    }

    public void setEffectEndDate(String effectEndDate) {
        EffectEndDate = effectEndDate;
    }
}
