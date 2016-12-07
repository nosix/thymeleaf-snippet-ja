package org.anyspirit.snippet.thymeleaf

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.RequestMapping
import java.util.*

@Controller
class ThymeleafSnippetController {

    data class Address(val zipCode: String, val city: String)
    data class User(val name: String, val age: Int, val address: Address, val isEnabled: Boolean)

    @ModelAttribute("property")
    fun populateProperty() = "age"

    @ModelAttribute("tag")
    fun populateTag() = "<span>text</span>"

    @ModelAttribute("user")
    fun populateUser() = User("Taro", 20, Address("123-4567", "Tokyo"), true)

    @ModelAttribute("list")
    fun populateList() = listOf(0, 2, 1)

    @ModelAttribute("map")
    fun populateMap() = mapOf("jp" to "Japanese", "en" to "English")

    @ModelAttribute("messageKey")
    fun populateMessageKey() = "string.welcome"

    @ModelAttribute("keyword")
    fun populateKeyword() = "thymeleaf"

    @ModelAttribute("java")
    fun populateJava() = "if (i > 0) { System.out.print(\"Hello\\n\"); }"

    @ModelAttribute("javascript")
    fun populateJavascript() = "if (i > 0) { console.log(\"Hello\\n\"); }"

    @ModelAttribute("comparator")
    fun populateComparator() = Comparator<Int> { o1, o2 ->
        when {
            o1 == null -> -1
            o2 == null -> +1
            else -> o2 - o1
        }
    }

    @RequestMapping("/")
    fun show(): String = "thymeleaf-snippet"
}