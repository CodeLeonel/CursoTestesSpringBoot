package com.example.swplanetapi.domain;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.example.swplanetapi.common.PlanetConstants.PLANET;


//@SpringBootTest(classes = PlanetService.class)
@ExtendWith(MockitoExtension.class)
public class PlanetServiceTest {

    
    //@Autowired
    @InjectMocks
    private PlanetService planetService;

    //@MockitoBean
    @Mock
    private PlanetRepository planetRepository;

    @Test
    public void createPlanet_WithValidData_ReturnsPlanet() {

        when(planetRepository.save(PLANET)).thenReturn(PLANET);

        Planet sut = planetService.create(PLANET);
        
        assertThat(sut).isEqualTo(PLANET);

    }

}
