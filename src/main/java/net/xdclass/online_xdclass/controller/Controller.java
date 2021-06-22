package net.xdclass.online_xdclass.controller;

import net.xdclass.online_xdclass.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/video")
public class Controller {

    @Autowired
    private VideoService videoService;

    @RequestMapping("list_video")
    public Object listVideo() {
        return videoService.listVideo();
    }
}
