package com.genians.jsf.demo.controller;

import com.genians.jsf.demo.service.BoardService;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;

import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author 이준수
 */
@Named("board")
@RequestScoped
public class BoardController {

    private static final Logger logger = Logger.getLogger(BoardController.class.getName());

    @Inject
    private BoardService service;
    
    

    public String getFoo() {
        logger.info("=========Logger=============");
        System.out.println("===========================");
        return service.getDate();
    }
    
    public String getBar() {
        return service.getDate2();
    }
}
