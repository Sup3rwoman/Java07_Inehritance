public class Boat extends Vehicle{
    //Constructor
    public Boat(String brand, int kilometers) {
        super(brand, kilometers);
    }

    @Override
    public String doStuff() {
        return "I'm " + this.getBrand() + " and I go glug glug!";
    }
}
