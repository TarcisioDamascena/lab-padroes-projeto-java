package com.tarcisio.gof.subsistem.cep;


public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Cidade: Vitória da Conquista";
    }
    public String recuperarEstado(String cep){
        return "Estado: BA";
    }
}
