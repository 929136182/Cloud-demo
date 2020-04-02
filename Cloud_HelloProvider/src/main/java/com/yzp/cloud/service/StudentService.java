package com.yzp.cloud.service;

import com.yzp.cloud.model.dto.SignDto;
import com.yzp.cloud.model.vo.R;

/**
 * @program:
 * @description:
 * @author: yzp
 * @create: 2020/2/13 19:35
 */
public interface StudentService {
    R sign(SignDto dto);
    R queryByName(String name);
    R queryAll();
}
