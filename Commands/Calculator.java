package Commands;

public class Calculator {
    public static String Calculate(double x, double y, double R) {

        String result = new String();

        if (x<=0 & y<=0 & x>=-R/2 & y>=-R){
            result = "successful hit";
        } else if (x>= 0 & y>=0 & y<=(-x + R/2) & x<=(-y + R/2)){
            result = "successful hit";
        } else if (x >= 0 & y<=0 & (x*x + y*y <= R*R)){
            result = "successful hit";
        } else result = "unsuccessful hit";

        return result;
    }

}
