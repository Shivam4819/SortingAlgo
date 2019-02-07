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
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      /*  int arr[]={2, 2, 5, 5, 6, 8, 8, 8};
        int temp=0,count=1;
        int count1[]=new int[4];
        System.out.println("length is"+arr.length);
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
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
        int j=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
                count1[j]=count;
            }
            else{
                j++;
                count=1;
                count1[j]=count;
            }
        }
        
       
        System.out.println("count->"+count);
        
        for(int i=0;i<count1.length;i++){
            System.out.println(count1[i]);
        }
*/
     SortArray sort=new SortArray();
     sort.sortArray();
     
     MinimumLength min=new MinimumLength();
     min.findMinLength();
    
    ArraySubset array=new ArraySubset();
    array.findSubset();
    
    KSorted k=new KSorted();
    k.nearlySort();
   
    DifferentMachine diff=new DifferentMachine();
    diff.sortElements();
   
    GreaterPower great=new GreaterPower();
    great.findGreaterPow();
  
    DifferenceWithK differnce=new DifferenceWithK();
    differnce.findDifference();
    }
    
}
