package br.com.zup.transacao.transacoes;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransacaoRepository extends CrudRepository<Transacao, String> {

    Page<Transacao> findAllByCartaoId(String cartaoId, Pageable paginacao);

}
