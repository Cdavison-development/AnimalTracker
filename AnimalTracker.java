package Week_3;


public class AnimalTracker { //public class that creates attribute name, distance travelled , and Coordpoint object
    String name = ""; //empty because it is defined later
    public CoordPoint location = null; //this is set to null because it is addressed later in the code
    private double distanceTravelled = 0; // set to 0 because value is changed later in the code



    public AnimalTracker(String name, double x, double y){
        this.name = name;                                   //sets name equal to String name created inside method
        this.location = new CoordPoint(); //creates location object


    }

    public void move(double nx, double ny){
        double distance=location.getDistance(nx, ny); //fetches nx and ny from GetDistance Method
        this.distanceTravelled+= distance; // adds distanceTravelled Attribute to distance attribute
        this.location.setLocation(nx, ny);//fetches nx and ny from setlocation method


    }

    public double getDistanceTravelled(){
        return distanceTravelled;
    } // returns distanceTravelled Attribute


}





