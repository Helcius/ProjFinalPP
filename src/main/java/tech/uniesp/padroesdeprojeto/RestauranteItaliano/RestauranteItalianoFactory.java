package tech.uniesp.padroesdeprojeto.RestauranteItaliano;

import tech.uniesp.padroesdeprojeto.Interfaces.Entrada;
import tech.uniesp.padroesdeprojeto.Interfaces.PratoPrincipal;
import tech.uniesp.padroesdeprojeto.Interfaces.RestauranteFactory;
import tech.uniesp.padroesdeprojeto.Interfaces.Sobremesa;

public class RestauranteItalianoFactory implements RestauranteFactory {
    @Override
    public Entrada criarEntrada() {
        return new EntradaItaliana();
    }

    @Override
    public PratoPrincipal criarPratoPrincipal() {
        return new PratoPrincipalItaliano();
    }

    @Override
    public Sobremesa criarSobremesa() {
        return new SobremesaItaliana();
    }
}
