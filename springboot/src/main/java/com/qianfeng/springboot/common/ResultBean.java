package com.qianfeng.springboot.common;

import lombok.AllArgsConstructor;
import lombok.Data;
/**
 * @author qiujinyao
 * @version 1.0
 * @Date 2019/7/30
 */
@Data
@AllArgsConstructor
public class ResultBean<T> {
    //状态码
    private String respCode;
    //异常信息
    private T data;
}
