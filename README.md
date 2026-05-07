# SimpleScript Interpreter with ANTLR

A custom scripting language interpreter built with **Java** and **ANTLR4**. 
This project was created as an assignment for a University "Compilers" (Fordítóprogramok) course. 

Unlike basic parsers, this program does not just check syntax; it dynamically generates an **Abstract Syntax Tree (AST)** using the Visitor pattern and fully evaluates/executes the code at runtime.

## Features

The language features C-style syntax and supports the following:

*   **Abstract Syntax Tree (AST) Execution:** Clean, OOP-based tree evaluation architecture.
*   **Data Types:** `int` and `double` with automatic type coercion (e.g., int + double = double).
*   **Global Variables:** Declaration (with optional immediate initialization), assignment, and deletion (`del`). Strict memory management prevents using undeclared variables.
*   **Mathematics & Precedence:** `+`, `-`, `*`, `/`, and parentheses `()`.
*   **Relational & Ternary Operators:** `<`, `>`, `==`, `!=`, and `?:`. (Evaluates to `1` for true, `0` for false).
*   **Control Structures:** 
    *   `if-else`
    *   `while` loop
    *   `for` loop
    *   `switch-case-default` (supports fall-through and `break` statements).
*   **I/O Operations:** `print(...)` for console output and `scan(...)` for reading user input.
*   **Built-in Functions:** 
    *   `TIME`: Returns the current UNIX timestamp in seconds.
    *   `ABS(x)`: Returns the absolute value of a number.
*   **Comments:** Supports `//`, `#` (single-line), and `/* ... */` (multi-line) comments.

## Project Structure

*   `ScriptLang.g4`: The ANTLR4 grammar file defining the lexer and parser rules with strict operator precedence.
*   `src/MyVisitor.java`: Converts the ANTLR parse tree into our custom AST.
*   `src/ast/`: Contains all AST Node classes (`IdNode`, `NumberNode`, `BinaryOpNode`, etc.) and the `Memory` manager. Every node implements an `evaluate()` method with `Object` return type.
*   `src/Main.java`: The entry point that tokenizes, parses, builds the AST, and executes the script.

## Language Syntax Example

Here is a valid script in this language that calculates the sum of numbers from 0 to 9 and measures the execution time:

```c
# Initialize variables
int starttime = TIME;
int sum = 0;
int x;

// Calculate sum
for (x = 0; x < 10; x = x + 1) {
    sum = sum + x;
}

print(sum);
print(TIME - starttime); // Execution time in seconds
```

Advanced `switch-case` with fall-through and user input:

```c
int x;
int y = 5;
scan(x); // Wait for user input

switch(x) {
    case 1: print(111); break;
    case 2: del y;      // Fall-through happens here
    case 3: x = 5; break;
    default: x = 10;
}
print(x+y);";
```

## Tech Stack & Requirements
*   **Java 21** (Compatible with Java 11+)
*   **ANTLR 4.11.1** (Provided as a `.jar` in the build path. In VSCode: Java projects -> Referenced Libraries -> Add `antlr-4.11.1-complete.jar`)

## How to Generate and Run
1. Generate lexer, parser, and visitor files from the grammar (in the main folder):
```bash
java -jar .\antlr-4.11.1-complete.jar  .\src\ScriptLang.g4 -visitor -no-listener
```
2. Compile the Java files
3. Run `Main.java` to execute the program and read from the `Test.txt` file ( or use the embedded scripts that are provided in code).
