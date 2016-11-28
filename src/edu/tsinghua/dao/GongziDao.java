package edu.tsinghua.dao;

import java.util.List;

import javax.management.Query;

import org.hibernate.Session;

import edu.tsinghua.entity.Gongzi;
import edu.tsinghua.entity.HuibaoKuai;

public class GongziDao  extends BaseDao{
	
	/**
	 * ��ʼ�����ʱ� insert
	 */
	public void init(Gongzi gongzi){
		Session session=sessionFactory.getCurrentSession();
		session.save(gongzi);
		System.out.println("��ʼ��");
	}
	
	
	
	/**
	 * �ύ���ʱ� insert
	 */
	public void insertOne(List<Gongzi> gongzis){
		Session session=sessionFactory.getCurrentSession();
		for (int i = 0; i < gongzis.size(); i++) {
			session.save(gongzis.get(i));
		}
		System.out.println("�ύ���ʱ�");
	}
	/**
	 * ɾ�����ʱ� 
	 */
	public void deleteOne(Gongzi gongzi){
		Session session =sessionFactory.getCurrentSession();
		session.delete(gongzi);
	}
	/**
	 * �޸Ĺ��ʱ� 
	 */
	public void updateOne(Gongzi gongzi){
		Session session =sessionFactory.getCurrentSession();
		session.update(gongzi);
	}
	/**
	 * �鿴���й��ʱ� 
	 */
	public List<Gongzi> showAll(){
		Session session =sessionFactory.getCurrentSession();
		org.hibernate.Query query= session.createQuery("from Gongzi");
		List<Gongzi> gongzis= query.list();
		return gongzis;
	}
	
	
	
}
