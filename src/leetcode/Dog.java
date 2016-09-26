/**
 * 
 */
package leetcode;

import java.util.Comparator;

/**
 * @author Laxmikant
 *
 */
public class Dog implements Comparator<Dog>, Comparable<Dog>{
   private String name;
   private int age;
   Dog(){
   }

   Dog(String n, int a){
      name = n;
      age = a;
   }

   public String getDogName(){
      return name;
   }

   public int getDogAge(){
      return age;
   }

   // Overriding the compareTo method
   public int compareTo(Dog d){
      return (this.name).compareTo(d.name);
   }

   // Overriding the compare method to sort the age 
   public int compare(Dog d, Dog d1){
      return d1.age - d.age;
   }
}
