package com.kgisl.nsedata;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/nsedata")

public class NseController {

    final String uri = "https://www.nseindia.com/live_market/dynaContent/live_watch/stock_watch/niftyStockWatch.json";
    RestTemplate restTemplate;
    List<Object> objects;// = new List<Object>();
    // @GetMapping("/")

    @RequestMapping(value="/", method=RequestMethod.GET)
    public @ResponseBody String get() {
        // List<Object> objects; //= new List<Object>();
        System.out.println("Begin /GET request!");

        final RestTemplate restTemplate = new RestTemplate();
final String response = restTemplate.getForObject(uri, String.class);

return response;
        // SimpleClientHttpRequestFactory clientHttpRequestFactory = new SimpleClientHttpRequestFactory();
        // Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("10.100.1.124", 3128));
        // clientHttpRequestFactory.setProxy(proxy);
        // RestTemplate restTemplate = new RestTemplate();
        // String response = restTemplate.getForObject(uri, String.class);

//         ResponseEntity<Object[]> responseEntity = restTemplate.getForEntity(uri, Object[].class);
// Object[] objects = responseEntity.getBody();
// MediaType contentType = responseEntity.getHeaders().getContentType();
// HttpStatus statusCode = responseEntity.getStatusCode();
// return objects;


        // System.out.println("==== RESTful API Response using Spring RESTTemplate START =======");
        // System.out.println(response.toString());
        // System.out.println("==== RESTful API Response using Spring RESTTemplate END =======");
    }

}
