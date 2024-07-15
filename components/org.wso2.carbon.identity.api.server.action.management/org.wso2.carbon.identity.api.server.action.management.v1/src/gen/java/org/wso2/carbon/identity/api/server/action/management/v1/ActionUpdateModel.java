/*
 * Copyright (c) 2024, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.api.server.action.management.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;
import javax.validation.Valid;
import javax.xml.bind.annotation.*;

public class ActionUpdateModel  {
  
    private String name;
    private String description;
    private String endpointUri;

    /**
    **/
    public ActionUpdateModel name(String name) {

        this.name = name;
        return this;
    }
    
    @ApiModelProperty(example = "Access Token Pre Issue", value = "")
    @JsonProperty("name")
    @Valid
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    /**
    **/
    public ActionUpdateModel description(String description) {

        this.description = description;
        return this;
    }
    
    @ApiModelProperty(example = "This is the configuration of pre-action for issuing access token.", value = "")
    @JsonProperty("description")
    @Valid
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    /**
    **/
    public ActionUpdateModel endpointUri(String endpointUri) {

        this.endpointUri = endpointUri;
        return this;
    }
    
    @ApiModelProperty(example = "https://abcd.com/token", value = "")
    @JsonProperty("endpointUri")
    @Valid
    public String getEndpointUri() {
        return endpointUri;
    }
    public void setEndpointUri(String endpointUri) {
        this.endpointUri = endpointUri;
    }



    @Override
    public boolean equals(java.lang.Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionUpdateModel actionUpdateModel = (ActionUpdateModel) o;
        return Objects.equals(this.name, actionUpdateModel.name) &&
            Objects.equals(this.description, actionUpdateModel.description) &&
            Objects.equals(this.endpointUri, actionUpdateModel.endpointUri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, endpointUri);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class ActionUpdateModel {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    endpointUri: ").append(toIndentedString(endpointUri)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
    * Convert the given object to string with each line indented by 4 spaces
    * (except the first line).
    */
    private String toIndentedString(java.lang.Object o) {

        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n");
    }
}

