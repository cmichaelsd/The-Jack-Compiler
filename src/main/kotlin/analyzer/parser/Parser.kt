package analyzer.parser

import java.io.File

abstract class Parser {
	fun parse(file: File): List<String> {
		var lines = file.useLines { it.toList() }
		lines = removeComments(lines)
		lines = tokenize(lines)
		return lines
	}

	private fun tokenize(lines: List<String>): List<String> {
		val result = mutableListOf<String>()

		for (line in lines) {
			if (line.isBlank()) continue

			val builder = StringBuilder()
            var mode    = false
			for (c in line) {
                if (c == '"') {
                    mode = !mode
                    if (builder.isNotEmpty()) {
                        result.add(builder.toString())
                        builder.clear()
                    }
                } else if (mode) builder.append(c)
                else if (c.isLetterOrDigit() || c == '_') builder.append(c)
                else if (!c.isLetterOrDigit()) {
                    if (builder.isNotEmpty()) {
                        result.add(builder.toString())
                        builder.clear()
                    }

                    if (c != ' ') result.add(c.toString())
                }
            }
		}

		return result
	}

	private fun removeComments(lines: List<String>): List<String> {
		val result  = mutableListOf<String>()
		val builder = StringBuilder()
		var mode    = false

		for (line in lines) {
			var j = 0
			while (j < line.length) {
				if (mode) {
					if (line[j] == '*' && j < line.length - 1 && line[j + 1] == '/') {
						mode = false
						++j
					}
				} else {
					if (line[j] == '/' && j < line.length - 1 && line[j + 1] == '/') {
						break
					} else if (line[j] == '/' && j < line.length - 1 && line[j + 1] == '*') {
						mode = true
						++j
					} else {
						builder.append(line[j])
					}
				}
				++j
			}

			if (!mode && builder.isNotEmpty()) {
				result.add(builder.toString())
				builder.clear()
			}
		}

		return result
	}
}