package com.ssm.service;

import com.ssm.model.ClassInfo;

import java.util.List;

/**
 * 班级信息服务接口
 * @author hp
 *
 */
public interface IClassInfoService {
	
	/**
	 * 获取所有班级信息
	 * @return
	 * @throws Exception 
	 */
	public List<ClassInfo> getAllClassInfos() throws Exception;
	public void addClass(ClassInfo model) throws Exception;
	public void deleteClass(long id);
	public ClassInfo getedit(long id) throws Exception;
	
 /**
 *
  * @param id
  * @param name
  * @throws Exception
 */
	public void editClass(Long id, String name, String number, String type) throws Exception;
	
	public List<ClassInfo> selectByName(String name) throws Exception;
}
