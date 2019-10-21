import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DatasetGetComponent } from './dataset-get/dataset-get.component';

import { DatasetsService } from './datasets.service';

@NgModule({
  declarations: [
    AppComponent,
    DatasetGetComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [ DatasetsService],
  bootstrap: [AppComponent]
})
export class AppModule { }
