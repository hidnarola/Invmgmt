import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { SearchLotService } from './search-lot.service';
import { DataEntryService } from '../data-entry/data-entry.service';

@Component({
  selector: 'jhi-search-lot',
  templateUrl: './search-lot.component.html',
  providers: [SearchLotService, DataEntryService]
  // styleUrls: ['./search-lot.component.css']
})
export class SearchLotComponent implements OnInit {
  lot_nos = '';
  lots = [];
  lot_nos_arr = [];

  constructor(
    private searchLotService: SearchLotService,
    private dataEntryService: DataEntryService,
    private router: Router
  ) { }

  ngOnInit() {
  }

  fnSearchLot() {
    const lot_nos_str = this.lot_nos.trim().replace(/(\r\n|\r|\n)+/g, ',');
    this.lot_nos_arr = lot_nos_str.split(',');
    this.searchLotService.search_lot(this.lot_nos_arr).subscribe((res) => {
      this.lots = res;
    }, (err) => { });
  }

  fnDataEntry() {
    localStorage.setItem('selected_lots', this.lot_nos_arr.join(','));
    this.router.navigate(['/data_entry']);
  }

  fnShowCashSale() { }
  fnPrintTag() { }

  fnClearSearchLot() {
    this.lot_nos = '';
    this.lots = [];
  }
}
