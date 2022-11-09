import Book.Book;
import Entity.Reader;
import Book.BookInformation;

import java.util.Scanner;

public class MainRun {

    public static Reader[] readers = new Reader[100];
    public static BookInformation[] books = new BookInformation[100];

    public static void main(String[] args) {
        while (true) {
            showMenu();
            int functionChoise = chooseFuntion();
            logicHandle(functionChoise);
        }
    }

    private static void logicHandle(int functionChoise) {
        switch (functionChoise) {
            case 1:
                addNewReader();
                break;
            case 2:
                showAllReader();
                break;
            case 3:
                addNewBook();
                break;
            case 4:
                showAllBook();
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                System.exit(0);
//                return;
        }
    }

    private static void showAllBook() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i]);
            }
        }
    }

    private static void addNewBook() {
        System.out.println("Nhập số lượng sách muốn thêm mới: ");
        int newBook = new Scanner(System.in).nextByte();
        for (int i = 0; i < newBook; i++) {
            BookInformation book = new BookInformation();
            book.nhapThongTinSach();
            saveBook(book);
        }
    }

    private static void saveBook(BookInformation book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }


    private static void showAllReader() {
        for (int i = 0; i < readers.length; i++) {
            if (readers[i] != null) {
                System.out.println(readers[i]);
            }
        }
    }

    private static void addNewReader() {
        System.out.println("Nhập số lượng bạn đọc muốn thêm mới: ");
        int readNum = new Scanner(System.in).nextByte();
        for (int i = 0; i < readNum; i++) {
            Reader reader = new Reader();
            reader.nhapThongTin();
            saveReader(reader);
        }
    }

    private static void saveReader(Reader reader) {
        for (int i = 0; i < readers.length; i++) {
            if (readers[i] == null) {
                readers[i] = reader;
                break;
            }
        }
    }

    private static int chooseFuntion() {
        System.out.println("Xin mời chọn chức năng: ");
        int functionChoise;
        do {
            functionChoise = new Scanner(System.in).nextByte();
            if (functionChoise >= 1 && functionChoise <= 8) {
                break;
            }
            System.out.println("Chức năng k hợp lệ, nhập lại");
        }
        while (true);
        return functionChoise;
    }

    private static void showMenu() {
        System.out.println("------PHẦN MỀM QUẢN LÝ THƯ VIỆN-------");
        System.out.println("1.Thêm mới bạn đọc. ");
        System.out.println("2.In ra danh sách đọc có trọng thư viện. ");
        System.out.println("3.Thêm đầu sách mới. ");
        System.out.println("4.In ra danh sách đầu sách có trong thư viện. ");
        System.out.println("5.Thực hiện cho bạn đọc mượn sách. ");
        System.out.println("6.Sắp xếp danh sách mượn sách. ");
        System.out.println("7.Tìm kiếm danh sách mượn sách. ");
        System.out.println("8.Thoát chương trình. ");
    }

}

