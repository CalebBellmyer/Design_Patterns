package vehicle_system;

public class Main {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        VehicleFactory motorcycleFactory = new MotorcycleFactory();
        TruckFactory truckFactory = new TruckFactory();
        
        Vehicle car = carFactory.createVehicle();
        Vehicle motorcycle = motorcycleFactory.createVehicle();
        Vehicle truck = truckFactory.createVehicle();
        
        car.getType();
        motorcycle.getType();
        truck.getType();
    }
    
}
