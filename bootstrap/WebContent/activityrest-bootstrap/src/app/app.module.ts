import { BrowserModule } from "@angular/platform-browser";
import { HttpClientModule } from "@angular/common/http";
import { NgModule } from "@angular/core";
import { FormsModule } from "@angular/forms";
import {
  FontAwesomeModule,
  FaIconLibrary,
} from "@fortawesome/angular-fontawesome";

import { AppComponent } from "./app.component";
import { ActivityDescriptionComponent } from "./activity-description/activity-description.component";
import { FunctionalEntityComponent } from "./functional-entity/functional-entity.component";
import { DeploymentModelComponent } from "./deployment-model/deployment-model.component";
import { ExitCodeDetailComponent } from "./exit-code-detail/exit-code-detail.component";
import { CommandLineTemplateComponent } from "./command-line-template/command-line-template.component";
import { LiteralCommandLineTemplateComponent } from "./literal-command-line-template/literal-command-line-template.component";
import { StringListManipulatorsComponent } from "./string-list-manipulators/string-list-manipulators.component";
import { ArtifactsGenerationComponent } from "./artifacts-generation/artifacts-generation.component";
import { ActivityDescriptionDetailComponent } from "./activity-description-detail/activity-description-detail.component";
import { FunctionalEntityDetailComponent } from "./functional-entity-detail/functional-entity-detail.component";
@NgModule({
  declarations: [
    AppComponent,
    ActivityDescriptionComponent,
    FunctionalEntityComponent,
    DeploymentModelComponent,
    ExitCodeDetailComponent,
    CommandLineTemplateComponent,
    LiteralCommandLineTemplateComponent,
    StringListManipulatorsComponent,
    ArtifactsGenerationComponent,
    ActivityDescriptionDetailComponent,
    FunctionalEntityDetailComponent,
  ],
  imports: [BrowserModule, FormsModule, HttpClientModule, FontAwesomeModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
