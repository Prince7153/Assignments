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
  
  public static void main(String[] args) 
  {
    Scanner answer = new Scanner(System.in);
    int hours,minutes,seconds;
    System.out.print("Hours? ");
    hours = answer.nextInt();
    System.out.print("Minute? ");
    System.out.print("Second? ");
  }
}