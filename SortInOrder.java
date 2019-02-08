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
public class SortInOrder {
    public void sortInOrder(){
        int arr1[]={2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
        int arr2[]={2, 1, 8, 3};
        int key=0,k=0,n=arr1.length;
        int arr3[]=new int[n];
        
        
        for(int i=0;i<arr2.length;i++){
            key=arr2[i];
            for(int j=0;j<arr1.length;j++){
                if(arr1[j]==key){
                    arr3[k]=key;
                    k++;
                }
            }
        }
        
        System.out.println("k->"+k);
        
        
        for(int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]);
        }
        
    }
}
