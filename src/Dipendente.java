public class Dipendente {
    private String matricola;
    private double stipendio;
    private double straordinario;
    public Dipendente (String matr,double stip,double straord){
        matricola=matr;
        stipendio=stip;
        straordinario=straord;
    }
    public double getStipendio (){
        return stipendio;
    }
    public double paga (int ore){
        double tot;
        tot=stipendio+(ore*straordinario);
        return tot;
    }
    public String stampa (){
        String unito;
        unito="Matricola:"+matricola+" Straordinario:"+straordinario;
        return unito;
    }
}
