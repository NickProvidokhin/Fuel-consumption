import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuelConsumptionServiceTest {
    @Test
    void distanceCalculateWhenVolumeIsZero() {
        FuelConsumptionService service = new FuelConsumptionService();
        double volume = 0.0;
        double consumption = 10.0;

        double result = new FuelConsumptionService().calculateDistance(volume, consumption);

        assertEquals(0.0, result);
    }

    @Test
    void distanceCalculateWhenVolumeOverConsumption() {
        FuelConsumptionService service = new FuelConsumptionService();
        double volume = 135.0;
        double consumption = 10.0;

        double result = new FuelConsumptionService().calculateDistance(volume, consumption);

        assertEquals(1350.0, result);
    }

    @Test
    void distanceCalculateWhenVolumeUnderConsumption() {
        FuelConsumptionService service = new FuelConsumptionService();
        double volume = 5.0;
        double consumption = 10.0;

        double result = new FuelConsumptionService().calculateDistance(volume, consumption);

        assertEquals(50.0, result);
    }

}