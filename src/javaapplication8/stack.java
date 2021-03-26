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
public class stack {
    int [] arr;
    int size;
    int counter=9;
    public stack(int s)
    {
        arr=new int[s];
        size=s;
    }
    public void purge(){}
    public void push(int data)
    {
        if (counter!=size){arr[counter++]=data;}
        else{/*err*/}
        
    }
    public int pop()
    {
        int x =0;
        if (counter!=0){x= arr[--counter];}
        else{/*err*/}
        return x;
        
    }
    public void get_top(){}
}
