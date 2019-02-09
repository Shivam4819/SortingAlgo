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
public class FindAPair {
    public void findPair(){
        int arr[]={10, 22, 28, 29, 30, 40};
        int n=arr.length,x=54,diff=Integer.MAX_VALUE;
        int left=0,right=n-1,lres=0,rres=0;
        
        while(right>left){
            if (Math.abs(arr[left] + arr[right] - x) < diff){ 
               lres = left; 
               rres = right; 
               diff = Math.abs(arr[left] + arr[right] - x); 
            } 
   
            if (arr[left] + arr[right] > x) 
               right--; 
            else  
               left++; 
        }
        
        System.out.println(arr[lres]+" "+arr[rres]);
        
    }
    
}
