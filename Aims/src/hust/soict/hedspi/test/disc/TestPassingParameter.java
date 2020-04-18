package hust.soict.hedspi.test.disc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class TestPassingParameter{
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
        
        Wrapper junWrapper = new Wrapper(jungleDVD);
        Wrapper cindeWrapper = new Wrapper(cinderellaDVD);
        swap(junWrapper, cindeWrapper);
        System.out.println("jungle dvd title: " + junWrapper.d.getTitle());
        System.out.println("cinderella dvd title: " + cindeWrapper.d.getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }

    public static void swap(Wrapper o1, Wrapper o2){
        DigitalVideoDisc tmp = o1.d;
        o1.d = o2.d;
        o2.d = tmp;
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title){
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
}
