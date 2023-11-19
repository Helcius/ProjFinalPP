package tech.uniesp.padroesdeprojeto.RestauranteJapones;

import tech.uniesp.padroesdeprojeto.Interfaces.Entrada;

class EntradaJaponesa implements Entrada {
    @Override
    public void servir() {
        System.out.println("Servindo entrada japonesa");
    }
}
