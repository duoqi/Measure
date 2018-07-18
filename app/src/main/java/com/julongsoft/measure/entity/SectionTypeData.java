package com.julongsoft.measure.entity;

/**
 * @author taodq
 * @version V1.0
 * @Description
 * @Date 2018/6/12.
 * @Copyright Copyright  2010-2017 TigerFace All Rights Reserved
 */
public class SectionTypeData {


    /**
     * id : null
     * userId : 1
     * state : 2
     * sn : 1
     * roleId : 1
     * roleName : 角色0
     * myState : null
     * myStateStr : null
     * time : 2018-06-12 14:15:23
     */

    private Integer id;
    private int userId;
    private int state;
    private int sn;
    private int roleId;
    private String roleName;
    private Integer myState;
    private String myStateStr;
    private String time;

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

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getSn() {
        return sn;
    }

    public void setSn(int sn) {
        this.sn = sn;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }

    public String getMyStateStr() {
        return myStateStr;
    }

    public void setMyStateStr(String myStateStr) {
        this.myStateStr = myStateStr;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
