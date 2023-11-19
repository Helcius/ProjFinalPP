package tech.uniesp.padroesdeprojeto.AppCliente;

import tech.uniesp.padroesdeprojeto.Interfaces.Entrada;
import tech.uniesp.padroesdeprojeto.Interfaces.PratoPrincipal;
import tech.uniesp.padroesdeprojeto.Interfaces.RestauranteFactory;
import tech.uniesp.padroesdeprojeto.Interfaces.Sobremesa;
import tech.uniesp.padroesdeprojeto.RestauranteBrasileiro.RestauranteBrasileiroFactory;
import tech.uniesp.padroesdeprojeto.RestauranteItaliano.RestauranteItalianoFactory;
import tech.uniesp.padroesdeprojeto.RestauranteJapones.RestauranteJaponesFactory;

public class Cliente {
    public static void main(String[] args) {
        // Escolha o tipo de restaurante desejado
        RestauranteFactory fabricaItaliana = new RestauranteItalianoFactory();
        RestauranteFactory fabricaJaponesa = new RestauranteJaponesFactory();
        RestauranteFactory fabricaBrasileira = new RestauranteBrasileiroFactory();

        // Crie os pratos usando a fábrica escolhida
        Entrada entrada = fabricaItaliana.criarEntrada();
        PratoPrincipal pratoPrincipal = fabricaItaliana.criarPratoPrincipal();
        Sobremesa sobremesa = fabricaItaliana.criarSobremesa();

        // Sirva os pratos
        entrada.servir();
        pratoPrincipal.servir();
        sobremesa.servir();
    }
}