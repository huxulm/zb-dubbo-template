package com.zb.template.persistence.bizdo;

import com.zb.common.dao.domain.BaseDO;

/**
 * Created by xulingming on 2017/1/11.
 */
public class UserDO extends BaseDO {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserDO{" +
                "id='" + getId() + "," + '\'' +
                "name='" + name + '\'' +
                '}';
    }
}
