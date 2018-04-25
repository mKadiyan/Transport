package com.transport.service;

import com.transport.model.Enquiry;
import com.transport.repository.EnquiryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EnquiryService {
    private EnquiryRepository enquiryRepository;

    @Autowired
    public EnquiryService(EnquiryRepository enquiryRepository) {
        this.enquiryRepository = enquiryRepository;
    }

    public List<Enquiry> getAllEnquiries() {
        return enquiryRepository.findAll();
    }

    public Enquiry saveEnquiry(Enquiry enquiry) {
        enquiry.setCreatedAt(new Date());
        enquiry.setUpdatedAt(new Date());
        return enquiryRepository.save(enquiry);
    }
}
