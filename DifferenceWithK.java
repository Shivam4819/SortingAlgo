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
public class DifferenceWithK {
    public void findDifference(){
        int arr[]={1,5,3,4,2};
        int k=3,key=0,j=0,count=0;
        
        for(int i=0;i<arr.length;i++){
            key=arr[i];
            j=i-1;
            
            while(j>=0&&arr[j]>=key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
        
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        int element;
        for(int i=0;i<arr.length;i++){
            element=arr[i]+k;
            for(j=0;j<arr.length;j++){
                if(arr[j]==element){
                    count++;
                    System.out.println("2..........");    
                }
            }
        }
        
        System.out.println("count->"+count);
    }
    
    
    
    
}
