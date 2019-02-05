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
public class ArraySubset {
    public void findSubset(){
        int arr1[]={11, 1, 13, 21, 3, 7};
        int arr2[]={11, 3, 7, 5};
        int temp=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length-i-1;j++){
                if(arr1[j]>arr1[j+1]){
                   temp=arr1[j];
                   arr1[j]=arr1[j+1];
                   arr1[j+1]=temp;
                }
            }
        }
        
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
        
        int n=arr1.length;
        boolean flag=serach(arr1, arr2, n);
        if(flag==true){
            System.out.println("all found");
        }
        if(flag==false)
            System.out.println("not found");
    }
    boolean serach(int arr1[],int arr2[],int n){
        for(int i=0;i<arr2.length;i++){
            if(binarySearch(arr1 , 0,n-1,arr2[i])==-1){
                return false;
            }
        }
        return true;
    }
    public int binarySearch(int arr1[],int low,int high,int x){
    
        if(high>=low){
            int mid=(low+high)/2;
            
            if(arr1[mid]==x){
                return mid;
            }
            
            if(arr1[mid]>x){
                return binarySearch(arr1, low, mid-1, x);
            }
            else{
                return binarySearch(arr1, mid+1, high, x);
            }
        }
        
        return -1;
    }
    
}
