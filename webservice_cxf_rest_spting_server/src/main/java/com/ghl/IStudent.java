package com.ghl;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;


/**
 * @Author : ganhonglaing
 * @Date : 2018/10/27 17:25
 * @Description: 学生接口
 */
@WebService
@Path("/student")
public interface IStudent {
    /**
     * @param id
     * @return
     */


    @GET
    @Path("/query/{id}")
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    Student query(@PathParam("id") int id);

    @GET
    @Path("/queryList/{name}")
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    List<Student> queryList(@PathParam("name") String name);
}
