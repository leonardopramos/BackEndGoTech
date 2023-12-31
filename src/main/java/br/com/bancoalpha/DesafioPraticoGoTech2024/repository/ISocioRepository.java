package br.com.bancoalpha.DesafioPraticoGoTech2024.repository;

import br.com.bancoalpha.DesafioPraticoGoTech2024.model.PessoaFisica.Socio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ISocioRepository extends JpaRepository<Socio,Long> {
    @Query("SELECT s FROM Socio s WHERE s.contaPessoaJuridica.id = :contaPessoaJuridicaId")
    Optional<Socio> findByContaPessoaJuridicaId(@Param("contaPessoaJuridicaId") String contaPessoaJuridicaId);
    List<Socio> findAllByContaPessoaJuridicaId(@Param("contaPessoaJuridicaId") String contaPessoaJuridicaId);

}
