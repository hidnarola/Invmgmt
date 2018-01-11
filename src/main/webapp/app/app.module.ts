import './vendor.ts';

import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { Ng2Webstorage } from 'ngx-webstorage';

import { InvmgmtSharedModule, UserRouteAccessService } from './shared';
import { InvmgmtAppRoutingModule} from './app-routing.module';
import { InvmgmtHomeModule } from './home/home.module';
import { InvmgmtAdminModule } from './admin/admin.module';
import { InvmgmtAccountModule } from './account/account.module';
import { InvmgmtEntityModule } from './entities/entity.module';
import { customHttpProvider } from './blocks/interceptor/http.provider';
import { PaginationConfig } from './blocks/config/uib-pagination.config';

// jhipster-needle-angular-add-module-import JHipster will add new module here

import {
    JhiMainComponent,
    NavbarComponent,
    FooterComponent,
    ProfileService,
    PageRibbonComponent,
    ActiveMenuDirective,
    ErrorComponent
} from './layouts';
import { SearchLotModule } from './search-lot/search-lot.module';
import { DataEntryModule } from './data-entry/data-entry.module';

@NgModule({
    imports: [
        BrowserModule,
        InvmgmtAppRoutingModule,
        Ng2Webstorage.forRoot({ prefix: 'jhi', separator: '-'}),
        InvmgmtSharedModule,
        InvmgmtHomeModule,
        InvmgmtAdminModule,
        InvmgmtAccountModule,
        InvmgmtEntityModule,
        SearchLotModule,
        DataEntryModule
        // jhipster-needle-angular-add-module JHipster will add new module here
    ],
    declarations: [
        JhiMainComponent,
        NavbarComponent,
        ErrorComponent,
        PageRibbonComponent,
        ActiveMenuDirective,
        FooterComponent
    ],
    providers: [
        ProfileService,
        customHttpProvider(),
        PaginationConfig,
        UserRouteAccessService
    ],
    bootstrap: [ JhiMainComponent ]
})
export class InvmgmtAppModule {}
