package com.team05.domain.base;

/**
 * Created by dllo on 18/2/6.
 */
public class Staff {
    private int staffId;
    private String staffName;
    private String staffEmail;
    private String staffUsername;
    private String staffPwd;
    private int staffDepId;
    //add by Kinjer 2018.2.8 19:24
    private int roleId;

    public Staff() {
    }

    public Staff(String staffName, String staffEmail, String staffUsername, String staffPwd, int staffDepId) {
        this.staffName = staffName;
        this.staffEmail = staffEmail;
        this.staffUsername = staffUsername;
        this.staffPwd = staffPwd;
        this.staffDepId = staffDepId;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffEmail() {
        return staffEmail;
    }

    public void setStaffEmail(String staffEmail) {
        this.staffEmail = staffEmail;
    }

    public String getStaffUsername() {
        return staffUsername;
    }

    public void setStaffUsername(String staffUsername) {
        this.staffUsername = staffUsername;
    }

    public String getStaffPwd() {
        return staffPwd;
    }

    public void setStaffPwd(String staffPwd) {
        this.staffPwd = staffPwd;
    }

    public int getStaffDepId() {
        return staffDepId;
    }

    public void setStaffDepId(int staffDepId) {
        this.staffDepId = staffDepId;
    }

    //add by Kinjer 2018.2.8 19:24
    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffId=" + staffId +
                ", staffName='" + staffName + '\'' +
                ", staffEmail='" + staffEmail + '\'' +
                ", staffUsername='" + staffUsername + '\'' +
                ", staffPwd='" + staffPwd + '\'' +
                ", staffDepId=" + staffDepId +
                '}';
    }
}
