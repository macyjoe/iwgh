package com.ll.sapp4.answer;

import com.ll.sapp4.question.Question;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Answer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String content;

	private LocalDateTime createDate;

	@ManyToOne
	private Question question;

	// getters and setters
}
