import { Injectable } from '@angular/core';
import { Resolve, ActivatedRouteSnapshot } from '@angular/router';
import { DataEntryService } from '../../data-entry/data-entry.service';

@Injectable()
export class SalePersonsResolve implements Resolve<any> {

    constructor(private dataEntryService: DataEntryService) { }

    resolve(route: ActivatedRouteSnapshot) {
        return this.dataEntryService.getSalePersons();
    }
}
