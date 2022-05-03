package br.com.coffeandit.limites_svc.service;

import br.com.coffeandit.limites_svc.entity.LimiteDiario;
import br.com.coffeandit.limites_svc.repository.LimiteDiarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LimiteDiarioService {

    LimiteDiarioRepository limiteDiarioRepository;

 public Optional<LimiteDiario> findById(Long id){
     return limiteDiarioRepository.findById(id);
 }
}
