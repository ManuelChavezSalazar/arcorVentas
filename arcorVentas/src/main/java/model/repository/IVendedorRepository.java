package model.repository;

import model.entity.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVendedorRepository extends JpaRepository<Vendedor, Integer> {
    // Puedes agregar métodos personalizados de consulta si es necesario
}
