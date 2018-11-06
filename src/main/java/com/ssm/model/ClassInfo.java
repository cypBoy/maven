package com.ssm.model;

/**
 * 班级信息实体对象
 * @author hp
 *
 */
public class ClassInfo {
	
	private Long id;
	
	private String name;
	
	private String number;
	
	private String type;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "ClassInfo{" +
				"id=" + id +
				", name='" + name + '\'' +
				", number='" + number + '\'' +
				", type='" + type + '\'' +
				'}';
	}
}
