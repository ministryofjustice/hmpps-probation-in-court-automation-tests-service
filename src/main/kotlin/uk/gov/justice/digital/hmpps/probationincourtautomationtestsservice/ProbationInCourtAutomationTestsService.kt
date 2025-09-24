package uk.gov.justice.digital.hmpps.probationincourtautomationtestsservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ProbationInCourtAutomationTestsService

fun main(args: Array<String>) {
  runApplication<ProbationInCourtAutomationTestsService>(*args)
}
