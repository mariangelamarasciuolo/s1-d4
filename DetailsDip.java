public class DetailsDip {
    static double stipendioBasic = 1000;
    private String matricola;
    private double stipendio;
    private double importoOrarioStraord;
    private Livello livello;
    private Dipartimento dipartimento;

    DetailsDip (String _matricola,Dipartimento _dipartimento) {
    this.stipendio = stipendioBasic;
    this.matricola = _matricola;
    this.importoOrarioStraord = 30;
    this.livello = Livello.OPERAIO;
    this.dipartimento = _dipartimento;
    }

    @Override
    public String toString() {
        return "DetailsDip{" +
                "matricola='" + matricola + '\'' +
                ", stipendio=" + stipendio +
                ", importoOrarioStraord=" + importoOrarioStraord +
                ", livello=" + livello +
                ", dipartimento=" + dipartimento +
                '}';
    }
    DetailsDip (double stipendio, String matricola, double importoOrarioStraord, Livello Livello, Dipartimento dipartimento ) {
        this.stipendio = stipendio;
        this.matricola = matricola;
        this.importoOrarioStraord = importoOrarioStraord;
        this.livello = Livello;
        this.dipartimento = dipartimento;
    }
    public static double calcstip(DetailsDip x) {
        x.stipendio = stipendioBasic;
        return x.stipendio;
}
    public static double calcstip(int h, DetailsDip x) {
        x.stipendio = stipendioBasic + (h* x.importoOrarioStraord);
        return x.stipendio;
    }
    public String printDetDip(){
        return "DetailsDip{" +
                "matricola='" + matricola +
                ", stipendio=" + stipendio +
                ", importoOrarioStraord=" + importoOrarioStraord +
                ", livello=" + livello +
                ", dipartimento=" + dipartimento +
                '}';
    }

    public double getImportoOrarioStraord() {
        return importoOrarioStraord;
    }
    public void setImportoOrarioStraord(double importoOrarioStraord) {
        this.importoOrarioStraord = importoOrarioStraord;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    };

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public double getStipendio() {
        return stipendio;
    }

    public String getMatricola() {
        return matricola;
    }

    public Livello getLivello() {
        return livello;
    }
    Livello promozioni (){
        switch (livello) {
            case OPERAIO :
                livello = Livello.IMPIEGATO;
                stipendioBasic = stipendioBasic*1.2;
                break;
            case IMPIEGATO:
                livello = Livello.QUADRO;
                stipendioBasic = stipendioBasic*1.5;
                break;
            case QUADRO:
                livello = Livello.DIRIGENTE;
                stipendioBasic = stipendioBasic*2;
                break;
            case DIRIGENTE:
                System.out.println("Non puoi andare più da nessuna parte, ora sei:");
                break;

        }
        return livello;
    }
};

