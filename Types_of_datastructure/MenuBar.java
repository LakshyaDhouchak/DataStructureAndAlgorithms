package Types_of_datastructure;

import java.util.Scanner;

import Types_of_datastructure.LinkedList_dataStructure.CircularLinkedList;
import Types_of_datastructure.LinkedList_dataStructure.SingleLinkedList;
import Types_of_datastructure.LinkedList_dataStructure.doubleLinkedList;
import Types_of_datastructure.Queue_dataStructure.ArrayQueue;
import Types_of_datastructure.Queue_dataStructure.LinkedListQueue;
import Types_of_datastructure.Stack_dataStructure.LinkedListStack;
import Types_of_datastructure.Stack_dataStructure.arrayStack;
import Types_of_datastructure.array_datastructure.DynamicArray;
import Types_of_datastructure.array_datastructure.staticArray;

public class MenuBar{
    public static void main(String[] args) {
        // calling the Scanner
        Scanner input = new Scanner(System.in);
        // define the Properties
        int choice ;
        // define the do-while() loop
        do{
            System.out.println("***************MAIN_CHOICE***************");
            System.out.println(" Case 1: Static Array\n"+
                               " Case 2: Dynamic Array\n"+
                               " Case 3: Single LinkedList\n"+
                               " Case 4: Double LinkedList\n"+
                               " Case 5: Circular LinkedList\n"+
                               " Case 6: ArrayStack\n"+
                               " Case 7: LinledListStack\n"+
                               " Case 8: ArrayQueue\n"+
                               " Case 9: LinkedListQueue");
            System.out.println("*****************************************");                   
            System.out.println("Enter the Choice:");
            choice = input.nextInt();

            // define the switch case
            switch(choice){
                case 1:
                int InitialChoice ;
                    int size = 5;
                    // calling the class Object
                    staticArray sArray =new staticArray(size);
                    do{
                        System.out.println("**********CHOICE***********");
                        System.out.println(" Press 1: Insert() methord\n"+
                                           " Press 2: Display() methord\n"+
                                           " Press 3: Max() methord\n"+
                                           " Press 4: Min() methord\n"+
                                           " Press 5: Get() methord\n"+
                                           " Press 6: Set() methord\n"+
                                           " Press 7: size() methord\n"+
                                           " Press 8: isEmpty() methord\n"+
                                           " Press 9: Exit");
                        System.out.println("**************************"); 
                        System.out.println("Enter the choice:");
                        InitialChoice = input.nextInt(); 

                        // define the switch
                        switch(InitialChoice){
                            case 1:
                                sArray.insert();
                                break;
                            case 2:
                                sArray.display();
                                break;
                            case 3:
                                sArray.max();
                                break;
                            case 4:
                                sArray.min();
                                break;
                            case 5:
                                sArray.get();
                                break;
                            case 6:
                                sArray.set();
                                break;
                            case 7:
                                sArray.size();
                                break;
                            case 8:
                                sArray.isEmpty();
                                break;                               
                        }
                    }
                    while(InitialChoice<9&&InitialChoice>0);
                    break;
                    
                case 2:
                    // calling the class Object
                    System.out.println("Enter the initial Capacity:");
                    int initialCapacity = input.nextInt();
                    DynamicArray dArray = new DynamicArray(initialCapacity);
                    do{
                        System.out.println("**********CHOICE**********");
                        System.out.println(" Press 1: add() methord\n"+
                                           " Press 2: Insert() methord\n"+
                                           " Press 3: Delete() methord\n"+
                                           " Press 4: Display() methord\n"+
                                           " Press 5: isEmpty() methord\n"+
                                           " Press 6: Exit");
                        System.out.println("**************************"); 
                        System.out.println("Enter the choice:");
                        int initialChoice = input.nextInt();
                        
                        // define the switch case
                        switch(initialChoice){
                            case 1:
                                dArray.add();
                                break;
                            case 2:
                                dArray.insert();
                                break;
                            case 3:
                                dArray.delete();
                                break;
                            case 4:
                                dArray.Display();
                                break;
                            case 5:
                                dArray.isEmpty();
                                break;
                            case 6:
                                System.exit(0);
                                break;                    
                        } 
                    }
                    while(initialCapacity<7&&initialCapacity>0);
                    break; 
                    
                case 3:
                    // define the properties
                    int Initialchoice;
                    // calling the class Object
                    SingleLinkedList sLinkedList = new SingleLinkedList();

                    do{
                        System.out.println("**********CHOICE**********");
                        System.out.println(" Press 1: create() methord\n"+
                                           " Press 2: Insert() methord\n"+
                                           " Press 3: Delete() methord\n"+
                                           " Press 4: Display() methord\n"+
                                           " Press 5: isEmpty() methord\n"+
                                           " Press 6: Exit");
                        System.out.println("***************************");
                    
                        System.out.println("Enter the choice:");
                        Initialchoice = input.nextInt();

                        switch(Initialchoice){
                            case 1:
                                sLinkedList.create();
                                break;
                            case 2:
                                sLinkedList.insert();
                                break;
                            case 3:
                                sLinkedList.delete();
                                break;
                            case 4:
                                sLinkedList.display();
                                break;
                            case 5:
                                sLinkedList.isEmpty();
                                break;
                        }                            
                    }
                    while(Initialchoice<6&&Initialchoice>0);
                    break;

                case 4:
                int initialChoice;
                    // calling the class Object
                    doubleLinkedList dLinkedList = new doubleLinkedList();
                    do{
                        System.out.println("***************CHOICE**************");
                        System.out.println(" Press 1: Create() methord\n"+
                                           " Press 2: Insert() methord\n"+
                                           " Press 3: Delete() methord\n"+
                                           " Press 4: Display() methord\n"+
                                           " Press 5: Revdisplay() methord\n"+
                                           " Press 6: Exit");
                        System.out.println("***********************************");
                        System.out.println("Enter the choice:");
                        initialChoice = input.nextInt();

                        switch(initialChoice){
                            case 1:
                                dLinkedList.create();
                                break;
                            case 2:
                                dLinkedList.insert();
                                break;
                            case 3:
                                dLinkedList.delete();
                                break;
                            case 4:
                                dLinkedList.display();
                                break;
                            case 5:
                                dLinkedList.reverseDisplay();
                                break;                
                        }
                    }
                    while(initialChoice<6&&initialChoice>0);  
                    break;
                case 5:
                    // calling the class Object
                    CircularLinkedList cLinkedList = new CircularLinkedList();
                    do{
                        System.out.println("************CHOICE***********");
                        System.out.println("   Case 1: Create() methord\n"+
                                           "   Case 2: Insert() methord\n"+
                                           "   Case 3: Delete() methord\n"+
                                           "   Case 4: Display() methord\n"+
                                           "   Case 5: Exit");
                        System.out.println("*****************************"); 
                        System.out.println("Enter the choice:");
                        Initialchoice = input.nextInt();
                        
                        switch(Initialchoice){
                            case 1:
                                cLinkedList.create();
                                break;
                            case 2:
                                cLinkedList.insert();
                                break;
                            case 3:
                                cLinkedList.delete();
                                break;
                            case 4:
                                cLinkedList.display();
                                break;            
                        }
                    } 
                    while(Initialchoice<5&&Initialchoice>0);
                    break; 
                    
                case 6:
                    // define the proprties
                    int InChoice;
                    System.out.println("Enter the size of stack is:");
                    int size1 = input.nextInt();
                    arrayStack aStack =new arrayStack(size1);

                    do{
                        System.out.println("************CHOICE*************");
                        System.out.println("    Press 1: Push() methord\n"+
                                           "    Press 2: Pop() methord\n"+
                                           "    Press 3: Peek() methord\n"+
                                           "    Press 4: IsEmpty() methord\n"+
                                           "    Press 5: Size() methord\n"+
                                           "    Press 6: Display() methord\n"+
                                           "    Press 7: Exit");
                        System.out.println("*******************************");
                        System.out.println("Enter the choice:");
                        InChoice = input.nextInt();
                        
                        // define the switch case
                        switch(InChoice){
                            case 1:
                                aStack.push();
                                break;
                            case 2:
                                aStack.pop();
                                break;
                            case 3:
                                aStack.peek();
                                break;
                            case 4:
                                aStack.isEmpty();
                                break;
                            case 5:
                                aStack.size();
                                break;
                            case 6:
                                aStack.display();
                                break;                

                        }
                    }
                    while(InChoice <7&& InChoice>0);
                    break;

                case 7:
                      // define the proprties
                    int Inchoice;
                    
                    LinkedListStack LinkedListStack =new LinkedListStack();

                    do{
                        System.out.println("************CHOICE*************");
                        System.out.println("    Press 1: Push() methord\n"+
                                           "    Press 2: Pop() methord\n"+
                                           "    Press 3: Peek() methord\n"+
                                           "    Press 4: IsEmpty() methord\n"+
                                           "    Press 5: Size() methord\n"+
                                           "    Press 6: Display() methord\n"+
                                           "    Press 7: Exit");
                        System.out.println("*******************************");
                        System.out.println("Enter the choice:");
                        Inchoice = input.nextInt();
                        
                        // define the switch case
                        switch(Inchoice){
                            case 1:
                                LinkedListStack.push();
                                break;
                            case 2:
                                LinkedListStack.pop();
                                break;
                            case 3:
                                LinkedListStack.peek();
                                break;
                            case 4:
                                LinkedListStack.isEmpty();
                                break;
                            case 5:
                                LinkedListStack.size();
                                break;
                            case 6:
                                LinkedListStack.display();
                                break;                

                        }
                    }
                    while(Inchoice <7&& Inchoice>0);
                    break; 
                case 8:
                    int Qchoice;
                    System.out.println("Enter the size of queue is:");
                    size = input.nextInt();
                    ArrayQueue aQueue = new ArrayQueue(size);
                    
                    do{
                        System.out.println("************CHOICE************");
                        System.out.println(" Press 1: Push() methord\n"+
                                           " Press 2: Pop() methord\n"+
                                           " Press 3: peekTop() methord\n"+
                                           " Press 4: PeekStart() methord\n"+
                                           " Press 5: Diaplay() methord\n"+
                                           " Press 6: Exit");
                        System.out.println("******************************");
                        
                        System.out.println("Enter the choice:");
                        Qchoice = input.nextInt();

                        switch(Qchoice){
                            case 1:
                                aQueue.push();
                                break;
                            case 2:
                                aQueue.pop();
                                break;
                            case 3:
                                aQueue.peekTop();
                                break;
                            case 4:
                                aQueue.peekStart();
                                break;
                            case 5:
                                aQueue.display();
                                break;                
                        }
                    }
                    while (Qchoice<6&&Qchoice>0);
                    break;

                case 9:
                    LinkedListQueue lQueue = new LinkedListQueue();
                    int Qwish;
                    do{
                        System.out.println("*************CHOICE************");
                        System.out.println("  Press 1: Push() methord\n"+
                                           "  Press 2: pop() methord\n"+
                                           "  press 3: PeekStart() methord\n"+
                                           "  Press 4: PeekEnd() methord\n"+
                                           "  Press 5: Display() methord\n"+
                                           "  Press 6: Exit");
                        System.out.println("******************************");
                        System.out.println("Enter the choice:");
                        Qwish = input.nextInt();
                        
                        // define the switch case
                        switch(Qwish){
                            case 1:
                                lQueue.push();
                                break;
                            case 2:
                                lQueue.pop();
                                break;
                            case 3:
                                lQueue.peekStart();
                                break;
                            case 4:
                                lQueue.peekEnd();
                                break;
                            case 5:
                                lQueue.display();
                                break;                
                        }
                    }
                    while(Qwish<6&&Qwish>0);
                    break;
            }

        }
        while(choice<10);
        // close the Scanner
        input.close();
    }
}