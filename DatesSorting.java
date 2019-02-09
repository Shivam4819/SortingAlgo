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
public class DatesSorting {
 public void sortDates(){
     int arr[][]  ={{20,  1, 2014},
                    {25,  3, 2010},
                    { 3, 12, 2000},
                    {18, 11, 2001},
                    {19,  4, 2015},
                    { 9,  7, 2005}};
     
     
     for(int i=0;i<6;i++){
         for(int j=2;j<3;j++){
             System.out.print(arr[i][j]+" ");
         }
         System.out.println("");
     }
 }   
}
