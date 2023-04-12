/*
 * Codealpine
 * The codealpine API description
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.ClimbingQuestion;
import org.openapitools.client.model.ClimbingQuestionnaireAnalysis;
import org.openapitools.client.model.ClimbingQuestionnaireUser;

/**
 * ClimbingQuestionnaire
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-12T19:52:35.504818235+02:00[Europe/Paris]")
public class ClimbingQuestionnaire {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private BigDecimal id;

  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  private String slug;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ACCESS_REQUIRED = "accessRequired";
  @SerializedName(SERIALIZED_NAME_ACCESS_REQUIRED)
  private String accessRequired;

  public static final String SERIALIZED_NAME_CLIMBING_QUESTION = "climbingQuestion";
  @SerializedName(SERIALIZED_NAME_CLIMBING_QUESTION)
  private List<ClimbingQuestion> climbingQuestion = new ArrayList<ClimbingQuestion>();

  public static final String SERIALIZED_NAME_ANALYSIS = "analysis";
  @SerializedName(SERIALIZED_NAME_ANALYSIS)
  private List<ClimbingQuestionnaireAnalysis> analysis = new ArrayList<ClimbingQuestionnaireAnalysis>();

  public static final String SERIALIZED_NAME_USER_RESPONSES = "userResponses";
  @SerializedName(SERIALIZED_NAME_USER_RESPONSES)
  private List<ClimbingQuestionnaireUser> userResponses = new ArrayList<ClimbingQuestionnaireUser>();


  public ClimbingQuestionnaire id(BigDecimal id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getId() {
    return id;
  }


  public void setId(BigDecimal id) {
    this.id = id;
  }


  public ClimbingQuestionnaire slug(String slug) {
    
    this.slug = slug;
    return this;
  }

   /**
   * Get slug
   * @return slug
  **/
  @ApiModelProperty(required = true, value = "")

  public String getSlug() {
    return slug;
  }


  public void setSlug(String slug) {
    this.slug = slug;
  }


  public ClimbingQuestionnaire title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(required = true, value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public ClimbingQuestionnaire description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(required = true, value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ClimbingQuestionnaire accessRequired(String accessRequired) {
    
    this.accessRequired = accessRequired;
    return this;
  }

   /**
   * Get accessRequired
   * @return accessRequired
  **/
  @ApiModelProperty(required = true, value = "")

  public String getAccessRequired() {
    return accessRequired;
  }


  public void setAccessRequired(String accessRequired) {
    this.accessRequired = accessRequired;
  }


  public ClimbingQuestionnaire climbingQuestion(List<ClimbingQuestion> climbingQuestion) {
    
    this.climbingQuestion = climbingQuestion;
    return this;
  }

  public ClimbingQuestionnaire addClimbingQuestionItem(ClimbingQuestion climbingQuestionItem) {
    this.climbingQuestion.add(climbingQuestionItem);
    return this;
  }

   /**
   * Get climbingQuestion
   * @return climbingQuestion
  **/
  @ApiModelProperty(required = true, value = "")

  public List<ClimbingQuestion> getClimbingQuestion() {
    return climbingQuestion;
  }


  public void setClimbingQuestion(List<ClimbingQuestion> climbingQuestion) {
    this.climbingQuestion = climbingQuestion;
  }


  public ClimbingQuestionnaire analysis(List<ClimbingQuestionnaireAnalysis> analysis) {
    
    this.analysis = analysis;
    return this;
  }

  public ClimbingQuestionnaire addAnalysisItem(ClimbingQuestionnaireAnalysis analysisItem) {
    this.analysis.add(analysisItem);
    return this;
  }

   /**
   * Get analysis
   * @return analysis
  **/
  @ApiModelProperty(required = true, value = "")

  public List<ClimbingQuestionnaireAnalysis> getAnalysis() {
    return analysis;
  }


  public void setAnalysis(List<ClimbingQuestionnaireAnalysis> analysis) {
    this.analysis = analysis;
  }


  public ClimbingQuestionnaire userResponses(List<ClimbingQuestionnaireUser> userResponses) {
    
    this.userResponses = userResponses;
    return this;
  }

  public ClimbingQuestionnaire addUserResponsesItem(ClimbingQuestionnaireUser userResponsesItem) {
    this.userResponses.add(userResponsesItem);
    return this;
  }

   /**
   * Get userResponses
   * @return userResponses
  **/
  @ApiModelProperty(required = true, value = "")

  public List<ClimbingQuestionnaireUser> getUserResponses() {
    return userResponses;
  }


  public void setUserResponses(List<ClimbingQuestionnaireUser> userResponses) {
    this.userResponses = userResponses;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClimbingQuestionnaire climbingQuestionnaire = (ClimbingQuestionnaire) o;
    return Objects.equals(this.id, climbingQuestionnaire.id) &&
        Objects.equals(this.slug, climbingQuestionnaire.slug) &&
        Objects.equals(this.title, climbingQuestionnaire.title) &&
        Objects.equals(this.description, climbingQuestionnaire.description) &&
        Objects.equals(this.accessRequired, climbingQuestionnaire.accessRequired) &&
        Objects.equals(this.climbingQuestion, climbingQuestionnaire.climbingQuestion) &&
        Objects.equals(this.analysis, climbingQuestionnaire.analysis) &&
        Objects.equals(this.userResponses, climbingQuestionnaire.userResponses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, slug, title, description, accessRequired, climbingQuestion, analysis, userResponses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClimbingQuestionnaire {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    accessRequired: ").append(toIndentedString(accessRequired)).append("\n");
    sb.append("    climbingQuestion: ").append(toIndentedString(climbingQuestion)).append("\n");
    sb.append("    analysis: ").append(toIndentedString(analysis)).append("\n");
    sb.append("    userResponses: ").append(toIndentedString(userResponses)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
