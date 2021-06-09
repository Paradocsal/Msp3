package Commands;

public class Shooting {
    public static void Shoot(String inputPart1, String inputPart2, String inputPart3) {
        try {
            double x = Double.parseDouble(inputPart1);
            double y = Double.parseDouble(inputPart2);
            double R = Double.parseDouble(inputPart3);
            if (R >= 0) {
                Store.addResult(Calculator.Calculate(x, y, R));
                System.out.println(Store.getLastResult());
            } else System.out.println("Your radius is less than zero. Try again");
        } catch (Exception e) {
            System.out.println("Oops, you have mistake. Try again");
        }

    }


}
