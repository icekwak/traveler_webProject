package com.traveler.main.vo.reponse;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ResponseVo {
	private int status;
	private String message;
}
