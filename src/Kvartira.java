import java.util.Arrays;

public class Kvartira  extends Adam implements Hintable{
    private String[] jashagandar;

    public Kvartira(int oplata, String usluga, String[] jashagandar) {
        super(oplata, usluga);
        this.jashagandar = jashagandar;
    }

    public String[] getJashagandar() {
        return jashagandar;
    }

    public void setJashagandar(String[] jashagandar) {
        this.jashagandar = jashagandar;
    }

    @Override
    public void oplata() {
        System.out.println("kom usluga 5000");

    }

    @Override
    public String toString() {
        return "Kvartira{" +
                "jashagandar=" + Arrays.toString(jashagandar) +
                "} " + super.toString();
    }
}
