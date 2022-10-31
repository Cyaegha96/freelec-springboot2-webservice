package com.jojoldu.book.springboot.web.dto;

import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

public class HelloResponseDtoTest {

    @Test
    public void lombok_test(){

        //given
        String name = "test";
        int amount = 800;

        //when

        HelloResponseDto dto = new HelloResponseDto(name, amount);

        //then

        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);

    }

}
