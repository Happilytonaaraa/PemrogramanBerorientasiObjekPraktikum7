package Agregasi;

public class Mainprogram {
    public static void main(String[] args) {
        //membuat object phone
        Phone handPhone = new Phone();

        //memanggil attribut dan nilai
        handPhone.brand = "OPPO";
        handPhone.OS = "OneUI";

        Person nanda = new Person(handPhone);

        nanda.brand = "OPPO";
        nanda.start();
        nanda.run();
        nanda.shutdown();
    }
}
