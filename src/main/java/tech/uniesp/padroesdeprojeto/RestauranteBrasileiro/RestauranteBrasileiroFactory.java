package tech.uniesp.padroesdeprojeto.RestauranteBrasileiro;

import tech.uniesp.padroesdeprojeto.Interfaces.Entrada;
import tech.uniesp.padroesdeprojeto.Interfaces.PratoPrincipal;
import tech.uniesp.padroesdeprojeto.Interfaces.RestauranteFactory;
import tech.uniesp.padroesdeprojeto.Interfaces.Sobremesa;

public class RestauranteBrasileiroFactory implements RestauranteFactory {
    @Override
    public Entrada criarEntrada() {
        return new EntradaBrasileira();
    }

    @Override
    public PratoPrincipal criarPratoPrincipal() {
        return new PratoPrincipalBrasileiro();
    }

    @Override
    public Sobremesa criarSobremesa() {
        return new SobremesaBrasileira();
    }
}

