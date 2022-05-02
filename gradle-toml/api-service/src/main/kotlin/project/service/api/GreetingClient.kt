package project.service.api

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import project.service.dto.GreetingDto
import project.service.dto.GreetingResponse

@FeignClient(name = "greeting", url = "\${greetingUrl}")
interface GreetingClient {

    @PostMapping("greeting")
    fun greeting(@RequestBody greetingData: GreetingDto): GreetingResponse

    @DeleteMapping("greeting")
    fun parting(): GreetingResponse
}
