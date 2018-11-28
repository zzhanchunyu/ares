package com.god.ares.dao;

import com.god.ares.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

	User selectByPrimaryKey(Integer id);

	int deleteByPrimaryKey(Integer id);

	int insertSelective(User user);

	int updateByPrimaryKeySelective(User user);

	Long selectObjectListPageTotal(User user);

	List<User> selectObjectListPage(User user);

	List<User> selectByObjectList(User user);

}
