import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	trie t=new trie();
    	
    	Scanner sc = new Scanner(System.in);
    	int numberOfLines = Integer.parseInt(sc.nextLine());
  
    	for (int i = 1; i<= numberOfLines;i++){
    		
    	String word =	sc.nextLine();
    	t.insert(word);
    	if(t.flag==true)
    		break;
       }
    	
    	
       
    	if(t.flag==false)
    		System.out.println("GOOD SET");
    		
    
    
}
}