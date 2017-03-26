package com.infocell.giz.gizart.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infocell.giz.gizart.dao.AbstractDao;
import com.infocell.giz.gizart.dao.ContactUsDao;
import com.infocell.giz.gizart.model.ContactUs;

@Repository
@Transactional
public class ContactUsDaoImpl extends AbstractDao<Integer, ContactUs> implements ContactUsDao {

	@Override
	public void update(ContactUs s) {
		update(s);

	}

	@Override
	public void create(ContactUs s) {
		persist(s);

	}

	@Override
	public ContactUs get(int id) {
		// TODO Auto-generated method stub
		return getByKey(id);
	}

	@Override
	public ContactUs getWithSid(String sid) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("sid", sid));
		return (ContactUs) criteria.uniqueResult();
	}

	@Override
	public List<ContactUs> getList() {
		Criteria criteria = createEntityCriteria();
		return criteria.list();
	}

	@Override
	public void delete(int id) {
		ContactUs s = get(id);
		delete(s);
	}

}
