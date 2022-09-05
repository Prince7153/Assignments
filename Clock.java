import java.util.Scanner;
public class Clock 
{
  private int hours;
  private int minutes;
  private int seconds;

  public Clock(int a, int b, int c)
  {
    this.hours = a;
    this.minutes = b;
    this.seconds = c;
  }
  private String twoDigit(int a )
  {
    if(a < 10)
    {
      String s = Integer.toString(a);
      s = "0" + s;
      return s;
    }
    else
    {
      String s = Integer.toString(a);
      return s;
    }
  }
  
  @Override
  public String toString()
  {
    return twoDigit(hours) + ":" + twoDigit(minutes) + ":" + twoDigit(seconds);
  }
  public static void main(String[] args) 
  {
    Scanner answer = new Scanner(System.in);
    int hours,minutes,seconds;
    System.out.print("Hours? ");
    hours = answer.nextInt();
    System.out.print("Minute? ");
    minutes = answer.nextInt();
    System.out.print("Second? ");
    seconds = answer.nextInt();
    Clock result = new Clock(hours,minutes,seconds);
    System.out.println("The time is " + result);
  }
}