package com.infocell.giz.gizart.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infocell.giz.gizart.dao.AbstractDao;
import com.infocell.giz.gizart.dao.BioDataDao;
import com.infocell.giz.gizart.exceptions.NotFound;
import com.infocell.giz.gizart.model.BioData;

@Repository
@Transactional
public class BioDataDaoImpl extends AbstractDao<Integer, BioData> implements BioDataDao {

	@Override
	public void create(BioData s) {
		persist(s);

	}

	@Override
	public BioData get(int id) {
		// TODO Auto-generated method stub
		return getByKey(id);
	}

	@Override
	public BioData getWithSid(String username, String pwd) throws NotFound {

		try {
			Criteria criteria = createEntityCriteria();
			criteria.add(Restrictions.eq("username", username));
			criteria.add(Restrictions.eqOrIsNull("password", pwd));
			return (BioData) criteria.uniqueResult();
		} catch (NotFound nf) {
			throw new NotFound();

		}
	}

	@Override
	public List<BioData> getList() {
		Criteria criteria = createEntityCriteria();
		return criteria.list();
	}

	@Override
	public void update(BioData s) {
		update(s);

	}

	@Override
	public void delete(int id) {
		BioData s = get(id);
		delete(s);
	}

}
