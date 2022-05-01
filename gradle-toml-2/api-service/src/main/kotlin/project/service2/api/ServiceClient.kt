package project.service2.api

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@FeignClient("service")
@RequestMapping("service")
interface ServiceClient {

    @GetMapping
    fun method1(@RequestParam("name") name: String): String
}
