package com.Blackwell.Jordan.maintenancerequestserver.domain.maintenanceRequest.services;


import com.Blackwell.Jordan.maintenancerequestserver.domain.maintenanceRequest.models.MaintenanceRequest;
import com.Blackwell.Jordan.maintenancerequestserver.domain.maintenanceRequest.repos.MaintenanceRequestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaintenanceRequestServiceImpl implements MaintenanceRequestService {

    private final MaintenanceRequestRepo requestRepo;

    @Autowired
    public MaintenanceRequestServiceImpl(MaintenanceRequestRepo requestRepo){
    this.requestRepo = requestRepo;
    }

    @Override
    public List<MaintenanceRequest> getAllRequests(){
        return requestRepo.findAll();
    }

    @Override
    public MaintenanceRequest getRequestById(Long id){
        return requestRepo.findById(id).orElse(null);
    }

    @Override
    public MaintenanceRequest createRequest(MaintenanceRequest request){
        return requestRepo.save(request);
    }

    @Override
    public void deleteRequest(Long id) {
        requestRepo.deleteById(id);
    }


}
