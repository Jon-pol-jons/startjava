package Lesson2;

public class MeaningMethodName {
    public static String returningValueMethodName() {
        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        return methodName;
    }
}
