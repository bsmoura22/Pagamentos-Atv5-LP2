package br.ufrn.imd;

public class Cartao implements MetodoPagamento{
    public Cartao(){

    }


    @Override
    public boolean debitar() {
        return false;
    }

    @Override
    public void estornar() {

    }
}
