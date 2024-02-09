public class Main1 {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightInMeters = 1.87;
        int weightInKg = 98;
        int bodyMassIndex = service.calculate(weightInKg, heightInMeters);
        System.out.println(bodyMassIndex);

    }
}
