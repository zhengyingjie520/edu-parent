package com.zyj.eduservice.service;

import com.zyj.eduservice.entity.EduSubject;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zyj.eduservice.entity.subject.OneSubject;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * <p>
 * 课程科目 服务类
 * </p>
 *
 * @author zyj
 * @since 2022-04-03
 */
public interface EduSubjectService extends IService<EduSubject> {
    //添加课程分类
    void saveSubject(MultipartFile file, EduSubjectService subjectService);

    //课程分类列表（树形）
    List<OneSubject> getAllOneTwoSubject();
}
