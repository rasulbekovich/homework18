public class Main {
    public static void main(String[] args) {
        String[] uiBulo={"jenish","yntymak","alibek"};
        Kvartira kvartira=new Kvartira(15000,"kom usluga",uiBulo);
        Obshejitie obshejitie=new Obshejitie(10000,"arenda",uiBulo);
        Gostinitsa gostinitsa=new Gostinitsa(20000,"arenda", uiBulo);
        System.out.println(kvartira);
        System.out.println(obshejitie);
        System.out.println(gostinitsa);
    }
}
