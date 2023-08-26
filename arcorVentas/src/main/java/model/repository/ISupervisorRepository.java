package model.repository;

import model.entity.Supervisor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISupervisorRepository extends JpaRepository<Supervisor, Integer> {
    // Puedes agregar métodos personalizados de consulta si es necesario
}
