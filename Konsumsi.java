
package konsumsi;

public class Konsumsi<M, I> {
    private M m;

    public M getM() {
        return m;
    }

    public I getI() {
        return i;
    }
    private I i;
    
public void setKonsumsi ( M makanan, I minuman){
    this.m = makanan;
    this.i = minuman;
}
    
}
