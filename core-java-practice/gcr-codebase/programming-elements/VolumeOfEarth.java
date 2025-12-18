
//Create a class to calculate the volume of the earth in cubic kilometers and cubic miles
public class VolumeOfEarth {
    public static void main(String[] args) {
        //Declare a varaible to store the radius of the eart
        int radiusOfEarth = 6378;

        //Declare a variable to store the vlaue of pi
        double pi = Math.PI;

        //Declare a variable to calculate the volume of earth in cubic kilometers 
        double volumeInKilometers = (4/ 3 ) * pi * Math.pow(radiusOfEarth, 3);

        //Declare a variable to calculate the volume of earth in cubic miles
        double volumeInMiles = volumeInKilometers * Math.pow(1.6 , 3);

        //Display the result 
        System.out.println("The volume of earth in cubic kilometers is "
                + volumeInKilometers + " and cubic miles is " + volumeInMiles);
    }
}

