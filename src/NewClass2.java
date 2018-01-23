import java.util.Scanner;


public class NewClass2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

// list1
        System.out.println("Enter list 1: "); 
        int[] list1 = new int [input.nextInt()];
        
        for (int i = 0; i < list1.length; i++)
            list1[i] = input.nextInt();
         
//list2        
       System.out.println("Enter list 2: ");
       //gives size of list2
       int[] list2 = new int [input.nextInt()];
       
       for (int i = 0; i < list2.length; i++) 
           list2[i] = input.nextInt();
       //method invoke
       boolean equal = equals(list1, list2);
       
       //end outputs
       if (equal == true) {
           System.out.println("The two lists are strictly identical");
       }
        else
           System.out.println("The two lists are not strictly identical");
       

    }
        
    public static boolean equals(int[] list1, int[] list2) {
            //use java equals method
            return java.util.Arrays.equals(list1, list2);
               
                    
    }

}
