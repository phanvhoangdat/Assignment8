/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment8;

public class Remove {
     // Phương thức xóa khoảng trắng thừa trong chuỗi
    public static String xoaKhoangTrangThua(String chuoi) {
        // Loại bỏ khoảng trắng thừa ở đầu và cuối chuỗi, sau đó thay thế các khoảng trắng giữa các từ
        return chuoi.trim().replaceAll("\\s+", " ");
    }

    public static void main(String[] args) {
        // Ví dụ sử dụng
        String chuoi = "   Hello    World   ";
        String chuoiXoaKhoangTrangThua = xoaKhoangTrangThua(chuoi);
        
        System.out.println("Chuoi ban dau : '" + chuoi + "'");
        System.out.println("Chuoi sau khi xoa khoang trang thua : '" + chuoiXoaKhoangTrangThua + "'");
    }
    
}
