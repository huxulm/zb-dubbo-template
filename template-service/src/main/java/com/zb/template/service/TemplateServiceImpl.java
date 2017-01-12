package com.zb.template.service;

import com.zb.template.api.TemplateService;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * Created by xulingming on 2017/1/10.
 */
@Component("templateService")
public class TemplateServiceImpl implements TemplateService {

    @Override
    public String sayHelloTo(String name) throws Exception {
        return "Hello " + (StringUtils.isEmpty(name) ? " " : name);
    }
}
