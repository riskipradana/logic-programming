package UAP;

import java.util.Scanner;

/**
 *
 * @author riskipradana
 */
class NodeCSLL {

    Pengunjung data;
    NodeCSLL next;

    public NodeCSLL(Pengunjung data) {
        this.data = data;
    }
}

class Pengunjung {

    String nama;
    int jumlahVoucher;

    public Pengunjung(String nama, int jumlahVoucher) {
        this.nama = nama;
        this.jumlahVoucher = jumlahVoucher;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlahVoucher() {
        return jumlahVoucher;
    }

    public void setJumlahVoucher(int jumlahVoucher) {
        this.jumlahVoucher = jumlahVoucher;
    }

}

class CircularLinkedList {

    private NodeCSLL pAwal, pAkhir;
    private int counter;

    public CircularLinkedList() {
        pAwal = null;
        pAkhir = null;
        counter = -1;
    }

    public void insertLast(Pengunjung data) {
        NodeCSLL pBaru = new NodeCSLL(data);
        if (pAwal == null) {
            pAwal = pBaru;
            pAkhir = pBaru;
            pBaru.next = pAwal;
            counter = 0;
        } else {
            pBaru.next = pAwal;
            pAkhir.next = pBaru;
            pAkhir = pBaru;
            counter++;
        }
    }

    public Object deleteFirst() {
        // lengkapi bagian ini
        // perhatikan bahwa proses delete bukan menghapus node, tetapi hanya mengurangi nilai data dari node
        return null;
    }

    public void cetak() {
        //lengkapi bagian ini 
        NodeCSLL pCetak;
        pCetak = pAwal;
        int i = -1;
        while ((i < counter)) {
            System.out.print(pCetak.data.nama + " " + pCetak.data.jumlahVoucher + "->");
            pCetak = pCetak.next;
            i++;
        }
        System.out.println();
    }
}

public class Queue {

    private CircularLinkedList listQueue;

    public Queue() {
        listQueue = new CircularLinkedList();
    }

    public void enqueue(Pengunjung data) {
        listQueue.insertLast(data);
    }

    public Object dequeue(){
        return listQueue.deleteFirst();
    }   
    
    public void print() {
        listQueue.cetak();
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Nama : ");
        String nama = in.nextLine();

        System.out.println("jumlah : ");
        int jumlah = in.nextInt();

        CircularLinkedList cll = new CircularLinkedList();
        cll.insertLast(new Pengunjung(nama, jumlah));
        cll.cetak();
    }
}
