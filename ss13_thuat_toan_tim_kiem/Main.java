package ss13_thuat_toan_tim_kiem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(15);
        numbers.add(21);
        numbers.add(10);

        //tim xem trong danh sach numbers co phan tu 2 hay khong
        //dem so luong phan tu chia het cho 3 trong danh sach numbers
        /*
            Thuat toan:
                - b1: tao bien dem: count = 0;
                - b2: Tim kiem phan tu chi het cho 3 trong danh sach
                        - neu gap phan tu chia het cho 3 thi tang count len 1
                - b3: in ra bien count
         */

        // tim so lon nhat trong danh sach numbers
        /*
            Thuat toan:
                - b1: gs phan tu dau tien la so lon nhat: max = number
         */
        int count = 0;
        for(Integer i : numbers){
            if(i%3 == 0){
                count++;
            }
        }
        System.out.println("Co "  + count + " phan tu chia het cho 3");


    }
}
