package tech.uniesp.padroesdeprojeto.RestauranteItaliano;

import tech.uniesp.padroesdeprojeto.Interfaces.Entrada;

public class EntradaItaliana implements Entrada {
    @Override
    public void servir() {
        System.out.println("Servindo entrada italiana");
    }
}
