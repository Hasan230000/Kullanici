/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kullanici;
import java.util.Scanner;
/**
 *
 * @author Costa
 */
public class Kullanici {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner veri=new Scanner (System.in);
        System.out.print("1. sayıyı giriniz:");
        int birinci=veri.nextInt();
        System.out.print("2. sayıyı giriniz:");
        int ikinci=veri.nextInt();
        double ort=(birinci+ikinci)/2;
        System.out.print("Ortalama:"+ort);
    }
    
}
