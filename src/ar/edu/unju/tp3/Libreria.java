package ar.edu.unju.tp3;

import java.util.Scanner;
/**
 * 
 * @author Augusto Tolaba LU:4060
 *
 */
public class Libreria {
	
	
	/**
	 * 
      class of the result of a palindrome where they are called
*     the methods to calculate whether or not an input string is a palindrome
	 */
	public static void resultado() {
		int q=0;
		String s;
		q=numline(q);
        for (int qItr = 0; qItr < q; qItr++) {
        	do {
        	s= chainss();
        	}while(s.length()>Math.pow(10, 10));
        	System.out.println(s);
        	int result = buildPalindrome(s);
            if(result!=-1) {
            	System.out.println("Quite el valor del indice"+" "+String.valueOf(result)+ " "+"para formar el palindromo");	
            }
            else {
            	 System.out.println(String.valueOf(result));	
            }
            System.out.println("\n");
        }
        System.out.println("FIN ");   
	   }
	
	/**
	 * class num line that returns the number of lines that must
* be less than or equal to 20
	 */
	 public static int numline(int q) {
		 do {
				Scanner sc = new Scanner(System.in);        
		        System.out.println("Inicio. Ingrese cantidad de líneas menor o igual a 20: ");      
		         q = sc.nextInt();
				 }while(q>20);
		 return q;
	 }
	 
	 /**
	  * 
	  * class of type string that returns the entered string that must be
* in the ascii range a-z and also spaces are deleted and it is transformed to lowercase
* calling the alphabet method
	  */
	
	 public static String chainss() {
         String s;
		 
               do {
        	 Scanner teclado = new Scanner(System.in);
             System.out.println("Ingrese cadena en el rango ascii[a-z]: ");  
             s = teclado. nextLine(); 
             s=s.toLowerCase();
     		s=s.replaceAll(" ",""); 
         	}while( alphabet(s)==true);
		    
		 return s;
	 }
	 
	 
	 /**
	  * 
	  * boolean type class that iterates through the string looking for a value that
      * is outside the ascii a-z range, returns true if it finds otherwise
       * fake
	  * @return
	  */
	 public static boolean alphabet(String s) {
		 boolean band=false;
		 if(s.charAt(0)<97 || s.charAt(0)>122) {
				return true;
			}
		 for(int i=0;i<s.length()-1;i++) {
			 if(s.charAt(i)<97 || s.charAt(i)>122) {
				 return true;
			 }
		 }
	 return band;
	 }
	 
	 /**
	  * 
	* class type integer that returns the index number of the string
* where is the value to remove to form a string
* palindrome
	  */
	 
	  public static int buildPalindrome(String s) {
		  String aux=reverseIt(s,s.length()-1);  
	        int i=-1;
	          if(s.equals(aux)) {
	        	  return -1;
	          }
	          else { 
	        	 String auxc;
	        	  for (int j=0; j < s.length();j++)
	        	    {  auxc = s;
	        	        auxc = auxc.substring(0,j) + auxc.substring(j+1);
	        	        aux=reverseIt(auxc,auxc.length()-1);
	        	        if(auxc.equals(aux)) {
	      	        	  return j;
	      	          }
	        	        
	        	    }
	        	 
	        	    } 
	          return i;
	    }
	  
	  /**
	   * 
	  * class type string that returns an inverse string, this is
* implemented recursively
	   * @param index
	   * @return
	   */
	  static String reverseIt(String str, int index){
			if(index == 0){
				return str.charAt(0) + "";
			}
			char letter = str.charAt(index);
			return letter + reverseIt(str, index-1);
		}
	}

