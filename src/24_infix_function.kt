infix fun String.substringMatches(r: Regex) : List<String> {
    return r.findAll(this)
      .map { it.value }
      .toList()
}

val matches = "a bc def" substringMatches ".*? ".toRegex()
Assert.assertEquals(listOf("a ", "bc "), matches)
