import java.util.*;
public class revArray{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int size = read.nextInt();
        int arr[]= new int[size];
        int temp;
        System.out.println("Enter the elements: ");

        for(int i=0;i<arr.length;i++){
            arr[i]=read.nextInt();
        }
        for(int i = 0;i<arr.length/2;i++){
            temp =arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
          System.out.println("::::Reversed array is::::");
        for(int i = 0;i<arr.length;i++){
          
            System.out.println(arr[i]);
        }

        
    }

}