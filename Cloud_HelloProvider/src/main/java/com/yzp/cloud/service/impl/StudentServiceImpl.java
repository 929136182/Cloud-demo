package com.yzp.cloud.service.impl;

import com.yzp.cloud.dao.StudentSignDao;
import com.yzp.cloud.model.dto.SignDto;
import com.yzp.cloud.model.entity.StudentSign;
import com.yzp.cloud.model.vo.R;
import com.yzp.cloud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program:
 * @description:
 * @author: yzp
 * @create: 2020/2/13 19:38
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentSignDao signDao;
    @Override
    public R sign(SignDto dto) {
        StudentSign sign = new StudentSign();
        sign.setClsname(dto.getClaname());
        sign.setName(dto.getName());
        sign.setType("上课前签到");
        if (signDao.insert(sign)>0){
            return R.ok();
        }
        return R.fail();
    }

    @Override
    public R queryByName(String name) {
        List<StudentSign> studentSigns = signDao.selectByName(name);
        if (studentSigns!=null){
            return R.ok(studentSigns);
        }
        return R.fail("无数据");
    }

    @Override
    public R queryAll() {
        return R.ok(signDao.selectAll());
    }
}
