package com.genians.jsf.demo.controller;

import com.genians.jsf.demo.service.BoardService;
import com.genians.jsf.demo.vo.BoardVo;
import java.util.List;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;

import javax.inject.Inject;
import javax.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author 이준수
 */
@Named("board")
@RequestScoped
public class BoardController {

    private static final Logger logger = Logger.getLogger(BoardController.class.getName());

    @Autowired
    private BoardService service;
    
    public List<BoardVo> listBoard(){
        return service.boardList();
    }
    
}
