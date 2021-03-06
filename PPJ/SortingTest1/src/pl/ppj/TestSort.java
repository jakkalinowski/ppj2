package pl.ppj;

import java.time.Duration;
import java.time.Instant;

public class TestSort {
  
  
  ISort method = new ListSort();
  
  // setters and getters
  public ISort getMethod() {
    return method;
  }

  public void setMethod(ISort method) {
    this.method = method;
  }

  // methods
  public long test(double[] array) {
    Instant start = Instant.now();
    method.sort(array);
    return Duration.between(start, Instant.now()).toNanos();
  }
  
  
}
