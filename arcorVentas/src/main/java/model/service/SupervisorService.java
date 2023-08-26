package model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.entity.Supervisor;
import model.repository.ISupervisorRepository;

@Service
public class SupervisorService {

    @Autowired
    private ISupervisorRepository supervisorRepository;

    public Supervisor crearSupervisor(Supervisor supervisor) {
        return supervisorRepository.save(supervisor);
    }

    public List<Supervisor> obtenerTodosLosSupervisores() {
        return supervisorRepository.findAll();
    }

    // Puedes agregar más métodos de servicio según tus necesidades
}
