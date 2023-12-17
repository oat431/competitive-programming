import java.util.Scanner;

public class Prb1001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt(); 
        int col = in.nextInt(); 
        in.nextLine(); 

        char[][] map = new char[row][col];
        int[] brick = new int[col];

        for (int i = 0; i < row; i++) {
            String line = in.nextLine();
            for (int j = 0; j < col; j++) {
                map[i][j] = line.charAt(j);
            }
        }

        for (int i = 0; i < col; i++) {
            brick[i] = in.nextInt();
        }

        in.close();

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < brick[i]; j++) {
                for (int k = 0; k < row; k++) {
                    if (map[k][i] == 'O' || map[k][i] == '#') {
                        if (k > 0) map[k-1][i] = '#';
                        break;
                    } else if (k == row-1) {
                        map[k][i] = '#';
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }

    }
}

// from : https://programming.in.th/tasks/1001