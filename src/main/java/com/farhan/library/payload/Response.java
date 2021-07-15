package com.farhan.library.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response {

    private String RC;

    private String responseType;

    private String message;

    private Object data;

}
