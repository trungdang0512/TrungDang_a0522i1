import { Component, OnInit } from '@angular/core';
import {IWord} from "../IWord";
import {ActivatedRoute, Router} from "@angular/router";
import {DictionaryService} from "../../../../service/dictionary.service";

@Component({
  selector: 'app-dictionary',
  templateUrl: './dictionary.component.html',
  styleUrls: ['./dictionary.component.css']
})
export class DictionaryComponent implements OnInit {
  dictionary: IWord = {};
  input: string;

  constructor(private activatedRoute: ActivatedRoute,
              private dictionaryService: DictionaryService,
              private route: Router) {
    this.activatedRoute.paramMap.subscribe(next =>{
      const input = next.get('word');
      if (input != null){
        this.dictionary = this.dictionaryService.findByWord(input);
          console.log(input);
      }
    }, error => {
    }, () => {
    });
  }

  ngOnInit(): void {
  }

}
