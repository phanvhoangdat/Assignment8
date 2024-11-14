/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment8;

public class demSolanXuatHien{

    public static int demSoLanXuatHien(String chuoi, char kyTu) {
        int dem = 0;
        
        // Duyệt qua từng ký tự trong chuỗi
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kyTu) {
                dem++;
            }
        }
        
        return dem;
    }

    public static void main(String[] args) {
        // Ví dụ sử dụng
        String chuoi = "hello world";
        char kyTu = 'o';
        int soLanXuatHien = demSoLanXuatHien(chuoi, kyTu);
        
        // In kết quả ra màn hình
        System.out.println("Ky tu '" + kyTu + "' xuat hien " + soLanXuatHien + " lan trong chuoi  '" + chuoi + "'.");
    }
}
