package com.infocell.giz.gizart.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infocell.giz.gizart.dao.AbstractDao;
import com.infocell.giz.gizart.dao.AdminDao;
import com.infocell.giz.gizart.model.Admin;

@Repository
@Transactional
public class AdminDaoImpl extends AbstractDao<Integer, Admin> implements AdminDao {

	@Override
	public void create(Admin s) {
		persist(s);

	}

	@Override
	public Admin get(int id) {
		return getByKey(id);
	}

	@Override
	public Admin getWithSid(String sid) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("sid", sid));
		return (Admin) criteria.uniqueResult();
	}

	@Override
	public List<Admin> getList() {
		Criteria criteria = createEntityCriteria();

		return criteria.list();
	}

	@Override
	public void update(Admin s) {

		Admin a = get(s.getAdminId());
		if (a != null) {
			System.out.println("inside update dao");
			a.setBioData(s.getBioData());

		}

	}

	@Override
	public void delete(int id) {
		Admin s = get(id);
		delete(s);

	}

}
