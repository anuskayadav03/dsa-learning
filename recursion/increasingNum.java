package recursion;

import java.util.Scanner;

public class increasingNum {
    public static void main(String[] args){
    try(Scanner sc = new Scanner(System.in)){
    int n = sc.nextInt();
    printIncreasing(n);
 }
}

public static void printIncreasing(int n){
     if(n==0){
        return;
    }
    System.out.println(n);
   printIncreasing( n-1 );
}
}
