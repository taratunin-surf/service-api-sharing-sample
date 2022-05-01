package samples.gradletoml2.service2.api

import org.springframework.web.bind.annotation.RestController
import project.service.api.GreetingClient
import project.service.dto.GreetingDto
import project.service2.api.ServiceClient

@RestController
class ServiceClientImpl(
    private val greetingClient: GreetingClient
) : ServiceClient {

    override fun method1(name: String): String {
        return greetingClient.greeting(GreetingDto(name)).greetingAnswer
    }
}
