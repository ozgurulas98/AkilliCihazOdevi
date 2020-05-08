package program.isbirimleri;
//subject
public class Eyleyici implements IEyleyici {
    @Override
    public void sogutucuyuAc() {
        System.out.println("Soğutucu Açılıyor...");
    }

    @Override
    public void sogutucuyuKapat() {
        System.out.println("Soğutucu kapatılıyor...");
    }
}
