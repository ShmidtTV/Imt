public class BmiService {
    public int calculate(int weightInKg, double heightInMeters) {
        double bodyMassIndex = weightInKg / (heightInMeters * heightInMeters);
        return (int) bodyMassIndex;
    }


}
