package com.zyj.servicebase.exceptionhandler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClssName MyException
 * @Description todo
 * @Author zyj
 * @Date 1/4/2022 下午 6:58
 * @Version 1.0
 **/

@Data
@AllArgsConstructor//生成有参数的构造方法
@NoArgsConstructor//生成无参数构造
public class MyException extends RuntimeException{

    private Integer code;//状态码

    private String msg;//异常信息

}
