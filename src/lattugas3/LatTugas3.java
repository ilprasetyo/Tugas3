/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lattugas3;

/**
 *
 * @author Alaba
 * Nama : Ilham Prasetyo
 * NIM  : 10116496
 * Kelas: IF-11
 */

class Mahasiswa {

    String nim, nama;
    double quis, uts, uas, nilaiAkhir;
    char index;

    public double getNilaiAkhir(double quis, double uts, double uas) {
        nilaiAkhir = 0.2 * quis + 0.3 * uts + 0.5 * uas;
        return nilaiAkhir;
    }

    public void getIndex(double nilaiAkhir) {
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            index = 'A';
        } else if (nilaiAkhir > 68 && nilaiAkhir <= 80) {
            index = 'B';
        } else if (nilaiAkhir > 56 && nilaiAkhir <= 68) {
            index = 'C';
        } else if (nilaiAkhir > 45 && nilaiAkhir <= 56) {
            index = 'D';
        } else if (nilaiAkhir <= 45) {
            index = 'E';
        }

    }

}

public class LatTugas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Mahasiswa Mhs = new Mahasiswa();
        Mhs.nim = "1.01.16.496.";
        Mhs.nama = "Ilham Prasetyo";
        Mhs.quis = 75;
        Mhs.uts = 65;
        Mhs.uas = 87;
        Mhs.getNilaiAkhir(Mhs.quis, Mhs.uts, Mhs.uas);
        Mhs.getIndex(Mhs.nilaiAkhir);
        //output 
        for (int i = 1; i < 5; i++) {
            System.out.println("Nama ke " + i + "\t\t= " + Mhs.nama);
        }

        for (int j = 8; j >= 1; j--) {
            System.out.println("NIM ke " + j + "\t\t= " + Mhs.nim + j);
        }

        System.out.println("\nQUIS \t\t= " + Mhs.quis);
        System.out.println("UTS \t\t= " + Mhs.uts);
        System.out.println("UAS \t\t= " + Mhs.uas);

        System.out.println("\nNilai Akhir \t= " + Mhs.nilaiAkhir);

        switch (Mhs.index) {
            case 'A':

                System.out.println("\nIndex = " + Mhs.index);
                System.out.println("Sangat Baik");
                break;
            case 'B':
                System.out.println("\nIndex = " + Mhs.index);
                System.out.println("Keterangan = Baik");
                break;
            case 'C':
                System.out.println("\nIndex = " + Mhs.index);
                System.out.println("Keterangan = Cukup");
                break;
            case 'D':
                System.out.println("\nIndex = " + Mhs.index);
                System.out.println("Keterangan = Kurang");
                break;
            case 'E':
                System.out.println("\nIndex = " + Mhs.index);
                System.out.println("Keterangan = Sangat Kurang");
                break;
            default:
                System.out.println("\nUNRECOGNIZE");

        }
    }
    
}
