package vehicle_system;

public class MotorcycleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new MotorCycle();
    }
    
}
