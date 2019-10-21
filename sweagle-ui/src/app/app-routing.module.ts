import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DatasetGetComponent } from './dataset-get/dataset-get.component'



const routes: Routes = [
  {
    path: '', redirectTo: 'datasets', pathMatch: 'full'
  },
  {
    path: 'datasets',
    component: DatasetGetComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
