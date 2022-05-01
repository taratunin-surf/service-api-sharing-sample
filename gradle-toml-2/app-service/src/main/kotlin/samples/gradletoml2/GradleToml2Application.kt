package samples.gradletoml2

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
// ToDo: separate to constant module
@EnableFeignClients(basePackages = ["project.service.api"])
class GradleToml2Application

fun main(args: Array<String>) {
    runApplication<GradleToml2Application>(*args)
}
