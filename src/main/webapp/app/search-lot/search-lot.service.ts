import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import { SERVER_API_URL } from '../app.constants';

@Injectable()
export class SearchLotService {

    constructor(private http: HttpClient) {}

    search_lot(lot_no_arr: any): Observable<any> {
        return this.http.post(SERVER_API_URL + 'api/lots', lot_no_arr);
    }
}
