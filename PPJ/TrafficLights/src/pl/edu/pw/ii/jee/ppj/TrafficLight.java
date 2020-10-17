package pl.edu.pw.ii.jee.ppj;

public class TrafficLight extends Light implements TrafficColor {

  public TrafficLight(String color) {
    setColor(color);
  }

  @Override
  public void green() {
    if (getColor().equals("green")) {
      System.out.println("The light is already green.");
    } else if (getColor().equals("red")) {
      System.out.println("The light has " + getColor() + " color but must be yellow before it can become green.");
    } else {
      setColor("green");
      System.out.println("The light is now green.");
    }

  }

  @Override
  public void yellow() {
    if (getColor().equals("green") || getColor().equals("red")) {
      setColor("yellow");
      System.out.println("The light is now yellow.");
    } else {
      System.out.println("The light is already yellow.");
    }

  }

  @Override
  public void red() {
    if (getColor().equals("red")) {
      System.out.println("The light is already red.");
    } else if (getColor().equals("green")) {
      System.out.println("The light has " + getColor() + " color but must be yellow before it can become green.");
    } else {
      setColor("red");
      System.out.println("The light is now red.");
    }

  }

  @Override
  protected void setColor(String color) {
    this.color = color;

  }

}
