package pe.edu.utec.grupo._1.be.kpi.presentacion.controller;
import org.springframework.web.bind.annotation.*;
import pe.edu.utec.grupo._1.be.kpi.application.service.ProjectByDepartmentService;
import pe.edu.utec.grupo._1.be.kpi.domain.model.ProjectByDepartment;
import java.util.List;

@RestController
@RequestMapping("/projects")
@CrossOrigin(origins = "*")
public class ProjectByDepartmentController {
    private final ProjectByDepartmentService projectByDepartmentService ;

    public ProjectByDepartmentController (ProjectByDepartmentService projectByDepartmentService) {
        this.projectByDepartmentService = projectByDepartmentService;
    }

    @GetMapping("/by-department")
    public List<ProjectByDepartment> getProjectByDepartment() {
        return projectByDepartmentService.getProjectByDepartment();
    }
}
