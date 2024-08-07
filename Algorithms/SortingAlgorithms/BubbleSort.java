package Algorithms.SortingAlgorithms;

import java.util.Scanner;

public class BubbleSort {
    // define the properties
    static int[] arr;

    // define the sort() methord
    public void sort(int[] dup){
        for(int i=0;i<dup.length;i++){
            for(int j=i+1;j<dup.length;j++){
                if(dup[i]>dup[j]){
                    int pointer = arr[i];
                    arr[i] = arr[j];
                    arr[j] = pointer;
                }
            }
        }
    }

    // define the display() methord
    public void display(){
        System.out.println("The element present in array is:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        // calling the Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of an array:");
        int size = input.nextInt();
        // initialization of an array
        arr = new int[size];

        for(int i=0;i<size;i++){
            System.out.println("Enter the data at index "+i+" :");
            int data = input.nextInt();
            arr[i] = data;
        }

        // calling the class Object
        BubbleSort bSort = new BubbleSort();
        bSort.display();
        bSort.sort(arr);
        System.out.println("After Sorting");
        bSort.display();

        // close the Scanner
        input.close();
    }
}
