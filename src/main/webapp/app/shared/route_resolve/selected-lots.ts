import { Injectable } from '@angular/core';
import { Resolve, ActivatedRouteSnapshot } from '@angular/router';
import { SearchLotService } from '../../search-lot/search-lot.service';

@Injectable()
export class SelectedLotsResolve implements Resolve<any> {

    constructor(private searchLotService: SearchLotService) { }

    resolve(route: ActivatedRouteSnapshot) {
        return this.searchLotService.search_lot(localStorage.getItem('selected_lots').split(','));
    }
}
