package com.transport.controller;

import com.transport.model.Enquiry;
import com.transport.service.EnquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class EnquiryController {

    private EnquiryService enquiryService;

    @Autowired
    public EnquiryController(EnquiryService enquiryService) {
        this.enquiryService = enquiryService;
    }

    @GetMapping("/enquiries")
    public List<Enquiry> getAllEnquiry(){
        return enquiryService.getAllEnquiries();
    }

    @PostMapping("/enquiries")
    public Enquiry saveEnquiry(@RequestBody Enquiry enquiry){
        return enquiryService.saveEnquiry(enquiry);
    }
}