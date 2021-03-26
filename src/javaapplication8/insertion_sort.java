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
public class insertion_sort {
 Scanner x=new Scanner(System.in);
    int []a;
    int s;
    
    public insertion_sort()
    {
        s=x.nextInt();
        a= new int[5];
        
    }
    public void add()
    {
        for(int i=0;i<s;i++)
        {
            a[i]=x.nextInt();
        }
    }
   ////////////////
    public void sort()
    {
    
        
        
        
    }
    /////////////////
    
    public void printall()
    {
        for(int i1=0;i1<s;i1++)
        {
            System.out.println(a[i1]);
        }
    }    
}
