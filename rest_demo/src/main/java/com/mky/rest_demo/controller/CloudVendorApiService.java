package com.mky.rest_demo.controller;

import com.mky.rest_demo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorApiService {

    CloudVendor cloudvendor;
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId){
        return cloudvendor;
        //return new CloudVendor("c1","Mky","ADD1","xxxxx");
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudvendor){
        this.cloudvendor=cloudvendor;
        return "Cloud Vendor Successfully Created";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudvendor){
        this.cloudvendor=cloudvendor;
        return "Cloud Vendor Updated Successfully";
    }

    @DeleteMapping("{vendorID}")
    public String deleteCloudVendorDetails(String vendorID){
        this.cloudvendor=null;
        return "Cloud Vendor Deleted Successfully";
    }


}
