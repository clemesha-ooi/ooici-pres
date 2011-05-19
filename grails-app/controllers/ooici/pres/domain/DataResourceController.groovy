package ooici.pres.domain

import ion.integration.ais.AppIntegrationService.RequestType;

class DataResourceController extends BaseController {

	def find = {
		
		preProcessRequest(false);
		
		specialPreProcessRequest()
		
		params.put("user_ooi_id", ooi_id)

		sendReceive(RequestType.FIND_DATA_RESOURCES);
	}
	
	def findByUser = {
		
		preProcessRequest(true)
		
		specialPreProcessRequest()

		params.put("user_ooi_id", ooi_id)
		
		sendReceive(RequestType.FIND_DATA_RESOURCES_BY_USER)
	}
	
	def detail = {
		
		preProcessRequest(false)

		sendReceive(RequestType.GET_DATA_RESOURCE_DETAIL)
	}
	
	def create = {
		
		preProcessRequest(true)
		
		sendReceive(RequestType.CREATE_DATA_RESOURCE)
	}
	
	def update = {
		
		preProcessRequest(true)
		
		sendReceive(RequestType.UPDATE_DATA_RESOURCE)
	}
	
	def delete = {
		
		preProcessRequest(true)
		
		sendReceive(RequestType.DELETE_DATA_RESOURCE)
	}
	
	def validate = {
		
		preProcessRequest(true)
		
		sendReceive(RequestType.VALIDATE_DATA_RESOURCE)
	}
	
	def specialPreProcessRequest = {
		
		// Special handle numeric params
		if (params.get("minLongitude") != null)
			params.put("minLongitude",params.float("minLongitude"));
		if (params.get("maxLongitude") != null)
			params.put("maxLongitude",params.float("maxLongitude"));
		if (params.get("minLatitude") != null)
			params.put("minLatitude",params.float("minLatitude"));
		if (params.get("maxLatitude") != null)
			params.put("maxLatitude",params.float("maxLatitude"));
		if (params.get("minVertical") != null)
			params.put("minVertical",params.float("minVirtical"));
		if (params.get("maxVertical") != null)
			params.put("maxVertical",params.float("maxVirtical"));
	}

}