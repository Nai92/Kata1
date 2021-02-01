/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.time.LocalDate;
import java.time.Month;
/**
 *
 * @author Nigel
 */
public class Kata1 {
    
    
    public static void main(String[] args) {
        Person person = new Person("Nigel", LocalDate.of(1992, Month.DECEMBER, 28));
        System.out.println(person.getName() + " tiene: " + person.getAge()+ " años");
    }
}





