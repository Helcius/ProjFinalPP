package tech.uniesp.padroesdeprojeto.RestauranteJapones;

import tech.uniesp.padroesdeprojeto.Interfaces.PratoPrincipal;

class PratoPrincipalJapones implements PratoPrincipal {
    @Override
    public void servir() {
        System.out.println("Servindo prato principal japonês");
    }
}

