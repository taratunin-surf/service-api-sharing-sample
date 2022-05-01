package samples.gradletoml.service.api

import org.springframework.web.bind.annotation.RestController
import project.service.api.GreetingClient
import project.service.dto.GreetingDto
import project.service.dto.GreetingResponse

@RestController
class GreetingClientImpl : GreetingClient {

    override fun greeting(greetingData: GreetingDto): GreetingResponse {
        return GreetingResponse("Greetings ${greetingData.name}")
    }

    override fun parting(): GreetingResponse {
        return GreetingResponse("Farewell")
    }
}
