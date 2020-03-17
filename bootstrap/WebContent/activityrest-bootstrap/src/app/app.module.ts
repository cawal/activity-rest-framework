import { BrowserModule } from "@angular/platform-browser";
import { NgModule } from "@angular/core";
import { FormsModule } from "@angular/forms";

import { AppComponent } from "./app.component";
import { ActivityDescriptionComponent } from "./activity-description/activity-description.component";
import { FunctionalEntityComponent } from "./functional-entity/functional-entity.component";
import { DeploymentModelComponent } from "./deployment-model/deployment-model.component";
import { ExitCodeDetailComponent } from "./exit-code-detail/exit-code-detail.component";
import { CommandLineTemplateComponent } from "./command-line-template/command-line-template.component";
import { LiteralCommandLineTemplateComponent } from "./literal-command-line-template/literal-command-line-template.component";
import { StringListManipulatorsComponent } from "./string-list-manipulators/string-list-manipulators.component";
import { ArtifactsGenerationComponent } from "./artifacts-generation/artifacts-generation.component";

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
    ArtifactsGenerationComponent
  ],
  imports: [BrowserModule, FormsModule],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {}
