package tech.uniesp.padroesdeprojeto.RestauranteJapones;

import tech.uniesp.padroesdeprojeto.Interfaces.Sobremesa;

class SobremesaJaponesa implements Sobremesa {
    @Override
    public void servir() {
        System.out.println("Servindo sobremesa japonesa");
    }
}
