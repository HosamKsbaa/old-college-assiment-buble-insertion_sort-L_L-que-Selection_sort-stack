/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author User
 */
public class que {
    int []arr;
    int size;
    int tail;
    public que(int s1)
    {
        size=s1;
        arr=new int[s1];
    }
    public void getHead(){}
    public void enqueue(int data)
    {
        arr[tail++]=data;
    }
    public int dequeue()
    {
        int rear=tail;
        return arr[0];
        for(i=0;i<s-1;i++)
        {
            arr[i]=arr[i+1]
        }
        arr[count]=0
                count--;
    }
}
