public class TestDipendente {
    public static void main(String[] args) {
        Dipendente dipendente=new Dipendente("00309",1000,7.5);
        System.out.println(("Stipendio totale:")+dipendente.paga(7));
        System.out.println(dipendente.stampa());
    }
}