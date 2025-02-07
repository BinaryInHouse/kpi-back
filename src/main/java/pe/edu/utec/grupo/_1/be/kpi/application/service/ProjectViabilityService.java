package pe.edu.utec.grupo._1.be.kpi.application.service;


import org.springframework.stereotype.Service;
import pe.edu.utec.grupo._1.be.kpi.domain.model.ProjectViability;
import pe.edu.utec.grupo._1.be.kpi.infraestructure.repository.ProjectViabilityRepository;

import java.util.List;

@Service
public class ProjectViabilityService {
    private final ProjectViabilityRepository projectViabilityRepository;

    public ProjectViabilityService(ProjectViabilityRepository projectViabilityRepository) {
        this.projectViabilityRepository = projectViabilityRepository;
    }

    public List<ProjectViability> getProjectViability(){
        return projectViabilityRepository.getProjectViability();
    }
}
