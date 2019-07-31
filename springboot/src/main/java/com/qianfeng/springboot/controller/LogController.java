package com.qianfeng.springboot.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qiujinyao
 * @version 1.0
 * @Date 2019/7/30
 */
@RestController
@RequestMapping("log")
public class LogController {
    private Logger logger= LoggerFactory.getLogger(LogController.class);
    @RequestMapping("getlog")
    public String log(){
        logger.debug("debug...");
        logger.debug("info..");
        logger.warn("warn..");
        logger.error("error..");
        return "ok";
    }
}
