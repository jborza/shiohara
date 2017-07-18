package com.viglet.shiohara.api.post;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.viglet.shiohara.persistence.model.ShPost;
import com.viglet.shiohara.persistence.model.ShPostAttr;
import com.viglet.shiohara.persistence.model.ShPostType;
import com.viglet.shiohara.persistence.service.ShPostAttrService;
import com.viglet.shiohara.persistence.service.ShPostService;
import com.viglet.shiohara.persistence.service.ShPostTypeService;

@Path("/post")
public class ShPostAPI {
	ShPostService shPostService = new ShPostService();
	ShPostTypeService shPostTypeService = new ShPostTypeService();
	ShPostAttrService shPostAttrService = new ShPostAttrService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<ShPost> list() throws Exception {
		return shPostService.listAll();
	}
	
	@Path("/{postId}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ShPost edit(@PathParam("postId") int id) throws Exception {
		return shPostService.get(id);
	}

	@Path("/{postId}")
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public ShPost update(@PathParam("postId") int id, ShPost shPost) throws Exception {
		ShPost shPostEdit = shPostService.get(id);
		shPostEdit.setDate(shPost.getDate());
		shPostEdit.setTitle(shPost.getTitle());
		shPostEdit.setSummary(shPost.getSummary());
		shPostService.save(shPost);
		return shPostEdit;
	}

	@Path("/{postId}")
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public boolean delete(@PathParam("postId") int id) throws Exception {
		return shPostService.delete(id);
	}

	@Path("/{postTypeId}/")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response add(@PathParam("postTypeId") int postTypeId, ShPost shPost) throws Exception {
		
		ShPostType shPostType = shPostTypeService.get(postTypeId);
		
		shPostService.saveByPostType(shPostType, shPost);
	
		String result = "Post saved : " + shPost;
		return Response.status(200).entity(result).build();

	}

}