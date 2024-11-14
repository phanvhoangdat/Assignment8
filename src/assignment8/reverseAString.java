/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment8;

public class reverseAString {

    // Phương thức đảo ngược chuỗi bằng StringBuilder
    public static String daoNguocChuoi(String chuoi) {
        StringBuilder sb = new StringBuilder(chuoi);
        return sb.reverse().toString();  
    }

    public static void main(String[] args) {

        String chuoi = "hello world";
        String chuoiDaoNguoc = daoNguocChuoi(chuoi);

        System.out.println("Chuoi ban dau : " + chuoi);
        System.out.println("Chuoi sau khi dao nguoc : " + chuoiDaoNguoc);
    }

}
