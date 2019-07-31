package com.qianfeng.springboot;

import com.google.gson.Gson;
import com.qianfeng.springboot.common.Quartz;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import sun.net.www.protocol.http.HttpURLConnection;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.text.SimpleDateFormat;

/**
 * @author qiujinyao
 * @version 1.0
 * @Date 2019/7/30
 */
@Component
@Configuration
@EnableScheduling
public class quartz {
    //添加定时任务
    @Scheduled(cron = "0 * * * * ?")
    @Scheduled(fixedRate = 5000)
    private void configureTasks() throws IOException {
/*        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String request="http://localhost:8080/actuator/health";
        URL url=new URL(request);
        HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
        urlConnection.setRequestMethod("GET");
        urlConnection.setDoOutput(true);
        urlConnection.setDoInput(true);
        InputStream inputStream = urlConnection.getInputStream();
        byte[] b = new byte[1024];
        int len = 0;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while ((len = inputStream.read(b)) != -1) {
            byteArrayOutputStream.write(b, 0, len);
        }
        String json = new String(byteArrayOutputStream.toByteArray());
        System.out.println(json);
        Gson gson=new Gson();
        Quartz quartz = gson.fromJson(json, Quartz.class);
        System.out.println(quartz);
        if(quartz.getStatus().equals("UP")){
            System.out.println(sdf.format(System.currentTimeMillis())+"当前程序运行正常....");
        }else {
            System.out.println(sdf.format(System.currentTimeMillis())+"程序中断...");
        }*/

    }
}
