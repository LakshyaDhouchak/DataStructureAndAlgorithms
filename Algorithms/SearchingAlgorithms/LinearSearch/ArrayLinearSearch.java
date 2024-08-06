package Algorithms.SearchingAlgorithms.LinearSearch;

import java.util.Scanner;

public class ArrayLinearSearch {
    // calling the Scanner
    Scanner input =  new Scanner(System.in);

    // define the Search() methord
    public int Search(int[] dup){
        System.out.println("Enter the key:");
        int key = input.nextInt();
        for(int i=0;i<dup.length;i++){
            if(dup[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // define the properties
        int[] arr;

        // calling the class Object
        ArrayLinearSearch bSearch = new ArrayLinearSearch();

        // calling the Scanner 
        Scanner input =  new Scanner(System.in);

        System.out.println("Enter the size of an array is:");
        int size = input.nextInt();

        arr = new int[size];

        for(int i=0;i<size;i++){
            System.out.println("Enter the data at index "+ i+" :");
            int data = input.nextInt();
            arr[i] = data;
        }

        // calling the Search() methord
        int out = bSearch.Search(arr);
        if(out != -1){
            System.out.println("**********CONGRATULATIONS**********");
            System.out.println("The element is found at index :"+out);
            System.out.println("***********************************");
        }
        else{
            System.out.println("The element is not found in array");
        }

        // close the Scanner
        input.close();
    }
}
