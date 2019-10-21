package com.syntax.sweagleapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.syntax.sweagleapi.dto.DatasetDTO;
import com.syntax.sweagleapi.dto.PayloadDTO;
import com.syntax.sweagleapi.exceptions.NoResourceFoundException;
import com.syntax.sweagleapi.exceptions.NotValidDataException;
import com.syntax.sweagleapi.service.CRUDService;

/**
 * The controller for handling the HTTP requests to the api.
 * All the requests are directed from the controller to the service layer of our application.
 * The controller is annotated as RestController which indicates that the data returned by each method will be written straight into the response body
 */
@RestController
// Enable CORS in order to allow cross-origin HTTP requests (different domain, protocol, or port)
@CrossOrigin(origins = "*")
// This is the base path of our api
@RequestMapping("/datasets")
public class WebController {

	private final CRUDService service;

	@Autowired
	public WebController(CRUDService service) {
		this.service = service;
	}

	/**
	 * Get request for fetching all the datasets.
	 * @param returnPayload query parameter which indicates whether the payload should be returned with every dataset
	 * @return a list of all the datasets existing in the database
	 */
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<DatasetDTO> getAll(@RequestParam boolean returnPayload) {
		return service.getAll(returnPayload);
	}
	
	/**
	 * Get request for fetching a specific dataset by its id
	 * @param returnPayload query parameter which indicates whether the payload should be returned with the dataset
	 * @return a dataset which the specified id
	 */
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public DatasetDTO getById(@PathVariable long id,@RequestParam boolean returnPayload) {
		return service.get(id, returnPayload);
	}
	
	/**
	 * Get request for fetching a specific dataset by its name
	 * @param returnPayload query parameter which indicates whether the payload should be returned with the dataset
	 * @return a dataset which the specified name
	 */
	@GetMapping("/name/{name}")
	@ResponseStatus(HttpStatus.OK)
	public DatasetDTO getByName(@PathVariable String name,@RequestParam boolean returnPayload) {
		return service.get(name, returnPayload);
	}
	
	/**
	 * Post request for creating a new dataset or updating an already existing dataset.
	 * @param dataset a dto with the details of the dataset to be created or updated
	 * @return the id of the created or updated dataset
	 * @throws NotValidDataException 
	 * @throws NoResourceFoundException 
	 */
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public String createOrUpdateDataset(@RequestBody DatasetDTO dataset) throws NoResourceFoundException, NotValidDataException {
		long datasetId = service.createDatasetWithPayload(dataset);
		return String.format("Dataset id: %s", String.valueOf(datasetId));
	}
	
	/**
	 * Post request for updating the payload of a specific dataset.Every payload belongs to a dataset,
	 * so it is considered as a nested resource. The url shows this relationship. The 204 NO CONTENT response indicates that the operation was
	 * successful and the response body is empty.
	 * @param id query parameter for specifying the id of the dataset, whose payload will be updated
	 * @param payload the body of the request is a dto with the update details for the payload 
	 * @throws NoResourceFoundException exception thrown when a dataset with the specified doesn't exist
	 * @throws NotValidDataException 
	 */
	@PostMapping(value = "/{id}/payloads",consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void updatePayload(@PathVariable long id,@RequestBody PayloadDTO payload) throws NoResourceFoundException, NotValidDataException {
		service.updatePayload(id,payload);
	}
	
	/**
	 * Delete request for deleting a specific dataset. Along with the dataset the respective payload is deleted.
	 * @param id the id for specifying the dataset
	 */
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteById(@PathVariable long id) {
		service.delete(id);
	}
	
	/**
	 * Delete request for deleting a specific dataset. Along with the dataset the respective payload is deleted.
	 * @param name the name for specifying the dataset
	 */
	@DeleteMapping("name/{name}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteByName(@PathVariable String name) throws NoResourceFoundException {
		service.delete(name);
	}
	
	/**
	 * Get request for fetching the payloads that belong to a dataset. For now each dataset has one payload so a dataset dto is expected as result.
	 * The response data type varies according to the value of the query parameter mediaType. For now possible data types for the response
	 * are json and yaml. More data types can added. The client has to set also the Accept header with the appropriate value
	 * (in our case these values are "application/json" or "application/x-yaml")
	 * @param id path parameter for specifying the desirable dataset by id
	 * @param mediaType query parameter for specifying the response data type
	 * @return a dto with the payload details
	 */
	@GetMapping(value = "/{id}/payloads")
	@ResponseStatus(HttpStatus.OK)
	public PayloadDTO getPayloadByDatasetId(@PathVariable long id,@RequestParam String mediaType) {
		return service.getPayload(id);
	}
	
	/**
	 * Get request for fetching the payloads that belong to a dataset. Query parameter for response media type is also applicable here
	 * @param name path parameter for specifying the desirable dataset by name
	 * @param mediaType query parameter for specifying the response data type
	 * @return a dto with the payload details
	 */
	@GetMapping(value = "/name/{name}/payloads")
	@ResponseStatus(HttpStatus.OK)
	public PayloadDTO getPayloadByDatasetName(@PathVariable String name, @RequestParam String mediaType) throws NoResourceFoundException {
		return service.getPayload(name);
	}
}