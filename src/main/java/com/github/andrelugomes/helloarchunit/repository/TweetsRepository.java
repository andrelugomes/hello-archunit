package com.github.andrelugomes.helloarchunit.repository;

import com.github.andrelugomes.helloarchunit.model.Tweet;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface TweetsRepository extends MongoRepository<Tweet, Long> {

}