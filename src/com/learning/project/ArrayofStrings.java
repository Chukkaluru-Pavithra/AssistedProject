package com.learning.project;
import java.util.Scanner;
public class ArrayofStrings {
    public static void main(String[] args) {
        String[] arr={"hari","ram","raj"};
        System.out.println("Enter the string to search :");
        Scanner sc =new Scanner(System.in);
        String str=sc.next();
        for (int i=0;i< arr.length;i++){
            if (arr[i].equals(str)){
                System.out.println("The item is present");
                break;
            }
            else {
                System.out.println("Not found");
                break;
            }
        }
    }


}
