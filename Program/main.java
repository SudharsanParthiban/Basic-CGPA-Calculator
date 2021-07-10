import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------CGPA CALCULATOR------------");
        System.out.println("---------------------------------------");
        System.out.println("A-Upto 2 Semester");
        System.out.println("B-Upto 3 Semester");
        System.out.println("C-Upto 4 Semester");
        System.out.println("D-Upto 5 Semester");
        System.out.println("E-Upto 6 Semester");
        System.out.println("F-Upto 7 Semester");
        System.out.println("G-Upto 8 Semester");
        System.out.println("---------------------------------------");
        Calculate obj = new Calculate();
        Double s1,s2,s3,s4,s5,s6,s7,s8;
        System.out.print("Enter the option:");
        String option = sc.next();
        char ch = option.charAt(0);
        switch (ch){
            case 'A':
                System.out.println("CGPA calculations upto 2nd sem");
                System.out.print("Enter the 1st Semester GPA:");
                s1 = sc.nextDouble();
                System.out.print("Enter the 2nd Semester GPA:");
                s2 = sc.nextDouble();
                System.out.println("------------Results------------");
                obj.sem1sem2(s1,s2);
                System.out.println("-------------------------------");
                break;
            case 'B':
                System.out.println("CGPA calculations upto 3rd sem");
                System.out.print("Enter the 1st Semester GPA:");
                s1 = sc.nextDouble();
                System.out.print("Enter the 2nd Semester GPA:");
                s2 = sc.nextDouble();
                System.out.print("Enter the 3rd Semester GPA:");
                s3 = sc.nextDouble();
                System.out.println("------------Results------------");
                obj.uptosem3(s1,s2,s3);
                System.out.println("-------------------------------");
                break;
            case 'C':
                System.out.println("CGPA calculations upto 4th sem");
                System.out.print("Enter the 1st Semester GPA:");
                s1 = sc.nextDouble();
                System.out.print("Enter the 2nd Semester GPA:");
                s2 = sc.nextDouble();
                System.out.print("Enter the 3rd Semester GPA:");
                s3 = sc.nextDouble();
                System.out.print("Enter the 4th Semester GPA:");
                s4 = sc.nextDouble();
                System.out.println("------------Results------------");
                obj.uptosem4(s1,s2,s3,s4);
                System.out.println("-------------------------------");
                break;
            case 'D':
                System.out.println("CGPA calculations upto 5th sem");
                System.out.print("Enter the 1st Semester GPA:");
                s1 = sc.nextDouble();
                System.out.print("Enter the 2nd Semester GPA:");
                s2 = sc.nextDouble();
                System.out.print("Enter the 3rd Semester GPA:");
                s3 = sc.nextDouble();
                System.out.print("Enter the 4th Semester GPA:");
                s4 = sc.nextDouble();
                System.out.print("Enter the 5th Semester GPA:");
                s5 = sc.nextDouble();
                System.out.println("------------Results------------");
                obj.uptosem5(s1,s2,s3,s4,s5);
                System.out.println("-------------------------------");
                break;
            case 'E':
                System.out.println("CGPA calculations upto 6th sem");
                System.out.print("Enter the 1st Semester GPA:");
                s1 = sc.nextDouble();
                System.out.print("Enter the 2nd Semester GPA:");
                s2 = sc.nextDouble();
                System.out.print("Enter the 3rd Semester GPA:");
                s3 = sc.nextDouble();
                System.out.print("Enter the 4th Semester GPA:");
                s4 = sc.nextDouble();
                System.out.print("Enter the 5th Semester GPA:");
                s5 = sc.nextDouble();
                System.out.print("Enter the 6th Semester GPA:");
                s6 = sc.nextDouble();
                System.out.println("------------Results------------");
                obj.uptosem6(s1,s2,s3,s4,s5,s6);
                System.out.println("-------------------------------");
                break;
            case 'F':
                System.out.println("CGPA calculations upto 7th sem");
                System.out.print("Enter the 1st Semester GPA:");
                s1 = sc.nextDouble();
                System.out.print("Enter the 2nd Semester GPA:");
                s2 = sc.nextDouble();
                System.out.print("Enter the 3rd Semester GPA:");
                s3 = sc.nextDouble();
                System.out.print("Enter the 4th Semester GPA:");
                s4 = sc.nextDouble();
                System.out.print("Enter the 5th Semester GPA:");
                s5 = sc.nextDouble();
                System.out.print("Enter the 6th Semester GPA:");
                s6 = sc.nextDouble();
                System.out.print("Enter the 7th Semester GPA:");
                s7 = sc.nextDouble();
                System.out.println("------------Results------------");
                obj.uptosem7(s1,s2,s3,s4,s5,s6,s7);
                System.out.println("-------------------------------");
                break;
            case 'G':
                System.out.println("CGPA calculations upto 8th sem");
                System.out.print("Enter the 1st Semester GPA:");
                s1 = sc.nextDouble();
                System.out.print("Enter the 2nd Semester GPA:");
                s2 = sc.nextDouble();
                System.out.print("Enter the 3rd Semester GPA:");
                s3 = sc.nextDouble();
                System.out.print("Enter the 4th Semester GPA:");
                s4 = sc.nextDouble();
                System.out.print("Enter the 5th Semester GPA:");
                s5 = sc.nextDouble();
                System.out.print("Enter the 6th Semester GPA:");
                s6 = sc.nextDouble();
                System.out.print("Enter the 7th Semester GPA:");
                s7 = sc.nextDouble();
                System.out.print("Enter the 8th Semester GPA:");
                s8 = sc.nextDouble();
                System.out.println("------------Results------------");
                obj.uptosem8(s1,s2,s3,s4,s5,s6,s7,s8);
                System.out.println("-------------------------------");
                break;
            default:
                System.out.println("Enter the valid option!!!!");
                break;
        }
    }
}
