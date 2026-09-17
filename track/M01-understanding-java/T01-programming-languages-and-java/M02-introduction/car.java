public class car {
    static void convertKmIntoMiles() {
        System.out.println("Converting KM into Miles.....");
    }

    void convertMilesIntoKm() {
        System.out.println("Converting Miles into KM.....");
    }

    public static void main(String[] args) {
        car.convertKmIntoMiles();
        car obj = new car();
        obj.convertMilesIntoKm();
    }
}
