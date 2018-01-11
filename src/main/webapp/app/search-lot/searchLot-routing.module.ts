import { Route } from '@angular/router';
import { UserRouteAccessService } from '../shared';
import { SearchLotComponent } from './search-lot.component';

export const SEARCH_LOT_ROUTE: Route = {
    path: '',
    component: SearchLotComponent,
    data: {
        authorities: ['ROLE_ADMIN'],
        pageTitle: 'searchlot'
    },
    canActivate: [UserRouteAccessService]
};
