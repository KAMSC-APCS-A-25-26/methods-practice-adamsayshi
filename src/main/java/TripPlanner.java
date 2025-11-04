import java.util.Scanner;

public class TripPlanner {
    public static void main(String[] args) {
        // TODO: Get user input for trip details
        // - Distance (miles)
        // - Average speed (mph)
        // - Fuel efficiency (miles per gallon)
        // - Fuel price per gallon
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter trip distance (miles): ");
        double miles = sc.nextDouble();
        System.out.print("Enter average speed (mph): ");
        double speed = sc.nextDouble();
        System.out.print("Enter fuel efficiency (miles per gallon): ");
        double eff = sc.nextDouble();
        System.out.print("Enter fuel price per gallon ($): ");
        double price = sc.nextDouble();

        // TODO: Calculate travel time using a return method
        // TODO: Calculate fuel needed using a return method
        // TODO: Calculate trip cost using a return method
        // TODO: Display results using a void method
        displayResults(calculateTravelTime(miles, speed), calculateFuelNeeded(eff, miles), calculateTripCost(eff, miles, price));
    }
    
    // TODO: Implement calculateTravelTime method
    public static double calculateTravelTime(double m, double s){
        return m/s;
    }
    // TODO: Implement calculateFuelNeeded method
    public static double calculateFuelNeeded(double e, double m){
        return m/e;
    }
    // TODO: Implement calculateTripCost method
    public static double calculateTripCost(double e, double m, double g){
        return (m/e)*g;
    }
    // TODO: Implement displayResults method
    public static void displayResults(double m,double s,double e){
        System.out.println("Results: ");
        System.out.println("Travel Time: " + String.format("%.2f", m) + " hours");
        System.out.println("Fuel Needed: " + String.format("%.2f", s) + " gallons");
        System.out.println("Trip Cost: $" + String.format("%.2f", e));
    }
}
