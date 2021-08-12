package platform;

import java.util.HashMap;
import java.util.Map;

public class CodeSnippet {
    private Map<String, String> jsonFormat = new HashMap<>();
    private String htmlFormat;

    public CodeSnippet() {

        this.jsonFormat.put("code", "public static void main(String[] args) {SpringApplication.run(CodeSharingPlatform.class, args);}");

        this.htmlFormat = "<html><head><title>Code</title></head><body><pre>public static void main(String[] args) {SpringApplication.run(CodeSharingPlatform.class, args);}</pre></body></html>";
    }

    public Map<String, String> getJsonFormat() {
        return this.jsonFormat;
    }

    public String getHtmlFormat() {
        return this.htmlFormat;
    }
}
