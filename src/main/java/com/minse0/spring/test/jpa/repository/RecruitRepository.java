package com.minse0.spring.test.jpa.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.minse0.spring.test.jpa.domain.Recruit;

public interface RecruitRepository extends JpaRepository<Recruit, Integer> {

	public List<Recruit> findById(int id);
	
	public List<Recruit> findByCompanyId(int companyId);
	
	public List<Recruit> findByPositionAndType(String position, String type);
	
	public List<Recruit> findByTypeOrSalaryGreaterThan(String type, int salary);
	
	public List<Recruit> findTop3ByOrderBySalaryDesc(); 
	
	public List<Recruit> findByRegionAndSalaryBetween(String region, int startSalary, int endSalary);
	
	@Query(value="SELECT *  FROM `recruit` WHERE `deadline` >= '2026-04-10' AND `salary` >= 8100  AND `type` = '정규직'", nativeQuery=true)
	public List<Recruit> findByDeadlineAndSalaryAndTypeDesc();
}
