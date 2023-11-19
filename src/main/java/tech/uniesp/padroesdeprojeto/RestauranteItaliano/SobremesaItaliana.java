package tech.uniesp.padroesdeprojeto.RestauranteItaliano;

import tech.uniesp.padroesdeprojeto.Interfaces.Sobremesa;

class SobremesaItaliana implements Sobremesa {
    @Override
    public void servir() {
        System.out.println("Servindo sobremesa italiana");
    }
}
