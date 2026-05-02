package ast;

import java.util.Map;
import java.util.HashMap;

public class Memory {
    // Változók típusai
    private static Map<String, String> types = new HashMap<>();

    // Változók értékei
    private static Map<String, Object> values = new HashMap<>();

    // Deklaráció
    public static void declare(String name, String type){
        if (types.containsKey(name)){
            throw new RuntimeException("Error: Variable '"+ name + "' is already declared");
        }
        types.put(name, type);

        // Kezdőérték
        if (type.equals("int")){
            values.put(name, 0);
        } else{
            values.put(name, 0.0);
        }
    }

    // Törlés
    public static void delete(String name){
        if(!types.containsKey(name)){
            throw new RuntimeException("Error: Cannot delete undeclared variable '"+ name +"'.");
        }
        types.remove(name);
        values.remove(name);
    }

    // Értékadás
    public static void setValue(String name, Object value){
        if(!types.containsKey(name)){
            throw new RuntimeException("Error: Variable '"+ name + "' is not declared");
        }

        // Típuskényszerítés vagy ellenőrzés
        String type = types.get(name);
        if(type.equals("int")){
            if(value instanceof Double){
                // Int típusba akarok Double-t beletenni akkor levágjuk a tört részt
                values.put(name, ((Double) value).intValue());
            } else{
                values.put(name, value);
            }
        } else if(type.equals("double")){
            if(value instanceof Integer){
                // Double-be akarok tenni Int-et, castoljuk.
                values.put(name, ((Integer)value).doubleValue());
            } else{
                values.put(name, value);
            }
        }
    }

    // Érték lekérése
    public static Object getValue(String name){
        if(!types.containsKey(name)){
            throw new RuntimeException("Error: Undeclared variable '"+ name +"'.");
        }
        return values.get(name);
    }

}
