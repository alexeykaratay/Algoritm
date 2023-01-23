public class Excerise_2 {
    public static void main(String[] args) {
        int[] station = {0, 200, 375, 550, 750, 950};
        System.out.println(minStop(station, 400));


    }
    public static int minStop(int[] station, int capacity) {
        int result = 0;
        int currentStop = 0;

        while (currentStop < station.length -1) {
            int nextStop = currentStop;
            while (nextStop < station.length -1 && station[nextStop+1] - station[currentStop] <= capacity)
                nextStop++;
            if (currentStop==nextStop)
                return -1;
            if (nextStop < station.length -1)
                result++;
            currentStop=nextStop;
        }
        return result;

    }
}
