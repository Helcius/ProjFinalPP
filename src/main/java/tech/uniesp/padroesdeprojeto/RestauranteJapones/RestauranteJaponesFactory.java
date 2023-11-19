package tech.uniesp.padroesdeprojeto.RestauranteJapones;

import tech.uniesp.padroesdeprojeto.Interfaces.Entrada;
import tech.uniesp.padroesdeprojeto.Interfaces.PratoPrincipal;
import tech.uniesp.padroesdeprojeto.Interfaces.RestauranteFactory;
import tech.uniesp.padroesdeprojeto.Interfaces.Sobremesa;

public class RestauranteJaponesFactory implements RestauranteFactory {
    @Override
    public Entrada criarEntrada() {
        return new EntradaJaponesa();
    }

    @Override
    public PratoPrincipal criarPratoPrincipal() {
        return new PratoPrincipalJapones();
    }

    @Override
    public Sobremesa criarSobremesa() {
        return new SobremesaJaponesa();
    }
}

