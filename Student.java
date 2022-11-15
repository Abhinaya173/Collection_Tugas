/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ABHINAYA
 */
import java.util.ArrayList;
import java.util.Collections;
public class Student {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList();
        addStudents(studentNames);
        displayStudents(studentNames);
        Collections.sort(studentNames);
        displayStudents(studentNames);
    }

    static void displayStudents(ArrayList<String> studentNames) {
        for(String student: studentNames)
            System.out.println("Student Name : " + student);
    }
    
    static void addStudents(ArrayList<String> studentNames){
        studentNames.add("Mark");
        studentNames.add("Andrew");
        studentNames.add("Beth");
        studentNames.remove("Andrew");
    }
}
