package com.beyang.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="sys_user")
public class User {
	
	private Integer id;
	private String name;
	
	private String info;
	
	private Date birthDay;
	
	private Date createTime;
	
	private Date lastUpdateTime;
	
	private Date time1;
	
	@Column(columnDefinition="DATE")
	public Date getBirthDay() {
		return birthDay;
	}
	@Temporal(TemporalType.DATE)
	public Date getCreateTime() {
		return createTime;
	}
	@Temporal(TemporalType.TIME)
	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	@Temporal(TemporalType.TIMESTAMP)
	public Date getTime1() {
		return time1;
	}
	
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	
	public void setTime1(Date time1) {
		this.time1 = time1;
	}
	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	/*
	 *ʹ��tableע�������ɱ������
	 * */
	@TableGenerator(
				name="jpa_id_generator",           // ��������
				table="jpa_id_generator",          // ���������ı���
				pkColumnName="PK_TYPE",            // ���������е�����
				pkColumnValue="user_id" ,          //�����������ֵ
				valueColumnName="PK_VALUE",        //����ֵ�������
				allocationSize=1,                  //ÿ�ε����Ĵ�С
				initialValue= 10				   // ��ʼ��ֵ
			)
	@GeneratedValue(strategy=GenerationType.TABLE,generator="jpa_id_generator")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(length=30,nullable=false,unique=true		)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Transient
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", info=" + info + "]";
	}
	
}
