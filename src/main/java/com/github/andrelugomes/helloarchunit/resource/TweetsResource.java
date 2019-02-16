package com.github.andrelugomes.helloarchunit.resource;

import javax.validation.Valid;

import com.github.andrelugomes.helloarchunit.model.Tweet;
import com.github.andrelugomes.helloarchunit.repository.TweetsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tweets")
class TweetsResource {

    @Autowired
    private TweetsRepository repository;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    Tweet save(@Valid @RequestBody Tweet tweet) {
        return repository.save(tweet);
    }


}

