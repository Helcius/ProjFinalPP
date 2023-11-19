package tech.uniesp.padroesdeprojeto.RestauranteBrasileiro;

import tech.uniesp.padroesdeprojeto.Interfaces.Sobremesa;

class SobremesaBrasileira implements Sobremesa {
    @Override
    public void servir() {
        System.out.println("Servindo sobremesa brasileira");
    }
}
