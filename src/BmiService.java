public class BmiService {

    public int calculate(double weight, double height) {

        // version 1
        return (int) (weight / (height * height));

        // version 2
        /*double bmi = weight / (height * height);
        int roundedBmi = (int) bmi;
        return roundedBmi;*/

        // version 3
        /*int bmi = (int) (weight / (height * height));
        return bmi;*/
    }
}
