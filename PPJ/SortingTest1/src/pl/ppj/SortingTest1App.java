package pl.ppj;

import java.util.Arrays;

public class SortingTest1App {

  public static void main(String[] args) {

    TestSort ts = new TestSort();
    long bubbleTime = 0;
    long parallelTime = 0;
    long quickTime = 0;

    for (int i = 0; i < 1000; ++i) {
      double[] arr = randomArray();
      
      ts.setMethod(new BubbleSort());
      bubbleTime += ts.test(Arrays.copyOf(arr, arr.length));
      
      ts.setMethod(new ListSort());
      quickTime += ts.test(Arrays.copyOf(arr, arr.length));
      
      ts.setMethod(new ParallelSort());
      parallelTime += ts.test(Arrays.copyOf(arr, arr.length));
    }
    final double DIV= Math.pow(10, 6);
    
    System.out.println("Bubblesort time[ms]: " + bubbleTime / DIV);
    System.out.println("Listsort time[ms]: " + quickTime / DIV);
    System.out.println("Parallelsort time[ms]: " + parallelTime / DIV);
  }

  static double[] randomArray() {
    double[] arr = new double[1000];
    for (int i = 0; i < 1000; ++i) {
      arr[i] = Math.random() * 100;
    }
    return arr;
  }

}
