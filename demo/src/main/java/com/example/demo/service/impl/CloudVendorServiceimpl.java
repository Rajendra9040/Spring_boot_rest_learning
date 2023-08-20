package com.example.demo.service.impl;

import com.example.demo.model.CloudVendor;
import com.example.demo.repository.CloudVendorRepository;
import com.example.demo.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceimpl implements CloudVendorService {

    CloudVendorRepository cloudVendorRepository;
    public CloudVendorServiceimpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Created Success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Created Success";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
//        More Business Logic
        cloudVendorRepository.deleteById(cloudVendorId);
        return "Deleted Success";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
        return cloudVendorRepository.findById(cloudVendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorRepository.findAll();
    }
}
