import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ThTimelinesComponent } from "./component/ss07/th-timelines/th-timelines.component";
import {ThYoutubePlaylistComponent} from "./component/ss07/th-youtube-playlist/th-youtube-playlist.component";
import {YoutubePlayerComponent} from "./component/ss07/th-youtube-playlist/youtube-player/youtube-player.component";
import {ProductListComponent} from "./component/ss07/product-managerment/product-list/product-list.component";
import {ProductCreateComponent} from "./component/ss07/product-managerment/product-create/product-create.component";
import {ProductUpdateComponent} from "./component/ss07/product-managerment/product-update/product-update.component";
import {BrowserModule} from "@angular/platform-browser";
import {FormsModule} from "@angular/forms";
import {ProductDeleteComponent} from "./component/ss07/product-managerment/product-delete/product-delete.component";
import {DictionaryComponent} from "./component/ss07/bt-dictionary/dictionary-detail/dictionary.component";
import {DictionaryPageComponent} from "./component/ss07/bt-dictionary/dictionary-page/dictionary-page.component";


const routes: Routes = [
  // ss07 th-timelines
//   {
//   path: 'timelines',
//   component: ThTimelinesComponent
// },
  // ss07 th-youtube-playlist
  // {
  //   path: 'youtube',
  //   component: ThYoutubePlaylistComponent,
  //   children: [{
  //     path: ':id',
  //     component: YoutubePlayerComponent
  //   }]
  // },
  // ss07 product-managerment
  // {
  //   path: 'product/list',
  //   component: ProductListComponent
  // },{
  //   path: 'product/create',
  //   component: ProductCreateComponent
  // },{
  //   path: 'product/edit/:id',
  //   component: ProductUpdateComponent
  // },{
  //   path: 'product/delete/:id',
  //   component: ProductDeleteComponent
  // }

  //ss07 dictionary
  {
    path: 'dictionary',
    component: DictionaryPageComponent
  },
  {
    path: 'dictionary/view/:word',
    component: DictionaryComponent
  }
];

@NgModule({
  imports: [BrowserModule, FormsModule, RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
