package com.example.swplanetapi.domain;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.when;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import static com.example.swplanetapi.common.PlanetConstants.PLANET;

@SpringBootTest(classes = PlanetService.class)
public class PlanetServiceTest {

    @Autowired
    private PlanetService planetService;

    @MockitoBean
    private PlanetRepository planetRepository;

    @Test
    public void createPlanet_WithValidData_ReturnsPlanet() {

        when(planetRepository.save(PLANET)).thenReturn(PLANET);

        Planet sut = planetService.create(PLANET);
        
        assertThat(sut).isEqualTo(PLANET);

    }

}
