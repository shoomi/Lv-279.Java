package ua.softserve.service;

import ua.softserve.persistence.entity.Feedback;
import ua.softserve.service.dto.FeedbackDTO;

import java.util.List;

public interface FeedbackService {
    List<Feedback> findAll();

    void saveDTO(FeedbackDTO feedbackDTO);

    Feedback findOne(int id);
}
