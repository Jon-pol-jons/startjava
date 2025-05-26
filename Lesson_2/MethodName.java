package Lesson2;

public class MethodName {
    private static String methodName;

    public static String getCurrentName() {
        return methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}
