package com.Blackwell.Jordan.maintenancerequestserver.domain.maintenanceRequest.services;

import com.Blackwell.Jordan.maintenancerequestserver.domain.maintenanceRequest.models.MaintenanceRequest;

import java.util.List;

public interface MaintenanceRequestService {

    List<MaintenanceRequest> getAllRequests();
    MaintenanceRequest getRequestById(Long id);
    MaintenanceRequest createRequest(MaintenanceRequest request);
    void deleteRequest(Long id);
}
