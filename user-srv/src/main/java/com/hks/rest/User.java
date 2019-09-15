package com.hks.rest;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    public Integer id ;

    private String userName ;
}
