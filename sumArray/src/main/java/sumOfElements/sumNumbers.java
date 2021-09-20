/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumOfElements;

/**
 *
 * @author Dell
 */
public class sumNumbers {
    public int sum(int [] arrayElements , int size){
        int totalOfElements  =0;
        for(int i=0; i<size; i++){
            totalOfElements += arrayElements[i];
        }
        return totalOfElements;
    
    }
            
    
}
