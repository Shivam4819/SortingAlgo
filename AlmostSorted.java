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
public class AlmostSorted {
    public void almostSorted(){
        int arr[]={10, 20, 40, 30, 50, 60};
        int lpoint=0,rpoint=0,temp;
        for(int i=1;i<=arr.length;i++){
            
            if(arr[i]<arr[i-1]){
                System.out.println("arr[left]->"+arr[i-1]);
                lpoint=i-1;
                break;
            }
        }
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>arr[i+1]){
                System.out.println("arr[right]->"+arr[i+1]);
                rpoint=i+1;
                break;
            }
        }
        temp=arr[rpoint];
        arr[rpoint]=arr[lpoint];
        arr[lpoint]=temp;
        
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
