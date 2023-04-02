import { Injectable } from '@angular/core';
import {IWord} from "../component/ss07/bt-dictionary/IWord";

@Injectable({
  providedIn: 'root'
})
export class DictionaryService {
  dictionary: IWord[]=[
    {
      word: "hello",
      mean: "xin chào"
    },{
      word: "goodbye",
      mean: "tạm biệt"
    },{
      word: "Good morning",
      mean: "Chào buổi sáng"
    },{
      word: "Good night",
      mean: "Chúc ngủ ngon"
    }
  ]

  constructor() { }

  getAll(){
    return this.dictionary;
  }

  findByWord(inputWord: string): IWord{
    return this.dictionary.find(word => word.word === inputWord)
  }
}
