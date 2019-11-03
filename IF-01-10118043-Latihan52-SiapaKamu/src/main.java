/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dosen d = new Dosen();
        Mahasiswa m = new Mahasiswa();
        Manusia man = new Manusia();
        man.siapaKamu();
        
        d.setNip("4122782990");
        d.setMataKuliah("PBO");
        d.setNsms("Rizki Adam K");
        d.setUmur(27);
        d.siapaKamu();
        d.mengajarApa();
        System.out.println("");
        
        m.setNim("10118043");
        m.setKelas("IF-1");
        m.setNsms("Dian R.P ");
        m.setUmur(18);
        m.siapaKamu();
        m.kelasApa();
        
    }
    
}
