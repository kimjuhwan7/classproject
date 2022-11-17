package firstcoding.spring_todo.domain;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class RegisterRequest {
    private String title;
    private String uday;


}
