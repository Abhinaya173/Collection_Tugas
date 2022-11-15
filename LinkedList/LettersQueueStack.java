/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

import java.util.LinkedList;

/**
 *
 * @author ABHINAYA
 */
public class LettersQueueStack {
    public static void main(String[] args) {
        LinkedList<String> lettersQ= new LinkedList<String>();
        lettersQ.push("A");
        lettersQ.push("V");
        lettersQ.push("C");
        
        System.out.println("Linked List : " + lettersQ);
        System.out.println("Queue Size: " + lettersQ.size());
        
        while(!lettersQ.isEmpty()){
           System.out.println(lettersQ.pop());
        }
        System.out.println("Linked list : " + lettersQ);
    }
}
