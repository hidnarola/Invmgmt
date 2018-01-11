/*
import { Route } from '@angular/router';
import { UserRouteAccessService } from '../app/shared';
import { NavbarComponent } from './layouts';

export const navbarRoute: Route = {
    path: '',
    data: {
        authorities: ['ROLE_ADMIN']
    },
    component: NavbarComponent,
    outlet: 'navbar',
    canActivate: [UserRouteAccessService]
};
*/


import { Route } from '@angular/router';
import { UserRouteAccessService } from '../app/shared';
import { SearchLotComponent } from './search-lot/search-lot.component';

export const SEARCH_LOT_ROUTE: Route = {
    path: '',
    data: {
        authorities: ['ROLE_ADMIN']
    },
    component: SearchLotComponent,
    canActivate: ['ROLE_ADMIN']
};
