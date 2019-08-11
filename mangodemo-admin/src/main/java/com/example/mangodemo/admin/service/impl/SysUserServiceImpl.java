package com.example.mangodemo.admin.service.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mangodemo.admin.mapper.SysUserMapper;
import com.example.mangodemo.admin.model.SysUser;
import com.example.mangodemo.admin.service.SysUserService;
import com.example.mangodemo.core.page.MybatisPageHelper;
import com.example.mangodemo.core.page.PageRequest;
import com.example.mangodemo.core.page.PageResult;

import utils.DateTimeUtils;
import utils.PoiUtils;

@Service
public class SysUserServiceImpl implements SysUserService{

	@Autowired
	private SysUserMapper sysUserMapper;
	
	@Override
	public List<SysUser> findAll() {
		return sysUserMapper.findAll();
	}

	@Override
	public int save(SysUser record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delede(SysUser record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(List<SysUser> record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public SysUser findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		return MybatisPageHelper.findPage(pageRequest, sysUserMapper);
	}

	@Override
	public File createUserExcelFile(PageRequest pageRequest) {
		PageResult pageResult = findPage(pageRequest);
		return createUserExcelFile(pageResult.getContent());
	}

	private File createUserExcelFile(List<?> records) {
		if(records==null) {
			records=new ArrayList<>();
		}
		Workbook workBook = new XSSFWorkbook();
		Sheet sheet = workBook.createSheet();
		Row row0 = sheet.createRow(0);
		int index = 0 ; 
		row0.createCell(index).setCellValue("No");
		row0.createCell(++index).setCellValue("ID");
		row0.createCell(++index).setCellValue("用户名");
		row0.createCell(++index).setCellValue("昵称");
		row0.createCell(++index).setCellValue("机构");
		row0.createCell(++index).setCellValue("角色");
		row0.createCell(++index).setCellValue("邮箱");
		row0.createCell(++index).setCellValue("手机号");
		row0.createCell(++index).setCellValue("状态");
		row0.createCell(++index).setCellValue("头像");
		row0.createCell(++index).setCellValue("创建人");
		row0.createCell(++index).setCellValue("创建时间");
		row0.createCell(++index).setCellValue("最后更新人");
		row0.createCell(++index).setCellValue("最后更新时间");
		for (int i = 0; i < records.size(); i++) {
			SysUser user = (SysUser) records.get(i);
			Row row = sheet.createRow(i+1);
			for (int j = 0; j < index + 1; j++) {
				row.createCell(j);
			}
			index = 0;
			row.getCell(index).setCellValue(i + 1);
			row.getCell(++index).setCellValue(user.getId());
			row.getCell(++index).setCellValue(user.getName());
			row.getCell(++index).setCellValue(user.getNickName());
			row.getCell(++index).setCellValue(user.getDeptName());
			row.getCell(++index).setCellValue(user.getRoleNames());
			row.getCell(++index).setCellValue(user.getEmail());
			row.getCell(++index).setCellValue(user.getStatus());
			row.getCell(++index).setCellValue(user.getAvatar());
			row.getCell(++index).setCellValue(user.getCreateBy());
			row.getCell(++index).setCellValue(DateTimeUtils.getDateTime(user.getCreateTime()));
			row.getCell(++index).setCellValue(user.getLastUpdateBy());
			row.getCell(++index).setCellValue(DateTimeUtils.getDateTime(user.getLastUpdateTime()));
		}
		return PoiUtils.createExcelFile(workBook, "download_user");
	}
	
}
