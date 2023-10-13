package com.Blackwell.Jordan.maintenancerequestserver.domain.maintenanceRequest.controllers;

import com.Blackwell.Jordan.maintenancerequestserver.domain.maintenanceRequest.models.MaintenanceRequest;
import com.Blackwell.Jordan.maintenancerequestserver.domain.maintenanceRequest.services.MaintenanceRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/maintenance-requests")
@CrossOrigin("*")
public class MaintenanceRequestController {

    private final MaintenanceRequestService requestService;

    @Autowired
    public MaintenanceRequestController(MaintenanceRequestService requestService) {
        this.requestService = requestService;
    }

    @GetMapping
    public List<MaintenanceRequest> getAllRequests() {
        return requestService.getAllRequests();
    }

    @GetMapping("/{id}")
    public MaintenanceRequest getRequestById(@PathVariable Long id) {
        return requestService.getRequestById(id);
    }

    @PostMapping
    public MaintenanceRequest createRequest(@RequestBody MaintenanceRequest request) {
        return requestService.createRequest(request);
    }

    @DeleteMapping("/{id}")
    public void deleteRequest(@PathVariable Long id) {
        requestService.deleteRequest(id);
    }
}