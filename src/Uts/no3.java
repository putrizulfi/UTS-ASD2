package Uts;
import java.util.Scanner;
public class no3 {
    public static void main(String[] args) {
        int a, b, c, d; 
        int matriks_A[][] = new int[10][10];
        int tranpose_A[][] = new int[10][10];  
        Scanner scan = new Scanner(System.in);
        
        System.out.print("masukkan jumlah baris matriks A: ");
        c = scan.nextInt();
        System.out.println("masukkan jumlah kolom matriks A: ");
        d = scan.nextInt();
        System.out.println("masukkan elemen matriks A: ");
        for(a = 0; a< c; a++){ 
            for(b = 0; b< d; b++){
                matriks_A[a][b] = scan.nextInt();
            }
        }
        System.out.println("hasil matriks A: ");
        for(a = 0; a< c; a++){
            for(b = 0;  b< d; b++){
                System.out.print(matriks_A[a][b] + "\t");
            }
            System.out.println();
        }
        
        for(a = 0; a <c ; a++){
            for(b = 0; b < d; b++){
                tranpose_A[b][a] = matriks_A[a][b];
            }
        }
        
        System.out.println("hasil tranpose matriks A: ");
        for(a = 0; a < c ; a++){
            for(b = 0; b < d ; b++){
                System.out.println(tranpose_A[a][b] + "\t");
            }
        }
        int e, f, g, h; 
        int matriks_B[][] = new int[10][10];
        int tranpose_B[][] = new int[10][10];  
        
        System.out.print("masukkan jumlah baris matriks B: ");
        g = scan.nextInt();
        System.out.println("masukkan jumlah kolom matriks B: ");
        h = scan.nextInt();
        System.out.println("masukkan elemen matriks B: ");
        for(e = 0; e< g; e++){ 
            for(f = 0; f< h; f++){
                matriks_B[e][f] = scan.nextInt();
            }
        }
        System.out.println("hasil matriks B: ");
        for(e = 0; e< g; e++){
            for(f = 0;  f< h; e++){
                System.out.print(matriks_B[e][f] + "\t");
            }
            System.out.println();
        }
        
        for(e = 0; e < g; e++){
            for(f = 0; f < h; f++){
                tranpose_B[f][e] = matriks_B[e][f];
            }
        }
        
        System.out.println("hasil tranpose matriks B: ");
        for(e = 0; e < g ; e++){
            for(f = 0; f < h ; f++){
                System.out.print(tranpose_B[e][f] + "\t");
            }
        }
    }
}
    

