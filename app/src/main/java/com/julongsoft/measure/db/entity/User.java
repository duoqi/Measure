package com.julongsoft.measure.db.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by duoqi.tao on 2017/7/11.
 */

@Entity
public class User {

    private String id;

    @Generated(hash = 197773214)
    public User(String id) {
        this.id = id;
    }

    @Generated(hash = 586692638)
    public User() {
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
