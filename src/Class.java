import java.util.Arrays;

public class Class {
    public int san;
    public  String soz;
    public int[]massiv;

    public Class(int san, String soz, int[] massiv) {
        this.san = san;
        this.soz = soz;
        this.massiv = massiv;
    }

    @Override
    public String toString() {
        return "Class{" +
                "san=" + san +
                ", soz='" + soz + '\'' +
                ", massiv=" + Arrays.toString(massiv) +
                '}';
    }
}
