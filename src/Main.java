/*
Question : Given an array of size N and an integer X. The task is to find all the indices of the integer X in
the array.
___________________________________________________________________________________________________________________
I/O ARR[] = [1,2.3,2,2,5],X = 2,N = 6
O/P = 1 3 4
___________________________________
I/O ARR[] = [8,8,8],X = 8,N = 3
O/P = 0 1 2
 */
import java.util.Scanner;
public class Main {
    static void PrintIndex(int[] array, int index,int FindNumber){
        if (index >= array.length)return;
        if (array[index] == FindNumber ){
            System.out.print(" " + index);
        }
        PrintIndex(array,index + 1 ,FindNumber);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int initialization,Array,FindingNumber,index = 0,count;
        System.out.println("Enter the length of array :");
        Array = sc.nextInt();
        count = Array;
        int[] array = new int[Array];
        System.out.println("Enter the element of array :");
        for (initialization = 0; initialization < array.length; initialization++){
            array[initialization] = sc.nextInt();
        }
        System.out.println("Enter the number to find in array :");
        FindingNumber = sc.nextInt();
        System.out.println("Printing the without using recursion :");
        for (initialization = 0; initialization < array.length; initialization++){
            if (FindingNumber == array[initialization]){
                System.out.print( " " + initialization);
                count--;
            }
        }
        if (Array == count){
            System.out.println("not present in array :");
        }
        System.out.println();
        System.out.println("Printing the result with help of recursion :");
        PrintIndex(array,index,FindingNumber);
    }
}