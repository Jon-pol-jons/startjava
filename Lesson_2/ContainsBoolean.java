package Lesson2;

import java.util.Random;

public class ContainsBoolean {

    Random random = new Random();
    private boolean test = random.nextBoolean();

    public boolean shouldPerformDivision() {
        System.out.println("\n" + MethodName.getCurrentName() +
                "() -> программа выполняет деление  или завершается? ");
        return true;
    }

    public boolean isFileDeleted() {
        System.out.println(MethodName.getCurrentName() +
                "() -> удалился ли файл на жестком диске или флешке? ");
        return false;
    }

    public boolean hasUniqueNumber() {
        System.out.println(MethodName.getCurrentName() +
                "() -> последовательность содержит уникальную цифру? ");
        return false;
    }

    public boolean hasLatter() {
        System.out.println(MethodName.getCurrentName() +
                "() -> пользователь ввел букву или что-то другое?");
        return false;
    }

    public boolean hasEqualNumber() {
        System.out.println(MethodName.getCurrentName() +
                "() -> в проверяемых числах, есть равные цифры? ");
        return false;
    }

    public boolean hasResidualAttempt() {
        System.out.println(MethodName.getCurrentName() +
                "() -> в игре \"Марио\" остались попытки? ");
        return false;
    }

    public boolean isStringEmpty() {
        System.out.println(MethodName.getCurrentName() +
                "() -> пользователь ввёл пустую строку или из одних пробелов? ");
        return false;
    }

    public boolean isEvenNumber() {
        System.out.println(MethodName.getCurrentName() +
                "() -> на кубике, который бросил компьютер, выпало четное число? ");
        return false;
    }

    public boolean isCorrectPath() {
        System.out.println(MethodName.getCurrentName() +
                "() -> путь до файла, который вы ищите на ssd, действительный? ");
        return false;
    }

    public boolean isFileExist() {
        System.out.println(MethodName.getCurrentName() +
                "() -> файл по указанному адресу существует? ");
        return true;
    }
}
