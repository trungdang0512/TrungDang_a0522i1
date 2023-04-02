import { Component, OnInit } from '@angular/core';
import { faThumbsUp, faThumbsDown } from '@fortawesome/free-solid-svg-icons';

@Component({
  selector: 'app-like',
  templateUrl: './like.component.html',
  styleUrls: ['./like.component.css']
})
export class LikeComponent implements OnInit {
  faThumpsUp = faThumbsUp;
  faThumpsDown = faThumbsDown;

  like = 0;

  constructor() { }

  ngOnInit(): void {
  }

  likeThis(){
    this.like++;
  }

  unLikeThis(){
    this.like--;
  }
}
