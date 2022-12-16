package Asosiasi;

public class MainProgram {
    public static void main(String[] args) {
        //membuat object Phone
        Phone handPhone = new Phone();

        //Memanggil attribut dan nilai
        handPhone.brand = "Xiaomi";
        handPhone.OS = "MIUI";

        Person marzuki = new Person("Marzuki");

        marzuki.brand = "Xiaomi";
        marzuki.Hp = handPhone;
        marzuki.start();
        marzuki.run();
        marzuki.shutdown();
    }
}
