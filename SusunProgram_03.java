    import java.util.Scanner;
public class SusunProgram_03 {
    public static void main(String[] args) {

        Scanner SusunProgram_03 = new Scanner(System.in);
    
        int jamSekarang, menitSekarang, jamKuliah, menitKuliah, lamaKuliah;
        
            System.out.println("masukkan jam sekarang : ");
            jamSekarang = SusunProgram_03.nextInt();
            System.out.println("masukkan menit sekarang : ");
            menitSekarang= SusunProgram_03.nextInt();
            System.out.println("jam kuliah sekarang : " + jamSekarang + ":" + menitSekarang );
            
            
            System.out.print("masukkan lama waktu kuliah dalam menit = ");
            lamaKuliah = SusunProgram_03.nextInt();
            int jamSelesaiKuliah = jamSekarang+2;
            int menitSelesaiKuliah = menitSekarang - 30;

            System.out.println("waktu anda anda selesai kuliah = " + jamSelesaiKuliah + " : " + menitSelesaiKuliah); 
           }
}
    
