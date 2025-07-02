package org.example.commande.util;

import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class RestClient<T> {
    private final RestTemplate template;
    private final HttpHeaders headers;
    private final String urlApi;

    public RestClient(RestTemplate template, HttpHeaders headers, String urlApi) {
        this.template = new RestTemplate();
        this.urlApi = urlApi;
        this.headers = new HttpHeaders();
    }

    public T get(Class<T> responseType){
        HttpEntity<String> requestEntity = new HttpEntity<>("",headers);
        ResponseEntity<T> response = template.exchange(urlApi, HttpMethod.GET,requestEntity,responseType);
        if(response.hasBody()){
            return response.getBody();
        }
        return null;
    }
}
