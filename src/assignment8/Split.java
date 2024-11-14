/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment8;

/**
 *
 * @author ACER
 */
public class Split {
    // Phương thức tách các từ trong một chuỗi

    public static String[] tachTuTrongChuoi(String chuoi) {
        // Dùng phương thức split() để tách chuỗi thành các từ dựa trên dấu cách
        return chuoi.split("\\s+");  // Dấu \\s+ để tách theo tất cả khoảng trắng liên tiếp
    }

    public static void main(String[] args) {
 
        String chuoi = "Hello world, welcome to Java!";
        String[] tu = tachTuTrongChuoi(chuoi);

        // In các từ đã tách ra
        System.out.println("Cac tu trong chuoi:");
        for (String word : tu) {
            System.out.println(word);
        }
    }

}
