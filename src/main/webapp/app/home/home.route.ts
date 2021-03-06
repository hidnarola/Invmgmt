import { Route } from '@angular/router';

import { HomeComponent } from './';

export const HOME_ROUTE: Route = {
    path: 'home',
    component: HomeComponent,
    data: {
        authorities: ['ROLE_ADMIN'],
        pageTitle: 'home.title'
    }
};
