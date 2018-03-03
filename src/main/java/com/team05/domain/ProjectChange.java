package com.team05.domain;

/**
 * Created by dllo on 18/3/1.
 */
public class ProjectChange {
    private String pmsChange,
            projId,
            projName,
            projAssumeStaffNo,
            projAssumeStaffName,
            assumeDeptId,
            assumeDeptName,
            chgReason,
            chgContent,
            effectFlag,
            createStaffNo,
            createStaffName,
            createDate,
            deptManager;

    public ProjectChange() {
    }

    public ProjectChange(String projId, String projName, String projAssumeStaffNo, String projAssumeStaffName, String assumeDeptId, String assumeDeptName, String chgReason, String chgContent, String effectFlag, String createStaffNo, String createStaffName, String createDate, String deptManager) {
        this.projId = projId;
        this.projName = projName;
        this.projAssumeStaffNo = projAssumeStaffNo;
        this.projAssumeStaffName = projAssumeStaffName;
        this.assumeDeptId = assumeDeptId;
        this.assumeDeptName = assumeDeptName;
        this.chgReason = chgReason;
        this.chgContent = chgContent;
        this.effectFlag = effectFlag;
        this.createStaffNo = createStaffNo;
        this.createStaffName = createStaffName;
        this.createDate = createDate;
        this.deptManager = deptManager;
    }

    public String getPmsChange() {
        return pmsChange;
    }

    public void setPmsChange(String pmsChange) {
        this.pmsChange = pmsChange;
    }

    public String getProjId() {
        return projId;
    }

    public void setProjId(String projId) {
        this.projId = projId;
    }

    public String getProjName() {
        return projName;
    }

    public void setProjName(String projName) {
        this.projName = projName;
    }

    public String getProjAssumeStaffNo() {
        return projAssumeStaffNo;
    }

    public void setProjAssumeStaffNo(String projAssumeStaffNo) {
        this.projAssumeStaffNo = projAssumeStaffNo;
    }

    public String getProjAssumeStaffName() {
        return projAssumeStaffName;
    }

    public void setProjAssumeStaffName(String projAssumeStaffName) {
        this.projAssumeStaffName = projAssumeStaffName;
    }

    public String getAssumeDeptId() {
        return assumeDeptId;
    }

    public void setAssumeDeptId(String assumeDeptId) {
        this.assumeDeptId = assumeDeptId;
    }

    public String getAssumeDeptName() {
        return assumeDeptName;
    }

    public void setAssumeDeptName(String assumeDeptName) {
        this.assumeDeptName = assumeDeptName;
    }

    public String getChgReason() {
        return chgReason;
    }

    public void setChgReason(String chgReason) {
        this.chgReason = chgReason;
    }

    public String getChgContent() {
        return chgContent;
    }

    public void setChgContent(String chgContent) {
        this.chgContent = chgContent;
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

    public String getDeptManager() {
        return deptManager;
    }

    public void setDeptManager(String deptManager) {
        this.deptManager = deptManager;
    }
}
