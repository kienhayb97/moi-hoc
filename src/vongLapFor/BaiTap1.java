package vongLapFor;

public class BaiTap1 {
    public static void main(String[] args) {
        // Khai báo một mảng
        String[] niit = {
                "1-Java",
                "2-Python",
                "3-PHP",
                "4-JavaScript",
                "5-CSS",
                "6-HTML",
                "7-Big Data"
        };
        // In ngược giá trị của mảng cho trước
        for (int i = niit.length; i > 0 ; i--)
            System.out.println(niit[i-1]);
    }
}
