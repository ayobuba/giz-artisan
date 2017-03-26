package com.infocell.giz.gizart.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infocell.giz.gizart.dao.AbstractDao;
import com.infocell.giz.gizart.dao.RoleDao;
import com.infocell.giz.gizart.model.Role;

@Repository
@Transactional
public class RoleDaoImpl extends AbstractDao<Integer, Role> implements RoleDao {

	@Override
	public void create(Role s) {

		persist(s);

	}

	@Override
	public Role get(int id) {
		// TODO Auto-generated method stub
		return getByKey(id);
	}

	@Override
	public Role getWithSid(String sid) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("roleName", sid));
		return (Role) criteria.uniqueResult();
	}

	@Override
	public List<Role> getList() {
		Criteria criteria = createEntityCriteria();
		return criteria.list();
	}

	@Override
	public void update(Role s) {
		update(s);

	}

	@Override
	public void delete(String id) {
		Role s = getWithSid(id);
		delete(s);
	}

}
