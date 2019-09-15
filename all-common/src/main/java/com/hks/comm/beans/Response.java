package com.hks.comm.beans;

import lombok.Data;

import java.io.Serializable;

@Data
public class Response implements Serializable {

    protected int code ;

    protected String msg ;

}
