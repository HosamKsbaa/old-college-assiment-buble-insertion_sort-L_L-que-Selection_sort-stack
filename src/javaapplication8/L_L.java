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
public class L_L {
   elem head= null;
   elem tail=null;
    public L_L(){}
    
     class elem
    {
        int data;
        elem next;
        public  elem(int data1,elem next1)
        {
            data=data1;
            next=next1;
        }
        ///////////////////
        public void insertaft(int data)
        {
            elem e1=new elem(data,this.next);
            if(tail==this){tail=e1;}
            this.next=e1;
        }
    ////////////////////////
    }
    public void print_all()
    {
        elem p1=head;
        if(head==null){System.out.println("emty");}
        else
        {
            System.out.println(p1.data);
            while(p1.next!=null)
            {
                System.out.println(p1.next.data);
                p1=p1.next;//==========================
            }
        }
    }
    public void append(int data)
    {
        elem e1=new elem(data , null);
        if(head==null){head=e1;}
        else{tail.next=e1;}
        tail=e1;
    }
    public void prepend(int data )
    {
        elem e1=new elem(data,head);
        if (head==null)
        {
            tail=e1;
        }
        head=e1;
        
    }
    public void insertpef(int data)
    {
        
    }
    
    public void travel(){}
    public elem search(int data)
    {
        elem p1=head;
        while(p1.data!=data & p1!=null)
        {
            p1=p1.next;
        }
        return p1;
    }
    public void extractfirst()/* del first*/{}
    public void extractlast()/*de last*/{}
    public void del(){}
}
