package com.valtech.spring.boot.RestControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.valtech.spring.boot.assignment.entity.Publisher;
import com.valtech.spring.boot.service.PublisherService;


@RestController
public class PublisherRestController {
	@Autowired
	private PublisherService publisherService;
	
	@PutMapping("/api/publishers/{id}")
	public Publisher updatePublisher(@PathVariable("id") int id,@RequestBody Publisher publisher){
		return publisherService.updatePublisher(publisher);
		
	}
	
	@PostMapping("/api/publishers")
	public Publisher createPublisher(@RequestBody Publisher publisher){
		return publisherService.createPublisher(publisher);
	}

	
	@GetMapping("api/publishers")
	public List<Publisher>getPublishers(){
		return publisherService.getAllPublishers();
	}
	
	@GetMapping("/api/publishers/{id}")
	public Publisher getPublisher(@PathVariable("id") int id){
		return publisherService.getPublisher(id);
		
	}

}
