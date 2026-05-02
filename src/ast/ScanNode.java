package ast;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScanNode implements Node{
    private List<String> varNames = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public void addVarName(String name){
        varNames.add(name);
    }

    @Override
    public Object evaluate(){
        for(String name : varNames){
            System.out.print("? "+ name + " = "); // Konzolos segítség
            String input = scanner.next();
            try{
                // Ha van benne pont, akkor double, amúgy meg int
                if(input.contains(".")){
                    Memory.setValue(name, Double.parseDouble(input));
                } else{
                    Memory.setValue(name, Integer.parseInt(input));
                }
            } catch (NumberFormatException e){
                throw new RuntimeException("Error: Invalid number format for variable '"+ name +"'.");
            }
        }
        return null;
    }
}
