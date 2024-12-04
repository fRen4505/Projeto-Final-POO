package proj.Maromo.ProjecAuten.Repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proj.Maromo.ProjecAuten.Model.Usuario;

@Repository
public interface userRepos extends JpaRepository<Usuario, UUID>{
}
