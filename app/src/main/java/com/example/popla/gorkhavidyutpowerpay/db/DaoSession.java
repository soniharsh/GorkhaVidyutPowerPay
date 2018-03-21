package com.example.popla.gorkhavidyutpowerpay.db;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.example.popla.gorkhavidyutpowerpay.db.User;
import com.example.popla.gorkhavidyutpowerpay.db.Employee;
import com.example.popla.gorkhavidyutpowerpay.db.Register;

import com.example.popla.gorkhavidyutpowerpay.db.UserDao;
import com.example.popla.gorkhavidyutpowerpay.db.EmployeeDao;
import com.example.popla.gorkhavidyutpowerpay.db.RegisterDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig userDaoConfig;
    private final DaoConfig employeeDaoConfig;
    private final DaoConfig registerDaoConfig;

    private final UserDao userDao;
    private final EmployeeDao employeeDao;
    private final RegisterDao registerDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        userDaoConfig = daoConfigMap.get(UserDao.class).clone();
        userDaoConfig.initIdentityScope(type);

        employeeDaoConfig = daoConfigMap.get(EmployeeDao.class).clone();
        employeeDaoConfig.initIdentityScope(type);

        registerDaoConfig = daoConfigMap.get(RegisterDao.class).clone();
        registerDaoConfig.initIdentityScope(type);

        userDao = new UserDao(userDaoConfig, this);
        employeeDao = new EmployeeDao(employeeDaoConfig, this);
        registerDao = new RegisterDao(registerDaoConfig, this);

        registerDao(User.class, userDao);
        registerDao(Employee.class, employeeDao);
        registerDao(Register.class, registerDao);
    }
    
    public void clear() {
        userDaoConfig.clearIdentityScope();
        employeeDaoConfig.clearIdentityScope();
        registerDaoConfig.clearIdentityScope();
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public EmployeeDao getEmployeeDao() {
        return employeeDao;
    }

    public RegisterDao getRegisterDao() {
        return registerDao;
    }

}
