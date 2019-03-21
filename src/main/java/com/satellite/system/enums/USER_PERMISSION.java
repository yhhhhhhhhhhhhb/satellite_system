package com.satellite.system.enums;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 22:52 2019/3/21
 * @Modified By:
 */
public enum  USER_PERMISSION {
    ADMIN(1,"管理员"),
    ORDINARY(2,"普通用户");

    private Integer status;
    private String desc;

    public Integer getStatus() {
        return status;
    }

    public String getDesc() {
        return desc;
    }

    USER_PERMISSION(Integer status, String desc) {
        this.status = status;
        this.desc = desc;
    }

    public static USER_PERMISSION getByStatus(Integer status){
        for(USER_PERMISSION user_permission: USER_PERMISSION.values()){
            if(user_permission.getStatus().equals(status)){
                return user_permission;
            }
        }
        return null;
    }
}
