package com.valtech.spring.boot.service;

import java.util.List;



import com.valtech.spring.boot.assignment.entity.Publisher;

public interface PublisherService {

	Publisher createPublisher(Publisher publisher);

	Publisher updatePublisher(Publisher publisher);

	Publisher getPublisher(int id);

	List<Publisher> getAllPublishers();

}