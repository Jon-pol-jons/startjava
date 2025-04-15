public class Jaeger {
    private String name;
    private int height;
    private String mark;
    private String status;

    public void setName(String name) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public Jaeger(int height, String mark, String status, String name) {
        this.height = height;
        this.mark = mark;
        this.status = status;
        this.name = name;
    }

    public void jaeger1() {
        System.out.println("jaeger " + name + " запускает реактор");
    }

    private float haightChernoAlpha;
    private float ft = 0.3048F;

    public float haightJaeger() {
        haightChernoAlpha = height * ft;
        System.out.println("Высота в метрах егеря " + name + " составляет " + haightChernoAlpha);
        return haightChernoAlpha;
    }
}
