package Book;

import java.util.Scanner;

public class Book {

    protected int id;
    protected String name;
    protected String author;
    protected String specialized;
    protected  int publishingyear;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSpecialized() {
        return specialized;
    }

    public void setSpecialized(String specialized) {
        this.specialized = specialized;
    }

    public int getPublishingyear() {
        return publishingyear;
    }

    public void setPublishingyear(int publishingyear) {
        publishingyear = publishingyear;
    }

    @Override
    public String toString() {
        return "BookInformation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", specialized='" + specialized + '\'' +
                ", Publishingyear=" + publishingyear +
                '}';
    }

    public void nhapThongTinSach() {
        System.out.println("Nhập mã sách: ");
        this.id = new Scanner(System.in).nextInt();
        System.out.println("Nhập tên sách: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.println("Nhập tên tác giả: ");
        this.author = new Scanner(System.in).nextLine();
        System.out.println("Nhập chuyên ngành: ");
        this.specialized = new Scanner(System.in).nextLine();
        System.out.println("Nhập mã sách: ");
        this.publishingyear = new Scanner(System.in).nextInt();
    }
}
