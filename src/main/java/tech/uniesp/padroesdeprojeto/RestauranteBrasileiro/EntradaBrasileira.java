package tech.uniesp.padroesdeprojeto.RestauranteBrasileiro;

import tech.uniesp.padroesdeprojeto.Interfaces.Entrada;

class EntradaBrasileira implements Entrada {
    @Override
    public void servir() {
        System.out.println("Servindo entrada brasileira");
    }
}
