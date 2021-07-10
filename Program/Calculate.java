
import java.text.DecimalFormat;

public class Calculate {
    public Double calc;
    private static DecimalFormat df = new DecimalFormat("0.00");
    public void sem1sem2(Double s1,Double s2){
        calc = (s1+s2)/2;
        System.out.println("CGPA upto 2nd semester - "+df.format(calc));
    }
    public void uptosem3(double s1,double s2,double s3){
        calc = (s1+s2+s3)/3;
        System.out.println("CGPA upto 3rd semester - "+df.format(calc));
    }
    public void uptosem4(double s1,double s2,double s3,double s4){
        calc = (s1+s2+s3+s4)/4;
        System.out.println("CGPA upto 4th semester - "+df.format(calc));
    }
    public void uptosem5(double s1,double s2,double s3,double s4,double s5){
        calc = (s1+s2+s3+s4+s5)/5;
        System.out.println("CGPA upto 5th semester - "+df.format(calc));
    }
    public void uptosem6(double s1,double s2,double s3,double s4,double s5,double s6){
        calc = (s1+s2+s3+s4+s5+s6)/6;
        System.out.println("CGPA upto 6th semester - "+df.format(calc));
    }
    public void uptosem7(double s1,double s2,double s3,double s4,double s5,double s6,double s7){
        calc = (s1+s2+s3+s4+s5+s6+s7)/7;
        System.out.println("CGPA upto 7th semester - "+df.format(calc));
    }
    public void uptosem8(double s1,double s2,double s3,double s4,double s5,double s6,double s7,double s8){
        calc = (s1+s2+s3+s4+s5+s6+s7+s8)/8;
        System.out.println("CGPA upto 8th semester - "+df.format(calc));
    }
}
