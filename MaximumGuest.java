/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;
import java.util.Arrays;
/**
 *
 * @author shivam
 */
public class MaximumGuest {
    public void maxGuest(){
        int arr[]={1,2,9,5,5};
        int exit[]={4,5,12,9,12};
        int guestin=1,maxguest=1,i=1,j=0;
        int time=arr[0];
        
        Arrays.sort(arr);
        Arrays.sort(exit);
        
        while(i<arr.length && j<arr.length){
            if(arr[i]<=exit[j]){
                guestin++;
                if(guestin>maxguest){
                    maxguest=guestin;
                    time=arr[i];
                }
                i++;
            }
            else{
                guestin--;
                j++;
            }
        }
        
        System.out.println("max guest="+maxguest+" at time "+time); 
    }
    
}
