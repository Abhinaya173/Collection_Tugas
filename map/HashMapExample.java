/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package map;

/**
 *
 * @author ABHINAYA
 */
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args){
        HashMap<String,String> fruitBowl = new HashMap<String, String>();
        addElements(fruitBowl);
    }
    static void addElements(HashMap<String, String> fruitBowl){
        fruitBowl.put("Apple", "Green");
        fruitBowl.put("Banana", "Yellow");
        fruitBowl.put("Melon", "Blue");
        
        findElement(fruitBowl, "Banana");
    }
    static void findElement(HashMap<String, String> fruitBowl, String fruit){
        if(fruitBowl.containsKey(fruit))
            System.out.println("The " + fruit + " is " + fruitBowl.get(fruit));
    }
    
    static void displayElements(HashMap<String, String> fruitBowl){
        System.out.println(fruitBowl);
        for (HashMap.Entry<String, String> fruit : fruitBowl.entrySet())
        {
            System.out.println("Fruit: " + fruit.getKey() + "Colour : " + fruit.getValue());
        }
    }
}
