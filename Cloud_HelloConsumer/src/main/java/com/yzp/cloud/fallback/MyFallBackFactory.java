package com.yzp.cloud.fallback;

import com.yzp.cloud.model.dto.SignDto;
import com.yzp.cloud.model.vo.R;
import com.yzp.cloud.service.StudentSignService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.security.PublicKey;

/**
 * @program:
 * @description:
 * @author: yzp
 * @create: 2020/2/13 21:08
 */
@Component
public class MyFallBackFactory implements FallbackFactory<StudentSignService> {
    @Override
    public StudentSignService create(Throwable throwable) {
        //匿名内部类
        return new StudentSignService() {
            @Override
            public R save(SignDto dto) {
                return R.fail("服务不可用-save");
            }

            @Override
            public R names(String name) {
                return R.fail("服务不可用-names" + name);
            }

            @Override
            public R all() {
                return R.fail("服务不可用-all");
            }
        };
    }
}
