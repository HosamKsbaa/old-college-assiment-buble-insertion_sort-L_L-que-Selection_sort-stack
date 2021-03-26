/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class buble {
    
    Scanner x=new Scanner(System.in);
    int []a;
    int s;
    
    public buble()
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
    
        int temp;
        for(int f1=0;f1<s;f1++)
        {
            for(int f2=0;f2<s-f1-1;f2++)
            {
                if(a[f2]<a[f2+1])
                {
                    temp=a[f2];
                    a[f2]=a[f2+1];
                    a[f2+1]=temp;
                }
            }
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
    
