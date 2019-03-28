package lesson11.autoRu;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.setMainTitle("Handai");
        car.setDatePublic("7 febrary");
        car.setTotalCountViews(700);
        car.setViewsToday(30);
        car.setPrice(70000);

        Photo photo1 = new Photo();
        photo1.setPuthToBigPhoto("www.erere.ru");
        photo1.setPuthToLittlePhoto("silka na foto v brauzere");

        Photo photo2 = new Photo();
        photo1.setPuthToBigPhoto("www.erere.ru");
        photo1.setPuthToLittlePhoto("silka na f12121oto v brauzere");

        Photo photo3 = new Photo();
        photo1.setPuthToBigPhoto("www.erere.ru");
        photo1.setPuthToLittlePhoto("silka na f11oto v brauzere");

        Photo[] photos = new Photo[3];
        photos[0] = photo1;
        photos[1] = photo2;
        photos[2] = photo3;

        car.setPhotos(photos);


        Otziv otziv1 = new Otziv("342","234","234",234, 89);
        otziv1.setOtziv("www.erere.ru");
        otziv1.setOtziv("silka na foto v brauzere");

        Otziv otziv2 = new Otziv("342","234","234",234, 89);
        otziv2.setOtziv("www.erere.ru");
        otziv2.setOtziv("silka na f12121oto v brauzere");

        Otziv otziv3 = new Otziv("232","erwqer","ewq",2323,2323);
        otziv3.setOtziv("www.erere.ru");
        otziv3.setOtziv("silka na f11oto v brauzere");

        Otziv[] otzivs = new Otziv[3];
        otzivs[0] = otziv1;
        otzivs[1] = otziv2;
        otzivs[2] = otziv3;

        car.setOtzivs(otzivs);




    }
}
