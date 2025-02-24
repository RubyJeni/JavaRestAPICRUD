package com.RJ.rest_demo.service;

import com.RJ.rest_demo.model.CloudVendor;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface CloudVendorService {
    public String CreateCloudVendor(CloudVendor cloudVendor);
    public String UpdateCloudVendor(CloudVendor cloudVendor);
    public String DeleteCloudVendor(String cloudVendorId);
    public CloudVendor GetCloudVendorById(String cloudVendorId);
    public List<CloudVendor> GetAllCloudVendor();
}
