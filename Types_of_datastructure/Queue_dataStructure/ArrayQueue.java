package Types_of_datastructure.Queue_dataStructure;

import java.util.Scanner;

public class ArrayQueue {
    // calling the Scanner
    Scanner input =  new Scanner(System.in);
    // define the properties
    int[] arr;
    int capacity;
    int top;
    int head;

    // define the constructor
    public ArrayQueue(int size){
        arr =  new int[size];
        capacity =size;
        top = -1;
    }

    // define the push() methord
    public void push(){
        head =  top;
        int choice;
        do{
            if(top==capacity-1){
                System.out.println("Sorry can't inserted because queue is full");
                break;
            }
            if(top == -1){
                System.out.println("Enter the data:");
                int data = input.nextInt();
                arr[++top] = data;
                head = top;
            }
            else{
                System.out.println("Enter the data:");
                int data = input.nextInt();
                arr[++top] = data;
            }

            System.out.println("*************CHOICE************");
            System.out.println("    Press 1: Add more data\n"+
                               "    Press 2: Don't add data");
            System.out.println("*******************************");  
            System.out.println("Enter the choice:");
            choice = input.nextInt();                 
        }
        while(choice == 1);
    }

    // define the peek() methord
    public void peekTop(){
        System.out.println("The top element of queue ehich is not removed is: "+arr[top]);
    }

    // define the firstPeek() methord
    public void peekStart(){
        System.out.println("The starting element of Queue which is not removed is: "+arr[head]);
    }

    // define the pop() methord
    public void pop(){
        System.out.println("The element removed from Queue is: "+ arr[head]);
        head++;
    }

    // define the display() methord
    public void display(){
        System.out.println("The element present in queue is:");
        for(int i= head;i<=top;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
