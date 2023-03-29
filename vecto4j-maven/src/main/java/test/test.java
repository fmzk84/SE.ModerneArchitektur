package test;

import de.dhbw.ka.se2.application.print.VehicleConfigGenerator;
import de.dhbw.ka.se2.domain.logistics.VehicleWeights;
import de.dhbw.ka.se2.domain.print.VehicleConfiguration;
import de.dhbw.ka.se2.domain.vehicledata.VehicleComponent;
import de.dhbw.ka.se2.plugin.logistics.LogisticsClient;
import de.dhbw.ka.se2.plugin.vehicledata.VehicleDataClient;

public class test {
	public static void main(String[] args) {
	    VehicleConfigGenerator gen = new VehicleConfigGenerator();
	    VehicleConfiguration vehicle = gen.generateVehicle(false);
	    VehicleDataClient vehicleDataClient = new VehicleDataClient();
	    VehicleComponent vehicleComponent = vehicleDataClient.getComponents(vehicle);
	    
	    LogisticsClient logisticsClient = new LogisticsClient();
	    VehicleWeights vehicleWeights = logisticsClient.getWeights(vehicle);

	    // Hier können Sie die Werte weiterverarbeiten oder ausgeben lassen.
	    System.out.println("Vehicle component: " + vehicleComponent);
	    System.out.println("Vehicle weights: " + vehicleWeights);
	}

}
