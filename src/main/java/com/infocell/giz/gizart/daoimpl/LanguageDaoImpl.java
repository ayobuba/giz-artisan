package com.infocell.giz.gizart.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infocell.giz.gizart.dao.AbstractDao;
import com.infocell.giz.gizart.dao.LanguageDao;
import com.infocell.giz.gizart.model.Language;

@Repository
@Transactional
public class LanguageDaoImpl extends AbstractDao<Integer, Language> implements LanguageDao {

	@Override
	public void create(Language s) {
		persist(s);

	}

	@Override
	public Language get(int id) {
		// TODO Auto-generated method stub
		return getByKey(id);
	}

	@Override
	public Language getWithSid(String sid) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("sid", sid));
		return (Language) criteria.uniqueResult();
	}

	@Override
	public List<Language> getList() {
		Criteria criteria = createEntityCriteria();
		return criteria.list();
	}

	@Override
	public void update(Language s) {
		update(s);

	}

	@Override
	public void delete(String id) {
		Language s = getWithSid(id);
		delete(s);
	}

}
