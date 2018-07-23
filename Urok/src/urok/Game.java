/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urok;

import java.util.Scanner;



/**
 *
 * @author User
 */
public class Game {
    // == and equals
        public static void main(String[] args) {
            System.out.println("1. Summer");
            System.out.println("2. Winter");
            System.out.println("3. Spring");
            System.out.println("4. Autmn");
            Scanner s=new Scanner(System.in);
            
            int day=s.nextInt();
            String dayString;
    switch (day) {
        case 1:  dayString = "Hot";
                 break;
        case 2:  dayString = "Cold";
                 break;
        case 3:  dayString = "Warm";
                 break;
      
        case 4: dayString = "Rain";
                 break;
        default: dayString = "Please, try to write number 1-42";
                 break;        
    }
    System.out.println(dayString);

    }
}

