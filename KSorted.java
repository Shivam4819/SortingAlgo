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
public class KSorted {
 public void nearlySort(){
     int arr[]={10, 9, 8, 7, 4, 70, 60, 50};
     int k=4;
     int key,j=0;
     for(int i=1;i<arr.length;i++){
         key=arr[i];
         j=i-1;
         
         while(j>=0 && arr[j]>key){
             arr[j+1] = arr[j];  
             j = j-1; 
         }
         arr[j+1]=key;
     }
     
     for(int i=0;i<arr.length;i++){
         System.out.println(arr[i]);
     }
 }   
}
