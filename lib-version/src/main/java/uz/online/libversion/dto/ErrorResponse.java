package uz.online.libversion.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class ErrorResponse {
    private int code;
    private String message;
}
