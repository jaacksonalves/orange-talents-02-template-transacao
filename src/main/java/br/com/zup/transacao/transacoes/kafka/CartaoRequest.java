package br.com.zup.transacao.transacoes.kafka;

import br.com.zup.transacao.transacoes.Cartao;

public class CartaoRequest {

    private String id;
    private String email;


    public Cartao toModel() {
        return new Cartao(id, email);
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}
