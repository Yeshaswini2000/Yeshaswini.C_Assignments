package com.valtech.spring.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.valtech.spring.boot.Repo.PublisherRepo;
import com.valtech.spring.boot.assignment.entity.Publisher;

@Service
@Transactional(propagation = Propagation.SUPPORTS)
public class PublisherImplService implements PublisherService {
	@Autowired
	private PublisherRepo publisherRepository;


	@Override

	@Transactional(propagation = Propagation.REQUIRED)
	public Publisher createPublisher(Publisher publisher) {
		return publisherRepository.save(publisher);
	}


	@Override

	@Transactional(propagation = Propagation.REQUIRED)
	public Publisher updatePublisher(Publisher publisher) {
		return publisherRepository.save(publisher);
	}


	@Override

	@Transactional(propagation = Propagation.REQUIRED)
	public Publisher getPublisher(int id) {
		return publisherRepository.getReferenceById(id);
	}


	@Override

	public List<Publisher> getAllPublishers() {
		return publisherRepository.findAll();
	}

}
