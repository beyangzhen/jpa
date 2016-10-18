package com.beyang.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

//�������
@Table(name="tb_customer")
@Entity
public @Data class Customer {
	//��ʾ����
	@Id
	//ָ��������ɲ���
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String lastName;
	private Integer age;
	private String email;
}
