package com.logicify.d2g.dtos.incomingdtos;

import com.logicify.d2g.dtos.DtosDomains.IncomingDto;

/**
 * Created by jadencorr on 27.02.17.
 */
public class UserUpdateStatusIncomingDto implements IncomingDto {

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    protected String status;

}
