/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;
import java.lang.Math;
/**
 *
 * @author shivam
 */
public class GreaterPower {
    public void findGreaterPow(){
        
        double x[]={2,1,6};
        double y[]={1,5};
        
        int count=0;
        
        for(int i=0;i<x.length;i++){
            for(int j=0;j<y.length;j++){
                if(Math.pow(x[i], y[j])>Math.pow(y[j], x[i])){
                    count++;
                }
            }
        }
        double n=Math.pow(2, 1);
        System.out.println(count);
    }
}
