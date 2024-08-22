package in.bottomhalf.httprequest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.http.HttpStatus;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse {
    @JsonProperty("AuthenticationToken")
    public String authenticationToken;
    @JsonProperty("ResponseBody")
    public Object responseBody;
    @JsonProperty("HttpStatusCode")
    public int httpStatusCode;
    @JsonProperty("HttpStatusMessage")
    public String httpStatusMessage;

    public static ApiResponse Ok(Object data) {
        ApiResponse response = new ApiResponse();
        response.setResponseBody(data);
        response.setHttpStatusCode(HttpStatus.OK.value());
        response.setHttpStatusMessage("successfull");
        return response;
    }

    public static ApiResponse Ok(Object data, String token) {
        ApiResponse response = new ApiResponse();
        response.setResponseBody(data);
        response.setHttpStatusMessage("successfull");
        response.setAuthenticationToken(token);
        response.setHttpStatusCode(HttpStatus.OK.value());
        return response;
    }

    public static ApiResponse BadRequest(Object data) {
        ApiResponse response = new ApiResponse();
        response.setResponseBody(data);
        response.setHttpStatusCode(HttpStatus.BAD_REQUEST.value());
        response.setHttpStatusMessage("error");
        return response;
    }
}
