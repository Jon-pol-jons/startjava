public class AbsenceBoolean {
    NameReturn nameReturn = new NameReturn();

    public boolean shouldPerformDivision() {
        System.out.println();
        nameReturn.calledMethod();
        System.out.println("() -> программа выполняет деление или завершается?");
        return false;
    }

    public boolean isFileDeleted() {
        nameReturn.calledMethod();
        System.out.println("() -> удалился ли файл на жестком диске или флешке?");
        return false;
    }

    public boolean hasUniqueNumber() {
        nameReturn.calledMethod();
        System.out.println("() -> последовательность содержит уникальную цифру?");
        return false;
    }

    public boolean hasLatter() {
        nameReturn.calledMethod();
        System.out.println("() -> пользователь ввел букву или что-то другое?");
        return false;
    }

    public boolean hasEqualNumber() {
        nameReturn.calledMethod();
        System.out.println("() -> в проверяемых числах, есть равные цифры?");
        return false;
    }

    public boolean hasResidualAttempt() {
        nameReturn.calledMethod();
        System.out.println("() -> в игре \"Марио\" остались попытки?");
        return false;
    }

    public boolean isStringEmpty() {
        nameReturn.calledMethod();
        System.out.println("() -> пользователь ввёл пустую строку или из одних пробелов?");
        return false;
    }

    public boolean isEvenNumber() {
        nameReturn.calledMethod();
        System.out.println("() -> на кубике, который бросил компьютер, выпало четное число?");
        return false;
    }

    public boolean isCorrectPath() {
        nameReturn.calledMethod();
        System.out.println("() -> путь до файла, который вы ищите на ssd, действительный?");
        return false;
    }

    public boolean isFileExist() {
        nameReturn.calledMethod();
        System.out.println("() -> файл по указанному адресу существует?");
        return false;
    }
}
