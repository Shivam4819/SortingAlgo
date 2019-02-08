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
public class SortInLinearTime {
    public void linearTime(){
        int n=5,key,j;
        int arr[]={0,23,14,12,9};
        int range=n*n-1;
        for(int i=0;i<n;i++){
            if(arr[i]>range){
                System.out.println("arr value exceds the range");
                break;
            }
        }
        
        for(int i=0;i<arr.length;i++){
            key=arr[i];
            j=i-1;
            
            while(j>=0&&arr[j]>=key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        System.out.println("range->"+range);
        
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
