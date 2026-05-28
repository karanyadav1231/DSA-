
import java.util.Arrays;

public class array2Dsearch{
      public static void main(String[] args) {
    
            int [][] arr={
            {12,13,52,26,84},
            {13,32,47,78,78},
            {87,98,28,9,85}
          };
          int target=855;
          int[] ans=search(arr,target);
          System.out.println(Arrays.toString(ans));
      }
      static  int[] search(int[][] arr,int target){
          // int max=Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                  for(int col=0;col<arr[i].length;col++){
            if(arr[i][col]==target){
                  return new int[] {i,col};
            }
      }
}
            return new int []{-1,-1};
                
            }
      }