package ca.uqtr.inf1013_h22_g5.dto.auth;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthenticationResponse {

    private String accessToken;
}
