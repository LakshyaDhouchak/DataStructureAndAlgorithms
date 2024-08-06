package Algorithms.SearchingAlgorithms;

import java.util.Scanner;

public class BinarySearch {
    // define the properties
    static int[] arr;

    // define the binarySearch() methord
    public void binarySearch(int[] dup,int key){
        int flag =0;
        int l=0;
        int h = dup.length-1;
        int mid ;
        while(l<h){
            mid = (l+h)/2;
            if(dup[mid] == key){
                System.out.println("Element found at index: "+mid);
                flag =1;
                break;
            }
            else if(dup[mid]>key){
                l = mid+1;
            }
            else{
                h= mid-1;
            }
        }
        if(flag == 0){
            System.out.println("Element is not present in an array");
        }
    } 

    public static void main(String[] args) {
        // calling the Scannner 
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = input.nextInt();

        arr = new int[size];

        for(int i=0;i<size;i++){
            System.out.println("Enter the data at index is: "+i);
            int data = input.nextInt();
            arr[i] = data;
        }

        System.out.println("Enter the key:");
        int key = input.nextInt();

        // calling the class Object
        BinarySearch bSearch = new BinarySearch();
        bSearch.binarySearch(arr, key);

        // close the Scanner
        input.close();
    }
}
