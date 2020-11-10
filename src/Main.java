import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 09/11/2020
 */

public class Main {

    public static void main(String[] args) {

        Apple a = new Apple();
        a.stykpris = 2;
        a.holdbarhed = new Date(1608768000);
        a.smidUd();
        a.moden = true;
        a.coolDown();

        Peas p = new Peas();
        p.stykpris = 0.1;
        p.holdbarhed = new Date(1608768000);
        p.freeze();

        Peach peach = new Peach();
        peach.pakkepris = 30;
        peach.holdbarhed = new Date(1605830400);
        System.out.println(peach.name);
        System.out.println(peach.type1);
        peach.saleOnSummer();

        Broccoli b = new Broccoli();
        b.stykpris = 20;
        System.out.println(b.name);
        b.storeRoomTemperature();


        Broccoli b1 = new Broccoli();
        System.out.println(b1.pakageName);
        b1.pakkepris = 10;
        Freezer f1 = new Broccoli();
        f1.freezing("Opbevar i fryseren");

        Chicken c = new Chicken();
        c.type = "Whole Chicken";
        System.out.println(c.type);
        c.holdbarhed = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("15/11/2020");
        String strDate= formatter.format(c.holdbarhed);
        System.out.println("Udløbsdato : " + strDate);
        c.keepFresh();





    }

}
