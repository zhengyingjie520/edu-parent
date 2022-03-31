package com.zyj.eduservice;

import com.zyj.eduservice.entity.EduTeacher;
import com.zyj.eduservice.service.EduTeacherService;
import lombok.val;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @ClssName eduTeacherTest
 * @Description todo
 * @Author zyj
 * @Date 31/3/2022 下午 6:52
 * @Version 1.0
 **/

@SpringBootTest
public class eduTeacherTest {

    @Autowired
    private EduTeacherService teacherService;

    @Test
    public void teach(){
        val str = "5";
        EduTeacher teacher = teacherService.getById(str);
        System.out.println(teacher);
    }

}
