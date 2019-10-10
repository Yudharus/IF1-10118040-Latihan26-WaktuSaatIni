/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118040.latihan26.waktusaatini;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author asus
 * NAMA			: Moch Yudha Rusdian    
 * KELAS		: IF-1
 * NIM			: 10118040
 * Deskripsi Program	: Menampilkan Waktu
 */
public class IF110118040Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter dateFormatted = DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy HH:mm:ss");
		String formattedDate = date.format(dateFormatted);
		System.out.println(formattedDate);
    }
    
}
