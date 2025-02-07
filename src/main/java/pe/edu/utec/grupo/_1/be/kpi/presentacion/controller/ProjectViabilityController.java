package pe.edu.utec.grupo._1.be.kpi.presentacion.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.utec.grupo._1.be.kpi.application.service.ProjectViabilityService;
import pe.edu.utec.grupo._1.be.kpi.domain.model.ProjectPriority;
import pe.edu.utec.grupo._1.be.kpi.domain.model.ProjectViability;

import java.util.List;


@RestController
@RequestMapping("/projects")
@CrossOrigin(origins = "*")
public class ProjectViabilityController {

    private final ProjectViabilityService projectViabilityService;

    public ProjectViabilityController(ProjectViabilityService projectViabilityService) {
        this.projectViabilityService = projectViabilityService;
    }

    @GetMapping("/viability")
    public List<ProjectViability> geProjectViability()
    {
        return projectViabilityService.getProjectViability();
    }
}
