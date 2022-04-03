package com.zyj.eduservice.entity.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @ClssName SubjectData
 * @Description todo
 * @Author zyj
 * @Date 3/4/2022 下午 12:01
 * @Version 1.0
 **/
@Data
public class SubjectData {
    @ExcelProperty(index = 0)
    private String oneSubjectName;

    @ExcelProperty(index = 1)
    private String twoSubjectName;
}
