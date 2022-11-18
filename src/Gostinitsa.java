import java.util.Arrays;

public class Gostinitsa extends Adam implements Hintable{
    private String[] jashagandar;

    public Gostinitsa(int oplata, String usluga, String[] jashagandar) {
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
        System.out.println("arenda 40000");

    }

    @Override
    public String toString() {
        return "Gostinitsa{" +
                "jashagandar=" + Arrays.toString(jashagandar) +
                "} " + super.toString();
    }
}
