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
     
     SortFrequencyWise sortfrequency=new SortFrequencyWise();
     sortfrequency.sortAccToFrequency();
     
     SortArray sort=new SortArray();
     sort.sortArray();
     
     MinimumLength minimum=new MinimumLength();
     minimum.findMinLength();
    
    ArraySubset subset=new ArraySubset();
    subset.findSubset();
    
    KSorted ksorted=new KSorted();
    ksorted.nearlySort();
   
    DifferentMachine differentMachine=new DifferentMachine();
    differentMachine.sortElements();
   
    GreaterPower greater=new GreaterPower();
    greater.findGreaterPow();
  
    DifferenceWithK differencewithK=new DifferenceWithK();
    differencewithK.findDifference();
    
    SortInLinearTime sortinlinear=new SortInLinearTime();
    sortinlinear.linearTime();
    
    SortInOrder sortinorder=new SortInOrder();
    sortinorder.sortInOrder();
    
    WaveForm wave=new WaveForm();
    wave.sortWave();
    
    FindAPair find=new FindAPair();
    find.findPair();
    
    AlmostSorted almostsort=new AlmostSorted();
    almostsort.almostSorted();
    
    DatesSorting date=new DatesSorting();
    date.sortDates();
    
    MaximumGuest max=new MaximumGuest();
    max.maxGuest();
    }
    
}
