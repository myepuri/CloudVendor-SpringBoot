package com.mky.rest_demo.service.impl;

import com.mky.rest_demo.model.CloudVendor;
import com.mky.rest_demo.repository.CloudVendorRepository;
import com.mky.rest_demo.service.CloudVendorService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {


    CloudVendorRepository cloudVendorRepository;


    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }


    @Override
    public void createCloudVendor(CloudVendor cloudVendor) {
       cloudVendorRepository.save(cloudVendor);

    }


    @Override
    public void updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
    }

    @Override
    public void deleteCloudVendor(String CloudVendorID) {
        cloudVendorRepository.deleteById(CloudVendorID);
    }

    @Override
    public Optional<CloudVendor> getCloudVendor(String CloudVendorID) {
        return cloudVendorRepository.findById(CloudVendorID);
    }

    @Override
    public List<CloudVendor> getallCloudVendor() {
        return cloudVendorRepository.findAll();
    }
}
