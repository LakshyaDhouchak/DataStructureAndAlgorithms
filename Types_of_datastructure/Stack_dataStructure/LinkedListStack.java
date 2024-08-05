package Types_of_datastructure.Stack_dataStructure;

import java.util.Scanner;

// define the node class
class nodeStack{
    // define the properties
    int data;
    nodeStack next;

    // define the constructor
    public nodeStack(int data){
        this.data =data;
        this.next = null;
    }
}

public class LinkedListStack {
    // define the properties
    nodeStack top = null;
    nodeStack dup;
    int size =1;
    // calling the Scanner
    Scanner input =  new Scanner(System.in);

    // define the push() methord
    public void push(){
        // define the properties
        int choice;
        do{
            if(top == null){
                System.out.println("Enter the data:");
                int data = input.nextInt();
                //calling the node class Object
                nodeStack nodeStack = new nodeStack(data);
                top = nodeStack;
            }
            else{
                System.out.println("Enter the data:");
                int data= input.nextInt();
                // calling the node class Object
                nodeStack nodeStack = new nodeStack(data);
                nodeStack.next = top;
                top = nodeStack;
            }

            System.out.println("**********CHOICE**********");
            System.out.println(" Press 1: Add more data\n"+
                               " Press 2: Don't add data");
            System.out.println("**************************");
            System.out.println("Enter the choice:");
            choice = input.nextInt();
        }
        while(choice==1);
    }

    // define the display() methord
    public void display(){
        dup = top;
        System.out.println("The element present in stack is:");
        while(dup!= null){
            System.out.print(dup.data+" ");
            dup = dup.next;
        }
        System.out.println();
    }

    // define the pop() methord
    public void pop(){
        if(top == null){
            System.out.println("The stack is not empty");
        }
        else{
            System.out.println("The element removed from the stack is: "+top.data);
            top = top.next;
        }
    }

    // define the peek() methord
    public void peek(){
        System.out.println("The top element of stack is :"+ top.data);
    }

    // define the isEmpty() methord
    public void isEmpty(){
        if( top == null){
            System.out.println("The stack is empty");
        }
        else{
            System.out.println("The stack is not empty");
        }
    }

    // define the size() methord
    public void size(){
        dup =  top;
        int size =0;
        while(dup!= null){
            size++;
            dup =  dup.next;
        }
        System.out.println("The size of stack is: "+ size);
    }
}
