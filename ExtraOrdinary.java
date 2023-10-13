import java.util.*;
public class ExtraOrdinary {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();
         
        while(n>1){
            if(n%2==0){
                n=n/2;
            }else if(n%3==0){
                n=n/3;
            
            }else if(n%5==0){
                n=n/5;
            }else{
                break;
            }
            
        
        }
        if(n==1){
                System.out.println("it's an extraordinary number ");
            }else{
                System.out.println("it's not an extraordinary number");
            }



    }
    
}
