public class Hangar {
    public static void main(String[] args) {

        //Instances of Car and Boat
        Car audi = new Car("Audi", 10000);
        Boat sun = new Boat("Sun Tracker", 500);

        //Display content of doStuff method
        System.out.println(audi.doStuff());
        System.out.println(sun.doStuff());
    }
}
