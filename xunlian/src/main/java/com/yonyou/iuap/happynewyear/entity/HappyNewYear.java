package com.yonyou.iuap.happynewyear.entity;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.yonyou.iuap.baseservice.entity.AbsDrModel;
import com.yonyou.iuap.baseservice.support.condition.Condition;
import com.yonyou.iuap.baseservice.support.generator.GeneratedValue;
import com.yonyou.iuap.baseservice.support.generator.Strategy;
import com.yonyou.iuap.persistence.jdbc.framework.annotation.Column;

@JsonIgnoreProperties(ignoreUnknown=true)
@Table(name = "example_helloworld")
public class HappyNewYear extends AbsDrModel implements Serializable{
	@Id
	@GeneratedValue(strategy = Strategy.UUID)
	@Column(name = "ID")
	@Condition
	protected String id;//ID

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public void setId(Serializable id) {
		// TODO Auto-generated method stub
		this.id = id.toString();
		super.id = id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	@Column(name = "name")
	@Condition
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
