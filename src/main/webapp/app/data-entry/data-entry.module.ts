import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { InvmgmtSharedModule } from '../shared';
import { DataTableModule, SharedModule, DropdownModule, CalendarModule, SpinnerModule } from 'primeng/primeng';
import { SalePersonsResolve, CategoriesResolve, LocationsResolve, SelectedLotsResolve } from '../shared/route_resolve';
import { DataEntryService } from './data-entry.service';
import { SearchLotService } from '../search-lot/search-lot.service';

import { dataEntryRoute } from './data-entry-routing.module';
import { DataEntryComponent } from './data-entry.component';

@NgModule({
  imports: [
    CommonModule,
    InvmgmtSharedModule,
    BrowserAnimationsModule,
    RouterModule.forChild([dataEntryRoute]),
    DropdownModule,
    CalendarModule,
    SpinnerModule
  ],
  declarations: [DataEntryComponent],
  entryComponents: [
  ],
  providers: [
    SalePersonsResolve,
    CategoriesResolve,
    LocationsResolve,
    SelectedLotsResolve,
    DataEntryService,
    SearchLotService
  ],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class DataEntryModule {
}
