package demo.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //crea getters y setters
@AllArgsConstructor //genera constructor parametrizado
@NoArgsConstructor //Constructor sin parametros
public class CustomRequest {
    String data;
}
