import java.io.*;
class GFG 
{

    // Return the maximum volume.

    static double maxvolume(double s)

    {

        // finding length

        double length = s / 3;

     

        s -= length;

     

        // finding breadth

        double breadth = s / 2;

     

        // finding height

        double height = s - breadth;

     

        return length * breadth * height;

    }

     

    // Driven Program

    public static void main (String[] args) 

    {

        int s = 999;

        System.out.printf ( "%.12f",maxvolume(s));

                 

    }
}
