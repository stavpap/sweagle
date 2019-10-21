package com.syntax.sweagleapi.repository;

/**
 * Interface for the data access layer of our application. The basic operations which should be 
 * implemented by every repository are described here.
 */
public interface SweagleRepository<T> {

	/**
	 * Method for getting a specific row by id. 
	 * @param id
	 * @return the record that was retrieved from the database
	 */
	public T get(long id);

	/**
	 * Method for inserting a new record in the database.
	 * @param body the record to be inserted
	 * @return the created record
	 */
	T insert(T body);

	/**
	 * Method for updating a record in the database by its dataset id.
	 * @param body the record with the fields to be updated
	 * @param datasetId the id which specifies the record to be updated
	 * @return the number of rows updated
	 */
	int update(T body, long datasetId);

	/**
	 * Method for deleting a in the database by its id.
	 * @param id the id for specifying the record to be deleted
	 * @return the number of rows deleted
	 */
	int delete(long id);

}
