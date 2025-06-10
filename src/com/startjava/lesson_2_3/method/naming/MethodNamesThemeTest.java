package src.com.startjava.lesson_2_3.method.naming;

public class MethodNamesThemeTest {
    public static void main(String[] args) {
        printMethodWithoutBoolean();
        containsBooleanOutput();
    }

    private static void printMethodWithoutBoolean() {
        AbsenceBoolean ab = new AbsenceBoolean();
        ab.findLongestWord();
        ab.selectMenuItem();
        ab.сalculateAverageScore();
        ab.countUniqueWords();
        ab.showErrorMessage();
        ab.syncCloud();
        ab.recoverData();
        ab.pauseDownload();
        ab.resetSettings();
        ab.writeToFile();
        ab.convertTemperature();
        ab.printMathExpression();
        ab.findWinner();
        ab.findBookByAuthor();
    }

    private static void containsBooleanOutput() {
        ContainsBoolMethods bm = new ContainsBoolMethods();
        System.out.println(bm.shouldPerformDivision());
        System.out.println(bm.isExist());
        System.out.println(bm.hasUniqueNumber());
        System.out.println(bm.isLetter());
        System.out.println(bm.hasEqualNumber());
        System.out.println(bm.hasAttempt());
        System.out.println(bm.isBlank());
        System.out.println(bm.isEvenNumber());
        System.out.println(bm.isValidPath());
        System.out.println(bm.isFileExist());
        System.out.println(bm.isFileExist());
    }
}
