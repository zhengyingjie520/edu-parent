package com.zyj.eduservice.controller;


import com.zyj.eduservice.entity.EduTeacher;
import com.zyj.eduservice.service.EduTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
@RestController
@RequestMapping("/eduservice/teacher")
public class EduTeacherController {
    //把service注入，http://localhost:8001/eduservice/teacher/findAll
    @Autowired
    private EduTeacherService teacherService;

    //查询讲师表中的所有数据
    @GetMapping("findAll")
    public List<EduTeacher> findAllTeacher(){
        List<EduTeacher> list = teacherService.list(null);
        return list;
    }
}

