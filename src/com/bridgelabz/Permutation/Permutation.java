package com.bridgelabz.Permutation;

import java.util.Scanner;

public class Permutation {

	//main 
	public static void main(String[] args) {     
        System.out.println("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        permute(str, 0, str.length());
    }
	
	//method for calculate permutation string
    
    private static void permute(String str, int start, int last) {  
        if(start==last-1){
            System.out.println(str);
        }else {
            for (int i=start;i<last;i++){
                str = Stringswap(str,start,i);
                permute(str,start+1,last);
                str = Stringswap(str,start,i);
            }
        }
    }
    
  //method for swap position
      
    public static String Stringswap(String string, int i, int j) {      
        	char temp;
            char[] charArray = string.toCharArray();            
            temp = charArray[i] ;
            charArray[i] = charArray[j];
            charArray[j] = temp;
            return String.valueOf(charArray);
    }
}

