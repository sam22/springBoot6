
package com.rest.example.domain.athletes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "name",
    "abbreviation",
    "id",
    "uid",
    "groupId",
    "shortName",
    "athletes"
})
public class League {

    @JsonProperty("name")
    private String name;
    @JsonProperty("abbreviation")
    private String abbreviation;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("uid")
    private String uid;
    @JsonProperty("groupId")
    private Integer groupId;
    @JsonProperty("shortName")
    private String shortName;
    @JsonProperty("athletes")
    private List<Athlete> athletes = new ArrayList<Athlete>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("abbreviation")
    public String getAbbreviation() {
        return abbreviation;
    }

    @JsonProperty("abbreviation")
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("uid")
    public String getUid() {
        return uid;
    }

    @JsonProperty("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    @JsonProperty("groupId")
    public Integer getGroupId() {
        return groupId;
    }

    @JsonProperty("groupId")
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    @JsonProperty("shortName")
    public String getShortName() {
        return shortName;
    }

    @JsonProperty("shortName")
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @JsonProperty("athletes")
    public List<Athlete> getAthletes() {
        return athletes;
    }

    @JsonProperty("athletes")
    public void setAthletes(List<Athlete> athletes) {
        this.athletes = athletes;
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
