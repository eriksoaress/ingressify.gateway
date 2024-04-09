package jogayjoga.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Api;

@RestController
@Api(tags = "Gateway", description = "Endpoints relacionados ao gateway")
public class GatewayResource {

    @GetMapping("/hello")
    @ApiOperation(value = "hello mundo")
    public String hello() {
        return "Hello from Gateway!";
    }

}