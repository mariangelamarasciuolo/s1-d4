import com.sun.source.doctree.SystemPropertyTree;

public class Main {
    public static void main (String[] args) {
        DetailsDip Aldo = new  DetailsDip("896", Dipartimento.PRODUZIONE);
        DetailsDip Giovanni = new  DetailsDip ("646", Dipartimento.PRODUZIONE);
    System.out.println(Aldo.printDetDip());
    System.out.println(Giovanni.printDetDip());
    System.out.println(Aldo.promozioni());
    /////
    System.out.println(DetailsDip.calcstip(6, Aldo));
    System.out.println(Aldo.promozioni());
    System.out.println(DetailsDip.calcstip(6, Aldo));
    System.out.println(Aldo.promozioni());
    System.out.println(DetailsDip.calcstip(6, Aldo));
    System.out.println(Aldo.promozioni());
    System.out.println(DetailsDip.calcstip(6, Aldo));
    System.out.println(Aldo.promozioni());
    //////
    System.out.println(DetailsDip.calcstip(6, Giovanni));
    System.out.println(Aldo.promozioni());
    System.out.println(DetailsDip.calcstip(6, Giovanni));
    System.out.println(Aldo.promozioni());
    System.out.println(DetailsDip.calcstip(6, Giovanni));
    System.out.println(Aldo.promozioni());
    System.out.println(DetailsDip.calcstip(6, Giovanni));

    }
}
