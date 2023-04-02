import { Component, OnInit } from '@angular/core';
import {Song} from "./song";
import {SongService} from "../../../service/song.service";

@Component({
  selector: 'app-th-youtube-playlist',
  templateUrl: './th-youtube-playlist.component.html',
  styleUrls: ['./th-youtube-playlist.component.css']
})
export class ThYoutubePlaylistComponent implements OnInit {
  playlist: Song[] = [];

  constructor(private songService: SongService) { }

  ngOnInit(): void {
    this.getAll();
  }

  getAll() {
    this.playlist = this.songService.playlist;
  }
}
