
public class Car  {

//Trick: Apply this formula
    //The <Classname> <MethodName> itself

  /*The Car starts itself : Yes
    The Car stops itself: Yes
    The Car applies breaks itself : No
    The Car shifts gear itself : No
    The Car washes itself: No
    The Car rides itself: No*/


    public void start() {
        System.out.println("Car Starts");
    }

    public void stop() {
        System.out.println("Car Stops");
    }

    public void shiftGear() {
        System.out.println("Shift Gears");
    }

    public void applyBreaks() {
        System.out.println("Apply Breaks");
    }

    public void wash() {
        System.out.println("Washes");
    }

    public void ride() {
        System.out.println("Rides");
    }

}
