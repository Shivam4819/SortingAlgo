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
public class WaveForm {
    public void sortWave(){
        int arr[]={10, 5, 6, 3, 2, 20, 100, 80};
        int key=0,j=0;
        
        for(int i=0;i<arr.length;i++){
            key=arr[i];
            j=i-1;
            
            while(j>=0&&arr[j]>=key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
    }
}
