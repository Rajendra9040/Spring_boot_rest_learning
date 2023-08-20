package com.example.demo.controler;

import com.example.demo.model.CloudVendor;
import com.example.demo.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloud-vendor")
public class CloudVendorController {
    CloudVendorService cloudVendorService;
    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    @GetMapping("/{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId) {
        return cloudVendorService.getCloudVendor(vendorId);
    }

    @GetMapping()
    public List<CloudVendor> getCloudVendorDetails() {
        return cloudVendorService.getAllCloudVendors();
    }

    @PostMapping
    public String createCloudVendor(@RequestBody CloudVendor cloudVendor) {
        cloudVendorService.createCloudVendor(cloudVendor);
        return "CloudVendor created successfully";
    }

    @PutMapping
    public String updateCloudVendor(@RequestBody CloudVendor cloudVendor) {
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "CloudVendor updated successfully";
    }

    @DeleteMapping("/{vendorId}")
    public String deleteCloudVendor(@PathVariable("vendorId") String vendorId) {
        cloudVendorService.deleteCloudVendor(vendorId);
        return "Cloud vendor deleted successfully";
    }
}
