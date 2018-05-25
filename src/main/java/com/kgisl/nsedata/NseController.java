package com.kgisl.nsedata;

import java.net.InetSocketAddress;

import java.net.Proxy;

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

    @GetMapping("/")

    public void get() {

        System.out.println("Begin /GET request!");

        SimpleClientHttpRequestFactory clientHttpRequestFactory = new SimpleClientHttpRequestFactory();

        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("10.100.1.124", 3128));

        clientHttpRequestFactory.setProxy(proxy);

        RestTemplate restTemplate = new RestTemplate();

        String response = restTemplate.getForObject(uri, String.class);

        System.out.println("==== RESTful API Response using Spring RESTTemplate START =======");

        System.out.println(response.toString());

        System.out.println("==== RESTful API Response using Spring RESTTemplate END =======");

    }

}
