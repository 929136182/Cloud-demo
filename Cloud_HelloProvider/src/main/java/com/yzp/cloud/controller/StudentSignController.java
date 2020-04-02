package com.yzp.cloud.controller;

import com.yzp.cloud.model.dto.SignDto;
import com.yzp.cloud.model.vo.R;
import com.yzp.cloud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program:
 * @description:
 * @author: yzp
 * @create: 2020/2/13 19:46
 */
@RestController
public class StudentSignController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/provider/sign/save.do")
    public R save(@RequestBody SignDto dto){
        return studentService.sign(dto);
    }

    @GetMapping("/provider/sign/queryname.do")
    public R names(@RequestParam String name){
        return studentService.queryByName(name);
    }

    @GetMapping("/provider/sign/all.do")
    public R all(){
        return studentService.queryAll();
    }
}
