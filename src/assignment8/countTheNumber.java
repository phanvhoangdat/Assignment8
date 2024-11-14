/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment8;

public class countTheNumber {
    // Phương thức đếm số từ trong chuỗi
    public static int demSoTu(String chuoi) {
        // Tách chuỗi thành mảng các từ, bỏ qua khoảng trắng thừa ở đầu và cuối
        String[] tu = chuoi.trim().split("\\s+");
        
        // Nếu chuỗi rỗng sau khi loại bỏ khoảng trắng, trả về 0
        if (chuoi.isEmpty()) {
            return 0;
        }

        return tu.length;  // Số lượng phần tử trong mảng là số từ
    }

    public static void main(String[] args) {
        // Ví dụ sử dụng
        String chuoi = "Java is ";
        int soTu = demSoTu(chuoi);
        
        System.out.println("Chuoi: \"" + chuoi + "\" co " + soTu + " tu.");
    }
    
}
