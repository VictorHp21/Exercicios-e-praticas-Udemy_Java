package Entities;

public class PessoaFisica extends Pessoa {
    private Double gastosSaude;

    public PessoaFisica(){
        super();
    }

    @Override
    public Double imposto() {
        if(getRendaAnual() < 20000.0){
            return getRendaAnual() * 0.15;
        } else if (getRendaAnual() > 20000.0){
            if(getGastosSaude() > 0.0){
                return getRendaAnual() * 0.25 - getGastosSaude() * 0.5;
            }
            return getRendaAnual() * 0.25;
        }
        return 0.0;
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }


}
