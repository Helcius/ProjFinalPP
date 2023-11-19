package tech.uniesp.padroesdeprojeto.Interfaces;

public interface RestauranteFactory {
    Entrada criarEntrada();
    PratoPrincipal criarPratoPrincipal();
    Sobremesa criarSobremesa();
}
