package project.service.api

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import project.service.dto.GreetingDto
import project.service.dto.GreetingResponse

@FeignClient("greeting")
@RequestMapping("greeting")
interface GreetingApi {

    @PostMapping
    fun greeting(@RequestBody greetingData: GreetingDto): GreetingResponse

    @DeleteMapping
    fun parting(): GreetingResponse
}
