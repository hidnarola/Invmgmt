import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UserRouteAccessService } from './shared';
import { errorRoute } from './layouts';

import { SEARCH_LOT_ROUTE } from './search-lot/searchLot-routing.module'

const LAYOUT_ROUTES = [
    SEARCH_LOT_ROUTE,
    ...errorRoute
];

@NgModule({
    imports: [
        RouterModule.forRoot(LAYOUT_ROUTES, { useHash: true })
    ],
    exports: [
        RouterModule
    ]
})
export class InvmgmtAppRoutingModule { }
