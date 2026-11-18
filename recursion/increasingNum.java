package recursion;

import java.util.Scanner;

public class increasingNum {
    public static void main(String[] args){
    try(Scanner sc = new Scanner(System.in)){
    int n = sc.nextInt();
    increasingNum(n);
 }
}

public static void increasingNum(int n){
     if(n==0){
        return;
    }
    
    increasingNum( n-1 );
    System.out.println(n);
}
}
