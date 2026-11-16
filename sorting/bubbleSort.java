package sorting;

public class bubbleSort {
     public static void main(String[] args){
          int[] arr = {10,40,2,30,55,1,0};
          int n=arr.length;

          for(int i=n-1;i>=0;i--){

              for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
              }
          }

           for(int i=0;i<arr.length;i++){   //print the new array
            System.out.print(arr[i] +" ");
            }
     }
}
