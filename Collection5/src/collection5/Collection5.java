/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collection5;
import java.util.*;
/**
 *
 * @author ASUS
 */
public class Collection5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    List list=new ArrayList();
    list.add("Jenie");
    list.add("Sherly");
    list.add("Nopeliba");
    list.add("Oktria");
    list.add("Angelyne");
    list.add("Michella");
   
    System.out.println(list);

    System.out.println("2 : "+list.get(2));
    System.out.println("0 : "+list.get(0));
    
    LinkedList queue = new LinkedList();
    queue.addFirst("Oktria");
    queue.addFirst("Nopeliba");
    queue.addFirst("Jenie");
    queue.addFirst("Michella");
    queue.addFirst("Sherly");
    queue.addFirst("Angelyne");
    System.out.println(queue);
    queue.removeLast();
    queue.removeLast();
    System.out.println(queue);


    }
    
}
