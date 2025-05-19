package Lesson2;

public class AbsenceBoolean {
    boolean yes = true;
    boolean no = false;
    public boolean shouldPerformDivision() {
        System.out.println("\n" + MeaningMethodName.returningValueMethodName() +
                "() -> программа выполняет деление " + yes + " или завершается? " + no );
        return true;
    }

    public boolean isFileDeleted() {
        System.out.println(MeaningMethodName.returningValueMethodName() +
                "() -> удалился ли файл на жестком диске или флешке? " + yes);
        return false;
    }

    public boolean hasUniqueNumber() {
        System.out.println(MeaningMethodName.returningValueMethodName() +
                "() -> последовательность содержит уникальную цифру? " + no);
        return false;
    }

    public boolean hasLatter() {
        System.out.println(MeaningMethodName.returningValueMethodName() +
                "() -> пользователь ввел букву " + no + " или что-то другое?" + yes);
        return false;
    }

    public boolean hasEqualNumber() {
        System.out.println(MeaningMethodName.returningValueMethodName() +
                "() -> в проверяемых числах, есть равные цифры? " + yes);
        return false;
    }

    public boolean hasResidualAttempt() {
        System.out.println(MeaningMethodName.returningValueMethodName() +
                "() -> в игре \"Марио\" остались попытки? " + no);
        return false;
    }

    public boolean isStringEmpty() {
        System.out.println(MeaningMethodName.returningValueMethodName() +
                "() -> пользователь ввёл пустую строку " + yes + " или из одних пробелов? " + no);
        return false;
    }

    public boolean isEvenNumber() {
        System.out.println(MeaningMethodName.returningValueMethodName() +
                "() -> на кубике, который бросил компьютер, выпало четное число? " + no);
        return false;
    }

    public boolean isCorrectPath() {
        System.out.println(MeaningMethodName.returningValueMethodName() +
                "() -> путь до файла, который вы ищите на ssd, действительный? " + yes);
        return false;
    }

    public boolean isFileExist() {
        System.out.println(MeaningMethodName.returningValueMethodName() +
                "() -> файл по указанному адресу существует? " + yes);
        return false;
    }
}
