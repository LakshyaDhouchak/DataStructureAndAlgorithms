package Types_of_datastructure;

import java.util.Scanner;

import Types_of_datastructure.LinkedList_dataStructure.CircularLinkedList;
import Types_of_datastructure.LinkedList_dataStructure.SingleLinkedList;
import Types_of_datastructure.LinkedList_dataStructure.doubleLinkedList;
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
                               " Case 5: Circular LinkedList");
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
            }

        }
        while(choice<5);
        // close the Scanner
        input.close();
    }
}