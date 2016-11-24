package edu.tsinghua.dao;

import java.util.List;

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
}
