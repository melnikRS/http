package ru.melnik;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Post(String id, String text, String type, String user, Integer upvotes) {
    public Post(@JsonProperty("id") String id,
                @JsonProperty("text") String text,
                @JsonProperty("type") String type,
                @JsonProperty("user") String user,
                @JsonProperty("upvotes") Integer upvotes) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }
}
