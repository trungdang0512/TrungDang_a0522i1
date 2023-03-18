import {Component, Input, OnInit} from '@angular/core';

@Component({
  selector: 'app-th-progress-bar',
  templateUrl: './th-progress-bar.component.html',
  styleUrls: ['./th-progress-bar.component.css']
})
export class ThProgressBarComponent implements OnInit {
  @Input() backgroundColor = '#D9D9D9';
  @Input() progressColor = '#4CAF50';
  @Input() progress = 0;

  constructor() { }

  ngOnInit(): void {
  }

  loading() {
    let interval = setInterval(() => {
      this.progress = +this.progress + 5;
      if (this.progress == 100) {
        clearInterval(interval);
      }
    }, 1000);
  }
}
