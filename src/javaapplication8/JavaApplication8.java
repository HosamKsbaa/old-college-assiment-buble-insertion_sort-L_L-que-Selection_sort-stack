/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int x=z.nextInt();
        System.out.println("sort choise");
        if(x==0)
        {
            Selection_sort a=new Selection_sort();
           System.out.println("add");

            a.add();
            System.out.println("done adding now sorting");
            a.sort();
            System.out.println("done sorting  now printing all");
            a.printall();
            System.out.println("done ");

        }
        else if(x==1)
        {
            buble a=new buble();
           System.out.println("add");

            a.add();
            System.out.println("done adding now sorting");
            a.sort();
            System.out.println("done sorting  now printing all");
            a.printall();
            System.out.println("done ");
        }
        else if(x==2)
        {
            L_L l1=new L_L();
            System.out.println("enter size ");

            int c=z.nextInt();
            int temp;
            System.out.println("enter all elem ");

            for(int f1=0;f1<c;f1++)
            {
            temp=z.nextInt();
            //l1.append(temp);
            l1.prepend(temp);
            }
            System.out.println("===");
            temp=z.nextInt();
            l1.search(8).insertaft(temp);
            
            System.out.println("print all");

            l1.print_all();
        }
        else if(x==3){}
        else if(x==4){}
        else if(x==5){}
        
    }
    
}
