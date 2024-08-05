package Types_of_datastructure.Stack_dataStructure;

import java.util.Scanner;

public class arrayStack {
    // define the properties
    int[] arr;
    int capacity;
    int top;

    // define the constructor
    public arrayStack(int size){
        arr = new int[size];
        capacity = size;
        top =-1;
    }

    // calling the scanner
    Scanner input =  new Scanner(System.in);

    // define the push() methord
    public void push(){
        int choice;
        do{
            if(top == capacity-1){
                System.out.println("Sorry Can't insert because stack is full");
                break;
            }
            System.out.println("Enter the data:");
            int element = input.nextInt();
            arr[++top] = element;
            
            System.out.println("**********CHOICE***********");
            System.out.println(" Press 1: Add more data\n"+
                               " Press 2: Don't add data");
            System.out.println("***************************"); 
            System.out.println("Enter the choice");
            choice = input.nextInt();                   
        }
        while(choice ==1);
    }

    // define the pop() methord
    public void pop(){
        if(top == -1){
            System.out.println("The stack is empty");
        }
        else{
            System.out.println("The element removed from the stack is: "+arr[top]);
            top--;
        }
    }

    // define the peak() methord
    public void peek(){
        if(top == -1){
            System.out.println("The stack is empty");
        }
        else{
            System.out.println("The element present on top is: "+arr[top]);
        }
    }

    // define the IsEmpty() methord
    public void isEmpty(){
        if(top == -1){
            System.out.println("The stack is empty");
        }
        else{
            System.out.println("The stack is not empty");
        }
    }

    // define the size() methord
    public void size(){
        System.out.println("The size of stack is: "+(top+1));
    }

    // define the display() methord
    public void display(){
        if(top == -1){
            System.out.println("The stack is empty");
        }
        else{
            System.out.println("The element present in stack is:");
            for(int i=0;i<=top;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
