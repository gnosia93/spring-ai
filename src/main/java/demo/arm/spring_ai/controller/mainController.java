package demo.arm.spring_ai.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;


@RestController
public class mainController {

    @RequestMapping(value = "/start", method = RequestMethod.GET)
    public String start() throws UnknownHostException {
        String hostName = InetAddress.getLocalHost().getHostName();
        String hostAddress = InetAddress.getLocalHost().getHostAddress();

        return String.format("spring-ai-%s-%s", hostName, hostAddress);
    }
}
