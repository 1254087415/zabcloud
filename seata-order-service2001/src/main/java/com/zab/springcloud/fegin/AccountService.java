package com.zab.springcloud.fegin;

import com.zab.springcloud.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@FeignClient(value = "seata-account-service")
public interface AccountService {

    /**
     * 扣减余额
     *
     * @param userId 用户id
     * @param money  用户余额
     * @return 返回参数
     */
    @PostMapping(value = "/account/decrease")
    CommonResult<String> decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
