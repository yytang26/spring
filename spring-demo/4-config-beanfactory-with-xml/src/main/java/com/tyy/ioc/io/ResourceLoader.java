package com.tyy.ioc.io;

import java.net.URL;

/**
 * @author:tyy
 * @date:2021/8/28
 */
public class ResourceLoader {

    public Resource getResource(String location) {
        URL resource = this.getClass().getClassLoader().getResource(location);
        return new UrlResource(resource);
    }
}
