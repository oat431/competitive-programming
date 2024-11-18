import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;

class SevenSegment {
    private char[][] sevenSegment;

    public SevenSegment() {
        this.sevenSegment = new char[3][3];
    }

    public SevenSegment(char[][] sevenSegment) {
        this.sevenSegment = sevenSegment;
    }

    public void setSegment(int x, int y, char v) {
        this.sevenSegment[x][y] = v;
    }

    public char getDigitFromSegment() {
        if (isDigit1()) {
            return '1';
        } else if (isDigit2()) {
            return '2';
        } else if (isDigit3()) {
            return '3';
        } else if (isDigit4()) {
            return '4';
        } else if (isDigit5()) {
            return '5';
        } else if (isDigit6()) {
            return '6';
        } else if (isDigit7()) {
            return '7';
        } else if (isDigit8()) {
            return '8';
        } else if (isDigit9()) {
            return '9';
        } else if (isDigit0()) {
            return '0';
        }
        return '0';
    }

    private boolean isDigit1() {
        return this.sevenSegment[0][0] == ' ' && this.sevenSegment[0][1] == ' ' && this.sevenSegment[0][2] == ' '
                && this.sevenSegment[1][0] == ' ' && this.sevenSegment[1][1] == ' ' && this.sevenSegment[1][2] == '|'
                && this.sevenSegment[2][0] == ' ' && this.sevenSegment[2][1] == ' ' && this.sevenSegment[2][2] == '|';
    }

    private boolean isDigit2() {
        return this.sevenSegment[0][0] == ' ' && this.sevenSegment[0][1] == '_' && this.sevenSegment[0][2] == ' '
                && this.sevenSegment[1][0] == ' ' && this.sevenSegment[1][1] == '_' && this.sevenSegment[1][2] == '|'
                && this.sevenSegment[2][0] == '|' && this.sevenSegment[2][1] == '_' && this.sevenSegment[2][2] == ' ';
    }

    private boolean isDigit3() {
        return this.sevenSegment[0][0] == ' ' && this.sevenSegment[0][1] == '_' && this.sevenSegment[0][2] == ' '
                && this.sevenSegment[1][0] == ' ' && this.sevenSegment[1][1] == '_' && this.sevenSegment[1][2] == '|'
                && this.sevenSegment[2][0] == ' ' && this.sevenSegment[2][1] == '_' && this.sevenSegment[2][2] == '|';
    }

    private boolean isDigit4() {
        return this.sevenSegment[0][0] == ' ' && this.sevenSegment[0][1] == ' ' && this.sevenSegment[0][2] == ' '
                && this.sevenSegment[1][0] == '|' && this.sevenSegment[1][1] == '_' && this.sevenSegment[1][2] == '|'
                && this.sevenSegment[2][0] == ' ' && this.sevenSegment[2][1] == ' ' && this.sevenSegment[2][2] == '|';
    }

    private boolean isDigit5() {
        return this.sevenSegment[0][0] == ' ' && this.sevenSegment[0][1] == '_' && this.sevenSegment[0][2] == ' '
                && this.sevenSegment[1][0] == '|' && this.sevenSegment[1][1] == '_' && this.sevenSegment[1][2] == ' '
                && this.sevenSegment[2][0] == ' ' && this.sevenSegment[2][1] == '_' && this.sevenSegment[2][2] == '|';
    }

    private boolean isDigit6() {
        return this.sevenSegment[0][0] == ' ' && this.sevenSegment[0][1] == '_' && this.sevenSegment[0][2] == ' '
                && this.sevenSegment[1][0] == '|' && this.sevenSegment[1][1] == '_' && this.sevenSegment[1][2] == ' '
                && this.sevenSegment[2][0] == '|' && this.sevenSegment[2][1] == '_' && this.sevenSegment[2][2] == '|';
    }

    private boolean isDigit7() {
        return this.sevenSegment[0][0] == ' ' && this.sevenSegment[0][1] == '_' && this.sevenSegment[0][2] == ' '
                && this.sevenSegment[1][0] == ' ' && this.sevenSegment[1][1] == ' ' && this.sevenSegment[1][2] == '|'
                && this.sevenSegment[2][0] == ' ' && this.sevenSegment[2][1] == ' ' && this.sevenSegment[2][2] == '|';
    }

    private boolean isDigit8() {
        return this.sevenSegment[0][0] == ' ' && this.sevenSegment[0][1] == '_' && this.sevenSegment[0][2] == ' '
                && this.sevenSegment[1][0] == '|' && this.sevenSegment[1][1] == '_' && this.sevenSegment[1][2] == '|'
                && this.sevenSegment[2][0] == '|' && this.sevenSegment[2][1] == '_' && this.sevenSegment[2][2] == '|';
    }

    private boolean isDigit9() {
        return this.sevenSegment[0][0] == ' ' && this.sevenSegment[0][1] == '_' && this.sevenSegment[0][2] == ' '
                && this.sevenSegment[1][0] == '|' && this.sevenSegment[1][1] == '_' && this.sevenSegment[1][2] == '|'
                && this.sevenSegment[2][0] == ' ' && this.sevenSegment[2][1] == '_' && this.sevenSegment[2][2] == '|';
    }

    private boolean isDigit0() {
        return this.sevenSegment[0][0] == ' ' && this.sevenSegment[0][1] == '_' && this.sevenSegment[0][2] == ' '
                && this.sevenSegment[1][0] == '|' && this.sevenSegment[1][1] == ' ' && this.sevenSegment[1][2] == '|'
                && this.sevenSegment[2][0] == '|' && this.sevenSegment[2][1] == '_' && this.sevenSegment[2][2] == '|';
    }

}

public class Prb1009 {
    private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    private static Long convertSegmentToInteger(List<SevenSegment> num) {
        return Long.parseLong(num.stream()
                .map(SevenSegment::getDigitFromSegment)
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString());
    }

    private static Long addSegment(List<SevenSegment> num1, List<SevenSegment> num2) {
        return convertSegmentToInteger(num1) + convertSegmentToInteger(num2);
    }

    private static boolean isSeperateBetweenSegment(int i) {
        return i == 3 || i == 7 || i == 11 ||
                i == 15 || i == 19 || i == 23 ||
                i == 27 || i == 31 || i == 35 ||
                i == 39 || i == 43 || i == 47;
    }

    private static List<SevenSegment> prepareInput(String[] segment, int n) {
        SevenSegment[] num = new SevenSegment[n];
        for (int i = 0; i < n; i++) {
            num[i] = new SevenSegment();
        }

        int segmentLength = (n * 3) + (n - 1);
        int tempIdxForEachSegment = 0;
        int idxForEachSegment = 0;
        for (int i = 0; i < 3; i++) {
            tempIdxForEachSegment = 0;
            idxForEachSegment = 0;
            for (int j = 0; j < segmentLength; j++) {
                if (isSeperateBetweenSegment(j)) {
                    tempIdxForEachSegment = 0;
                    idxForEachSegment++;
                    continue;
                } else {
                    num[idxForEachSegment].setSegment(
                            i, // row
                            tempIdxForEachSegment, // column
                            segment[i].charAt(j)); // value
                    tempIdxForEachSegment++;
                }
            }
        }

        return List.of(num);
    }

    public static void main(String[] args) throws IOException {
        int a, b;
        String[] rawNum1 = new String[3];
        String[] rawNum2 = new String[3];

        String[] input = in.readLine().split(" ");
        a = Integer.parseInt(input[0]);
        b = Integer.parseInt(input[1]);
        for (int i = 0; i < 3; i++) {
            rawNum1[i] = in.readLine();
        }
        for (int i = 0; i < 3; i++) {
            rawNum2[i] = in.readLine();
        }

        List<SevenSegment> num1 = prepareInput(rawNum1, a);
        List<SevenSegment> num2 = prepareInput(rawNum2, b);
        System.out.println(addSegment(num1, num2));
    }
}
