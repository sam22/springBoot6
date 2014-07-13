
package com.rest.example.domain.sports.teams;

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
    "sports",
    "resultsOffset",
    "resultsLimit",
    "resultsCount",
    "timestamp",
    "status"
})
public class SportsTeams {

    @JsonProperty("sports")
    private List<Sport> sports = new ArrayList<Sport>();
    @JsonProperty("resultsOffset")
    private String resultsOffset;
    @JsonProperty("resultsLimit")
    private String resultsLimit;
    @JsonProperty("resultsCount")
    private String resultsCount;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("status")
    private String status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sports")
    public List<Sport> getSports() {
        return sports;
    }

    @JsonProperty("sports")
    public void setSports(List<Sport> sports) {
        this.sports = sports;
    }

    @JsonProperty("resultsOffset")
    public String getResultsOffset() {
        return resultsOffset;
    }

    @JsonProperty("resultsOffset")
    public void setResultsOffset(String resultsOffset) {
        this.resultsOffset = resultsOffset;
    }

    @JsonProperty("resultsLimit")
    public String getResultsLimit() {
        return resultsLimit;
    }

    @JsonProperty("resultsLimit")
    public void setResultsLimit(String resultsLimit) {
        this.resultsLimit = resultsLimit;
    }

    @JsonProperty("resultsCount")
    public String getResultsCount() {
        return resultsCount;
    }

    @JsonProperty("resultsCount")
    public void setResultsCount(String resultsCount) {
        this.resultsCount = resultsCount;
    }

    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
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
