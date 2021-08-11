package com.hou.water.controller;

import com.hou.water.common.constant.ConstantHtml;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author hou
 * @since 2021-07-22
 */
@Controller
@RequestMapping("/signRecord")
public class SignRecordController {

    @RequestMapping("/index2")
    public String index2(){
        return ConstantHtml.INDEX2;
    }

}
