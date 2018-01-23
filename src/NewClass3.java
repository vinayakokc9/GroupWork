import java.util.Scanner;
public class NewClass3 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ten numbers: ");
        double[] list = new double[10];
        for(int i = 0; i < 10; i++)
        {
            list[i] = scanner.nextDouble();
            //System.out.print(list[i]);
        }
        System.out.println("The minimum number is: " + min(list));
    }
    public static double min(double[] array)
    {
        double j = array[0];
        for(int i = 1; i < array.length; i++)
        {
            if(j > array[i])
            {
                 j = array[i];
            }
        }
        return j;
    }
}
