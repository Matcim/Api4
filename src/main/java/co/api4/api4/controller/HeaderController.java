package co.api4.api4.controller;


import co.api4.api4.entites.Headers;
import co.api4.api4.servicesImpl.HeaderSeriviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.InetSocketAddress;

@RestController
@RequestMapping
public class HeaderController {

    @Autowired
    private HeaderSeriviceImpl serivice;

    @GetMapping("/headers")
    public String host(@RequestHeader("headers") Headers headers){
       return serivice.HttpRequest(headers);
    }
       //todo: entrambi i metodi vanno bene
    @GetMapping("/getBaseUrl")
    public ResponseEntity<String> getBaseUrl(@RequestHeader HttpHeaders headers) {
        InetSocketAddress host = headers.getHost();
        String url = "http://" + host.getHostName() + ":" + host.getPort();
        return new ResponseEntity(String.format("Base URL = %s", url), HttpStatus.OK);
    }

}
