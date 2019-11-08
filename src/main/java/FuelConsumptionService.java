public class FuelConsumptionService {
    public double calculateDistance(double volume, double consumption) {
        int fuelDistance = 100;
        return Math.ceil(volume * fuelDistance / consumption);
    }
}
