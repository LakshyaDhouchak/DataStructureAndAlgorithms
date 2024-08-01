package Types_of_datastructure.array_datastructure;

import java.util.Scanner;

public class DynamicArray {
    // calling the Scanner
    Scanner input = new Scanner(System.in);
    // define the properties
    int[] arr;
    int capacity;
    int size;

    // define the constructor
    public DynamicArray(int initialCapacity){
        this.capacity = initialCapacity;
        arr =new int[capacity];
        this.size = 0;
    }

    // define the add() methord
    public void add(){
        int choice;
        do{
            // define the condition
            if(size == capacity){
                resize();
            }
            System.out.println("Enter the data at index: "+size);
            int element = input.nextInt();
            arr[size] = element;
            size++;

            System.out.println("*********CHOICE*********");
            System.out.println(" Press 1: Add more data\n"+
                               " Press 2: Don't add data");
            System.out.println("************************");                   
            System.out.println("Enter the choice:");
            choice = input.nextInt();
        }
        while(choice==1);    
    }

    // define the resize() methord
    public void resize(){
        capacity = 2*capacity;
        int[] dup = new int[capacity];
        System.arraycopy(arr,0,dup,0,size);
        arr = dup;
        dup = null;
    }

    // define the display() methord
    public void Display(){
        System.out.println("The element present in arrayList:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    // define the insert() methord
    public void insert(){
        System.out.println("Enter the index:");
        int index = input.nextInt();
        System.out.println("Enter the data:");
        int element = input.nextInt();
        if(size == capacity){
            resize();
        }
        if(index == 0){
            for(int i= size-1;i>=0;i--){
                arr[i+1] = arr[i];
            }
            arr[0] = element;
            size++;
        }
        else{
            if(index == size){
                arr[size] =  element;
                size++;
            }
            else if(index<size&& index>0){
                for(int i=size-1;i>=index;i--){
                    arr[i+1] = arr[i];
                }
                arr[index] =  element;
                size++;
            }
            else{
                System.out.println("Sorry Index out of range ");
            }
        }
    }

    // define the delete() methord
    public void delete(){
        System.out.println("Enter the index:");
        int index = input.nextInt();
        if(index == size-1){
            size--;
        }
        else if(index<size&&index>=0){
            for(int i=index;i<size;i++){
                arr[i] = arr[i+1];
            }
            size--;
        }
        else{
            System.out.println("Sorry Index out of range ");
        }
    }

    // define the isEmpty() methord
    public void isEmpty(){
        if(capacity == 0){
            System.out.println("The ArrayList is empty");
        }
        else{
            System.out.println("The arrayList is not empty");
        }
    }
    
}
