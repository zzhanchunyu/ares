package com.god.ares.rpc;

import com.god.ares.model.User;

import java.util.List;


public interface UserService {

    User selectByPrimaryKey(Integer id);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(User user);

    int updateByPrimaryKeySelective(User user);

    Long selectObjectListPageTotal(User user);

    List<User> selectObjectListPage(User user);

    List<User> selectByObjectList(User user);

}
