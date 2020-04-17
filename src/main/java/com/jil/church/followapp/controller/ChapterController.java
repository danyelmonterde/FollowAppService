package com.jil.church.followapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jil.church.followapp.model.Chapters;
import com.jil.church.followapp.service.ChapterService;
import com.jil.church.followapp.serviceimpl.ChapterServiceImpl;

@RestController
public class ChapterController implements ChapterService {

	@Autowired
	private ChapterServiceImpl chapterServiceImpl;

	public ChapterController(ChapterServiceImpl chapterServiceImpl) {
		this.chapterServiceImpl = chapterServiceImpl;
	}

	@Override
	@GetMapping("/getChapterById/{chapterId}")
	@CrossOrigin(origins = "*")
	public Chapters getChapterById(@PathVariable("chapterId") int chapterId) {
		return chapterServiceImpl.getChapterById(chapterId);
	}

}
