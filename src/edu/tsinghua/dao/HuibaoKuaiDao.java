package edu.tsinghua.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import edu.tsinghua.entity.HuibaoKuai;

public class HuibaoKuaiDao extends BaseDao{

	/**
	 * 提交工作报告 insert
	 */
	public void insertOne(HuibaoKuai huibaoKuai){
		Session session=sessionFactory.getCurrentSession();
//		LoginInfo loginInfo= (LoginInfo) session.get(LoginInfo.class,"loginInfo");
//		huibaoKuai.setKuaijiId(loginInfo.getUserId());
		session.save(huibaoKuai);
		System.out.println("已经提交");
	}
	
	/**
	 * 查询所有汇报——会计
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
