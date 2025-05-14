package Lesson2;

public class AbsenceBoolean {
    MeaningMethodName meaningMethodName = new MeaningMethodName();

    public boolean shouldPerformDivision() {
        System.out.println();
        System.out.println(meaningMethodName.returningValueMethodName() +
                "() -> программа выполняет деление или завершается?");
        return false;
    }

    public boolean isFileDeleted() {
        System.out.println(meaningMethodName.returningValueMethodName() +
                "() -> удалился ли файл на жестком диске или флешке?");
        return false;
    }

    public boolean hasUniqueNumber() {
        System.out.println(meaningMethodName.returningValueMethodName() +
                "() -> последовательность содержит уникальную цифру?");
        return false;
    }

    public boolean hasLatter() {
        System.out.println(meaningMethodName.returningValueMethodName() +
                "() -> пользователь ввел букву или что-то другое?");
        return false;
    }

    public boolean hasEqualNumber() {
        System.out.println(meaningMethodName.returningValueMethodName() +
                "() -> в проверяемых числах, есть равные цифры?");
        return false;
    }

    public boolean hasResidualAttempt() {
        System.out.println(meaningMethodName.returningValueMethodName() +
                "() -> в игре \"Марио\" остались попытки?");
        return false;
    }

    public boolean isStringEmpty() {
        System.out.println(meaningMethodName.returningValueMethodName() +
                "() -> пользователь ввёл пустую строку или из одних пробелов?");
        return false;
    }

    public boolean isEvenNumber() {
        System.out.println(meaningMethodName.returningValueMethodName() +
                "() -> на кубике, который бросил компьютер, выпало четное число?");
        return false;
    }

    public boolean isCorrectPath() {
        System.out.println(meaningMethodName.returningValueMethodName() +
                "() -> путь до файла, который вы ищите на ssd, действительный?");
        return false;
    }

    public boolean isFileExist() {
        System.out.println(meaningMethodName.returningValueMethodName() +
                "() -> файл по указанному адресу существует?");
        return false;
    }
}
