package com.julongsoft.measure.db;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.julongsoft.measure.db.entity.User;
import com.julongsoft.measure.entity.DbSegments;
import com.julongsoft.measure.entity.DbUser;
import com.julongsoft.measure.entity.DbUserName;

import com.julongsoft.measure.db.UserDao;
import com.julongsoft.measure.db.DbSegmentsDao;
import com.julongsoft.measure.db.DbUserDao;
import com.julongsoft.measure.db.DbUserNameDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig userDaoConfig;
    private final DaoConfig dbSegmentsDaoConfig;
    private final DaoConfig dbUserDaoConfig;
    private final DaoConfig dbUserNameDaoConfig;

    private final UserDao userDao;
    private final DbSegmentsDao dbSegmentsDao;
    private final DbUserDao dbUserDao;
    private final DbUserNameDao dbUserNameDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        userDaoConfig = daoConfigMap.get(UserDao.class).clone();
        userDaoConfig.initIdentityScope(type);

        dbSegmentsDaoConfig = daoConfigMap.get(DbSegmentsDao.class).clone();
        dbSegmentsDaoConfig.initIdentityScope(type);

        dbUserDaoConfig = daoConfigMap.get(DbUserDao.class).clone();
        dbUserDaoConfig.initIdentityScope(type);

        dbUserNameDaoConfig = daoConfigMap.get(DbUserNameDao.class).clone();
        dbUserNameDaoConfig.initIdentityScope(type);

        userDao = new UserDao(userDaoConfig, this);
        dbSegmentsDao = new DbSegmentsDao(dbSegmentsDaoConfig, this);
        dbUserDao = new DbUserDao(dbUserDaoConfig, this);
        dbUserNameDao = new DbUserNameDao(dbUserNameDaoConfig, this);

        registerDao(User.class, userDao);
        registerDao(DbSegments.class, dbSegmentsDao);
        registerDao(DbUser.class, dbUserDao);
        registerDao(DbUserName.class, dbUserNameDao);
    }
    
    public void clear() {
        userDaoConfig.clearIdentityScope();
        dbSegmentsDaoConfig.clearIdentityScope();
        dbUserDaoConfig.clearIdentityScope();
        dbUserNameDaoConfig.clearIdentityScope();
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public DbSegmentsDao getDbSegmentsDao() {
        return dbSegmentsDao;
    }

    public DbUserDao getDbUserDao() {
        return dbUserDao;
    }

    public DbUserNameDao getDbUserNameDao() {
        return dbUserNameDao;
    }

}
