package com.zb.template.persistence.manager;

import com.zb.common.dao.BaseDao;
import com.zb.common.dao.helper.DaoHelper;
import com.zb.common.dao.manager.BaseManager;
import com.zb.template.persistence.bizdo.UserDO;
import com.zb.template.persistence.dao.UserDao;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by xulingming on 2017/1/11.
 */
@Component
public class UserManager extends BaseManager<UserDO> {

    @Resource
    UserDao userDao;

    @Override
    public BaseDao<UserDO> getDao() {
        return userDao;
    }

    public static  void main(String[] args) {
        DaoHelper.genXMLWithFeature("/Users/xulingming/zibang/zibang_projects/zb-dubbo-template/template-persistence/src/main/resources/sqlmap/tp-user-sqlmap.xml", UserDao.class, UserDO.class, "user", true);
    }
}
