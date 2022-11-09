package Entity;

import Constant.ReaderTypeConstant;

import java.util.Scanner;

public class Reader extends Person {

    private static int AUTO_ID = 0;
    private int id;
    private String type;

    public Reader() {
        if (AUTO_ID == 0) {
            AUTO_ID = 9999;
        }
        AUTO_ID++;
        this.id = AUTO_ID;
    }

    public int getId() {
        return id;
    }

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
        return "Reader{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", id=" + id +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.println("Nhập loại bạn đọc:  ");
        System.out.println("Chọn 1 trong các loại dưới đây: ");
        System.out.println("1. Sinh viên");
        System.out.println("2. Cao học");
        System.out.println("3. Giảng viên");
        int readTypeTemp;
        do {
            readTypeTemp = new Scanner(System.in).nextByte();
            if (readTypeTemp >= 1 && readTypeTemp <= 3) {
                break;
            }
            System.out.println("Loại bạn đọc không hợp lệ, nhập lại");
        }
        while (true);
        switch (readTypeTemp) {
            case 1:
                this.type = ReaderTypeConstant.STUDENT;
                break;
            case 2:
                this.type = ReaderTypeConstant.POST_UNIVERSITY;
                break;
            case 3:
                this.type = ReaderTypeConstant.TEACHER;
                break;
        }
    }


}



