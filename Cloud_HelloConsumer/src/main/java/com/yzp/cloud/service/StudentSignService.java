package com.yzp.cloud.service;

import com.yzp.cloud.fallback.MyFallBackFactory;
import com.yzp.cloud.model.dto.SignDto;
import com.yzp.cloud.model.vo.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program:
 * @description:
 * @author: yzp
 * @create: 2020/2/13 20:06
 */
@FeignClient(value = "xph-provider" , fallbackFactory = MyFallBackFactory.class)
public interface StudentSignService {
    @PostMapping("/provider/sign/save.do")
    R save(@RequestBody SignDto dto);
    @GetMapping("/provider/sign/queryname.do")
    R names(@RequestParam String name);
    @GetMapping("/provider/sign/all.do")
    R all();
}
