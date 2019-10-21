import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class DatasetsService {
  constructor(private http: HttpClient) { }

  getDatasets() {
    return this
           .http
           .get('http://localhost:8080/datasets?returnPayload=true');
  }
  
  deleteDataset(id) {
    return this
              .http
              .delete(`http://localhost:8080/datasets/${id}`);
  }

}
