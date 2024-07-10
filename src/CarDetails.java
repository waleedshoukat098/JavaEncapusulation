class CarDetails {
    private String make;
    private String model;
    private int milage;

    CarDetails(String make, String model, int milage) {
        this.make = make;
        this.model = model;
        this.milage = milage;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setMilage(int carMilage) {
        if (carMilage > 0) {
            this.milage = carMilage;
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMilage() {
        return milage;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}

class CarDetailsResult {
    public static void main(String[] args) {
        CarDetails carDetails = new CarDetails("Honda", "Civic", 20);
        System.out.println("Made by => " + carDetails.getMake() + "\n" +
                "Model is => " + carDetails.getModel() + "\n"+
                " Mileage is => " +carDetails.getMilage());
        carDetails.getMake();
        carDetails.setMake("Toyota");
        carDetails.setModel("2024");
        carDetails.setMilage(30);
        carDetails.getMilage();
        carDetails.getModel();
        carDetails.setMilage(40);
        System.out.println("Made by => " + carDetails.getMake() + "\n" +
                "Model is => " + carDetails.getModel() + "\n"+
                " Mileage is => " +carDetails.getMilage()+"kmp/h");
    }

}