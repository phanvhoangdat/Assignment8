/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment8;

/**
 *
 * @author ACER
 */
public class checkString {
    // Phương thức kiểm tra chuỗi có phải là chuỗi đối xứng không
    public static boolean kiemTraDoiXung(String chuoi) {
        int n = chuoi.length();
        
        // Nếu chuỗi có số ký tự lẻ, chia đôi và kiểm tra đối xứng
        StringBuilder sb = new StringBuilder(chuoi);
        String chuoiDaoNguoc = sb.reverse().toString();
        
        // So sánh phần đầu và phần cuối của chuỗi ban đầu với chuỗi đảo ngược
        return chuoi.equals(chuoiDaoNguoc);
    }

    public static void main(String[] args) {
        // Ví dụ sử dụng
        String chuoi1 = "abccba";
        String chuoi2 = "abcd";
        
        System.out.println("Chuoi '" + chuoi1 + "' la doi xung: " + kiemTraDoiXung(chuoi1));
        System.out.println("Chuoi '" + chuoi2 + "' la doi xung: " + kiemTraDoiXung(chuoi2));
    }
    
}
