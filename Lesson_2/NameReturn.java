public class NameReturn {
    public void calledMethod() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        // 0 - это сам метод getStackTrace();
        // 1 - это вызываемый метод (calledMethod);
        // 2 - это вызывающий (родительский) метод (callerMethod).
        StackTraceElement stackTraceElement = stackTrace[2];
        System.out.print(stackTraceElement.getMethodName()); // callerMethod
    }
}
