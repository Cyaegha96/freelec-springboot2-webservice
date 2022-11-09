package com.jojoldu.book.springboot.web;

import org.junit.Test;
import org.springframework.mock.env.MockEnvironment;

import static org.assertj.core.api.Assertions.assertThat;

public class ProfileControllerUnitTest {

    @Test
    public void real_profile이_없으면_첫번째가_조회되다(){

        //given

        String expedtedProfile = "oauth";

        MockEnvironment env = new MockEnvironment();

        env.addActiveProfile(expedtedProfile);
        env.addActiveProfile("real-db");

        ProfileController controller = new ProfileController(env);

        //when

        String profile = controller.profile();

        //then

        assertThat(profile).isEqualTo(expedtedProfile);
    }

    @Test
    public void active_profile이_없으면_default가_조회된다(){

        //given

        String expedtedProfile = "default";

        MockEnvironment env = new MockEnvironment();

        ProfileController controller = new ProfileController(env);

        //when

        String profile = controller.profile();

        //then

        assertThat(profile).isEqualTo(expedtedProfile);
    }

}
