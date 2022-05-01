package samples.gradletoml

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class GradleTomlApplication

fun main(args: Array<String>) {
    runApplication<GradleTomlApplication>(*args)
}
