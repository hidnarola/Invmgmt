import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';

import { InvmgmtSharedModule } from '../shared';
import { DataTableModule, SharedModule, InputTextareaModule, ButtonModule } from 'primeng/primeng';

import { SEARCH_LOT_ROUTE } from './searchLot-routing.module';
import { SearchLotComponent } from './search-lot.component';

@NgModule({
  imports: [
    CommonModule,
    InvmgmtSharedModule,
    RouterModule.forChild([SEARCH_LOT_ROUTE]),
    DataTableModule,
    SharedModule,
    InputTextareaModule,
    ButtonModule
  ],
  declarations: [SearchLotComponent],
  entryComponents: [
  ],
  providers: [
  ],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class SearchLotModule {
}
