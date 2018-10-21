package com.liuke.controller;

import com.liuke.domain.ReturnModel;
import io.swagger.annotations.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/file")
@Api(tags = "文件服务")
public class FileController {
    @PostMapping("/upload")
    @ApiOperation("上传文件")
    @ResponseBody
    public Object upload(@ApiParam(value = "文件") MultipartFile multipartFile) {
        return ReturnModel.getInstance(0, "上传成功");
    }

    @GetMapping("/say")
    @ResponseBody
    public Object say() {
        return ReturnModel.getInstance(0, "上传成功");
    }
}
