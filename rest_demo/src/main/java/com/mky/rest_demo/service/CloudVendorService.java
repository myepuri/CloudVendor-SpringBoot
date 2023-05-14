package com.mky.rest_demo.service;

import com.mky.rest_demo.model.CloudVendor;
import java.util.List;
import java.util.Optional;

public interface CloudVendorService {

    public void createCloudVendor(CloudVendor cloudVendor);
    public void updateCloudVendor(CloudVendor cloudVendor);
    public void deleteCloudVendor(String CloudVendorID);
    public Optional<CloudVendor> getCloudVendor(String CloudVendorID);
    public List<CloudVendor> getallCloudVendor();


}
