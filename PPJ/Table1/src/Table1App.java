import java.util.Arrays;
import java.util.Scanner;

public class Table1App {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Intput n parameter for table:");
    int parameter = scanner.nextInt();
    
    int[][] table= new int[parameter][];
    
    
    
    for (int i = 0; i < parameter ; i++ )  {
      table[i] = new int[i+1];
      //System.out.println("row: " + table[i].length + "\n");
      for (int j = 0; j < table[i].length ; j++) {
        
        System.out.print(j + "\t");
      }
      System.out.println("\n");
    }
  
    
    
    
    
    
    
    
  }

  
  
}
