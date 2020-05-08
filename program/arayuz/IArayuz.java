package program.arayuz;

import program.isbirimleri.IEyleyici;
import program.isbirimleri.ISicaklikAlgilayici;

//observer
public interface IArayuz {
    public boolean kullaniciGiris();
    public int islemSecimi();
    public void sicaklik(ISicaklikAlgilayici sicaklikAlgilayici);
    public void sogutucuyuAc(IEyleyici eyleyici);
    public void sogutucuyuKapat(IEyleyici eyleyici);
    public void CikisYap();
}
