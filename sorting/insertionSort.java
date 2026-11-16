package sorting;

public class insertionSort {
     public static void main(String[] args){
          int[] arr = {10,40,2,30,55,1,0};
          int n=arr.length;

        for(int i=0;i<=n-1;i++){
          int j=i;
          while(j>0 && arr[j-1]>arr[j]){
            int temp = arr[j-1];
            arr[j-1]=arr[j];
            arr[j]=temp;
            j--;
          }
        }
        for(int i=0;i<arr.length;i++){   
            System.out.print(arr[i] +" ");
            }
     }
}
