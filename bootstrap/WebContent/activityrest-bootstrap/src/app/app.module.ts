import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { ActivityDescriptionComponent } from './activity-description/activity-description.component';
import { FuctionalEntityComponent } from './fuctional-entity/fuctional-entity.component';
import { DeploymentModelComponent } from './deployment-model/deployment-model.component';
import { ExitCodeDetailComponent } from './exit-code-detail/exit-code-detail.component';
import { CommandLineTemplateComponent } from './command-line-template/command-line-template.component';

@NgModule({
  declarations: [
    AppComponent,
    ActivityDescriptionComponent,
    FuctionalEntityComponent,
    DeploymentModelComponent,
    ExitCodeDetailComponent,
    CommandLineTemplateComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
