package com.screensaver.screensaver.api;

import com.screensaver.screensaver.screensaver.ScreenSaver;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/screensaver")
@Api(value = "screensaver", tags = "screensaver")
@AllArgsConstructor
public class ScreenshotApi {

    private final ScreenSaver screenSaver;

    @PostMapping
    @ApiOperation("Prendre une jolie photo")
    public void takeScreenshot() {
        screenSaver.takeScreenshot();
    }


}
