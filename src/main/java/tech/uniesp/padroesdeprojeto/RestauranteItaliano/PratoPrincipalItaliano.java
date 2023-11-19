package tech.uniesp.padroesdeprojeto.RestauranteItaliano;

import tech.uniesp.padroesdeprojeto.Interfaces.PratoPrincipal;

class PratoPrincipalItaliano implements PratoPrincipal {
    @Override
    public void servir() {
        System.out.println("Servindo prato principal italiano");
    }
}
