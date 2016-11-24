package edu.tsinghua.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import edu.tsinghua.entity.HuibaoKuai;

public class HuibaoKuaiDao extends BaseDao{

	/**
	 * �ύ�������� insert
	 */
	public void insertOne(HuibaoKuai huibaoKuai){
		Session session=sessionFactory.getCurrentSession();
//		LoginInfo loginInfo= (LoginInfo) session.get(LoginInfo.class,"loginInfo");
//		huibaoKuai.setKuaijiId(loginInfo.getUserId());
		session.save(huibaoKuai);
		System.out.println("�Ѿ��ύ");
	}
	
	/**
	 * ��ѯ���л㱨�������
	 * */
	public List<HuibaoKuai> getAll(){
		Session session=sessionFactory.getCurrentSession();
		System.out.println("2");
		Query query=session.createQuery("from HuibaoKuai");
		List<HuibaoKuai> huibaoKuais=query.list();
		System.out.println(huibaoKuais.size());
		return huibaoKuais;
	}
}
