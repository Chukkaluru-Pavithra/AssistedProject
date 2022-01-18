package com.learning.project;
interface First 
{  
    default void show() 
    { 
    	System.out.println("default first interface"); 
    } 
} 
interface Second 
{  
    default void show() 
    { 
        System.out.println("default second interface"); 
    } 
}  

public class Diamond implements First, Second {
	public void show() 
    {  
        First.super.show(); 
        Second.super.show(); 
    } 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diamond td = new Diamond(); 
        td.show(); 


	}

}

