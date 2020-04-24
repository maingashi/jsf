/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genians.jsf.demo.repository;

import org.mybatis.cdi.Mapper;

/**
 *
 * @author 이준수
 */

@Mapper
public interface DemoMapper {

    public String toDay();
}
