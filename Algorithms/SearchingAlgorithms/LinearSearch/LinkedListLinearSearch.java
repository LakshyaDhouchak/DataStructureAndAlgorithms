package Algorithms.SearchingAlgorithms.LinearSearch;


import java.util.Scanner;

class node{
    // define the properties
    int data;
    node next;

    // define the constructor
    public node(int data){
        this.data =  data;
        this.next = null;
    }
}

public class LinkedListLinearSearch {
    // define the properties
    node head;
    node dup;

    // calling the Scanner
    Scanner input =  new Scanner(System.in);

    // define the create() methord
    public void create(){
        // define the properties
        int choice;
        do{
            if(head == null){
                System.out.println("Enter the data:");
                int data = input.nextInt();
                //calling the node class Object
                node node =  new node(data);
                head =  node;
                dup = node;
            }
            else{
                System.out.println("Enter the data:");
                int data = input.nextInt();
                // calling the class Object
                node node =  new node(data);
                dup.next = node;
                dup = node;
            }
            System.out.println("*************CHOICE**************");
            System.out.println("      Press 1: Add more data\n"+
                               "      Press 2: Don't add data");
            System.out.println("*********************************"); 
            System.out.println("Enter the choice:");
            choice = input.nextInt();
        }
        while(choice ==1);
    }

    // define the search() methord
    public void search(int key){
        int flag =0;
        dup =  head;
        while(dup!=null){
            if(dup.data ==key){
                System.out.println("The element present at address is: "+ dup);
                flag =1;
                break;
            }
            dup = dup.next;
        }
        if(flag == 0){
            System.out.println("The element is not present in linledlist");
        }
    }

    public static void main(String[] args) {
        // calling the Scanner
        Scanner input =  new Scanner(System.in); 

        // calling the class Object
        LinkedListLinearSearch linkedListLinearSearch =  new LinkedListLinearSearch();

        // calling the create() methord
        linkedListLinearSearch.create();

        System.out.println("Enter the key:");
        int key = input.nextInt();
        // calling the search() methord
        linkedListLinearSearch.search(key);

        // close the Scanner
        input.close();

    }

}
