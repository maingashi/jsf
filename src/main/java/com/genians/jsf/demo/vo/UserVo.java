package com.genians.jsf.demo.vo;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;


/**
 *
 * @author 이준수
 */

@Named("userVo")
@RequestScoped
public class UserVo {

    private String userId;
    private String userName;
    private String joinDate;
    private String registYn;
    private String outDate;

    private List<UserVo> userList;
    
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public String getRegistYn() {
        return registYn;
    }

    public void setRegistYn(String registYn) {
        this.registYn = registYn;
    }

    public String getOutDate() {
        return outDate;
    }

    public void setOutDate(String outDate) {
        this.outDate = outDate;
    }

}
