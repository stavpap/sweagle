
import { Component, OnInit } from '@angular/core';
import { DatasetsService } from '../datasets.service';
import { DomSanitizer } from '@angular/platform-browser';


@Component({
  selector: 'app-dataset-get',
  templateUrl: './dataset-get.component.html',
  styleUrls: ['./dataset-get.component.css']
})
export class DatasetGetComponent implements OnInit {

  datasets: any[];
  constructor(private ds: DatasetsService, private _sanitizer: DomSanitizer) { }

  ngOnInit() {
    this.ds
      .getDatasets()
      .subscribe((data: any[]) => {
        var that = this;
        data.forEach(function(ds) {
        ds.payload.image = that._sanitizer.bypassSecurityTrustResourceUrl('data:image/jpg;base64,' 
                 + ds.payload.filePayload);;
        });

        this.datasets = data;

    });
  }


  deleteProduct(id) {
    this.ds.deleteDataset(id).subscribe(res => {
      this.datasets.splice(id, 1);
    });
  }
}