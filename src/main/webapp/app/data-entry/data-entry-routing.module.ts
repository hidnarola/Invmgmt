import { Route } from '@angular/router';
import { UserRouteAccessService } from '../shared';
import { DataEntryComponent } from './data-entry.component';
import { SalePersonsResolve, CategoriesResolve, LocationsResolve, SelectedLotsResolve } from '../shared/route_resolve';

export const dataEntryRoute: Route = {
    path: 'data_entry',
    component: DataEntryComponent,
    data: {
        authorities: ['ROLE_ADMIN'],
        pageTitle: 'searchlot'
    },
    resolve: {
        sale_persons: SalePersonsResolve,
        categories : CategoriesResolve,
        locations : LocationsResolve,
        selected_lots : SelectedLotsResolve
    },
    canActivate: [UserRouteAccessService]
};
