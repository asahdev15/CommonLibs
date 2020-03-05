package utils;


import org.springframework.web.client.RestTemplate;

import java.net.URI;

public class RestUtils {

    public static Object get(String url, Class objectClass){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, objectClass);
    }

    public static URI post(String url, Class objectClass, Object item) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForLocation(url, item, objectClass);
    }

    public static void update(String url, Class objectClass, Object item) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(url, item);
    }

    public static void delete(String url) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(url);
    }
}
