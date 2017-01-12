package com.zb.template.persistence.test.manager;

import com.zb.template.persistence.bizdo.UserDO;
import com.zb.template.persistence.manager.UserManager;
import com.zb.template.persistence.test.BaseTest;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * Created by xulingming on 2017/1/11.
 */
public class UserManagerTest extends BaseTest {

    @Resource
    UserManager userManager;

    @Test
    public void testInsert() throws Exception{
//        Assert.assertNotNull(userManager);

        UserDO nwUserDO = new UserDO();
        nwUserDO.setName("jackdon");

        userManager.insert(nwUserDO);

        System.out.println(nwUserDO);
    }
}
