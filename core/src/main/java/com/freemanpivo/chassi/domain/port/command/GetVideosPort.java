package com.freemanpivo.chassi.domain.port.command;

import com.freemanpivo.chassi.domain.model.Video;

import java.util.List;

public interface GetVideosPort {

    List<Video> findVideos();
}
