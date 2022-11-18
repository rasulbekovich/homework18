import java.util.Arrays;

public class Obshejitie extends Adam implements Hintable{
    private String[] jashagandar;

    public Obshejitie(int oplata, String usluga, String[] jashagandar) {
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
        System.out.println("arenda 30000");

    }

    @Override
    public String toString() {
        return "Obshejitie{" +
                "jashagandar=" + Arrays.toString(jashagandar) +
                "} " + super.toString();
    }
}
