/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.Scanner;

/**
 *
 * @author 201743566
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      char operator;
        
        int num1,num2,results;
        
        Scanner input = new Scanner(System.in);
        System.out.println("PLEASE CHOOSE OPERATOR : Addition ,Subtraction , Multiplication , Division ");
        
        operator=input.next().charAt(0);
        
        System.out.println("PLEASE ENTER FIRST NUMBER :");
        num1=(int) input.nextDouble();
        
        System.out.println("PLEASE ENTER SECOND NUMBER:");
        num2=(int) input.nextDouble();
        
        switch (operator){
            
            case '+':
                
                results = num1 + num2;
                System.out.println(num1 +" + " + num2 +" ="+ results);
                break;
                
                case'-':
                    
                results = num1 - num2;
                System.out.println(num1 +" - " + num2 +" ="+ results);
                break;
                
            case'*':
                
                results = num1 * num2;
                System.out.println(num1 +" * " + num2 +" = " + results);
                break;
                
                case'/':
                    
                results = num1 / num2;
                System.out.println(num1 +" +" + num2 +" = " + results);
                break;
                
                default:
                    System.out.println("Invalid operator!");
                    break;
                
        }
        input.close();
    }
    
}
