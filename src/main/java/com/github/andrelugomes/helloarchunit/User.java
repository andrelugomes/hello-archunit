package com.github.andrelugomes.helloarchunit;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.mongodb.core.mapping.Field;

public class User {

    @JsonProperty("screen_name")
    @Field("screen_name")
    private String screenName;

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(final String screenName) {
        this.screenName = screenName;
    }
}
