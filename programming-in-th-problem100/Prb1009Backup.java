import java.math.BigDecimal;
import java.util.Scanner;

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
        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 3; j++) {
        // System.out.println(this.sevenSegment[i][j]);
        // }
        // System.out.println();
        // }
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
        return '?';
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

public class Prb1009Backup {
    private static final Scanner in = new Scanner(System.in);

    private static Integer convertSegmentToInteger(SevenSegment[] num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num.length; i++) {
            sb.append(num[i].getDigitFromSegment());
        }
        return Integer.parseInt(sb.toString());
    }

    private static Integer addSegment(SevenSegment[] num1, SevenSegment[] num2) {
        int numResult1 = convertSegmentToInteger(num1);
        int numResult2 = convertSegmentToInteger(num2);
        System.out.println(numResult1);
        System.out.println(numResult2);
        return numResult1 + numResult2;
    }

    private static void testcase1() {
        SevenSegment[] num1 = new SevenSegment[4];
        SevenSegment[] num2 = new SevenSegment[2];

        num1[0] = new SevenSegment(
                new char[][] {
                        { ' ', ' ', ' ' },
                        { ' ', ' ', '|' },
                        { ' ', ' ', '|' }
                });
        num1[1] = new SevenSegment(
                new char[][] {
                        { ' ', ' ', ' ' },
                        { '|', '_', '|' },
                        { ' ', ' ', '|' }
                });
        num1[2] = new SevenSegment(
                new char[][] {
                        { ' ', ' ', ' ' },
                        { ' ', ' ', '|' },
                        { ' ', ' ', '|' }
                });
        num1[3] = new SevenSegment(
                new char[][] {
                        { ' ', ' ', ' ' },
                        { '|', '_', '|' },
                        { ' ', ' ', '|' }
                });

        num2[0] = new SevenSegment(
                new char[][] {
                        { ' ', ' ', ' ' },
                        { '|', '_', '|' },
                        { ' ', ' ', '|' }
                });
        num2[1] = new SevenSegment(
                new char[][] {
                        { ' ', ' ', ' ' },
                        { ' ', ' ', '|' },
                        { ' ', ' ', '|' }
                });

        System.out.println(addSegment(num1, num2));
    }

    public static void testcase2() {
        SevenSegment[] num1 = new SevenSegment[4];
        SevenSegment[] num2 = new SevenSegment[3];

        num1[0] = new SevenSegment(
                new char[][] {
                        { ' ', ' ', ' ' },
                        { ' ', ' ', '|' },
                        { ' ', ' ', '|' }
                });
        num1[1] = new SevenSegment(
                new char[][] {
                        { ' ', ' ', ' ' },
                        { '|', '_', '|' },
                        { ' ', ' ', '|' }
                });

        num1[2] = new SevenSegment(
                new char[][] {
                        { ' ', '_', ' ' },
                        { ' ', '_', '|' },
                        { '|', '_', ' ' }
                });
        num1[3] = new SevenSegment(
                new char[][] {
                        { ' ', ' ', ' ' },
                        { '|', '_', '|' },
                        { ' ', ' ', '|' }
                });

        num2[0] = new SevenSegment( // 7
                new char[][] {
                        { ' ', '_', ' ' },
                        { ' ', ' ', '|' },
                        { ' ', ' ', '|' }
                });

        num2[1] = new SevenSegment( // 1
                new char[][] {
                        { ' ', ' ', ' ' },
                        { ' ', ' ', '|' },
                        { ' ', ' ', '|' }
                });

        num2[2] = new SevenSegment( // 6
                new char[][] {
                        { ' ', '_', ' ' },
                        { '|', '_', ' ' },
                        { '|', '_', '|' }
                });

        System.out.println(addSegment(num1, num2));
    }

    private static void testcase3() {
        String[] rawNum1 = new String[3];
        rawNum1[0] = "               ";
        rawNum1[1] = "  | |_|   | |_|";
        rawNum1[2] = "  |   |   |   |";

        String[] rawNum2 = new String[3];
        rawNum2[0] = "       ";
        rawNum2[1] = "|_|   |";
        rawNum2[2] = "  |   |";

        SevenSegment[] num1 = prepareInput(rawNum1, 4);
        SevenSegment[] num2 = prepareInput(rawNum2, 2);

        System.out.println(addSegment(num1, num2));
    }

    private static boolean isSeperateBetweenSegment(int i) {
        return i == 3 || i == 7 || i == 11 ||
                i == 15 || i == 19 || i == 23 ||
                i == 31 || i == 35 || i == 39 ||
                i == 43;
    }

    // testing
    private static SevenSegment[] prepareInput(String[] segment, int n) {
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
                    System.out.println(i + " " + j + " " + tempIdxForEachSegment + " " + idxForEachSegment);
                    num[idxForEachSegment].setSegment(
                            i, // row
                            tempIdxForEachSegment, // column
                            segment[i].charAt(j)); // value
                    tempIdxForEachSegment++;
                }
            }
        }

        return num;
    }

    public static void main(String[] args) {
        int a = in.nextInt();
        int b = in.nextInt();
        in.nextLine();

        String[] rawNum1 = new String[3];
        for (int i = 0; i < 3; i++) {
            rawNum1[i] = in.nextLine();
        }
        String[] rawNum2 = new String[3];
        for (int i = 0; i < 3; i++) {
            rawNum2[i] = in.nextLine();
        }
        SevenSegment[] num1 = prepareInput(rawNum1, a);
        SevenSegment[] num2 = prepareInput(rawNum2, b);
        System.out.println(addSegment(num1, num2));
    }
}
