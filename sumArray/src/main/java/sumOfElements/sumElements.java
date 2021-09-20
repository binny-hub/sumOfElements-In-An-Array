
package sumOfElements;
import java.util.Scanner;

// find sum of elements in an array
public class sumElements {
    private int arrayElements[];
    private int size;
    int sum;
    Scanner sc= new Scanner(System.in);
            
            
   public void  enterValuesIntoArray(){
   System.out.println("Enter how many elements ");
   size = sc.nextInt();
   arrayElements = new int[size];
   // arrayElements[0]  arrayElements[1]   
   System.out.println(" Enter the elements ");
   for(int i=0; i<size; i++)
       arrayElements[i] = sc.nextInt();
   
   sumNumbers sn = new sumNumbers();
   sum = sn.sum(arrayElements, size);
   System.out.println( " The sum total of elements is "+ sum);
   }
    
    
    public static void main(String args[]) {
       sumElements sl = new sumElements();
       sl.enterValuesIntoArray();
    }
}
