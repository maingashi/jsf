/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genians.jsf.demo.vo;

import java.util.List;
import lombok.Data;

/**
 *
 * @author 이준수
 */
@Data
public class BoardVo {

    public String num;
    public String context;
    public String userId;
    public String subject;
    public String createDate;
    public String editDate;
    public String deleteYn;
    public List<BoardVo> boardList;

}
