package com.tyy.aop.beans.io;

import cpm.tyy.aop.beans.io.Resource;
import cpm.tyy.aop.beans.io.ResourceLoader;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;


public class ResourceLoaderTest {

	@Test
	public void test() throws IOException {
		ResourceLoader resourceLoader = new ResourceLoader();
        Resource resource = resourceLoader.getResource("tinyioc.xml");
        InputStream inputStream = resource.getInputStream();
        Assert.assertNotNull(inputStream);
    }
}
