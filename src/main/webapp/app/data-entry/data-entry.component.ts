import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { DataEntryService } from './data-entry.service';
import { SearchLotService } from '../search-lot/search-lot.service';

@Component({
  selector: 'jhi-data-entry',
  templateUrl: './data-entry.component.html'
})
export class DataEntryComponent implements OnInit {
  saleGroups = [
    { id: 1, name: 'Local HKD' },
    { id: 2, name: 'Normal' }
  ];
  selectedSaleGroup = {};
  lot_data = {};
  sale_persons;
  categories;
  locations;
  selected_lots;
  minDate: Date;
  lots = [];

  constructor(
    private route: ActivatedRoute,
    private dataEntryService: DataEntryService,
    private searchLotService: SearchLotService
  ) {

  }

  ngOnInit() {
    this.sale_persons = this.route.snapshot.data['sale_persons'];
    this.categories = this.route.snapshot.data['categories'];
    this.locations = this.route.snapshot.data['locations'];
    this.selected_lots = this.route.snapshot.data['selected_lots'];
    this.minDate = new Date();
  }
}
