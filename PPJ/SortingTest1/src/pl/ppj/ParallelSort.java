package pl.ppj;

import java.util.Arrays;

public class ParallelSort implements ISort {

  @Override
  public void sort(double[] arr) {
    Arrays.parallelSort(arr);
  }



}
