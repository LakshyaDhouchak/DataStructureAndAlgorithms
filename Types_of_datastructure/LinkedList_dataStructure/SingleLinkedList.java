package Types_of_datastructure.LinkedList_dataStructure;

import java.util.Scanner;

// define the node class
class node{
    // define the properties
    int data;
    node next;
    // calling the constructor
    public node(int data){
        this.data = data;
        this.next = null;
    }
}

public class SingleLinkedList {

    // calling the Scanner
    Scanner input =  new Scanner(System.in);

    // define the properties
    node head = null;
    node dup =  head;

    // define the create() methord
    public void create(){
        System.out.println("Enter the data:");
        int data = input.nextInt();
        if(head == null){
            node node = new node(data);
            head = node;
            dup =  head;
        }
        else{
            node node =  new node(data);
            dup.next = node;
            dup = node;
        }
        System.out.println("***********CHOICE***********");
        System.out.println(" Press 1: Add more node\n"+
                           " Press 2: Don't add node");
        System.out.println("*****************************"); 
        System.out.println("Enter the choice:");
        int choice = input.nextInt();
        if(choice == 1){
            create();
        }                  
    }

    // define the display() methord
    public void display(){
        dup = head;
        System.out.println("The element present in linkedList: ");
        while(dup!=null){
            System.out.print(dup.data+" ");
            dup = dup.next;
        }
        System.out.println();
    }

    // define the isEmpty() methord
    public void isEmpty(){
        if(head == null){
            System.out.println("The linkedList is Empty");
        }
        else{
            System.out.println("The linkedList is not Empty");
        }
    }

    // define the insert() methord
    public void insert(){
        int flag = 0;
        System.err.println("**********CHOICE**********");
        System.out.println(" Press 1: Insert at starting\n"+
                           " Press 2: Insert at end\n"+
                           " Press 3: Insert at middle");
        System.out.println("**************************"); 
        System.out.println("Enter the Choice:");
        int choice = input.nextInt();
        
        switch(choice){
            case 1:
                System.out.println("Enter the data at starting:");
                int data = input.nextInt();
                // calling the  node class Object
                node node =  new node(data);
                node.next =  head;
                head = node;
                break;
            case 2:
                dup =  head;
                System.out.println("Enter the data at end:");
                data = input.nextInt();
                // define the condition
                while(dup.next!= null){
                    dup =  dup.next;
                }
                // calling the node  class Object
                node =  new node(data);
                dup.next = node;
                break;
            case 3:
                dup =  head;
                System.out.println("Enter the after data");
                data = input.nextInt();
                while(dup != null){
                    if(dup.data == data){
                        System.out.println("Enter the data to be inserted in middle:");
                        data = input.nextInt();
                        // calling the node class Object
                        node = new node(data);
                        node.next =  dup.next;
                        dup.next = node;
                        flag = 1;
                        break;
                    }
                    dup =  dup.next;
                } 
                if(flag == 0){
                    System.out.println("Sorry can't inserted ");
                } 
                break;      
        }
    }

    // define the delete() methord
    public void delete(){
        dup =  head;
        System.out.println("***********CHOICE***********");
        System.out.println(" Press 1: Delete from starting\n"+
                          "  Press 2: Delete from end\n"+
                          "  Press 3: Delete from middle");
        System.out.println("****************************"); 
        System.out.println("Enter the choice:");
        int choice = input.nextInt();
        
        switch(choice){
            case 1:
                head = head.next;
                break;
            case 2:
                while(dup!= null){
                    if(dup.next.next == null){
                        break;
                    } 
                    dup =  dup.next;   
                }
                dup.next = null;
                break;
            case 3:
                System.out.println("Enter the data to be removed:");
                int data = input.nextInt();
                while(dup != null){
                    if(dup.next.data == data){
                        break;
                    }
                } 
                dup.next = dup.next.next;
                break;   

        }
        
    }
}
