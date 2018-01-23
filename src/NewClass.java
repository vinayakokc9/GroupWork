import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int[] studentnumber = new int[input.nextInt()];

        System.out.print(" Enter " + studentnumber.length + " scores: ");
        for (int i = 0; i < studentnumber.length; i++) {
            studentnumber[i] = input.nextInt();
                    
        }

        /*if(studentnumber > studentnumber.length){
            System.out.println("Too many numbers. Try again.");
            return;
        }*/
        
        int bestGrade = studentnumber[0];
        for (int i = 1; i < studentnumber.length; i++) {
            if (studentnumber[i] > bestGrade) {
                bestGrade = studentnumber[i];

            }
        }

        int a = 0;
        for (int x : studentnumber) {
            System.out.println("Student " + (a++) + " score is " + x + " and grade is " + studentgrades(x, bestGrade));
        }
    }

    public static char studentgrades(int score, int best) {
        if (score >= (best - 10)) {
            return 'A';
        } else if (score >= (best - 20)) {
            return 'B';
        } else if (score >= (best - 30)) {
            return 'C';
        } else if (score >= (best - 40)) {
            return 'D';
        } else {
            return 'F';
        }
    }

}
