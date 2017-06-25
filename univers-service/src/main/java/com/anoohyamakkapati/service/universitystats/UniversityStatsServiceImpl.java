package com.anoohyamakkapati.service.universitystats;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anoohyamakkapati.repository.university.UniversityStatisticsRepository;

@Service
public class UniversityStatsServiceImpl implements UniversityStatsService {

	@Autowired
	private UniversityStatisticsRepository getUniversityStatisticsRepository;
	
	public Integer getStatistics(Integer universityId) {
		return getUniversityStatisticsRepository.getNumOfStudentsForUniversity(universityId);
	}

}
