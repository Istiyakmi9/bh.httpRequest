package in.bottomhalf.httpRequest.contract;

import in.bottomhalf.httpRequest.model.ApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

@FeignClient(name = "fileConverterService", url = "http://localhost:5160/api/")
public interface IHttpServiceRequest {
    @GetMapping(value = "b_files/file_detail")
    String get();

    @PostMapping(value = "b_files/read_image", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    String upload(@RequestPart("file") MultipartFile file);

    @PostMapping(value = "File/saveFile", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    ApiResponse uploadFile(
            @RequestPart("files") MultipartFile[] files,
            @RequestPart("data") String data
    );
   /*
    @RequestMapping(method = RequestMethod.PUT, value = "")
    String put(@RequestHeader("Authorization") String token, @RequestParam("url") String url, @RequestBody Map<String, Object> requestBody);

    @RequestMapping(method = RequestMethod.DELETE, value = "")
    void delete(@RequestHeader("Authorization") String token, @RequestParam("url") String url);*/
}
