/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment8;

public class Convert {
    // Phương thức chuyển đổi chữ hoa thành chữ thường và ngược lại

    public static String chuyenDoiChuHoaThuong(String chuoi) {
        StringBuilder sb = new StringBuilder();

        // Duyệt qua từng ký tự trong chuỗi
        for (int i = 0; i < chuoi.length(); i++) {
            char c = chuoi.charAt(i);

            // Nếu là chữ hoa, chuyển thành chữ thường
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } // Nếu là chữ thường, chuyển thành chữ hoa
            else if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } // Nếu không phải chữ cái (ví dụ dấu cách, số), giữ nguyên
            else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        // Ví dụ sử dụng
        String chuoi = "Hello World";
        String chuoiSauKhiChuyenDoi = chuyenDoiChuHoaThuong(chuoi);

        System.out.println("Chuoi ban dau: " + chuoi);
        System.out.println("Chuoi sau khi chuyen doi : " + chuoiSauKhiChuyenDoi);
    }

}
