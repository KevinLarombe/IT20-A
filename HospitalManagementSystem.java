package hospitalmanagementsystem;

import java.util.PriorityQueue;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Queue;

public class HospitalManagementSystem {
   public static void main(String[] args) {
        Queue <String> arrivalpatients = new LinkedList <>();
        
        System.out.println("=== Arrival Order ===");
        arrivalpatients.offer("Anna (Severity: " + 3 + ")");
        arrivalpatients.offer("Bob (Severity: " + 1 + ")");
        arrivalpatients.offer("Carla (Severity: " + 2 + ")");
        arrivalpatients.offer("Dave (Severity:" + 1 + ")");
        
        System.out.println("Arrival Order: " + arrivalpatients);
        
         PriorityQueue <String> patients = new PriorityQueue <>(Comparator.comparingInt(
                 s-> Integer.parseInt(s.replaceAll("[^0-9]", ""))
         ));
         
         patients.addAll(arrivalpatients);
         
           System.out.println("\n=== Treatment Order ===");
         while(!patients.isEmpty()){
             System.out.println("Treating: " + patients.poll());
         }
    }
}