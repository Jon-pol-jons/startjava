public class JaegerTest {
    public static void main(String[] args) {
        Jaeger chernoAlpha = new Jaeger(0, "", "", "");
        chernoAlpha.setName("ChernoAlpha");
        chernoAlpha.setHeight(280);
        chernoAlpha.setMark("Mark-1");
        chernoAlpha.setStatus("Destroyed");
        
        Jaeger coyoteTango = new Jaeger(280, "Mark-1", "Destroyed", "CoyoteTango");
        System.out.println("jaeger 1: " + chernoAlpha.getHeight() + "\n" + chernoAlpha.getMark() +
                "\n" + chernoAlpha.getStatus());
        System.out.println("jaeger 2: " + coyoteTango.getHeight() + "\n" + coyoteTango.getMark() +
                "\n" + coyoteTango.getStatus());
        coyoteTango.jaeger1();
        chernoAlpha.haightJaeger();
    }
}
