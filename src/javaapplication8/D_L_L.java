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
public class D_L_L {
    elem head= null;
   elem tail=null;
    public D_L_L(){}
    
    class elem
    {
        int data;
        elem next;
        public void L_L(int data1,elem next1)
        {
            data=data1;
            next=next1;
        }
    
    }
    
    public void prepend(int data){}
    public void append(int data ){}
    public void insertpef(int data){}
    public void insertaft(int data){}
    public void travel(){}
    public void search(){}
    public void extractfirst()/* del first*/{}
    public void extractlast()/*de last*/{}
    public void del(){}
}
