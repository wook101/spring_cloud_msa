package com.elevenst.api;

import com.elevenst.service.ProductRemoteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/displays")
public class DisplayController {

    //@Autowired
    //private ProductRemoteService productRemoteService;

    //생성자 방식으로 주입을 선호
    private final ProductRemoteService productRemoteService;

    public DisplayController(ProductRemoteService productRemoteService) {
        this.productRemoteService = productRemoteService;
    }

    @GetMapping(path = "/{displayId}")
    public String getDisplayDetail(@PathVariable String displayId) {
        String productInfo = productRemoteService.getProductInfo("22222");
        return String.format("[display id = %s at %s product: %s ]", displayId, System.currentTimeMillis(), productInfo);
    }
}