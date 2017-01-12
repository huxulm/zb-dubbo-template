package com.zb.template.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by xulingming on 2017/1/10.
 */
public class StartTemplateMain {

    private static final Logger LOGGER = LoggerFactory.getLogger(StartTemplateMain.class);

    public static void main(String[] args) {
        try {
            com.alibaba.dubbo.container.Main.main(args);
        } catch (RuntimeException e) {
            LOGGER.info("Discover start has e:{}", e.getMessage());
            System.exit(1);
        }
    }
}
