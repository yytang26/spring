package com.tyy.ioc.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author:tyy
 * @date:2021/8/28
 */
public interface Resource {

    InputStream getInputStream() throws IOException;
}
