package com.pedrozanon.chassi.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GarageAppConfiguration {

	@Bean
	RetrieveCategories retrieveCategories(GetCategories getCategories) {
		return new RetrieveCategories(getCategories);
	}

	@Bean
	RetrieveVideos retrieveVideos(GetVideos getVideos) {
		return new RetrieveVideos(getVideos);
	}

	@Bean
	SaveVideoInfo saveVideoInfo(SaveVideoModelPort saveVideoModelPort, RetrieveCategories retrieveCategories) {
		return new SaveVideoInfo(saveVideoModelPort, retrieveCategories);
	}

	@Bean
	RetrieveVideosById retrieveVideosById(GetVideosById getVideosById) {
		return new RetrieveVideosById(getVideosById);
	}

	@Bean
	RetrieveVideosByTitle retrieveVideosByTitle(GetVideosByTitle getVideosByTitle) {
		return new RetrieveVideosByTitle(getVideosByTitle);
	}

	@Bean
	DeleteVideo deleteVideo(DeleteVideoPort deleteVideoPort) {
		return new DeleteVideo(deleteVideoPort);
	}

	@Bean
	RetrieveVideoByCategory retrieveVideoByCategory(GetVideosByCategory getVideosByCategory) {
		return new RetrieveVideoByCategory(getVideosByCategory);
	}

	@Bean
	SaveCategoryInfo saveCategoryInfo(SaveCategoryModelPort saveCategoryModelPort) {
		return new SaveCategoryInfo(saveCategoryModelPort);
	}

	@Bean
	DeleteCategory deleteCategory(DeleteCategoryById deleteCategoryById, RetrieveCategories retrieveCategories) {
		return new DeleteCategory(deleteCategoryById, retrieveCategories);
	}

	@Bean
	UpdateVideo updateVideo(RetrieveVideosById retrieveVideosById, SaveVideoInfo saveVideoInfo) {
		return new UpdateVideo(retrieveVideosById, saveVideoInfo);
	}

	@Bean
	UpdateCategory updateCategory(RetrieveCategories retrieveCategories, SaveCategoryInfo saveCategoryInfo) {
		return new UpdateCategory(retrieveCategories, saveCategoryInfo);
	}
}