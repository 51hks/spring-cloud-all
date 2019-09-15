package com.hks.comm.beans;

import lombok.Data;

@Data
public class Result<T> extends Response{

    public  T data ;

}
