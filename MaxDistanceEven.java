public class MaxDistanceEven
{
    public static void main(String[] args)
    {
        int n = 2;                                  //Initializes n as 2.
        double maxDistance = 4 * Math.sqrt(2) / 3;  //The distance of the furthest point from the origin when n = 2.
        double numerator = 4 * Math.sqrt(2);        //The numerator of maxDistance.
        double denominator = 3;                     //The denominator of maxDistance.
        double numeratorDiff = 4 * Math.sqrt(2);    //The amount the numerator changes by when n increases by 2.
        int denominatorDiff = 2;                    //The amount the denominator changes by when n increases by 2.
        double temp;                                //A temporary variable for storing values.
        double change;                      //The distance between maxDistance and the previous value of maxDistance.

        /*
        To conserve processing power, this program is only run until n is greater than 100000, which is far beyond when
        the value of change noticeably converges. n is incremented by 1, but this actually represents 2 increments of n.
        numeratorDiff and denominatorDiff are accordingly shifted to account for this.
        */
        while(n <= 10000)
        {
            numeratorDiff += 6 * Math.sqrt(2);      //Increases the amount by which the numerator increases.
            temp = maxDistance;                     //Assigns the current maxDistance to temp.
            numerator += numeratorDiff;             //Increases the numerator by numeratorDiff.
            denominator += denominatorDiff;         //Increases the denominator by denominatorDiff.
            maxDistance = numerator / denominator;  //Assigns the numerator divided by the denominator to maxDistance.
            change = maxDistance - temp;            //Calculates the distance between maxDistance and temp.
            System.out.println(change);             //Prints change.
            n++;                                    //Increases n by 1, representing two increments of n.
        }
    }
}
