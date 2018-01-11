import { Injectable } from '@angular/core';
import { Http } from '@angular/http';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import { BehaviorSubject } from 'rxjs/BehaviorSubject';
import { SERVER_API_URL } from '../app.constants';

@Injectable()
export class DataEntryService {
    private share_data: any;
    private subject = new BehaviorSubject<string>('default message');
    currentShareData = this.subject.asObservable();
    constructor(
        private httpClient: HttpClient
    ) {
        this.share_data = [];
    }

    setShareData(data) {
        console.log('data = ', data);
        this.subject.next(data);
    }
    getSalePersons() {
        return this.httpClient.get(SERVER_API_URL + 'api/invoice/salesperson');
    }
    getLocations() {
        return this.httpClient.get(SERVER_API_URL + 'api/invoice/location');
    }
    getCategories() {
        return this.httpClient.get(SERVER_API_URL + 'api/invoice/category');
    }
}
