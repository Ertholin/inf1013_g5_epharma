package ca.uqtr.inf1013_h22_g5.handlers;

/*
* L'objet qu'on va renvoyer l'orsqu'on capte une exception
* */

import ca.uqtr.inf1013_h22_g5.exception.ErrorCodes;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Objet à renvoyer dès que l'application rencontre une exception
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorDto {

    private Integer httpCode;

    private ErrorCodes code;

    private String message;

    private List<String> errors = new ArrayList<>();

}
