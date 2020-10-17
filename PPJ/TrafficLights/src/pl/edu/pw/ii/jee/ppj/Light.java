package pl.edu.pw.ii.jee.ppj;

public abstract class Light {
  
  protected String color;

  public String getColor()  {
    return color;
  };
  
  protected abstract void setColor(String color);
}
