package org.anyspirit.snippet.thymeleaf

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.web.client.RestTemplate
import java.nio.file.*

@RunWith(SpringRunner::class)
@SpringBootTest
class ThymeleafSnippetJaApplicationTests {

	@Test
	fun generateHtml() {
		RestTemplate().getForObject("http://localhost:8080/", String::class.java).run {
			Files.newBufferedWriter(Paths.get("generated.html")).use {
				it.write(this)
			}
		}
	}

}
