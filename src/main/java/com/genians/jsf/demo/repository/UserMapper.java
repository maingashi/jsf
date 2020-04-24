/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genians.jsf.demo.repository;

import com.genians.jsf.demo.vo.UserVo;
import java.util.List;
import org.mybatis.cdi.Mapper;

/**
 *
 * @author 이준수
 */
@Mapper
public interface UserMapper {

    public List<UserVo> selectListUserId();
    
    public void insertUserInfo(UserVo vo);

    public void updateUserInfo(UserVo vo);
    
    public void deleteUserInfo(UserVo vo);
    
    public int ChkUser(UserVo vo);
    
}
