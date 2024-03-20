
public class Main {
    public static void main(String[] args) {

       /* for(int i = 0; i<=9; i++){
            int x = 1;
            System.out.print(x); */

        //[paris, london, madrid] -> [Paris, London, Madrid]

        String[] cities = {"paris", "london", "madrid"};
        String[] capitalizedCities = new String[cities.length];

        for (int i = 0; i < cities.length; i++) {
            System.out.print(cities[i] + " ");
        }

        System.out.println();

        for (int j = 0; j < cities.length; j++) {
            capitalizedCities[j] = cities[j].substring(0, 1).toUpperCase() + cities[j].substring(1); // substring(0, 1): (initial position is always 0, and the first one (0 too), is the one you want pick, and 1  is where the subtring ends.  the second part, 1 is just where the substring beginns.
            System.out.print(capitalizedCities[j] + " ");

        }


    }
}