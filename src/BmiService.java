public class BmiService {
    public double calculate( double bodyWeightInKg, double heightInMeters){
        double bodyMassIndex = bodyWeightInKg/(heightInMeters*heightInMeters);

        return bodyMassIndex;
    }
}
