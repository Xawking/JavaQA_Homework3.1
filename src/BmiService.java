public class BmiService {
    public int calculate(int weight, double height) {
        double bodyMass = weight / (height * height);
        return (int) bodyMass;

    }
}
