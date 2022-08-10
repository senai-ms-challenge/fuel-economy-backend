package com.example.fueleconomybackend.integrationtests.modeloveiculo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;

@SpringBootTest
@AutoConfigureMockMvc
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
@ActiveProfiles("test")
public class SaveModeloVeiculoIntegrationTest {

    private static final String PATH = "/modelo-veiculos";

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper mapper;

    @Test
    public void mustSaveModeloVeiculoSuccessfully() throws Exception {
        HashMap<String, String> modeloVeiculo = createModeloVeiculoHashMap();

        MockHttpServletResponse response = performPost(modeloVeiculo);

        HashMap savedModeloVeiculo = mapToHashMap(response);

        Assertions.assertEquals(HttpStatus.CREATED.value(), response.getStatus());
        Assertions.assertNotNull(savedModeloVeiculo.get("id"));
        Assertions.assertEquals(modeloVeiculo.get("nome"), savedModeloVeiculo.get("nome"));
        Assertions.assertEquals(modeloVeiculo.get("fabricante"), savedModeloVeiculo.get("fabricante"));
    }

    private HashMap mapToHashMap(MockHttpServletResponse response) throws JsonProcessingException, UnsupportedEncodingException {
        return this.mapper.readValue(response.getContentAsString(), HashMap.class);
    }

    private HashMap<String, String> createModeloVeiculoHashMap() {
        HashMap<String, String> modeloVeiculo = new HashMap<>();
        modeloVeiculo.put("nome", "HB20");
        modeloVeiculo.put("fabricante", "Hyundai");
        return modeloVeiculo;
    }

    private MockHttpServletResponse performPost(HashMap<String, String> modeloVeiculo) throws Exception {
        String json = this.mapper.writeValueAsString(modeloVeiculo);

        MockHttpServletRequestBuilder request =
                MockMvcRequestBuilders.post(PATH).contentType(MediaType.APPLICATION_JSON).content(json);

        MockHttpServletResponse response = this.mockMvc.perform(request).andReturn().getResponse();
        return response;
    }

}
