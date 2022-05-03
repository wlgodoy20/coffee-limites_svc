package br.com.coffeandit.limites_svc.repository;

import br.com.coffeandit.limites_svc.entity.LimiteDiario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LimiteDiarioRepository extends CrudRepository<LimiteDiario, Long> {

    LimiteDiario findByAgenciaAndConta(Long agencia, Long conta);
}
