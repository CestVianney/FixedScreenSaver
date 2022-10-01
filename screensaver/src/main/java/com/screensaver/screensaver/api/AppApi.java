package com.screensaver.screensaver.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/app")
@Api(value = "app", tags = "app")
@AllArgsConstructor
public class AppApi {

    @PostMapping
    @ApiOperation("Quitter l'application")
    public void takeScreenshot() {
        System.exit(0);
    }

}
