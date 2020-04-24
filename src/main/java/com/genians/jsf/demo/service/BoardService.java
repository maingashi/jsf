/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genians.jsf.demo.service;

import com.genians.jsf.demo.repository.BoardMapper;
import com.genians.jsf.demo.repository.DemoMapper;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author 이준수
 */
@RequestScoped
public class BoardService {

    @Inject
    private DemoMapper mapper;

    @Inject
    private BoardMapper mapper2;

    public String getDate() {
        return mapper.toDay();
    }

    public String getDate2() {
        return mapper2.toDay();
    }
}
