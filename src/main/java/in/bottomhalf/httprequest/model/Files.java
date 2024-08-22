package in.bottomhalf.httprequest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Files {
    @JsonProperty(value = "FileName")
    String fileName;
    @JsonProperty(value = "FilePath")
    String filePath;
    @JsonProperty(value = "FileExtension")
    String fileExtension;
}
