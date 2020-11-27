public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double bodyMassIndex = service.calculate(80,1.6);
        System.out.println(bodyMassIndex);

    }
}
