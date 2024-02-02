package ASSIGNMENTS_8;

public class OxygenProductionCalculator {
    private static final double OXYGEN_PER_PLANT = 0.9;


    public double calculateOxygenProduction(double length, double breadth, double plantArea) {
      
        double plantAreaInSquareMeters = plantArea / (100 * 100);

       
        int totalPlants = (int) (Math.floor(plantAreaInSquareMeters / 10) * 10);

        double totalOxygenProduction = totalPlants * OXYGEN_PER_PLANT;

        return totalOxygenProduction;
    }
}