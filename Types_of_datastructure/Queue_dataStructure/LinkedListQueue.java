package Types_of_datastructure.Queue_dataStructure;

import java.util.Scanner;

class QNode{
    // define the properties
    int data;
    QNode next;

    // define the properties
    public QNode(int data){
        this.data = data;
        this.next =  null;
    }
}
public class LinkedListQueue {
    // define the properties
    QNode head;
    QNode tail;
    QNode dup;

    // calluing the Scanner
    Scanner input = new Scanner(System.in);

    // define the push() methord
    public void push(){
        int choice;
        do{
            if(head == null){
                System.out.println("Enter the data:");
                int data = input.nextInt();
                // calling the node class Object
                QNode Qnode =  new QNode(data);
                head = Qnode;
                tail =Qnode;
            }
            else{
                System.out.println("Enter the data:");
                int data = input.nextInt();
                // calling the class Object
                QNode Qnode =  new QNode(data);
                tail.next =  Qnode;
                tail = Qnode;
            }
            System.out.println("************CHOICE*************");
            System.out.println("    Press 1: Add more Data\n"+
                               "    Press 2: Don't add data");
            System.out.println("*******************************"); 
            System.out.println("Enter the choice:"); 
            choice = input.nextInt();                 
        }
        while(choice == 1);
    }

    // define the peek() methord
    public void peekStart(){
        System.out.println("The starting element of queue is: "+head.data);
    }

    // define the peekEnd() methord
    public void peekEnd(){
        System.out.println("The last element of queue is: "+tail.data);
    }

    // define the display() methord
    public void display(){
        dup = head;
        System.out.println("The element present in queue is: ");
        while(dup != null){
            System.out.print(dup.data+" ");
            dup =  dup.next;
        }
        System.out.println();
    }

    // define the pop() methord
    public void pop(){
        System.out.println("The element removed from Queue is: "+head.data);
        head =  head.next;
    }

    // define the isEmpty() methord
    public void Isempty(){
        if( head == null){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("Queue is not empty ");
        }
    }

}
