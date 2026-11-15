package sorting;

public class selectionSort {
     public static void main(String[] args){
        //example array
        int[] arr = {10,40,2,30,55,1,0};

        for(int i=0;i<arr.length-1;i++){
            int min =i;   //pointing at the 1st element

            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){ //checking the first and second element 
                  min=j; 
                }
            }
               int temp =arr[i];      //swap
               arr[i]=arr[min];
               arr[min]=temp;
            }
            for(int i=0;i<arr.length;i++){   //print the new array
            System.out.print(arr[i] +" ");
            }
        }
     }

