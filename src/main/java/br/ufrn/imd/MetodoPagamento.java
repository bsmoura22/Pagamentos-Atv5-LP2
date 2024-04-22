package br.ufrn.imd;

interface MetodoPagamento {
    boolean debitar();
    void estornar();
}
}
