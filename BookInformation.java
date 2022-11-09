package Book;

import Constant.BookTypeConstant;

import java.util.Scanner;

public class BookInformation extends Book {
    private static int AUTO_ID1 = 0;
    private int id;
    private String type;

    public BookInformation() {
        if (AUTO_ID1 == 0) {
            AUTO_ID1 = 9999;
        }
        AUTO_ID1++;
        this.id = AUTO_ID1;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "BookInformation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", specialized='" + specialized + '\'' +
                ", publishingyear=" + publishingyear +
                ", id=" + id +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public void nhapThongTinSach() {
        super.nhapThongTinSach();
        System.out.println("Nhập loại sách:  ");
        System.out.println("Chọn 1 trong các loại dưới đây: ");
        System.out.println("1. KHOA HỌC TƯ NHIÊN");
        System.out.println("2. VĂN HỌC NGHÊ THUẬT");
        System.out.println("3. ĐIỆN TỬ VIỄN THÔNG");
        System.out.println("4. CÔNG NGHỆ THÔNG TIN");
        int bookTypeTemp;
        do {
            bookTypeTemp = new Scanner(System.in).nextByte();
            if (bookTypeTemp >= 1 && bookTypeTemp <= 4) {
                break;
            }
            System.out.println("Loại sách không hợp lệ, nhập lại");
        }
        while (true);
        switch (bookTypeTemp) {
            case 1:
                this.type = BookTypeConstant.NATURALSCIENCES;
                break;
            case 2:
                this.type = BookTypeConstant.LITERATUREANDART;
                break;
            case 3:
                this.type = BookTypeConstant.ELECTRONICSANDTELECOMMUNICATION;
                break;
            case 4:
                this.type = BookTypeConstant.INFORMATIONANDTECHNOLOGY;
                break;
        }
    }
}
