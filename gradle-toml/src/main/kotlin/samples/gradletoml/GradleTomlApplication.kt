package samples.gradletoml

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GradleTomlApplication

fun main(args: Array<String>) {
    runApplication<GradleTomlApplication>(*args)
}
