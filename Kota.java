
package latihan1sem4;

public class Kota<E> {
private E element;

public Kota(E kota){
    element = kota;
}

    public E getElement() {
        return element;
    }
    public static void main(String[] args) {
        Kota<Integer> jumlahKota = new Kota<Integer>(9);
        Kota<String> namaKota = new Kota<String>("MALANG");
        System.out.println("Jumlah Kota di Jawa Timur : "+ jumlahKota.getElement() + "kota");
        System.out.println("Salah satu kota di jawa timur : Kota "+ namaKota.getElement());
    }

    
}
