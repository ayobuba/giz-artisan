package com.infocell.giz.gizart.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infocell.giz.gizart.dao.AbstractDao;
import com.infocell.giz.gizart.dao.OrganizationDao;
import com.infocell.giz.gizart.model.Organization;

@Repository
@Transactional
public class OrganizationDaoImpl extends AbstractDao<Integer, Organization> implements OrganizationDao {

	@Override
	public void update(Organization s) {
		update(s);
	}

	@Override
	public void create(Organization s) {
		persist(s);

	}

	@Override
	public Organization get(int id) {
		// TODO Auto-generated method stub
		return getByKey(id);
	}

	@Override
	public Organization getWithSid(String sid) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("sid", sid));
		return (Organization) criteria.uniqueResult();
	}

	@Override
	public List<Organization> getList() {
		Criteria criteria = createEntityCriteria();
		return criteria.list();
	}

	@Override
	public void delete(int id) {
		Organization s = get(id);
		delete(s);
	}

}
