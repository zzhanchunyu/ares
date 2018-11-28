package com.god.ares.service;

import com.god.ares.dao.UserDao;
import com.god.ares.model.User;
import com.god.ares.rpc.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Resource
    private UserDao userDao;

    @Override
    public User selectByPrimaryKey(Integer id) {
        logger.info("call method selectByPrimaryKey!!!!!!!!!!!");
        return userDao.selectByPrimaryKey(id);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userDao.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(User user) {
        return userDao.insertSelective(user);
    }

    @Override
    public int updateByPrimaryKeySelective(User user) {
        return userDao.updateByPrimaryKeySelective(user);
    }

    @Override
    public Long selectObjectListPageTotal(User user) {
        return userDao.selectObjectListPageTotal(user);
    }

    @Override
    public List<User> selectObjectListPage(User user) {
        return userDao.selectObjectListPage(user);
    }

    @Override
    public List<User> selectByObjectList(User user) {
        return userDao.selectByObjectList(user);
    }

}
