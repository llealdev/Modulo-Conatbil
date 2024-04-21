package entities;


public class IPI implements Imposto{
    
    private double valorAliquota;
    private double valorProduto;
    private double frete;
    private double seguro;
    private double outrasDespesas;

    public IPI() {
        
    }

    public IPI(double valorAliquota, double valorProduto, double frete, double seguro, double outrasDespesas) {
        this.valorAliquota = valorAliquota;
        this.valorProduto = valorProduto;
        this.frete = frete;
        this.seguro = seguro;
        this.outrasDespesas = outrasDespesas;
       
    }
    
    public double getValorAliquota() {
        return valorAliquota;
    }

    public void setValorAliquota(double valorAliquota) {
        this.valorAliquota = valorAliquota;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    public double getSeguro() {
        return seguro;
    }

    public void setSeguro(double seguro) {
        this.seguro = seguro;
    }

    public double getOutrasDespesas() {
        return outrasDespesas;
    }

    public void setOutrasDespesas(double outrasDespesas) {
        this.outrasDespesas = outrasDespesas;
    }


    @Override
    public double calcularImposto() {
        double calculoBase = valorProduto + frete + seguro + outrasDespesas;
        return calculoBase * (valorAliquota /100);
    }

    @Override
    public String nome() {
        return "IPI";
    }
    
}
