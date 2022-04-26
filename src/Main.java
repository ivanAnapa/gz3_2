public class Main {
    public static void main(String[] args) {

        BmiService bmiService = new BmiService();

        // set value in kilograms
        double weight = 95.60;

        // set value in meters
        double height = 1.84;

        // В методе calculate лежит 3 версии одного и того же решения. Какая лучше?
        int bmi = bmiService.calculate(weight, height);
        System.out.println("Индекс массы тела: " + bmi);

    }
}
