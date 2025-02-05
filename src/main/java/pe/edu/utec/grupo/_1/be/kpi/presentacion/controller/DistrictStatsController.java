package pe.edu.utec.grupo._1.be.kpi.presentacion.controller;

import org.springframework.web.bind.annotation.*;
import pe.edu.utec.grupo._1.be.kpi.application.service.DistrictStatsService;
import pe.edu.utec.grupo._1.be.kpi.domain.model.DistrictProjectStats;

import java.util.List;

@RestController
@RequestMapping("/projects")
@CrossOrigin(origins = "*")
public class DistrictStatsController {
    private final DistrictStatsService districtStatsService;

    public DistrictStatsController(DistrictStatsService districtStatsService) {
        this.districtStatsService = districtStatsService;
    }

    @GetMapping("/by-districts")
    public List<DistrictProjectStats> getDistrictStats() {
        return districtStatsService.getDistrictStats();
    }
}
