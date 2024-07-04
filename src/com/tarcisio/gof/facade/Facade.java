package com.tarcisio.gof.facade;

import com.tarcisio.gof.subsistem.cep.CepApi;
import com.tarcisio.gof.subsistem.crm.CrmService;

public class Facade {

    public void clientMigration(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);
        CrmService.recordClient(nome, cep, cidade, estado);
    }
}
