package com.centurylink.bbc.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import java.lang.reflect.ParameterizedType;



public abstract class AbstractDao<T> {
	
	@Autowired
	private HibernateTemplate  hibernateTemplate;
	
	
	/**
	 * Class of BusinessEntity
	 */
	@SuppressWarnings("unchecked")
	private Class<T> persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0] ;
	
	

	protected Session getSession() {
		return hibernateTemplate.getSessionFactory().getCurrentSession();
	}

	public void persist(Object entity) {
		hibernateTemplate.persist(entity);
	}

	public void delete(Object entity) {
		hibernateTemplate.delete(entity);
		//getSession().delete(entity);
	}

	public T update(final T entity) {
		return hibernateTemplate.merge(entity);
	}
	
	@SuppressWarnings("unchecked")
	public T retrieveById(final Integer id) {
		return (T)getSession().get(persistentClass, id);
	}
	
	public void deleteById(final Integer id) {
		hibernateTemplate.delete(retrieveById(id));
	}
	
	@SuppressWarnings("unchecked")
	public List<T> retrieveAll() {
		Query query = getSession().createQuery("from " + persistentClass.getName());
		return (List<T>)query.list();
	}
	
	
	
	@SuppressWarnings("unchecked")
	public List<T>  executeQuery(String hqlQuery,Object...params){
		/*Query query = getSession().createQuery(hqlQuery);
		if(params!=null && params.length>0) {
			for(int index=0; index<params.length; index++) {
				query.setParameter(index+1, params[index]);
			}
		}
		List<T> list =query.list();*/
		List<T> list = (List<T>) hibernateTemplate.find(hqlQuery,params);
		return list;
	}
	
	public List<T> executeNativeQuery(String query, Object...params) {
		List<T> result = null;
		return result;
	}
	
	
}
