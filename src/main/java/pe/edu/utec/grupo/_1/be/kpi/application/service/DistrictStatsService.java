package pe.edu.utec.grupo._1.be.kpi.application.service;

import org.springframework.stereotype.Service;
import pe.edu.utec.grupo._1.be.kpi.domain.model.DistrictProjectStats;
import pe.edu.utec.grupo._1.be.kpi.infraestructure.repository.DistrictStatsRepository;

import java.util.List;

@Service
public class DistrictStatsService {
    private final DistrictStatsRepository districtStatsRepository;

    public DistrictStatsService(DistrictStatsRepository districtStatsRepository) {
        this.districtStatsRepository = districtStatsRepository;
    }

    public List<DistrictProjectStats> getDistrictStats() {
        return districtStatsRepository.getDistrictStats();
    }
}
