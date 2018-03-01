package com.team05.domain.plant;

/**
 * Created by dllo on 18/2/28.
 */
public class Plant {
    private int plantId;
    private String
            macNo,
            plantName,
            plantAddr,
            plantManageStaff_no,
            plantManageStaffName,
            effectFlag,
            createStaffNo,
            createStaffName,
            createDate;


    public Plant() {
    }

    public Plant(String macNo, String plantName, String plantAddr, String plantManageStaff_no, String plantManageStaffName, String effectFlag, String createStaffNo, String createStaffName, String createDate) {
        this.macNo = macNo;
        this.plantName = plantName;
        this.plantAddr = plantAddr;
        this.plantManageStaff_no = plantManageStaff_no;
        this.plantManageStaffName = plantManageStaffName;
        this.effectFlag = effectFlag;
        this.createStaffNo = createStaffNo;
        this.createStaffName = createStaffName;
        this.createDate = createDate;
    }

    public Plant(int plantId, String macNo, String plantName, String plantAddr, String plantManageStaff_no, String plantManageStaffName, String effectFlag, String createStaffNo, String createStaffName, String createDate) {
        this.plantId = plantId;
        this.macNo = macNo;
        this.plantName = plantName;
        this.plantAddr = plantAddr;
        this.plantManageStaff_no = plantManageStaff_no;
        this.plantManageStaffName = plantManageStaffName;
        this.effectFlag = effectFlag;
        this.createStaffNo = createStaffNo;
        this.createStaffName = createStaffName;
        this.createDate = createDate;
    }

    public int getPlantId() {
        return plantId;
    }

    public void setPlantId(int plantId) {
        this.plantId = plantId;
    }

    public String getMacNo() {
        return macNo;
    }

    public void setMacNo(String macNo) {
        this.macNo = macNo;
    }

    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }

    public String getPlantAddr() {
        return plantAddr;
    }

    public void setPlantAddr(String plantAddr) {
        this.plantAddr = plantAddr;
    }

    public String getPlantManageStaff_no() {
        return plantManageStaff_no;
    }

    public void setPlantManageStaff_no(String plantManageStaff_no) {
        this.plantManageStaff_no = plantManageStaff_no;
    }

    public String getPlantManageStaffName() {
        return plantManageStaffName;
    }

    public void setPlantManageStaffName(String plantManageStaffName) {
        this.plantManageStaffName = plantManageStaffName;
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
        return "Plant{" +
                "plantId=" + plantId +
                ", macNo='" + macNo + '\'' +
                ", plantName='" + plantName + '\'' +
                ", plantAddr='" + plantAddr + '\'' +
                ", plantManageStaff_no='" + plantManageStaff_no + '\'' +
                ", plantManageStaffName='" + plantManageStaffName + '\'' +
                ", effectFlag='" + effectFlag + '\'' +
                ", createStaffNo='" + createStaffNo + '\'' +
                ", createStaffName='" + createStaffName + '\'' +
                ", createDate='" + createDate + '\'' +
                '}';
    }
}
