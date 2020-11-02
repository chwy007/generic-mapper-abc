package com.yujizi.aspect;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ProjectName: generic-mapper-abc
 * @Package: com.yujizi.aspect
 * @ClassName: GlobalException
 * @Author: ychw
 * @Description:
 * @Date: 2020/10/30 14:19
 * @Version: 1.0
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public String globalexcep(Exception e){
        System.out.println("未知异常！原因是"+e);
        return "redirect:/templates/globalException.html";
    }

}
