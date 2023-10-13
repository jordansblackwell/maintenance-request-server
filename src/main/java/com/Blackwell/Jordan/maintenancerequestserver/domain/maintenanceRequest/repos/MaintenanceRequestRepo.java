package com.Blackwell.Jordan.maintenancerequestserver.domain.maintenanceRequest.repos;

import com.Blackwell.Jordan.maintenancerequestserver.domain.maintenanceRequest.models.MaintenanceRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaintenanceRequestRepo extends JpaRepository<MaintenanceRequest, Long> {
}
