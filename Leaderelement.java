public class Leaderelement {
         public static void main(String[] args) {
         int arr[] = {1,4,8,9,5,10,6};
         int max=0 ;
         for(int i=arr.length-1;i>=0;i--){
             if(arr[i]>max){
                 System.out.println(+arr[i]);
             }
             max=arr[i];
         }
           
     
         }
     }
     
