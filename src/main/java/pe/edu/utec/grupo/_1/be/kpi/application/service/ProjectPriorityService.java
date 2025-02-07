package pe.edu.utec.grupo._1.be.kpi.application.service;

import org.springframework.stereotype.Service;
import pe.edu.utec.grupo._1.be.kpi.domain.model.ProjectPriority;
import pe.edu.utec.grupo._1.be.kpi.infraestructure.repository.ProjectPriorityRepository;

import java.util.List;

@Service
public class ProjectPriorityService {

    private final ProjectPriorityRepository projectPriorityRepository;

    public ProjectPriorityService(ProjectPriorityRepository projectPriorityRepository) {
        this.projectPriorityRepository = projectPriorityRepository;
    }

    public List<ProjectPriority> getProjectPriority(){
        return projectPriorityRepository.getProjectPriority();
    }
}
