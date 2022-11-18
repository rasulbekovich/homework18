public abstract class Adam {
    private int oplata;
    private String usluga;

    public Adam(int oplata, String usluga) {
        this.oplata = oplata;
        this.usluga = usluga;
    }

    public int getOplata() {
        return oplata;
    }

    public void setOplata(int oplata) {
        this.oplata = oplata;
    }

    public String getUsluga() {
        return usluga;
    }

    public void setUsluga(String usluga) {
        this.usluga = usluga;
    }

    @Override
    public String toString() {
        return "Adam{" +
                "oplata=" + oplata +
                ", usluga='" + usluga + '\'' +
                '}';
    }
}

