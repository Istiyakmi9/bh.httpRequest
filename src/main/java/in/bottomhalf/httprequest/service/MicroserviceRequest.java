package in.bottomhalf.httprequest.service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MicroserviceRequest {
    String url;
    String payload;
    String token;
    String companyCode;
    MultipartFile[] fileCollections;
    DbConfigModal database;
    String connectionString;
}
