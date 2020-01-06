package com.finest.app.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * 加载yaml配置文件的方法
 * spring-boot更新到1.5.2版本后locations属性无法使用
 * @PropertySource注解只可以加载proprties文件,无法加载yaml文件
 * 故现在把数据放到application.yml文件中,spring-boot启动时会加载
 */
@Component
@ConfigurationProperties(prefix="params")
public class ParamsConfig {
    private String uploadPath;
    private String outSiteHost;
    private List<String> uploadList;
    private Map<String,String> specialMap;
    private String imageFormat;
    private Count count;

    public String getUploadPath() {
        return uploadPath;
    }

    public void setUploadPath(String uploadPath) {
        this.uploadPath = uploadPath;
    }

    public String getOutSiteHost() {
        return outSiteHost;
    }

    public void setOutSiteHost(String outSiteHost) {
        this.outSiteHost = outSiteHost;
    }

    public List<String> getUploadList() {
        return uploadList;
    }

    public void setUploadList(List<String> uploadList) {
        this.uploadList = uploadList;
    }

    public String getImageFormat() {
        return imageFormat;
    }

    public void setImageFormat(String imageFormat) {
        this.imageFormat = imageFormat;
    }

    public Map<String, String> getSpecialMap() {
        return specialMap;
    }

    public void setSpecialMap(Map<String, String> specialMap) {
        this.specialMap = specialMap;
    }

    public Count getCount() {
        return count;
    }

    public void setCount(Count count) {
        this.count = count;
    }
}