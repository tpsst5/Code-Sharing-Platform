package platform;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class CodeSharingPlatformController {
    private CodeSnippet codeSnippet = new CodeSnippet();

    @GetMapping(value = "/code", produces = MediaType.TEXT_HTML_VALUE)
    public ResponseEntity<String> getCodeSnippetsWebInterface() {
        return new ResponseEntity<>(codeSnippet.getHtmlFormat(), HttpStatus.OK);
    }

    @GetMapping(value = "/api/code", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, String>> getCodeSnippetsApi() {
        return new ResponseEntity<>(codeSnippet.getJsonFormat(), HttpStatus.OK);
    }
}
