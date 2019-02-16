package com.github.andrelugomes.helloarchunit.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.andrelugomes.helloarchunit.User;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Document(collection = "tweets")
public class Tweet {

    @Id
    private String id;

    @Indexed(unique = true)
    @JsonProperty("id_str")
    @Field("id_str")
    private String idStr;

    @NotBlank
    @Size(max = 140)
    private String text;

    @NotNull
    @JsonProperty("created_at")
    @Field("created_at")
    private String createdAt;

    private User user;

    public Tweet() {

    }

    public Tweet(String text) {
        this.id = id;
        this.text = text;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getIdStr() {
        return idStr;
    }

    public void setIdStr(final String idStr) {
        this.idStr = idStr;
    }

    public User getUser() {
        return user;
    }

    public void setUser(final User user) {
        this.user = user;
    }
}

