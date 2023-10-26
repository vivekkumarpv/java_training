package com.gptapi.demo.controller;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gptapi.demo.dto.ModelDto;
import com.gptapi.demo.dto.RequestDto;

@RestController
public class GptApiController {
	@PostMapping(value = "/getGptResponse", consumes = { "application/json" })
	public ResponseEntity<?> getRequest(@RequestBody ModelDto modelDto) throws IOException, InterruptedException {

		HttpClient httpClient = HttpClient.newHttpClient();

		String apiUrl = "https://api.openai.com/v1/chat/completions";

		//String apiUrl = "https://api.openai.com/v1/models";

//		Map<String,Object> strMap=new HashMap<>();
//		strMap.put("model","gpt-3.5-turbo-0613" );
//		RequestDto reqDto=new RequestDto();
//		strMap.put("messages", reqDto);
		String request=new ObjectMapper().writeValueAsString(modelDto);
		HttpRequest httpRequest = HttpRequest.newBuilder()
				.header("Authorization", "Bearer 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")
				.uri(URI.create(apiUrl)).POST(HttpRequest.BodyPublishers.ofString(request)).build();

		HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

		return new ResponseEntity<>(httpResponse.body(), HttpStatus.BAD_REQUEST);
	}

}
