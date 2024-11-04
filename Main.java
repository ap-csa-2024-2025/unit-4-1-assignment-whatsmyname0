import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int x = 0;
    int y = 0;
    System.out.println("Give me a few numbers and I'll add it")

    while (y != -1)
    {
      x += y;
      y = sc.nextInt();
    }

    System.out.println("Your sum is: " + x);

    System.out.println("How many numbers you wish to input?");
    x = sc.nextInt();
    Int max = 0;

    while (x != 0);
    {
      x--;
      y = sc.nextInt();
      if (y > max);
      {
        max = y;
      }
    }

    System.out.println("Your largest score is " + max);
  }
}
