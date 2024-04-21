
package application;

import entities.IPI;
import entities.PIS;
import entities.Pagamentos;
import java.util.Locale;
import java.util.Scanner;


public class Program {

    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        boolean para = true;
        
        System.out.println("---------- Calcule seu Imposto ----------");
        System.out.print("Digite o nome da empresa: ");
        String nome = sc.nextLine();
        Pagamentos pagamentos = new Pagamentos(nome);
        
        while(para){
            System.out.println();
            System.out.print("Qual imposto você deseja calcular PIS | IPI: ");
            String tipoImposto = sc.nextLine();
       
         
            if(tipoImposto.equals("PIS")){
                System.out.println();
                System.out.print("Digite o valor de débito da empresa R$");
                double debito = sc.nextDouble();
                System.out.print("Digite o valor de crédito da empresa R$");
                double credito = sc.nextDouble();
                sc.nextLine();
                PIS pis = new PIS(debito, credito);
                pagamentos.adicionarImposto(pis);
            }
            else if(tipoImposto.equals("IPI")){
                System.out.println();
                System.out.print("Digite a alíquota: ");
                double valorAliquota = sc.nextDouble();
                System.out.print("Digite o valor do produto: R$");
                double valorProduto = sc.nextDouble();
                System.out.print("Digite o valor do frete: R$");
                double frete = sc.nextDouble();
                System.out.print("Digite o valor do seguro: R$");
                double seguro = sc.nextDouble();
                sc.nextLine();
                System.out.println();
                System.out.print("Possuiu outras despesas? [S]Sim | [N]Não: ");
                char despesas = sc.next().charAt(0);
                double outrasDespesas = 0.0;
                if(despesas == 'S'){
                    System.out.print("Digite o valor das despesas: R$");
                    outrasDespesas = sc.nextDouble();
                          
                }
                IPI ipi = new IPI(valorAliquota, valorProduto, frete, seguro, outrasDespesas);
                pagamentos.adicionarImposto(ipi);
            }
            else{
                System.out.println();
                System.out.println("Tipo de imposto inválido. Por favor, escolha PIS ou IPI.");
                continue;
            }
            System.out.println();
            System.out.print("Deseja calcular outro imposto? [S]Sim | [N]Não: ");
            char continuar = sc.next().charAt(0);
            sc.nextLine();
            if (continuar == 'N') {
                para = false;
            }
        }
        
        pagamentos.calcularImpostos();
        
        
        
        sc.close();
    }
    
}
