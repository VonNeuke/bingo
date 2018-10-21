package com.liuke.interceptor;

import com.alibaba.fastjson.JSON;
import com.liuke.domain.ReturnModel;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.apache.tomcat.util.http.fileupload.servlet.ServletRequestContext;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@Component
public class ParamCheckInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("自定义拦截器。。。。。。。。。");
        if (request != null && ServletFileUpload.isMultipartContent(request)) {
            ServletRequestContext ctx = new ServletRequestContext(request);
            //获取上传文件尺寸大小
            long requestSize = ctx.contentLength();
            if (requestSize > 10) {
                response.setHeader("Content-Type", "application/json;charset=UTF-8");
                PrintWriter out = response.getWriter();
                out.write(JSON.toJSONString(ReturnModel.getInstance(0, "file is too large")));
                out.flush();
                return false;
            }
        }
        return true;
    }
}
