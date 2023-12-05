import java.util.Scanner;

class Team {
    private String name;
    private int score;
    private int win;
    private int lose;

    public Team(String name, int win, int score, int lose) {
        this.name = name;
        this.win = win;
        this.score = score;
        this.lose = lose;
    }

    public String getName() { return name; }
    public int getWin() { return win; }
    public int getLose() { return lose; }
    public int getScore() { return score; }

    public void setWin(int win) { this.win = win; }
    public void setLose(int lose) { this.lose = lose;}
    public void setScore(int score) { this.score = score;}

}

public class Prb0028 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Team[] teams = new Team[4];
        for(int i=0;i<4;i++) {
            teams[i] = new Team(in.next(), 0, 0, 0);
        }

        int[][] scores = new int[4][4];
        for(int i=0;i<4;i++) {
            for(int j=0;j<4;j++) {
                scores[i][j] = in.nextInt();
                if(i != j) {
                    teams[i].setWin(teams[i].getWin() + scores[i][j]);
                    teams[i].setLose(teams[i].getLose() + scores[i][j]);
                }
            }
        }

        for(int i=0;i<4;i++) {
            for(int j=0;j<4;j++) {
                if(scores[i][j] > scores[j][i]) {
                    teams[i].setScore(teams[i].getScore() + 3);
                } else if (scores[i][j] == scores[j][i] && i != j) {
                    teams[i].setScore(teams[i].getScore() + 1);
                }
            }
        }

        for(int i=0;i<4;i++) {
            int k = i;
            for(int j=0;j<4;j++) {
                if(compareJustScore(teams[k], teams[j])) {
                    k=j;
                } else if(comparePerfermance(teams[k], teams[j])) {
                    k=j;
                } else if(compareWinRate(teams[k], teams[j])) {
                    k=j;
                }
            }
            System.out.println(teams[k].getName() + " " + teams[k].getScore());
            teams[k].setScore(-1);
        }
    }

    private static boolean compareJustScore(Team t1, Team t2) {
        return t1.getScore() < t2.getScore();
    }

    private static boolean comparePerfermance(Team t1, Team t2) {
        return t1.getScore() == t2.getScore() && 
        t1.getWin() - t1.getLose() < t2.getWin() - t2.getLose();
    }

    private static boolean compareWinRate(Team t1, Team t2) {
        return t1.getScore() == t2.getScore() && 
        t1.getWin() - t1.getLose() == t2.getWin() - t2.getLose() &&
        t1.getWin() < t2.getWin();
    }
}

// from : https://programming.in.th/tasks/0028