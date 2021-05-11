

public class CoordPoint { //public class that creates 2 double variables, x and y
    double x = 0;
    double y = 0;




    public void CoordPoint(double nx, double ny){   //method that makes x and y defined in public class CoordPoint
        this.x = nx;                                // equal to nx and ny, the attributes created in the method
        this.y = ny;

    }

    public void CoordPoint(CoordPoint p){
        this.x = p.x;                       //sets x and y to the P object using the dot notation
        this.y = p.y;
    }
    public void setLocation(double nx, double ny){
        this.x = nx;                        //used to set x and y to nx and ny, this is used to create the location
        this.y = ny;                        // object inside the move method in AnimalTracker Class

    }
    public float getDistance(double nx, double ny){
        return (float) Math.sqrt(Math.pow(nx-x, 2.0) + Math.pow(ny-y, 2.0)); //algorithm used to calculate the distance
    }                                                                    //inside the Move method in AnimalTracker class

    public double getX(){
        return this.x;
    } //returns the x attribute

    public double getY(){
        return this.y;
    } //returns the y attribute


}
