import { Component, OnInit } from '@angular/core';
import {IWord} from "../IWord";
import {DictionaryService} from "../../../../service/dictionary.service";

@Component({
  selector: 'app-dictionary-page',
  templateUrl: './dictionary-page.component.html',
  styleUrls: ['./dictionary-page.component.css']
})
export class DictionaryPageComponent implements OnInit {
  dictionary: IWord[];

  constructor(private dictionaryService: DictionaryService) { }

  ngOnInit(): void {
    this.getAll()
  }

  getAll(){
    this.dictionary = this.dictionaryService.getAll();
  }
}
