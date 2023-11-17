package se.lexicon.practise;

public class Car {
    private String brand;
    private int regNo;
    private int speed;
    private String ownerName;

    @Override
    public String toString() {
        return "Car Details : " +
                "brand='" + brand + '\'' +
                ", regNo=" + regNo +
                ", speed=" + speed +
                ", ownerName='" + ownerName + '\'' +
                ", model='" + model + '\'' +
                '.';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    private String model;
}

class CarCreator {
    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("Volvo");
        car.setRegNo(3454);
        car.setOwnerName("Anita");
        car.setSpeed(130);
        car.setModel("123454321WS12");
        System.out.println(car);
    }
}
