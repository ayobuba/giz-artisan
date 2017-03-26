package com.infocell.giz.gizart.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infocell.giz.gizart.dao.AbstractDao;
import com.infocell.giz.gizart.dao.AddressDao;
import com.infocell.giz.gizart.model.Address;

@Repository
@Transactional
public class AddressDaoImpl extends AbstractDao<Integer, Address> implements AddressDao {

	public void create(Address s) {
		persist(s);

	}

	public Address get(int id) {
		// TODO Auto-generated method stub
		return getByKey(id);
	}

	public Address getWithSid(String sid) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("sid", sid));
		return (Address) criteria.uniqueResult();
	}

	public List<Address> getList() {
		Criteria criteria = createEntityCriteria();
		return criteria.list();
	}

	@Override
	public void update(Address s) {
		update(s);

	}

	public void delete(String id) {
		Address s = getWithSid(id);
		delete(s);
	}

}
