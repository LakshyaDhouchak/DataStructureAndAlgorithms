package Types_of_datastructure.LinkedList_dataStructure;

import java.util.Scanner;

// define the node class
class node1{
    // define the properties
    int data;
    node1 left;
    node1 right;
    // define the constructor
    public node1(int data){
       this.data = data;
       this.left = null;
       this.right = null; 
    }
}
public class doubleLinkedList {
    // define the properties
    node1 head= null;
    node1 tail = null;
    node1 dup;

    // calling the Scanner 
    Scanner input =  new Scanner(System.in);

    // define the create() method
    public void create(){
        // define the properties
        int choice;
        do{
            if(head == null){
                System.out.println("Enter the data:");
                int data = input.nextInt();
                // calling the node class Object
                node1 Node= new node1(data);
                head = Node;
                tail = Node;
            }
            else{
                System.out.println("Enter the data:");
                int data = input.nextInt();
                // calling the node class Object
                node1 node = new node1(data);
                tail.right = node;
                node.left = tail;
                tail = node;
            }
            System.out.println("*********CHOICE*********");
            System.out.println(" Press 1: add more node\n"+
                               " Press 2: Don't add node");
            System.out.println("*************************");
            System.out.println("Enter the choice:");
            choice = input.nextInt();                   
        }
        while(choice == 1);
    }

    // define the display() methord
    public void display(){
        dup = head;
        System.out.println("The element present in double LinkedList:");
        while(dup!= null){
            System.out.print(dup.data+" ");
            dup = dup.right;
        }
        System.out.println();
    }

    // define the reverse Display() methord
    public void reverseDisplay(){
        dup = tail;
        System.out.println("The element present in linkedList at reverse order:");
        while(dup!= null){
            System.out.print(dup.data+" ");
            dup =  dup.left;
        }
        System.out.println();
    }

    // define the insert() methord
    public void insert(){
        System.out.println("*********CHOICE**********");
        System.out.println(" Press 1: Insert in starting\n"+
                           " Press 2: Insert at end\n"+
                           " Press 3: Insert at middle");
        System.out.println("*************************");
        System.out.println("Enter the choice:");
        int choice = input.nextInt();
        
        // define the condition
        switch(choice){
            case 1:
                System.out.println("Enter the data in starting:");
                int data = input.nextInt();
                // calling the node class Object
                node1 node =  new node1(data);
                head.left = node;
                node.right = head;
                head = node;
                break;
            case 2:
                System.out.println("Enter the data at end:");
                data = input.nextInt();
                // calling the node class Object
                node = new node1(data);
                tail.right = node;
                tail = node;
                break;
            case 3:
            int flag =0;
                dup =  head;
                System.out.println("Enter the after data:");
                data = input.nextInt();
                while(dup!= null){
                    if(dup.data ==  data){
                        System.out.println("Enter the data to be inserted:");
                        data = input.nextInt();
                        // calling the node class Object
                        node = new node1(data);
                        node.right =dup.right;
                        node.left = dup;
                        dup.right = node;
                        node.right.left = node;
                        flag =1;
                        break;
                    }
                    dup =  dup.right;
                }
                if(flag == 0){
                    System.out.println("Sorry can't insert ");
                }
                break;
        }
    }

    // define the delete() methord
    public void delete(){
        int flag =0;
        System.out.println("**************CHOICE**************");
        System.out.println(" Press 1:Delete from starting\n"+
                           " Press 2:Delete from end\n"+
                           " Press 3:Delete from middle");
        System.out.println("************************************");
        System.out.println("Enter the choice:");
        int choice = input.nextInt();
        
        // define the switch case
        switch(choice){
            case 1:
                head = head.right;
                break;
            case 2:
                tail= tail.left;
                tail.right = null;
                break;
            case 3:
                dup =  head;
                System.out.println("Enter the data:");
                int data = input.nextInt(); 
                while(dup!= null){
                    if(dup.data == data){
                        dup.left.right = dup.right;
                        dup.right.left = dup.right;
                        flag =1;
                    }
                    dup =  dup.right;
                } 
                if(flag == 0){
                    System.out.println("Element is not present in likedList");
                }
                break;     
        }
    }
}
