package UTP;

/**
 *
 * @author riskipradana
 */
class NodeDLL {
    int data;
    NodeDLL prev, next;
    String datah;
}

public class DoubleLinkedList {
    
    private NodeDLL pKepala,pKepala2, pEkor,pEkor2;
    private NodeDLL pointer;
    
    public DoubleLinkedList() {
        pKepala = null;
        pEkor = null;
        pointer = null;
    }

    public void sisipDipKepala(int dt) {
    //Lengkapi bagian ini
        NodeDLL baru = new NodeDLL();
        baru.data = dt;
        if (pKepala == null) {
            baru.prev = pKepala;
            baru.next = pEkor;
            pKepala = baru;
            pEkor = baru;
        } else {
            baru.next = pKepala;
            pKepala.prev = baru;
            pKepala = baru;
        }
    }

    public void sisipDipEkor(int data) {
//Lengkapi bagian ini
        NodeDLL baru = new NodeDLL();
        baru.data = data;
        if (pEkor == null) {
            baru.prev = pKepala;
            baru.next = pEkor;
            pKepala = baru;
            pEkor = baru;
        } else {
            baru.prev = pEkor;
            pEkor.next = baru;
            pEkor = baru;
        }
    }

    public void sisipHURUFDipEkor(String datah) {
//Lengkapi bagian ini
        NodeDLL baru = new NodeDLL();
        baru.datah = datah;
        if (pEkor2 == null) {
            baru.prev = pKepala2;
            baru.next = pEkor2;
            pKepala2 = baru;
            pEkor2 = baru;
        } else {
            baru.prev = pEkor2;
            pEkor2.next = baru;
            pEkor2 = baru;
        }
    }
    public static DoubleLinkedList gabungList(DoubleLinkedList a, DoubleLinkedList b) {
//Lengkapi bagian ini
        
        DoubleLinkedList dll = a;
        NodeDLL baru = new NodeDLL();
        baru = dll.pointer;
        while (baru != null) {
            baru = baru.next;
            if (baru.next == null) {
                baru.next = b.pointer;
                break;
            }
        }
        return dll;
    }
    
    public void cetak(String kom) {
        System.out.println(kom);
        NodeDLL p = new NodeDLL();
        p=pKepala;
        System.out.print("NULL <=> ");
        while (p != null) {
            System.out.print(p.data + "->");
            p = p.next;
        }
        System.out.print("NULL");
        System.out.println();  
    }
    
    public void cetak2(String kom) {
        System.out.println(kom);
        NodeDLL p2 = pKepala2;
        System.out.print("NULL <=> ");
        while (p2 != null) {
            System.out.print(p2.datah + " -> ");
            p2 = p2.next;
        }
        System.out.print("NULL");
        System.out.println();
    }
    
    public void cetak3(String kom) {
        System.out.println(kom);
        NodeDLL p = pKepala;
        NodeDLL p2 = pKepala2;
        System.out.print("NULL <=> ");
        while (p != null) {
            System.out.print(p.data + " <=> ");
            p = p.next;
            System.out.print(p2.datah+" <=> ");
            p2=p2.next;
        }
        System.out.print("NULL");
        System.out.println();  
    }
    public static void main (String[]args){
        DoubleLinkedList dll =new DoubleLinkedList();
        dll.sisipHURUFDipEkor("A");
        dll.sisipHURUFDipEkor("B");
        dll.sisipHURUFDipEkor("C");
        dll.sisipHURUFDipEkor("D");
        dll.sisipHURUFDipEkor("E");
        dll.sisipHURUFDipEkor("F");
        dll.cetak2("DLL huruf:");
        System.out.println("");
        dll.sisipDipKepala(6);
        dll.sisipDipKepala(5);
        dll.sisipDipKepala(4);
        dll.sisipDipKepala(3);
        dll.sisipDipKepala(2);
        dll.sisipDipKepala(1);
        dll.cetak("DLL angka:");
        System.out.println("");
        dll.cetak3("DLL gabung:");
    }
}

