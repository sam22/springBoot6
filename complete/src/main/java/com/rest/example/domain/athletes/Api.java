
package com.rest.example.domain.athletes;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "athletes",
    "news",
    "notes"
})
public class Api {

    @JsonProperty("athletes")
    private Athletes_ athletes;
    @JsonProperty("news")
    private News news;
    @JsonProperty("notes")
    private Notes notes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("athletes")
    public Athletes_ getAthletes() {
        return athletes;
    }

    @JsonProperty("athletes")
    public void setAthletes(Athletes_ athletes) {
        this.athletes = athletes;
    }

    @JsonProperty("news")
    public News getNews() {
        return news;
    }

    @JsonProperty("news")
    public void setNews(News news) {
        this.news = news;
    }

    @JsonProperty("notes")
    public Notes getNotes() {
        return notes;
    }

    @JsonProperty("notes")
    public void setNotes(Notes notes) {
        this.notes = notes;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
