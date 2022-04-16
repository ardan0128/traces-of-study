package com.example.hello;

import com.example.hello.dto.UserDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloApplicationTests {

	@Test
	void contextLoads() throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		UserDto userDto = new UserDto("Joriter", 20, "010-1111-2222");
		String text = objectMapper.writeValueAsString(userDto);
		System.out.println(text);

		UserDto objectUser = objectMapper.readValue(text, UserDto.class);
		System.out.println(objectUser);
	}

}
