import java.util.HashMap;
import java.util.Scanner;

public class eliminarPorEdad {
    public static void main(String[ ] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        HashMap<String, Integer> ages = new HashMap<String, Integer>();
        ages.put("David", 22);
        ages.put("Tom", 23);
        ages.put("Robert", 32);
        ages.put("Alice", 21);
        ages.put("Sophie", 19);
        ages.put("Maria", 24);
        ages.put("John", 28);
        
        String[] nameArr = new String[ages.size()];
        nameArr = ages.keySet().toArray(nameArr);
        
        int ageLimit = scanner.nextInt();
        
        for (String emp : nameArr){
            int edad = ages.get(emp);
            if (edad < ageLimit){
                if (ages.containsKey(emp)){
                    ages.remove(emp);
                }
            }            
        }
        
        System.out.println(ages);
    }
}