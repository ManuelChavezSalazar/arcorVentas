package model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.entity.Administrativo;
import model.repository.IAdministrativoRepository;

@Service
public class AdministrativoService {

    @Autowired
    private IAdministrativoRepository administrativoRepository;

    public Administrativo crearAdministrativo(Administrativo administrativo) {
        return administrativoRepository.save(administrativo);
    }

    public List<Administrativo> obtenerTodosLosAdministrativos() {
        return administrativoRepository.findAll();
    }

    // Puedes agregar más métodos de servicio según tus necesidades
}
