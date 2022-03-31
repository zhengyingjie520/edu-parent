package com.zyj.eduservice.controller;


import com.zyj.eduservice.entity.EduTeacher;
import com.zyj.eduservice.service.EduTeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author zyj
 * @since 2022-03-29
 */
@Api(tags = "讲师管理")
@RestController
@RequestMapping("/eduservice/teacher")
public class EduTeacherController {
    //把service注入，http://localhost:8001/eduservice/teacher/findAll
    @Autowired
    private EduTeacherService teacherService;

     //查询讲师表中的所有数据
     @ApiOperation(value = "所有讲师列表")
     @GetMapping("findAll")
    public List<EduTeacher> findAllTeacher(){
        List<EduTeacher> list = teacherService.list(null);
        return list;
    }


    //讲师逻辑删除功能
    @ApiOperation(value = "逻辑删除讲师")
    @GetMapping("{id}")
    public boolean removeTeacher(@ApiParam(name = "id",value = "讲师ID",required = true) @PathVariable String id){
        boolean flag = teacherService.removeById(id);
        System.out.println(flag);
        return flag;
    }

}

