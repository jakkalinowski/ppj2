package pl.edu.pw.ii.jee.ppj;

public class TrafficLightApp {

  public static void main(String[] args) {
    TrafficLight light1 = new TrafficLight("green");
    TrafficLight light2 = new TrafficLight("red");
    System.out.println("The color of light1 is " + light1.getColor());
    light1.yellow();
    System.out.println("The color of light1 is " + light1.getColor());
    light2.green();
    System.out.println("The color of light2 is " + light2.getColor());
    light2.yellow();
    System.out.println("The color of light2 is " + light2.getColor());
  }

}
