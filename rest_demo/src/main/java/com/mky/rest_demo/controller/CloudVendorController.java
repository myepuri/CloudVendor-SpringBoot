package com.mky.rest_demo.controller;

import com.mky.rest_demo.model.CloudVendor;
import com.mky.rest_demo.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {

    CloudVendorService cloudVendorService;
    CloudVendor cloudVendor;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    //read specific Cloud Vendor Details
    @GetMapping("{vendorId}")
    public Optional<CloudVendor> getCloudVendorDetails(@PathVariable("vendorID") String vendorId){
        return cloudVendorService.getCloudVendor(vendorId);
        //return new CloudVendor("c1","Mky","ADD1","xxxxx");
    }

    //Read ALl Cloud Vendor Details in the DB
    @GetMapping()
    public List<CloudVendor> getallCloudVendorDetails(){
        return cloudVendorService.getallCloudVendor();
        //return new CloudVendor("c1","Mky","ADD1","xxxxx");
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudvendor){
        cloudVendorService.createCloudVendor(cloudVendor);
        return "Cloud Vendor Successfully Created";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudvendor){
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud Vendor Updated Successfully";
    }

    @DeleteMapping("{vendorID}")
    public String deleteCloudVendorDetails(@PathVariable("vendorID") String vendorID){
        cloudVendorService.deleteCloudVendor(cloudVendor.getVendorId());
        return "Cloud Vendor Deleted Successfully";
    }


}
