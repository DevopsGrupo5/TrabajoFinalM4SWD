package com.devops.dxc.devops.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Util {

    /**
     * Método para cacular el 10% del ahorro en la AFP. Las reglas de negocio se
     * pueden conocer en
     * https://www.previsionsocial.gob.cl/sps/preguntas-frecuentes-nuevo-retiro-seguro-10/
     * 
     * @param ahorro
     * @param sueldo
     * @return
     */
    public static int getDxc(int ahorro, int sueldo) {
        int uf = getUf();
        System.out.println("" + uf);
        if (((ahorro * 0.1) / uf) > 150) {
            return (int) (150 * uf);
        } else if ((ahorro * 0.1) <= 1000000 && ahorro >= 1000000) {
            return (int) 1000000;
        } else if (ahorro <= 1000000) {
            return (int) ahorro;
        } else {
            return (int) (ahorro * 0.1);
        }
    }

    /**
     * Método que retorna el valor de la UF. Este método debe ser refactorizado por
     * una integración a un servicio que retorne la UF en tiempo real. Por ejemplo
     * mindicador.cl
     * 
     * @return
     */
    public static int getUf() {
        RestTemplate restTemplate = new RestTemplate();
        DateFormat dform = new SimpleDateFormat("dd-MM-yyyy");
        Date obj = new Date();
        String today = dform.format(obj);
        ResponseEntity<UFResponse> call = restTemplate.getForEntity("https://mindicador.cl/api/uf/" + today,
                UFResponse.class);
        SerieResponse serie = (SerieResponse) call.getBody().getSerie().get(0);

        int uf = (int) Math.round(serie.getValor());

        return uf;
    }

}
