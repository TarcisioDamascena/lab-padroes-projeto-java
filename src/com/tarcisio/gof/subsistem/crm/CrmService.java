package com.tarcisio.gof.subsistem.crm;

public class CrmService {

    private CrmService() {
        super();
    }

    public static void recordClient(String nome, String cep, String estado, String cidade) {
        System.out.println("Cliente salvo no sistema de CRM.");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(estado);
        System.out.println(cidade);
    }
}
