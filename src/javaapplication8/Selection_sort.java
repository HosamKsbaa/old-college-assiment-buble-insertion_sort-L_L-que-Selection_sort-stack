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
public class Selection_sort {
     Scanner x=new Scanner(System.in);
    int []a;
    int s;
    
    public Selection_sort()
    {
        s=x.nextInt();
        a= new int[s];
        
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
        int smallin;
        int temp;
        for(int i =0 ;i<s;i++)
        {
            smallin=i;
            for(int i2=i+1;i2<s;i2++)
            {
                if(a[i2]<a[smallin])
                {
                    smallin=i2;
                }
            }
            temp=a[i];
            a[i]=a[smallin];
            a[smallin]=temp;
            
        }
        
        
        
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
