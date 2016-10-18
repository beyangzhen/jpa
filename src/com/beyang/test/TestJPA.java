package com.beyang.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.Test;

import com.beyang.entity.Customer;

public class TestJPA {
	@Test
	public void test(){
		  // 1. ����һ��EntityManagerFactory
			String persistenceUnitName="jpa01";
			EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory(persistenceUnitName);
		  // 2. ����EntityManger
			EntityManager entityManager=entityManagerFactory.createEntityManager();
		  // 3.  ��������
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
		  // 4.  ���г־û�����
			Customer customer=new Customer();
			customer.setAge(30);
			customer.setEmail("aa@yeah.net");
			customer.setLastName("bruce");
			
			entityManager.persist(customer);
		  // 5.  �ύ����
			entityTransaction.commit();
		  // 6.  �ر�EntityManger
			entityManager.close();
		  // 7.  �ر� EntityManagerFactory
			entityManagerFactory.close();
	}
}
