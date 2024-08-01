package Types_of_datastructure.array_datastructure;
import java.util.Scanner;
public class staticArray {
    // calling the Scanner 
    Scanner input =  new Scanner(System.in);
    // define the properties
    int[] arr;

    // define the constructor
    public staticArray(int size){
        arr =  new int[size];
    }

    // define the insert() methord
    public void insert(){
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the data at index: "+i);
            int data = input.nextInt();
            arr[i] = data;
        }
        System.out.println();
    }

    // define the display() methord
    public void display(){
        System.out.println("The element present in array:");
        // define the for loop
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    // define the isEmpty() methord
    public void isEmpty(){
        if(arr.length== 0){
            System.out.println("The array is Empty");
        }
        else{
            System.out.println("Array is not empty");
        }
    }

    // define the max() methord
    public void max(){
        int max =  arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("The max element present in array is: "+max);
    }

    // define the min() methord
    public void min(){
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min =  arr[i];
            }
        }
        System.out.println("The min element present in an array is: "+min);
    }

    // define the size() methord
    public void size(){
        int length = arr.length;
        System.out.println("The size of an array is: "+length);
    }

    // define the get() methord
    public void get(){
        System.out.println("Enter the index of an array:");
        int index = input.nextInt();
        if(index<arr.length){
            System.out.println("The element present at index "+index+" is: "+arr[index]);
        }
        else{
            System.out.println("The index is greater than size of an array");
        }
    }

    // define the set() methord
    public void set(){
        System.out.println("Enter the index:");
        int index = input.nextInt();
        System.out.println("Enter the element:");
        int element = input.nextInt();
        if(index<arr.length){
            arr[index] = element;
        }
        else{
            System.out.println("Sorry Can't insert element at index");
        }
    }

}
