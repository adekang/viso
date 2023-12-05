package com.example.viso.controller;


import com.example.viso.service.ex.SelectException;
import com.example.viso.service.ex.ServiceException;
import com.example.viso.util.JsonResult;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class BaseController {
    //操作成功码
    public static final Integer OK = 200;

    //请求处理方法，返回传递给前端的数据
    @ExceptionHandler({ServiceException.class, FileUploadException.class})//用于统一处理抛出异常
    public JsonResult<Void> handleException(Throwable e) {
        JsonResult<Void> result = new JsonResult<>(e);
        if (e instanceof SelectException) {
            result.setState(400);
        }
        return result;
    }
}