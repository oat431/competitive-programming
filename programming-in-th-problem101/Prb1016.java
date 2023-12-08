import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

record Treasure(Double distance, String direction ) {}
public class Prb1016 {
    private static Double x = 0.0;
    private static Double y = 0.0;
    public static void main(String[] args) {
        List<Treasure> map = getTreasureMap();

        for(Treasure t : map) {
            followingTreasure(t);
        }

        System.out.printf("%.3f %.3f\n", x, y);
        System.out.printf("%.3f",getDistanceFromBeginning(x, y));
    }

    private static void followingTreasure(Treasure t) {
            switch(t.direction()) {
                case "N":
                    y += t.distance();
                    break;
                case "S":
                    y -= t.distance();
                    break;
                case "E":
                    x += t.distance();
                    break;
                case "W":
                    x -= t.distance();
                    break;
                case "NE":
                    x += t.distance() * Math.cos(Math.PI / 4);
                    y += t.distance() * Math.sin(Math.PI / 4);
                    break;
                case "NW":
                    x -= t.distance() * Math.cos(Math.PI / 4);
                    y += t.distance() * Math.sin(Math.PI / 4);
                    break;
                case "SE":
                    x += t.distance() * Math.cos(Math.PI / 4);
                    y -= t.distance() * Math.sin(Math.PI / 4);
                    break;
                case "SW":
                    x -= t.distance() * Math.cos(Math.PI / 4);
                    y -= t.distance() * Math.sin(Math.PI / 4);
                    break;
            }
    }

    private static double getDistanceFromBeginning(double x, double y) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    private static List<Treasure> getTreasureMap() {
        Scanner in = new Scanner(System.in);
        List<Treasure> map = new ArrayList<>();
        while(true) {
            String t = in.next();
            if(t.equals("*")) {
                break;
            }
            String dis = t.replaceAll("[^0-9.]", "");
            String dir = t.replaceAll("[0-9.]", "");
            map.add(new Treasure(Double.parseDouble(dis), dir));
        }
        in.close();
        return map;
    }
}

// from : https://programming.in.th/tasks/1016