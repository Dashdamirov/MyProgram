package lesson11.homeWork;

public class Main1 {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        mouse.setMainTitle("Заголовок");
        mouse.setSubTitle("Подзаголовок");
        mouse.setPrice(399);

        Photo photo1 = new Photo();
        photo1.setPuthToBigPhoto("Большое изображение1");
        photo1.setPuthToLittlePhoto("Маленькое фото1");

        Photo photo2 = new Photo();
        photo1.setPuthToBigPhoto("Большое изображение2");
        photo1.setPuthToLittlePhoto("Маленькое фото1");

        Photo photo3 = new Photo();
        photo1.setPuthToBigPhoto("Большое изображение3");
        photo1.setPuthToLittlePhoto("Маленькое фото1");

        Photo[] photos = new Photo[3];
        photos[0] = photo1;
        photos[1] = photo2;
        photos[2] = photo3;

        mouse.setPhotos(photos);

        System.out.println();
    }
}
