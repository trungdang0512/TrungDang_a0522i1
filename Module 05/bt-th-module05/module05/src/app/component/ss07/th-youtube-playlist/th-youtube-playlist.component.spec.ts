import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ThYoutubePlaylistComponent } from './th-youtube-playlist.component';

describe('ThYoutubePlaylistComponent', () => {
  let component: ThYoutubePlaylistComponent;
  let fixture: ComponentFixture<ThYoutubePlaylistComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ThYoutubePlaylistComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ThYoutubePlaylistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
