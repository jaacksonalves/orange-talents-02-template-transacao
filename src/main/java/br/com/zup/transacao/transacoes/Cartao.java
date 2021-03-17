package br.com.zup.transacao.transacoes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Cartao {

    @Id
    private String id;
    @Column(nullable = false)
    private String email;


    public Cartao(String id, String email) {
        this.id = id;
        this.email = email;
    }

    @Deprecated
    public Cartao() {
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}
