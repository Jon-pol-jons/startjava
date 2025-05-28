package Lesson2;

public class MethodNamesThemeTest {
    public static void main(String[] args) {
        absenceBooleanOutput();
        containsBooleanOutput();
    }

    private static void absenceBooleanOutput() {
        AbsenceBoolean absenceBoolean = new AbsenceBoolean();
        absenceBoolean.findTheLongWord();
        absenceBoolean.selectItemMenu();
        absenceBoolean.сalculateAverageScore();
        absenceBoolean.countingUniqueWords();
        absenceBoolean.errorMessage();
        absenceBoolean.syncCloudStorage();
        absenceBoolean.recoverData();
        absenceBoolean.pauseDownload();
        absenceBoolean.resetSettings();
        absenceBoolean.writeСontentFile();
        absenceBoolean.convertTemperature();
        absenceBoolean.mathExpression();
        absenceBoolean.findWinnerGame();
        absenceBoolean.findBook();
    }

    private static void containsBooleanOutput() {
        ContainsBoolMethods containsBooleanMethods = new ContainsBoolMethods();
        System.out.println(containsBooleanMethods.shouldPerformDivision());
        System.out.println(containsBooleanMethods.isExist());
        System.out.println(containsBooleanMethods.hasUniqueNumber());
        System.out.println(containsBooleanMethods.isLetter());
        System.out.println(containsBooleanMethods.hasEqualNumber());
        System.out.println(containsBooleanMethods.hasAttempt());
        System.out.println(containsBooleanMethods.isBlank());
        System.out.println(containsBooleanMethods.isEvenNumber());
        System.out.println(containsBooleanMethods.isValidPath());
        System.out.println(containsBooleanMethods.isFileExist());
        System.out.println(containsBooleanMethods.isFileExist());
    }
}
