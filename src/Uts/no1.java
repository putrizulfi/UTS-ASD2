package Uts;
public class no1 {
    public static void select(int[] arr){
                int n = arr.length;
                int C,M;
                int jarak,i,j,kondisi;
                boolean sudah = true;
                int temp;
                C=0;
                M=0;jarak = n;
   while (jarak >= 1){
   jarak = jarak/2;
   sudah = true;
   while (sudah){
       sudah = false;
       for (j=0; j<n-jarak; j++){
           i=j+jarak;
           C++;
           if(arr[j]>arr[i]){
               temp=arr[j];
               arr[j]=arr[i];
               arr[i]=temp;
               sudah = true;
       }}
   }
   
   }
   }
   public static void tampil(int data[]){
   for (int i =0;i<data.length;i++){
   System.out.print(data[i]+ " ");
   }
   System.out.println();
   }
    public static void main(String[] args) {
     System.out.println("Pengurutan Menggunakan SelectionSort");
          int data[] = {3,10,4,2,8,13};
           no1.tampil(data);
           no1.select(data);
           no1.tampil(data);
        
        int cari = 8;
        int IndeksAwal = 0;
        int IndeksAkhir = data.length-1;
        int ketemu =0;
        int point =0;
        
        while ((IndeksAwal <= IndeksAkhir) && (ketemu ==0)){
            point = (IndeksAwal + IndeksAkhir)/2;
            System.out.println("Indeks Pointer : "+ point);
            if(cari == data[point]){
                ketemu =1;
                System.out.println("Data " +cari + " Telah Ditemukan Di indeks ke : " + point );   
            }else if (cari < data[point]){
                System.out.println("cari di kanan ");
                IndeksAkhir = point -1;
            }
            else {
                IndeksAwal = point+1;
                System.out.println("Cari di kiri ");
            }
            
        }
        if(ketemu ==1 ){
        System.out.println("Data Ditemukan ");
        }else {
            System.out.println("Data Tidak Ditemukan ");
        }
        
        System.out.println();
        System.out.println("putri zulfiaturrizki");
        
    } 
}