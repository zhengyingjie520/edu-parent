package com.zyj.eduservice.controller;

import com.zyj.commonutils.R;
import org.springframework.web.bind.annotation.*;

/**
 * @ClssName EduLoginController
 * @Description todo
 * @Author zyj
 * @Date 2/4/2022 下午 8:14
 * @Version 1.0
 **/

@RestController
@RequestMapping("/eduservice/user")
@CrossOrigin
public class EduLoginController {

    //1.login
    @PostMapping("login")
    public R login(){
        return R.ok().data("token","admin");
    }

    //2.info
    @GetMapping("info")
    public R info(){
        return R.ok().data("roles","[admin]").data("name","admin").data("avatar","https://img1.baidu.com/it/u=583582599,306470958&fm=253&fmt=auto&app=138&f=JPEG?w=500&h=500");
    }
}
