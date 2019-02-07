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
public class DifferentMachine {
 public void sortElements(){
     int m1[]={30,40,50};
     int m2[]={35,45};
     int m3[]={10,60,70,80,100};
     int k=0,key=0,k1=0,j=0;
     int output[]=new int[m1.length+m2.length+m3.length];
     for(int i=0;i<output.length;i++){
         if(i<m1.length){
             output[i]=m1[i];
             k=i;
         }
     }
     
     for(int i=k+1;i<m1.length+m2.length;i++){
         if(j<m2.length){    
            output[i]=m2[j];
            j++;
            k1=i;
         }
     }
     j=0;
     for(int i=k1+1;i<m1.length+m2.length+m3.length;i++){
         if(j<m3.length){    
            output[i]=m3[j];
            j++;
         }
     }
     
     j=0;
     for(int i=0;i<output.length;i++){
         key=output[i];
         j=i-1;
         
         while(j>=0 &&output[j]>=key){
             output[j+1]=output[j];
             j=j-1;
         }
         output[j+1]=key;
     }
     
     System.out.println("k->"+k1);
     for(int i=0;i<output.length;i++){
         System.out.println(output[i]);
     }
     
 }   
}
