import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

record Point(int x, int y) {}

public class Prb0035 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        List<Point> points = new ArrayList<>();

        int n = Integer.parseInt(in.readLine());
        for(int i = 0; i < n; i++) {
            String[] line = in.readLine().split(" ");
            points.add(new Point(Integer.parseInt(line[0]), Integer.parseInt(line[1])));
        }
        in.close();

        double maxArea = 0.0;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                for(int k=j+1; k<n; k++) {
                    maxArea = Math.max( 
                        maxArea,
                        getArea(points.get(i), points.get(j), points.get(k))
                    );
                }
            }
        }
        System.out.printf("%.3f\n", maxArea);
    }

    private static double getArea(Point p1, Point p2, Point p3) {
        return Math.abs(
                p1.x() * p2.y() + 
                p2.x() * p3.y() + 
                p3.x() * p1.y() - 
                p1.y() * p2.x() - 
                p2.y() * p3.x() - 
                p3.y() * p1.x()
        ) / 2.0;
    }
}
