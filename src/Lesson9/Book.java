package Lesson9;

public class Book {
    private int page;
    private String avtor;
    private String name;
    private int price;
    private int godIzdaniya;

    public Book(){

    }
    public Book(String nameB, String avtorB){
        name = nameB;
        avtor = avtorB;

    }
    public Book(int pageB, String name1, String avtor1,int price1, int godIzdaniya1){
        page = pageB;
        name = name1;
        avtor = avtor1;
        price = price1;
        godIzdaniya = godIzdaniya1;
    }
    public void print(){
        System.out.printf("Название книги - %s, автор - %s", name, avtor);
    }
}
