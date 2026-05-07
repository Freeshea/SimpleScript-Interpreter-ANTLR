import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import ast.Node;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws Exception{

        // Teszt kód
        // String code = 
        //     "int starttime;\n" +
        //     "double myVar;\n" +
        //     "starttime = TIME;\n" +
        //     "myVar = ABS(0 - 5.5);\n" +
        //     "print(starttime);\n" +
        //     "print(myVar * 2);\n";

        // String code = 
        //     "int a;\n" +
        //     "int b;\n" +
        //     "a = 10;\n" +
        //     "b = 20;\n" +
        //     "print(a < b);\n" +            // 10 < 20 -> Igaz, tehát 1-et kell kiírnia
        //     "print(a == b);\n" +           // 10 == 20 -> Hamis, tehát 0-t kell kiírnia
        //     "int max;\n" +
        //     "max = (a < b) ? a : b;\n" +   // Melyik a nagyobb?
        //     "print(max);\n";               // 20-at kell kiírnia

        // Példa input #1
        // String code = 
        //     "int starttime = TIME;\n" +
        //     "int sum = 0;\n" +
        //     "int x;\n" +
        //     "// Calculate sum\n" +
        //     "for (x=0; x<10; x=x+1) {\n" +
        //     "  sum = sum + x;\n" +
        //     "}\n" +
        //     "print(sum);\n" +
        //     "print(TIME - starttime);\n";

        // String code = 
        //     "int choice;\n" +
        //     "print(101);\n" +           // Csak kiírunk valamit tesztnek
        //     "scan(choice);\n" +         // Beolvassa a konzolról
        //     "switch (choice) {\n" +
        //     "  case 1: print(1111);\n" +
        //     "  case 2: print(2222);\n" +
        //     "  default: print(0);\n" +
        //     "}\n";

        // Példa input #2
        // String code = 
        //     "# Ez az input fuggvenyeben futhat helyesen\n" +
        //     "# vagy okozhat futasi hibat\n" +
        //     "int x;\n" +
        //     "scan(x);\n" +
        //     "while(x>0) {\n" +
        //     "    switch(x) {\n" +
        //     "        case 1: int y; scan(y); break;\n" +
        //     "        case 2: del y;\n" +
        //     "        case 3: x = 5; break;\n" +
        //     "        default: x = 10;\n" +
        //     "    }\n" +
        //     "    scan(x);\n" +
        //     "}\n" +
        //     "print(x+y);\n";
        
        // String code =
        //     "int x;\n" + 
        //     "int y = 5;\n" + 
        //     "scan(x); // Wait for user input\n" + 
        //     "\n" + 
        //     "switch(x) {\n" + 
        //     "    case 1: print(111); break;\n" + 
        //     "    case 2: del y;      // Fall-through happens here\n" + 
        //     "    case 3: x = 5; break;\n" + 
        //     "    default: x = 10;\n" + 
        //     "}\n" +
        //     "print(x+y);\n";


        // 0. File reading
        String filePath = "Test.txt";
        String code = "";

        try{
            code = Files.readString(Paths.get(filePath));
        } catch (Exception e){
            System.err.println("Error: cannot find the '" + filePath +"' file!");
            System.err.println("Please make sure the file is in the same folder as the 'src' folder!");
            return;
        }

        // 1. Lexer
        CharStream input = CharStreams.fromString(code);
        ScriptLangLexer lexer = new ScriptLangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // 2. Parser
        ScriptLangParser parser = new ScriptLangParser(tokens);
        ParseTree tree = parser.program();

        // 3. Visitor
        MyVisitor visitor = new MyVisitor();
        Node ast = visitor.visit(tree);

        // 4. Execution
        System.out.println("--- Program kimenete ---");
        ast.evaluate();
        System.out.println("------------------------");
    }
}
