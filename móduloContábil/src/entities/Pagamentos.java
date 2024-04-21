
package entities;

import java.util.ArrayList;
import java.util.List;


public class Pagamentos {
    
    private String nomeEmpresa;
    List<Imposto> impostos = new ArrayList<>();

    public Pagamentos() {
        
    }
    
    public Pagamentos(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }
    
    public void adicionarImposto(Imposto imposto){
        impostos.add(imposto);
    }
    
    public void calcularImpostos(){
        for(Imposto imp : impostos){
            System.out.println();
            System.out.println("Empresa: " + nomeEmpresa + "\nImpostos a ser pago: ");
            System.out.println(imp.nome() + ": R$" + String.format("%.2f",imp.calcularImposto()));
        }
    }
    
    
}
