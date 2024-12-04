package proj.Maromo.ProjecAuten.Repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proj.Maromo.ProjecAuten.Model.Funcionario;

@Repository
public interface funcRepos extends JpaRepository<Funcionario, UUID> {
}
