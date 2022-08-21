package com.model.sample.controller;

import com.model.sample.model.Sample;
import com.model.sample.repository.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="sample")
@CrossOrigin(origins = "*")
public class SampleController {

    @Autowired
    SampleRepository sampleRepository;

    @GetMapping
    public Sample getSample() {
        return sampleRepository.findAll().get(0);}
@GetMapping("/increment/sampleNo")
    public Boolean incrementSampleRef(){
        Sample sample = sampleRepository.findAll().get(0);
        sample.setSampleNo(sample.getSampleNo()+1);
        sampleRepository.save(sample);
        return true;
}
}