package Algorithms.SortingAlgorithms;

import java.util.Scanner;

public class InsertionSort {
    // define the properties
    static int[] arr;

    // define the sort() methord
    public void sort(){
        for(int i=1;i<arr.length;i++){
            int j =i-1;
            while(j>=0){
                if(arr[i]<arr[j]){
                    int pointer = arr[i];
                    arr[i] = arr[j];
                    arr[j] = pointer;
                }
                j = j-1;
            }
        }
    }

    // define the display() methord
    public void display(){
        System.out.println("The element present in an array is:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // calling the Scanner
        Scanner input =  new Scanner(System.in);

        System.out.println("Enter the size of an array:");
        int size = input.nextInt();
        // initialization of an array
        arr =  new int[size];

        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the data at index "+i+" :");
            int data = input.nextInt();
            arr[i] = data;
        }

        // calling the class Object
        InsertionSort iSort = new InsertionSort();
        iSort.display();
        iSort.sort();
        System.out.println("After sorting");
        iSort.display();
        // close the Scanner
        input.close();
    }
}
