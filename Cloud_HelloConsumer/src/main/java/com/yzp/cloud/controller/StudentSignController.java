package com.yzp.cloud.controller;

import com.yzp.cloud.model.dto.SignDto;
import com.yzp.cloud.model.vo.R;
import com.yzp.cloud.service.StudentSignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program:
 * @description:
 * @author: yzp
 * @create: 2020/2/13 20:17
 */
@RestController
public class StudentSignController {
    @Autowired
    private StudentSignService signService;

    @PostMapping("/api/sign/save.do")
    public R names(@RequestBody SignDto dto){
        return signService.save(dto);
    }
    @GetMapping("/api/sign/queryname.do")
    public R names(@RequestParam String name){
        return signService.names(name);
    }
    @GetMapping("/api/sign/all.do")
    public R all(){
        return signService.all();
    }
}
