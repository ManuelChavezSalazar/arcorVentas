package model.repository;

import model.entity.Administrativo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdministrativoRepository extends JpaRepository<Administrativo, Integer> {
    // Puedes agregar métodos personalizados de consulta si es necesario
}
