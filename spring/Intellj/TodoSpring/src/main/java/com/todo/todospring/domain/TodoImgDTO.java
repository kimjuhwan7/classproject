package com.todo.todospring.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

/*리스트 이미지*/
public class TodoImgDTO {
    private long Ino;
    private MultipartFile Iimg;

    /*이미지 이름 변경하려고 만들었*/
    public void setIimg(String newImgName) {
    }
}
