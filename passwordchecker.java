package javaproject;

import java.util.Scanner;

public class passwordchecker {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // int lc=0;
        // int uc=0;
        // int d=0;
        // int sy=0;
        System.out.println("Enter your Password: ");
        String pass=sc.next();
        int lc=0;
        int uc=0;
        int d=0;
        int sy=0;
        for(int i=0;i<pass.length();i++){
            if(pass.charAt(i)>='a' && pass.charAt(i)<='z' )
              {
                lc+=1;
              }
            if(pass.charAt(i)>='A' && pass.charAt(i)<='Z'){
                uc+=1;     
            }
            if(pass.charAt(i)>='0'&& pass.charAt(i)<='9'){
                d+=1;
            }
            if (pass.charAt(i)=='@'||pass.charAt(i)=='&' || pass.charAt(i)=='$'|| pass.charAt(i)=='#'){
                sy+=1;
            }
        }
        if(uc>=1 && lc>=1 && sy>=1 && d>=1){
            System.out.println("Valid password!");
        }
        else{
            System.out.println("Invalid password!");
        }
    }
    
}
