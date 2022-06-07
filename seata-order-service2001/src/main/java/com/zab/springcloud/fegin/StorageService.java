package com.zab.springcloud.fegin;

import com.zab.springcloud.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "seata-storage-service")
public interface StorageService {

    /**
     * 扣减库存
     *
     * @param productId 产品id
     * @param count     数量
     * @return 返回参数
     */
    @PostMapping(value = "/storage/decrease")
    CommonResult<String> decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);

}
