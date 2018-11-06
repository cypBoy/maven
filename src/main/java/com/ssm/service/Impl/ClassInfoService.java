package com.ssm.service.Impl;

import com.ssm.dao.IClassInfoDao;
import com.ssm.model.ClassInfo;
import com.ssm.service.IClassInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 班级信息服务
 * @author hp
 *
 */
@Service
public class ClassInfoService implements IClassInfoService {
	
	@Autowired
	private IClassInfoDao dao;


	@Override
	public List<ClassInfo> getAllClassInfos() throws Exception {
		List<ClassInfo> data = this.dao.selectAllClassInfo();
		return data;
	}
	public void addClass(ClassInfo model) throws Exception{
		
		dao.insertClassInfo(model);
	}
	public void deleteClass(long id){
		
		try {
			dao.deleteClassInfo(id);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	public ClassInfo getedit(long id) throws Exception{
		return dao.selectClassInfoById(id);
	}
	public void editClass(Long id, String name, String number, String type ) throws Exception{
		ClassInfo model=this.getedit(id);
		model.setName(name);
		model.setNumber(number);
		model.setType(type);
		dao.updateClassInfo(model);
		
	}
	@Override
	public List<ClassInfo> selectByName(String name) throws Exception {
		// TODO Auto-generated method stub
		return dao.selectClassInfoByName(name);
	}

}
