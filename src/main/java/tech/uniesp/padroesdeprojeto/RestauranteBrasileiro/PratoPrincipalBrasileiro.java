package tech.uniesp.padroesdeprojeto.RestauranteBrasileiro;

import tech.uniesp.padroesdeprojeto.Interfaces.PratoPrincipal;

class PratoPrincipalBrasileiro implements PratoPrincipal {
    @Override
    public void servir() {
        System.out.println("Servindo prato principal brasileiro");
    }
}
