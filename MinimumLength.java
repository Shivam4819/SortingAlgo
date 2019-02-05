/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author shivam
 */
public class MinimumLength {
 public void findMinLength(){
     int arr[]={10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
     int first=0,last=0,temp=0;
     for(int i=0;i<=arr.length-1;i++){
         if(arr[i]>arr[i+1]){
             first=i;
             break;
         }
     }
     for(int i=arr.length-1;i>=0;i--){
         if(arr[i]<arr[i-1]){
             last=i+1;
             break;
         }
     }
     
     System.out.println(first+" "+last);
     
     for(int i=first;i<last;i++){
         System.out.println("arr["+i+"]->"+arr[i]);
         for(int j=first;j<last;j++){
             if(arr[j]>arr[j+1]){
                 temp=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
             }
         }
     }
     
     for(int i=0;i<arr.length;i++){
         System.out.println(arr[i]);
     }
 }   
}
