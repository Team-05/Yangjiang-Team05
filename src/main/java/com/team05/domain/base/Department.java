package com.team05.domain.base;

/**
 * Created by dllo on 18/2/6.
 */
public class Department {
    private int depId;
    private String depName;
    private int chiefId;

    public Department() {
    }

    public Department(String depName, int chiefId) {
        this.depName = depName;
        this.chiefId = chiefId;
    }

    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public int getChiefId() {
        return chiefId;
    }

    public void setChiefId(int chiefId) {
        this.chiefId = chiefId;
    }

    @Override
    public String toString() {
        return "Department{" +
                "depId=" + depId +
                ", depName='" + depName + '\'' +
                ", chiefId=" + chiefId +
                '}';
    }
}
