package Types_of_datastructure.LinkedList_dataStructure;

import java.util.Scanner;

class node2{
    // define the properties
    int data;
    node2 next;
    // define the constructor
    public node2(int data){
        this.data = data;
        this.next = null;
    }
}
public class CircularLinkedList {
    //define the properties
    node2 head = null;
    node2 dup = head;

    // calling the Scanner
    Scanner input = new Scanner(System.in);

    // define the create() methord
    public void create(){
        int choice;
        do{
            if(head == null){
                System.out.println("Enter the data:");
                int data = input.nextInt();
                // calling the node class Object
                node2 node = new node2(data);
                head = node;
                head.next = head;
                dup = head;
            }
            else{
                System.out.println("Enter the data:");
                int data = input.nextInt();
                // calling the node class Object
                node2 node =  new node2(data);
                dup.next = node;
                node.next = head;
                dup = node;
            }
            System.out.println("**********CHOICE************");
            System.out.println("   Press 1: Add more node\n"+
                               "   Press 2: Don't add node");
            System.out.println("****************************"); 
            System.out.println("Enter the choice:");
            choice = input.nextInt();                  
        }
        while(choice==1);
    }

    // define the display() methord
    public void display(){
        dup = head;
        System.out.println("The element present in circular LinkedLis:");
        while(dup.next!= head){
            System.out.print(dup.data+" ");
            dup = dup.next;
        }
        if(dup.next == head){
            System.out.print(dup.data);
        }
        System.out.println();
    }

    // define the insert methord
    public void insert(){
        System.out.println("************CHOICE*************");
        System.out.println(" Case 1: Insert in starting\n"+
                           " Case 2: Insert at end\n"+
                           " Case 3: Insert at middle");
        System.out.println("********************************"); 
        System.out.println("Enter the choice:");
        int choice = input.nextInt();
        
        switch(choice){
            case 1:
                dup=  head;
                System.out.println("Enter the data to be inserted in starting:");
                int data = input.nextInt();
                // calling the node class Object
                node2 node =  new node2(data);
                node.next = head;
                while(dup.next != head){
                    dup =  dup.next;
                }
                head = node;
                dup.next = head;
                break;
            case 2:
                dup = head;
                while(dup.next!= head){
                    dup = dup.next;
                } 
                System.out.println("Enter the data to be inserted at end:");   
                data = input.nextInt();
                // calling the node class Object
                node =  new node2(data);
                dup.next = node;
                dup = node;
                dup.next = head;
                break;
            case 3:
                int flag =0;
                dup = head;
                System.out.println("Enter the after data:");
                data =input.nextInt();
                while(dup.next!= head){
                    if(dup.data == data){
                        System.out.println("Enter the data:");
                        data = input.nextInt();
                        // calling the node class Object
                        node=  new node2(data);
                        node.next = dup.next;
                        dup.next = node;
                        flag =1;
                        break;
                    }
                    dup = dup.next;
                } 
                if(flag == 1){
                    System.out.println("Sorry can't insert");
                } 
                break; 

        }
    }

    // define the delete() methord
    public void delete(){
        System.out.println("***************CHOICE****************");
        System.out.println(" Case 1: Delete from starting\n"+
                           " Case 2: Delete from end\n"+
                           " Case 3: Delete from middle");
        System.out.println("*************************************"); 
        System.out.println("Enter the choice:");
        int choice = input.nextInt();
        
        // define the switch case
        switch(choice){
            case 1:
                dup =  head;
                while(dup.next != head){
                    dup = dup.next;
                }
                head=head.next;
                dup.next =  head;
                break;
            case 2:
                dup = head;
                while(dup.next != head){
                    if(dup.next.next == head){
                        break;
                    }
                    dup =  dup.next;
                }
                dup.next = head;
                break;
            case 3:
                int flag =0;
                dup = head;
                System.out.println("Enter the data to be deleted:");
                int data = input.nextInt();
                while(dup.next != head){
                    if(dup.next.data == data){
                        dup.next = dup.next.next;
                        flag =1;
                        break;
                    }
                    dup = dup.next;
                }    
                if(flag ==0){
                    System.out.println("Sorry Can't delete");
                }
                break;
        }
    }
}
