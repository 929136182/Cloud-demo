package com.yzp.cloud.model.entity;

import lombok.Data;

import java.util.Date;

/**
 * @program:
 * @description:
 * @author: yzp
 * @create: 2020/2/13 19:20
 */
@Data
public class StudentSign {
    private Integer id;
    private String name;
    private String clsname;//班级
    private Date stime;//签到时间
    private String type;//类型 ：第一节签到 第二节签到
}
