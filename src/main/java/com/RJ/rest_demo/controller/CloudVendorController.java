package com.RJ.rest_demo.controller;
import com.RJ.rest_demo.model.CloudVendor;
import com.RJ.rest_demo.service.CloudVendorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {

    CloudVendorService cloudVendorService;
    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId)
    {
        return cloudVendorService.GetCloudVendorById(vendorId);
    }
    @GetMapping()
    public List<CloudVendor> getAllCloudVendorDetails()
    {
        return cloudVendorService.GetAllCloudVendor();
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        cloudVendorService.CreateCloudVendor(cloudVendor);
        return "Cloud vendor Created";
    }

    @PutMapping
    public String UpdateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendorService.UpdateCloudVendor(cloudVendor);
        return "Cloud vendor Updated";
    }

    @DeleteMapping("{vendorId}")
    public String DeleteCloudVendorDetails(@PathVariable("vendorId") String vendorId)
    {
        this.cloudVendorService.DeleteCloudVendor(vendorId);
        return "Cloud vendor Deleted";
    }
}
