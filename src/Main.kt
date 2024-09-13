fun main() {
    println("Привет! Эта программа подсчитывает количество всех символов в введённой строке и выдает их в алфавитном порядке. Всё просто, попробуй! Удачи :)\n")
    while (true) {
        println("Введите строку, содержащую символы (или введите 'exit' для выхода): ")

        val input = readln()

        if (input.equals("exit", ignoreCase = true)) {
            println("Программа завершена.")
            break
        }

        if (input.isEmpty()) {
            println("Ошибка: введена пустая строка. Пожалуйста, введите строку, содержащую хотя бы один символ.")
            println()
            continue
        }

        try {
            val charCountMap = mutableMapOf<Char, Int>()

            for (char in input) {
                charCountMap[char] = charCountMap.getOrDefault(char, 0) + 1
            }

            println("Подсчет символов:")
            charCountMap.toSortedMap().forEach { (char, count) ->
                println("$char - $count")
            }

        } catch (e: Exception) {
            println("Произошла ошибка: ${e.message}")
        }
        finally {
            println()
        }
    }
}
