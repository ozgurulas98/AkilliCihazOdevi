package program.isbirimleri;

import program.observer.IObserver;
import program.observer.ISubject;

import java.util.ArrayList;
import java.util.Random;

public class SicaklikAlgilayici implements ISicaklikAlgilayici, ISubject {
    private ArrayList observers = new ArrayList();
    @Override
    public int sicakligiOku() {
        Random rnd = new Random();
        int sayi = rnd.nextInt(100);
        return sayi;
    }

    @Override
    public int sicakligiGonder() {
        System.out.println("Sicaklik: "+sicakligiOku()+" Derece");
        return sicakligiOku();
    }



    public void registerObserver(IObserver o) {
        observers.add(o);
    }

    public void removeObserver(IObserver o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            IObserver observer = (IObserver)observers.get(i);
            observer.guncelle(sicakligiGonder());
        }
    }
}
