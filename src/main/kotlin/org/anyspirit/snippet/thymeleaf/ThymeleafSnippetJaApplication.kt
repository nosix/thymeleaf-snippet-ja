package org.anyspirit.snippet.thymeleaf

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.support.ResourceBundleMessageSource

@SpringBootApplication
open class ThymeleafSnippetJaApplication {

    @Bean
    open fun messageSource() = ResourceBundleMessageSource().apply {
        setDefaultEncoding("UTF-8")
        setBasenames("templates/string")
    }
/*
    @Bean
    open fun viewResolver() = ThymeleafViewResolver().apply {
        templateEngine = templateEngine()
    }

    @Bean
    open fun templateEngine() = SpringTemplateEngine().apply {
        templateResolvers = setOf(templateResolver())
    }

    @Bean
    open fun templateResolver() = SpringResourceTemplateResolver().apply {
        prefix = "classpath:/templates/"
        suffix = ".html"
        templateMode = "LEGACYHTML5"
        isCacheable = false // TODO: make it true before release
    }
*/
}

fun main(args: Array<String>) {
    SpringApplication.run(ThymeleafSnippetJaApplication::class.java, *args)
}
