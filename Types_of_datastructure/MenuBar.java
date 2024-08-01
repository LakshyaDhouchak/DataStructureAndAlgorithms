package Types_of_datastructure;
import java.util.Scanner;

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
            System.out.println("***************CHOICE***************");
            System.out.println(" Case 1: Static Array\n"+
                               " Case 2: Dynamic Array");
            System.out.println("************************************");                   
            System.out.println("Enter the Choice:");
            choice = input.nextInt();

            // define the switch case
            switch(choice){
                case 1:
                int InitialChoice;
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
                            case 9:
                                System.exit(0);
                                break;                                
                        }
                    }
                    while(InitialChoice<10&&InitialChoice>0);
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
            }

        }
        while(choice<5);
        // close the Scanner
        input.close();
    }
}