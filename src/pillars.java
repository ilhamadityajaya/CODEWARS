
public class pillars {

    public static int pillars(int numPill, int dist, int width) {

        if (numPill == 1) {
            return 0;
        }

        int distanceInCm = dist * 100;

        int totalDistance = (numPill - 1) * distanceInCm;

        totalDistance += (numPill - 2) * width;

        return totalDistance;
    }

    public static void main(String[] args) {

        System.out.println(pillars(1, 20, 30));
        System.out.println(pillars(2, 20, 25));
        System.out.println(pillars(3, 15, 30));
        System.out.println(pillars(5, 10, 50));
    }
}
