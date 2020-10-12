package com.hdw.system.dto;

/**
 * @Description 密码表单
 * @Author TuMinglong
 * @Date 2018/6/11 17:07
 */
public class PasswordDTO {
    /**
     * 原密码
     */
    private String password;
    /**
     * 新密码
     */
    private String newPassword;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
}
