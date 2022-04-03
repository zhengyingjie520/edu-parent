package com.zyj.demo.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @ClssName DemoData
 * @Description todo
 * @Author zyj
 * @Date 3/4/2022 上午 11:07
 * @Version 1.0
 **/
@Data
public class DemoData {
    //设置excel表头名称
    @ExcelProperty(value = "学生编号",index = 0)
    private Integer sno;
    @ExcelProperty(value = "学生姓名",index = 1)
    private String sname;

}
