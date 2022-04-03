package com.zyj.servicebase.exceptionhandler;


import com.zyj.commonutils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClssName GlobalExceptionHandler
 * @Description 统一异常处理类
 * @Author zyj
 * @Date 1/4/2022 下午 3:18
 * @Version 1.0
 **/
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    //指定出现什么异常执行这个方法
    @ExceptionHandler(Exception.class)
    @ResponseBody //为了返回数据
    public R error(Exception e) {
        e.printStackTrace();
        return R.error().message("执行了全局异常处理..");
    }

    //特定异常
    @ExceptionHandler(ArithmeticException.class)
    @ResponseBody //为了返回数据
    public R error(ArithmeticException e) {
        e.printStackTrace();
        return R.error().message("执行了ArithmeticException异常处理..");
    }

    //自定义异常
    @ExceptionHandler(MyException.class)
    @ResponseBody //为了返回数据
    public R error(MyException e) {
        log.error(e.getMessage());
        e.printStackTrace();

        return R.error().code(e.getCode()).message(e.getMsg());
    }

}
