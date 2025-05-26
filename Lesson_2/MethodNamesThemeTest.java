package Lesson2;

public class MethodNamesThemeTest {
    public static void main(String[] args) {
        absenceBooleanOutput();
        containsBooleanOutput();
    }

    static void absenceBooleanOutput() {
        AbsenceBoolean absenceBoolean = new AbsenceBoolean();
        absenceBoolean.findLongWord();
        absenceBoolean.selectingMenu();
        absenceBoolean.сalculateScore();
        absenceBoolean.searchWord();
        absenceBoolean.error();
        absenceBoolean.synchronization();
        absenceBoolean.recoverData();
        absenceBoolean.pauseDownload();
        absenceBoolean.resetSettings();
        absenceBoolean.dataRecording();
        absenceBoolean.convertTemperature();
        absenceBoolean.mathematicalExpression();
        absenceBoolean.winnerGame();
        absenceBoolean.findBook();
    }

    static void containsBooleanOutput() {
        ContainsBoolean containsBoolean = new ContainsBoolean();
        System.out.println(containsBoolean.shouldPerformDivision());
        System.out.println(containsBoolean.isFileDeleted());
        System.out.println(containsBoolean.hasUniqueNumber());
        System.out.println(containsBoolean.hasLatter());
        System.out.println(containsBoolean.hasEqualNumber());
        System.out.println(containsBoolean.hasResidualAttempt());
        System.out.println(containsBoolean.isStringEmpty());
        System.out.println(containsBoolean.isEvenNumber());
        System.out.println(containsBoolean.isCorrectPath());
        System.out.println(containsBoolean.isFileExist());
        System.out.println(containsBoolean.isFileExist());
    }
}
