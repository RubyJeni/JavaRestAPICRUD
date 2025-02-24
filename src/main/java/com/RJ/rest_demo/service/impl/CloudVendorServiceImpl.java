package com.RJ.rest_demo.service.impl;

import com.RJ.rest_demo.model.CloudVendor;
import com.RJ.rest_demo.repository.CloudVendorRepository;
import com.RJ.rest_demo.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CloudVendorServiceImpl implements CloudVendorService {

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    CloudVendorRepository cloudVendorRepository;


    @Override
    public String CreateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String UpdateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String DeleteCloudVendor(String cloudVendorId) {
        cloudVendorRepository.deleteById(cloudVendorId);
        return "Success";
    }

    @Override
    public CloudVendor GetCloudVendorById(String cloudVendorId) {

        return cloudVendorRepository.findById(cloudVendorId).get();
    }

    @Override
    public List<CloudVendor> GetAllCloudVendor() {
        return cloudVendorRepository.findAll();
    }
}