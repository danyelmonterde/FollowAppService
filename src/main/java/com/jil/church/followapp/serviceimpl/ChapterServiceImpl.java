package com.jil.church.followapp.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jil.church.followapp.model.Chapters;
import com.jil.church.followapp.repository.ChapterRepository;
import com.jil.church.followapp.service.ChapterService;

@Service
public class ChapterServiceImpl implements ChapterService{

	@Autowired
	private ChapterRepository chapterRepository;
	
	@Override
	public Chapters getChapterById(int chapterId) {
		return chapterRepository.findById(chapterId).get();
	}

}
