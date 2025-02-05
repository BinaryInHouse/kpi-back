package pe.edu.utec.grupo._1.be.kpi.application.service;
import java.util.List;
import org.springframework.stereotype.Service;
import pe.edu.utec.grupo._1.be.kpi.infraestructure.repository.ProjectByDepartmentRepository;
import pe.edu.utec.grupo._1.be.kpi.domain.model.ProjectByDepartment;

@Service
public class ProjectByDepartmentService {
    private final ProjectByDepartmentRepository projectByDepartmentRepository;

    public ProjectByDepartmentService(ProjectByDepartmentRepository projectByDepartmentRepository) {
        this.projectByDepartmentRepository = projectByDepartmentRepository;
    }

    public List<ProjectByDepartment>  getProjectByDepartment() {
        return projectByDepartmentRepository.getProjectByDepartment();
    }
}
