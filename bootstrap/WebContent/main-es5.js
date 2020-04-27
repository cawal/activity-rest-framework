function _possibleConstructorReturn(self, call) { if (call && (typeof call === "object" || typeof call === "function")) { return call; } return _assertThisInitialized(self); }

function _assertThisInitialized(self) { if (self === void 0) { throw new ReferenceError("this hasn't been initialised - super() hasn't been called"); } return self; }

function _getPrototypeOf(o) { _getPrototypeOf = Object.setPrototypeOf ? Object.getPrototypeOf : function _getPrototypeOf(o) { return o.__proto__ || Object.getPrototypeOf(o); }; return _getPrototypeOf(o); }

function _inherits(subClass, superClass) { if (typeof superClass !== "function" && superClass !== null) { throw new TypeError("Super expression must either be null or a function"); } subClass.prototype = Object.create(superClass && superClass.prototype, { constructor: { value: subClass, writable: true, configurable: true } }); if (superClass) _setPrototypeOf(subClass, superClass); }

function _setPrototypeOf(o, p) { _setPrototypeOf = Object.setPrototypeOf || function _setPrototypeOf(o, p) { o.__proto__ = p; return o; }; return _setPrototypeOf(o, p); }

function _classCallCheck(instance, Constructor) { if (!(instance instanceof Constructor)) { throw new TypeError("Cannot call a class as a function"); } }

function _defineProperties(target, props) { for (var i = 0; i < props.length; i++) { var descriptor = props[i]; descriptor.enumerable = descriptor.enumerable || false; descriptor.configurable = true; if ("value" in descriptor) descriptor.writable = true; Object.defineProperty(target, descriptor.key, descriptor); } }

function _createClass(Constructor, protoProps, staticProps) { if (protoProps) _defineProperties(Constructor.prototype, protoProps); if (staticProps) _defineProperties(Constructor, staticProps); return Constructor; }

(window["webpackJsonp"] = window["webpackJsonp"] || []).push([["main"], {
  /***/
  "./$$_lazy_route_resource lazy recursive":
  /*!******************************************************!*\
    !*** ./$$_lazy_route_resource lazy namespace object ***!
    \******************************************************/

  /*! no static exports found */

  /***/
  function $$_lazy_route_resourceLazyRecursive(module, exports) {
    function webpackEmptyAsyncContext(req) {
      // Here Promise.resolve().then() is used instead of new Promise() to prevent
      // uncaught exception popping up in devtools
      return Promise.resolve().then(function () {
        var e = new Error("Cannot find module '" + req + "'");
        e.code = 'MODULE_NOT_FOUND';
        throw e;
      });
    }

    webpackEmptyAsyncContext.keys = function () {
      return [];
    };

    webpackEmptyAsyncContext.resolve = webpackEmptyAsyncContext;
    module.exports = webpackEmptyAsyncContext;
    webpackEmptyAsyncContext.id = "./$$_lazy_route_resource lazy recursive";
    /***/
  },

  /***/
  "./node_modules/raw-loader/dist/cjs.js!./src/app/activity-description-detail/activity-description-detail.component.html":
  /*!******************************************************************************************************************************!*\
    !*** ./node_modules/raw-loader/dist/cjs.js!./src/app/activity-description-detail/activity-description-detail.component.html ***!
    \******************************************************************************************************************************/

  /*! exports provided: default */

  /***/
  function node_modulesRawLoaderDistCjsJsSrcAppActivityDescriptionDetailActivityDescriptionDetailComponentHtml(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony default export */


    __webpack_exports__["default"] = "<div *ngIf=\"this.isParameter(this.detailedComponent)\" class=\"parameter\">\n  <h3>Parameter:</h3>\n\n  <label [attr.title]=\"lang.parameterName\"\n    >Name:\n    <input\n      [(ngModel)]=\"this.detailedComponent.name\"\n      placeholder=\"name\"\n      type=\"text\"\n    />\n  </label>\n\n  <label [attr.title]=\"lang.parameterType\"\n    >Type:\n    <select [(ngModel)]=\"this.detailedComponent.parameterType\">\n      <option\n        *ngFor=\"let symbol of keys(parameterTypes)\"\n        [ngValue]=\"parameterTypes[symbol]\"\n        [attr.title]=\"lang.paramsTypes[symbol]\"\n      >\n        {{ symbol }}\n      </option>\n    </select>\n  </label>\n\n  <label [attr.title]=\"lang.parameterMinimumCardinality\"\n    >Minimum cardinality:\n    <input\n      [(ngModel)]=\"this.detailedComponent.minimumCardinality\"\n      placeholder=\"Minimum cardinality\"\n      type=\"number\"\n      min=\"1\"\n    />\n  </label>\n\n  <label [attr.title]=\"lang.parameterMaximumCardinality\"\n    >Maximum cardinality:\n    <input\n      [(ngModel)]=\"this.detailedComponent.maximumCardinality\"\n      placeholder=\"Maximum cardinality\"\n      type=\"number\"\n      min=\"-1\"\n    />\n  </label>\n\n  <label [attr.title]=\"lang.remarks\"\n    >Remarks:\n    <textarea\n      [(ngModel)]=\"this.detailedComponent.remark\"\n      placeholder=\"Remarks\"\n    ></textarea>\n  </label>\n</div>\n\n<div *ngIf=\"this.isInputDataset(this.detailedComponent)\">\n  <h3>Input dataset:</h3>\n  <label [attr.title]=\"lang.datasetName\"\n    >Name:\n    <input\n      [(ngModel)]=\"this.detailedComponent.name\"\n      placeholder=\"name\"\n      type=\"text\"\n    />\n  </label>\n\n  <label [attr.title]=\"lang.datasetMimeType\"\n    >MIME Type:\n    <input\n      [(ngModel)]=\"this.detailedComponent.mimeType\"\n      placeholder=\"mimeType\"\n      type=\"text\"\n    />\n  </label>\n\n  <label [attr.title]=\"lang.datasetMinimumCardinality\"\n    >Minimum cardinality:\n    <input\n      [(ngModel)]=\"this.detailedComponent.minimumCardinality\"\n      placeholder=\"Minimum cardinality\"\n      type=\"number\"\n      min=\"1\"\n    />\n  </label>\n\n  <label [attr.title]=\"lang.datasetMaximumCardinality\"\n    >Maximum cardinality:\n    <input\n      [(ngModel)]=\"this.detailedComponent.maximumCardinality\"\n      placeholder=\"Maximum cardinality\"\n      type=\"number\"\n      min=\"-1\"\n    />\n  </label>\n\n  <label [attr.title]=\"lang.remarks\"\n    >Remarks:\n    <textarea\n      [(ngModel)]=\"this.detailedComponent.remark\"\n      placeholder=\"Remarks\"\n    ></textarea>\n  </label>\n</div>\n\n<div *ngIf=\"this.isOutputDataset(this.detailedComponent)\">\n  <h3>Output dataset:</h3>\n  <label [attr.title]=\"lang.datasetName\"\n    >Name:\n    <input\n      [(ngModel)]=\"this.detailedComponent.name\"\n      placeholder=\"name\"\n      type=\"text\"\n    />\n  </label>\n\n  <label [attr.title]=\"lang.datasetMimeType\"\n    >MIME Type:\n    <input\n      [(ngModel)]=\"this.detailedComponent.mimeType\"\n      placeholder=\"mimeType\"\n      type=\"text\"\n    />\n  </label>\n\n  <label [attr.title]=\"lang.datasetMinimumCardinality\"\n    >Minimum cardinality:\n    <input\n      [(ngModel)]=\"this.detailedComponent.minimumCardinality\"\n      placeholder=\"Minimum cardinality\"\n      type=\"number\"\n      min=\"1\"\n    />\n  </label>\n\n  <label [attr.title]=\"lang.datasetMaximumCardinality\"\n    >Maximum cardinality:\n    <input\n      [(ngModel)]=\"this.detailedComponent.maximumCardinality\"\n      placeholder=\"Maximum cardinality\"\n      type=\"number\"\n      min=\"-1\"\n    />\n  </label>\n\n  <label [attr.title]=\"lang.remarks\"\n    >Remarks:\n    <textarea\n      [(ngModel)]=\"this.detailedComponent.remark\"\n      placeholder=\"Remarks\"\n    ></textarea>\n  </label>\n</div>\n";
    /***/
  },

  /***/
  "./node_modules/raw-loader/dist/cjs.js!./src/app/activity-description/activity-description.component.html":
  /*!****************************************************************************************************************!*\
    !*** ./node_modules/raw-loader/dist/cjs.js!./src/app/activity-description/activity-description.component.html ***!
    \****************************************************************************************************************/

  /*! exports provided: default */

  /***/
  function node_modulesRawLoaderDistCjsJsSrcAppActivityDescriptionActivityDescriptionComponentHtml(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony default export */


    __webpack_exports__["default"] = "<div class=\"main\">\n  <div *ngIf=\"activity\" class=\"model\">\n    <h2 [attr.title]=\"lang.activity\">Activity</h2>\n    <label [attr.title]=\"lang.activityName\"\n      >Name:\n      <input [(ngModel)]=\"activity.name\" placeholder=\"name\" type=\"text\" />\n    </label>\n    <h3 [attr.title]=\"lang.parameter\">\n      Parameters:\n    </h3>\n\n    <div *ngFor=\"let p of activity.parameters\" class=\"parameter\">\n      <div>\n        <button (click)=\"this.showDetail(p)\" [attr.title]=\"lang.parameterEdit\">\n          {{ p.name }}\n        </button>\n        <button\n          (click)=\"removeParameter(p)\"\n          [attr.title]=\"lang.parameterRemove\"\n          class=\"icon\"\n        >\n          <fa-icon [icon]=\"iconRemove\"></fa-icon>\n        </button>\n      </div>\n    </div>\n\n    <button (click)=\"addParameter()\" [attr.title]=\"lang.parameterAdd\">\n      <fa-icon [icon]=\"iconAdd\"></fa-icon>\n    </button>\n\n    <h3 [attr.title]=\"lang.inputDataset\">\n      Input datasets:\n    </h3>\n\n    <div *ngFor=\"let d of activity.inputDatasets\" class=\"input-dataset\">\n      <div>\n        <button (click)=\"this.showDetail(d)\" [attr.title]=\"lang.datasetEdit\">\n          {{ d.name }}\n        </button>\n        <button\n          (click)=\"removeInputDataset(d)\"\n          [attr.title]=\"lang.datasetRemove\"\n        >\n          <fa-icon [icon]=\"iconRemove\"></fa-icon>\n        </button>\n      </div>\n    </div>\n\n    <button (click)=\"addInputDataset()\" [attr.title]=\"lang.datasetAdd\">\n      <fa-icon [icon]=\"iconAdd\"></fa-icon>\n    </button>\n\n    <h3 [attr.title]=\"lang.outputDataset\">\n      Output datasets:\n    </h3>\n\n    <div *ngFor=\"let d of activity.outputDatasets\" class=\"output-dataset\">\n      <div>\n        <button (click)=\"this.showDetail(d)\" [attr.title]=\"lang.datasetEdit\">\n          {{ d.name }}\n        </button>\n        <button\n          (click)=\"removeOutputDataset(d)\"\n          [attr.title]=\"lang.datasetRemove\"\n        >\n          <fa-icon [icon]=\"iconRemove\"></fa-icon>\n        </button>\n      </div>\n    </div>\n\n    <button (click)=\"addOutputDataset()\">\n      <fa-icon [icon]=\"iconAdd\" [attr.title]=\"lang.datasetAdd\"></fa-icon>\n    </button>\n  </div>\n  <app-activity-description-detail\n    [detailedComponent]=\"this.detail\"\n    class=\"detail\"\n  ></app-activity-description-detail>\n</div>\n";
    /***/
  },

  /***/
  "./node_modules/raw-loader/dist/cjs.js!./src/app/app.component.html":
  /*!**************************************************************************!*\
    !*** ./node_modules/raw-loader/dist/cjs.js!./src/app/app.component.html ***!
    \**************************************************************************/

  /*! exports provided: default */

  /***/
  function node_modulesRawLoaderDistCjsJsSrcAppAppComponentHtml(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony default export */


    __webpack_exports__["default"] = "<body>\n  <h1>{{ title }}</h1>\n  <div class=\"main\">\n    <div class=\"navigation\">\n      <button (click)=\"showActivity()\">Step 1: Activity description</button>\n      <button\n        (click)=\"showFunctionalEntity()\"\n        [disabled]=\"!this.isFunctionalEntityEnabled\"\n      >\n        Step 2: Command line tool description\n      </button>\n      <button (click)=\"showDeployment()\" [disabled]=\"!this.isDeploymentEnabled\">\n        Step 3: Deployment description\n      </button>\n      <button\n        (click)=\"showGenerationScreen()\"\n        [disabled]=\"!this.isGenerationEnabled\"\n      >\n        Step 4: Generate!\n      </button>\n      <button (click)=\"log()\">Print</button>\n    </div>\n    <div class=\"step-detail\">\n      <div *ngIf=\"state == 'ACTIVITY'\">\n        <app-activity-description\n          [activity]=\"activity\"\n        ></app-activity-description>\n      </div>\n\n      <div *ngIf=\"state == 'FUNCTIONAL_ENTITY'\">\n        <app-functional-entity\n          [commandLineTool]=\"functionalEntity\"\n          [activity]=\"activity\"\n        ></app-functional-entity>\n      </div>\n\n      <div *ngIf=\"state == 'DEPLOYMENT'\">\n        <app-deployment-model\n          [deploymentModel]=\"deployment\"\n        ></app-deployment-model>\n      </div>\n\n      <div *ngIf=\"state == 'GENERATION'\">\n        <app-artifacts-generation\n          [generatorService]=\"generatorService\"\n          [activity]=\"activity\"\n          [deployment]=\"deployment\"\n          [functionalEntity]=\"functionalEntity\"\n        ></app-artifacts-generation>\n      </div>\n\n      <div>\n        <button\n          *ngIf=\"state != 'GENERATION'\"\n          (click)=\"moveToNextScreen()\"\n          class=\"next\"\n        >\n          Next\n        </button>\n      </div>\n    </div>\n  </div>\n</body>\n";
    /***/
  },

  /***/
  "./node_modules/raw-loader/dist/cjs.js!./src/app/artifacts-generation/artifacts-generation.component.html":
  /*!****************************************************************************************************************!*\
    !*** ./node_modules/raw-loader/dist/cjs.js!./src/app/artifacts-generation/artifacts-generation.component.html ***!
    \****************************************************************************************************************/

  /*! exports provided: default */

  /***/
  function node_modulesRawLoaderDistCjsJsSrcAppArtifactsGenerationArtifactsGenerationComponentHtml(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony default export */


    __webpack_exports__["default"] = "<h2>Generate artifacts</h2>\n\n<div>\n  <div>\n    <label\n      >Generate Activity-REST service for Java EE / Jakarta EE :\n      <button\n        (click)=\"\n          this.generatorService.generateService(\n            this.activity,\n            this.functionalEntity,\n            this.deployment\n          )\n        \"\n      >\n        Generate!\n      </button>\n    </label>\n  </div>\n  <div>\n    <label\n      >Generate Activity-REST client for CLI/Galaxy:\n      <button\n        (click)=\"\n          this.generatorService.generateClient(\n            activity,\n            functionalEntity,\n            deployment\n          )\n        \"\n      >\n        Generate!\n      </button>\n    </label>\n  </div>\n</div>\n";
    /***/
  },

  /***/
  "./node_modules/raw-loader/dist/cjs.js!./src/app/command-line-template/command-line-template.component.html":
  /*!******************************************************************************************************************!*\
    !*** ./node_modules/raw-loader/dist/cjs.js!./src/app/command-line-template/command-line-template.component.html ***!
    \******************************************************************************************************************/

  /*! exports provided: default */

  /***/
  function node_modulesRawLoaderDistCjsJsSrcAppCommandLineTemplateCommandLineTemplateComponentHtml(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony default export */


    __webpack_exports__["default"] = "<span *ngIf=\"isLiteralTemplate(entryList)\">\n  Literals:\n  <app-literal-command-line-template\n    [literals]=\"entryList\"\n  ></app-literal-command-line-template>\n</span>\n\n<span *ngIf=\"isParameterTemplate(entryList)\">\n  Parameter:\n  <select [(ngModel)]=\"entryList.parameter\">\n    <option *ngFor=\"let p of parameters\" (ngValue)=\"(p)\">\n      {{ p.name }}\n    </option>\n  </select>\n\n  <app-string-list-manipulators\n    [manipulators]=\"entryList.manipulators\"\n  ></app-string-list-manipulators>\n</span>\n\n<span *ngIf=\"isDatasetTemplate(entryList)\">\n  Dataset\n  <select [(ngModel)]=\"entryList.dataset\">\n    <option\n      *ngFor=\"let d of inputDatasets.concat(outputDatasets)\"\n      (ngValue)=\"(d)\"\n    >\n      {{ d.name }}\n    </option>\n  </select>\n\n  <app-string-list-manipulators\n    [manipulators]=\"entryList.manipulators\"\n  ></app-string-list-manipulators>\n</span>\n";
    /***/
  },

  /***/
  "./node_modules/raw-loader/dist/cjs.js!./src/app/deployment-model/deployment-model.component.html":
  /*!********************************************************************************************************!*\
    !*** ./node_modules/raw-loader/dist/cjs.js!./src/app/deployment-model/deployment-model.component.html ***!
    \********************************************************************************************************/

  /*! exports provided: default */

  /***/
  function node_modulesRawLoaderDistCjsJsSrcAppDeploymentModelDeploymentModelComponentHtml(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony default export */


    __webpack_exports__["default"] = "<h2>Deployment information</h2>\n<h3>Service information</h3>\n<div>\n  <label [attr.title]=\"lang.deploy.serviceName\"\n    >Name: <input [(ngModel)]=\"deploymentModel.service.name\" type=\"text\"\n  /></label>\n  <label [attr.title]=\"lang.deploy.serviceVersion\"\n    >API version:\n    <input [(ngModel)]=\"deploymentModel.service.apiVersion\" type=\"text\"\n  /></label>\n  <label [attr.title]=\"lang.remarks\"\n    >Description:\n    <textarea [(ngModel)]=\"deploymentModel.service.description\"></textarea>\n  </label>\n</div>\n\n<h3>Container information</h3>\n<div>\n  <label [attr.title]=\"lang.deploy.containerName\"\n    >Name: <input [(ngModel)]=\"deploymentModel.container.name\" type=\"text\"\n  /></label>\n  <label [attr.title]=\"lang.deploy.containerUrl\"\n    >Base URL:\n    <input [(ngModel)]=\"deploymentModel.container.baseUrl\" type=\"url\"\n  /></label>\n\n  <label [attr.title]=\"lang.remarks\"\n    >Description:\n    <textarea [(ngModel)]=\"deploymentModel.container.description\"></textarea>\n  </label>\n</div>\n\n<h3>Contact information</h3>\n<div>\n  <label [attr.title]=\"lang.deploy.contactName\"\n    >Name:\n    <input [(ngModel)]=\"deploymentModel.contactInformation.name\" type=\"text\"\n  /></label>\n  <label [attr.title]=\"lang.deploy.contactEmail\"\n    >Email:\n    <input [(ngModel)]=\"deploymentModel.contactInformation.email\" type=\"text\"\n  /></label>\n  <label [attr.title]=\"lang.deploy.contactUrl\"\n    >URL:\n    <input [(ngModel)]=\"deploymentModel.contactInformation.url\" type=\"url\"\n  /></label>\n</div>\n";
    /***/
  },

  /***/
  "./node_modules/raw-loader/dist/cjs.js!./src/app/exit-code-detail/exit-code-detail.component.html":
  /*!********************************************************************************************************!*\
    !*** ./node_modules/raw-loader/dist/cjs.js!./src/app/exit-code-detail/exit-code-detail.component.html ***!
    \********************************************************************************************************/

  /*! exports provided: default */

  /***/
  function node_modulesRawLoaderDistCjsJsSrcAppExitCodeDetailExitCodeDetailComponentHtml(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony default export */


    __webpack_exports__["default"] = "<label [attr.title]=\"lang.exitCodeCode\"\n  >Code:\n  <input type=\"number\" [(ngModel)]=\"exitCode.code\" />\n</label>\n\n<label [attr.title]=\"lang.exitCodeStatus\"\n  >Status:\n  <select [(ngModel)]=\"this.exitCode.status\">\n    <option\n      *ngFor=\"let t of keys(terminationStatus)\"\n      (ngValue)=\"(terminationStatus[t])\"\n    >\n      {{ t }}\n    </option>\n  </select>\n</label>\n\n<label [attr.title]=\"lang.exitCodeDescription\"\n  >Description:\n  <textarea [(ngModel)]=\"exitCode.reportMessage\"></textarea>\n</label>\n";
    /***/
  },

  /***/
  "./node_modules/raw-loader/dist/cjs.js!./src/app/functional-entity-detail/functional-entity-detail.component.html":
  /*!************************************************************************************************************************!*\
    !*** ./node_modules/raw-loader/dist/cjs.js!./src/app/functional-entity-detail/functional-entity-detail.component.html ***!
    \************************************************************************************************************************/

  /*! exports provided: default */

  /***/
  function node_modulesRawLoaderDistCjsJsSrcAppFunctionalEntityDetailFunctionalEntityDetailComponentHtml(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony default export */


    __webpack_exports__["default"] = "<div *ngIf=\"this.isExitCode(this.detailedComponent)\">\n  <app-exit-code-detail\n    [exitCode]=\"this.detailedComponent\"\n  ></app-exit-code-detail>\n</div>\n\n<app-command-line-template\n  *ngIf=\"this.isCommandLineEntryList(this.detailedComponent)\"\n  [entryList]=\"this.detailedComponent\"\n  [parameters]=\"this.activity.parameters\"\n  [inputDatasets]=\"this.activity.inputDatasets\"\n  [outputDatasets]=\"this.activity.outputDatasets\"\n></app-command-line-template>\n";
    /***/
  },

  /***/
  "./node_modules/raw-loader/dist/cjs.js!./src/app/functional-entity/functional-entity.component.html":
  /*!**********************************************************************************************************!*\
    !*** ./node_modules/raw-loader/dist/cjs.js!./src/app/functional-entity/functional-entity.component.html ***!
    \**********************************************************************************************************/

  /*! exports provided: default */

  /***/
  function node_modulesRawLoaderDistCjsJsSrcAppFunctionalEntityFunctionalEntityComponentHtml(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony default export */


    __webpack_exports__["default"] = "<div class=\"main\">\n  <div class=\"model\">\n    <h2 [attr.title]=\"lang.commandLineTool\">\n      Command line tool\n    </h2>\n    <label [attr.title]=\"lang.toolName\"\n      >Name:\n      <input\n        [(ngModel)]=\"commandLineTool.name\"\n        placeholder=\"name\"\n        type=\"text\"\n      />\n    </label>\n    <label [attr.title]=\"lang.remarks\"\n      >Remark:\n      <input\n        [(ngModel)]=\"commandLineTool.remark\"\n        placeholder=\"remark\"\n        type=\"text\"\n      />\n    </label>\n\n    <h3 [attr.title]=\"lang.commandLineTemplate\">\n      Command line template:\n    </h3>\n    <div\n      *ngFor=\"let t of commandLineTool.commandLineTemplate\"\n      class=\"command-line-entry\"\n    >\n      <button\n        (click)=\"showDetails(t)\"\n        [attr.title]=\"lang.commandLineTemplateEdit\"\n      >\n        {{ t.getExample(this.activity) }}\n      </button>\n      <button\n        (click)=\"moveEntryListUp(t)\"\n        [attr.title]=\"lang.commandLineTemplateMoveUp\"\n      >\n        <fa-icon [icon]=\"iconUp\"></fa-icon>\n      </button>\n      <button\n        (click)=\"moveEntryListDown(t)\"\n        [attr.title]=\"lang.commandLineTemplateMoveDown\"\n      >\n        <fa-icon [icon]=\"iconDown\"></fa-icon>\n      </button>\n      <button (click)=\"remove(t)\" [attr.title]=\"lang.commandLineTemplateRemove\">\n        <fa-icon [icon]=\"iconRemove\"></fa-icon>\n      </button>\n    </div>\n\n    <div>\n      <button\n        (click)=\"addLiteralCommandLineEntry()\"\n        [attr.title]=\"lang.commandLineTemplateAddLiterals\"\n      >\n        <fa-icon [icon]=\"iconAdd\"></fa-icon> Literals\n      </button>\n      <button\n        (click)=\"addParameterCommandLineEntry()\"\n        [attr.title]=\"lang.commandLineTemplateAddParameter\"\n      >\n        <fa-icon [icon]=\"iconAdd\"></fa-icon> Parameter\n      </button>\n      <button\n        (click)=\"addDatasetCommandLineEntry()\"\n        [attr.title]=\"lang.commandLineTemplateAddDataset\"\n      >\n        <fa-icon [icon]=\"iconAdd\"></fa-icon> Dataset\n      </button>\n    </div>\n\n    <h3 [attr.title]=\"lang.exitCodes\">\n      Exit codes:\n    </h3>\n    <div *ngFor=\"let e of commandLineTool.exitCodes\">\n      <button (click)=\"this.showDetails(e)\" [attr.title]=\"lang.exitCodeEdit\">\n        {{ e.code }} ({{ e.status }})\n      </button>\n      <button (click)=\"removeExitCode(e)\" [attr.title]=\"lang.exitCodeRemove\">\n        <fa-icon [icon]=\"iconRemove\"></fa-icon>\n      </button>\n    </div>\n    <button (click)=\"addExitCode()\" [attr.title]=\"lang.exitCodeAdd\">\n      <fa-icon [icon]=\"iconAdd\"></fa-icon>\n    </button>\n\n    <h3 [attr.title]=\"lang.streamRedirections\">\n      Stream redirections:\n    </h3>\n    <label\n      >Standard input stream:\n      <select [(ngModel)]=\"commandLineTool.standardInputStream\">\n        <option *ngFor=\"let d of activity.inputDatasets\" [ngValue]=\"d\">\n          {{ d.name }}\n        </option>\n      </select>\n    </label>\n\n    <label\n      >Standard output stream:\n      <select [(ngModel)]=\"commandLineTool.standardOutputStream\">\n        <option *ngFor=\"let d of activity.outputDatasets\" [ngValue]=\"d\">\n          {{ d.name }}\n        </option>\n      </select>\n    </label>\n\n    <label\n      >Standard error stream:\n      <select [(ngModel)]=\"commandLineTool.standardErrorStream\">\n        <option *ngFor=\"let d of activity.outputDatasets\" [ngValue]=\"d\">\n          {{ d.name }}\n        </option>\n      </select>\n    </label>\n  </div>\n  <app-functional-entity-detail\n    [detailedComponent]=\"this.detail\"\n    [activity]=\"this.activity\"\n    class=\"detail\"\n  ></app-functional-entity-detail>\n</div>\n";
    /***/
  },

  /***/
  "./node_modules/raw-loader/dist/cjs.js!./src/app/literal-command-line-template/literal-command-line-template.component.html":
  /*!**********************************************************************************************************************************!*\
    !*** ./node_modules/raw-loader/dist/cjs.js!./src/app/literal-command-line-template/literal-command-line-template.component.html ***!
    \**********************************************************************************************************************************/

  /*! exports provided: default */

  /***/
  function node_modulesRawLoaderDistCjsJsSrcAppLiteralCommandLineTemplateLiteralCommandLineTemplateComponentHtml(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony default export */


    __webpack_exports__["default"] = "<div *ngFor=\"let l of literals.literals; let i = index; trackBy: trackByIndex\">\n  <input type=\"text\" [(ngModel)]=\"literals.literals[i]\" />\n  <button\n    (click)=\"removeLiteral(literals.literals[i])\"\n    [attr.title]=\"lang.literalRemove\"\n  >\n    <fa-icon [icon]=\"iconRemove\"></fa-icon>\n  </button>\n</div>\n<button (click)=\"addLiteral()\" [attr.title]=\"lang.literalAdd\">\n  <fa-icon [icon]=\"iconAdd\"></fa-icon>\n</button>\n<app-string-list-manipulators\n  [manipulators]=\"literals.manipulators\"\n></app-string-list-manipulators>\n";
    /***/
  },

  /***/
  "./node_modules/raw-loader/dist/cjs.js!./src/app/string-list-manipulators/string-list-manipulators.component.html":
  /*!************************************************************************************************************************!*\
    !*** ./node_modules/raw-loader/dist/cjs.js!./src/app/string-list-manipulators/string-list-manipulators.component.html ***!
    \************************************************************************************************************************/

  /*! exports provided: default */

  /***/
  function node_modulesRawLoaderDistCjsJsSrcAppStringListManipulatorsStringListManipulatorsComponentHtml(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony default export */


    __webpack_exports__["default"] = "<h4 [attr.title]=\"lang.slm.stringListManipulators\">String list manipulators</h4>\n<div *ngFor=\"let m of manipulators\">\n  <div *ngIf=\"isJoin(m)\" class=\"string-list-manipulator\">\n    Join with delimiter\n    <input [(ngModel)]=\"m.delimiter\" />\n  </div>\n\n  <div *ngIf=\"isPrependEach(m)\" class=\"string-list-manipulator\">\n    Prepend each with\n    <input [(ngModel)]=\"m.value\" />\n  </div>\n\n  <div *ngIf=\"isAppendEach(m)\" class=\"string-list-manipulator\">\n    Append each with\n    <input [(ngModel)]=\"m.value\" />\n  </div>\n\n  <div *ngIf=\"isPrependListWith(m)\" class=\"string-list-manipulator\">\n    Prepend list with\n    <input [(ngModel)]=\"m.value\" />\n  </div>\n\n  <div *ngIf=\"isAppendListWith(m)\" class=\"string-list-manipulator\">\n    Append list with\n    <input [(ngModel)]=\"m.value\" />\n  </div>\n\n  <div *ngIf=\"isToFlag(m)\" class=\"string-list-manipulator\">\n    If true: <input [(ngModel)]=\"m.ifTrue\" /> If false:\n    <input [(ngModel)]=\"m.ifFalse\" />\n  </div>\n  <button (click)=\"moveUp(m)\" [attr.title]=\"lang.slm.up\">\n    <fa-icon [icon]=\"iconUp\"></fa-icon>\n  </button>\n  <button (click)=\"moveDown(m)\" [attr.title]=\"lang.slm.down\">\n    <fa-icon [icon]=\"iconDown\"></fa-icon>\n  </button>\n  <button (click)=\"remove(m)\" [attr.title]=\"lang.slm.remove\">\n    <fa-icon [icon]=\"iconRemove\"></fa-icon>\n  </button>\n</div>\n\n<select [(ngModel)]=\"selectedManipulatorClass\">\n  <option value=\"Join\" [attr.title]=\"lang.slm.Join\">Join</option>\n  <option value=\"PrependEach\" [attr.title]=\"lang.slm.PrependEach\"\n    >PrependEach</option\n  >\n  <option value=\"AppendEach\" [attr.title]=\"lang.slm.AppendEach\"\n    >AppendEach</option\n  >\n  <option value=\"AppendListWith\" [attr.title]=\"lang.slm.AppendListWith\"\n    >AppendListWith</option\n  >\n  <option value=\"PrependListWith\" [attr.title]=\"lang.slm.PrependListWith\"\n    >PrependListWith</option\n  >\n  <option value=\"ToFlag\" [attr.title]=\"lang.slm.ToFlag\">ToFlag</option>\n</select>\n<button (click)=\"add(this.selectedManipulator)\">\n  <fa-icon [icon]=\"iconAdd\"></fa-icon>\n</button>\n";
    /***/
  },

  /***/
  "./node_modules/tslib/tslib.es6.js":
  /*!*****************************************!*\
    !*** ./node_modules/tslib/tslib.es6.js ***!
    \*****************************************/

  /*! exports provided: __extends, __assign, __rest, __decorate, __param, __metadata, __awaiter, __generator, __exportStar, __values, __read, __spread, __spreadArrays, __await, __asyncGenerator, __asyncDelegator, __asyncValues, __makeTemplateObject, __importStar, __importDefault */

  /***/
  function node_modulesTslibTslibEs6Js(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "__extends", function () {
      return __extends;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "__assign", function () {
      return _assign;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "__rest", function () {
      return __rest;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "__decorate", function () {
      return __decorate;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "__param", function () {
      return __param;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "__metadata", function () {
      return __metadata;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "__awaiter", function () {
      return __awaiter;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "__generator", function () {
      return __generator;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "__exportStar", function () {
      return __exportStar;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "__values", function () {
      return __values;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "__read", function () {
      return __read;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "__spread", function () {
      return __spread;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "__spreadArrays", function () {
      return __spreadArrays;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "__await", function () {
      return __await;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "__asyncGenerator", function () {
      return __asyncGenerator;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "__asyncDelegator", function () {
      return __asyncDelegator;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "__asyncValues", function () {
      return __asyncValues;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "__makeTemplateObject", function () {
      return __makeTemplateObject;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "__importStar", function () {
      return __importStar;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "__importDefault", function () {
      return __importDefault;
    });
    /*! *****************************************************************************
    Copyright (c) Microsoft Corporation. All rights reserved.
    Licensed under the Apache License, Version 2.0 (the "License"); you may not use
    this file except in compliance with the License. You may obtain a copy of the
    License at http://www.apache.org/licenses/LICENSE-2.0
    
    THIS CODE IS PROVIDED ON AN *AS IS* BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
    KIND, EITHER EXPRESS OR IMPLIED, INCLUDING WITHOUT LIMITATION ANY IMPLIED
    WARRANTIES OR CONDITIONS OF TITLE, FITNESS FOR A PARTICULAR PURPOSE,
    MERCHANTABLITY OR NON-INFRINGEMENT.
    
    See the Apache Version 2.0 License for specific language governing permissions
    and limitations under the License.
    ***************************************************************************** */

    /* global Reflect, Promise */


    var _extendStatics = function extendStatics(d, b) {
      _extendStatics = Object.setPrototypeOf || {
        __proto__: []
      } instanceof Array && function (d, b) {
        d.__proto__ = b;
      } || function (d, b) {
        for (var p in b) {
          if (b.hasOwnProperty(p)) d[p] = b[p];
        }
      };

      return _extendStatics(d, b);
    };

    function __extends(d, b) {
      _extendStatics(d, b);

      function __() {
        this.constructor = d;
      }

      d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    }

    var _assign = function __assign() {
      _assign = Object.assign || function __assign(t) {
        for (var s, i = 1, n = arguments.length; i < n; i++) {
          s = arguments[i];

          for (var p in s) {
            if (Object.prototype.hasOwnProperty.call(s, p)) t[p] = s[p];
          }
        }

        return t;
      };

      return _assign.apply(this, arguments);
    };

    function __rest(s, e) {
      var t = {};

      for (var p in s) {
        if (Object.prototype.hasOwnProperty.call(s, p) && e.indexOf(p) < 0) t[p] = s[p];
      }

      if (s != null && typeof Object.getOwnPropertySymbols === "function") for (var i = 0, p = Object.getOwnPropertySymbols(s); i < p.length; i++) {
        if (e.indexOf(p[i]) < 0 && Object.prototype.propertyIsEnumerable.call(s, p[i])) t[p[i]] = s[p[i]];
      }
      return t;
    }

    function __decorate(decorators, target, key, desc) {
      var c = arguments.length,
          r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc,
          d;
      if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);else for (var i = decorators.length - 1; i >= 0; i--) {
        if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
      }
      return c > 3 && r && Object.defineProperty(target, key, r), r;
    }

    function __param(paramIndex, decorator) {
      return function (target, key) {
        decorator(target, key, paramIndex);
      };
    }

    function __metadata(metadataKey, metadataValue) {
      if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(metadataKey, metadataValue);
    }

    function __awaiter(thisArg, _arguments, P, generator) {
      return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) {
          try {
            step(generator.next(value));
          } catch (e) {
            reject(e);
          }
        }

        function rejected(value) {
          try {
            step(generator["throw"](value));
          } catch (e) {
            reject(e);
          }
        }

        function step(result) {
          result.done ? resolve(result.value) : new P(function (resolve) {
            resolve(result.value);
          }).then(fulfilled, rejected);
        }

        step((generator = generator.apply(thisArg, _arguments || [])).next());
      });
    }

    function __generator(thisArg, body) {
      var _ = {
        label: 0,
        sent: function sent() {
          if (t[0] & 1) throw t[1];
          return t[1];
        },
        trys: [],
        ops: []
      },
          f,
          y,
          t,
          g;
      return g = {
        next: verb(0),
        "throw": verb(1),
        "return": verb(2)
      }, typeof Symbol === "function" && (g[Symbol.iterator] = function () {
        return this;
      }), g;

      function verb(n) {
        return function (v) {
          return step([n, v]);
        };
      }

      function step(op) {
        if (f) throw new TypeError("Generator is already executing.");

        while (_) {
          try {
            if (f = 1, y && (t = op[0] & 2 ? y["return"] : op[0] ? y["throw"] || ((t = y["return"]) && t.call(y), 0) : y.next) && !(t = t.call(y, op[1])).done) return t;
            if (y = 0, t) op = [op[0] & 2, t.value];

            switch (op[0]) {
              case 0:
              case 1:
                t = op;
                break;

              case 4:
                _.label++;
                return {
                  value: op[1],
                  done: false
                };

              case 5:
                _.label++;
                y = op[1];
                op = [0];
                continue;

              case 7:
                op = _.ops.pop();

                _.trys.pop();

                continue;

              default:
                if (!(t = _.trys, t = t.length > 0 && t[t.length - 1]) && (op[0] === 6 || op[0] === 2)) {
                  _ = 0;
                  continue;
                }

                if (op[0] === 3 && (!t || op[1] > t[0] && op[1] < t[3])) {
                  _.label = op[1];
                  break;
                }

                if (op[0] === 6 && _.label < t[1]) {
                  _.label = t[1];
                  t = op;
                  break;
                }

                if (t && _.label < t[2]) {
                  _.label = t[2];

                  _.ops.push(op);

                  break;
                }

                if (t[2]) _.ops.pop();

                _.trys.pop();

                continue;
            }

            op = body.call(thisArg, _);
          } catch (e) {
            op = [6, e];
            y = 0;
          } finally {
            f = t = 0;
          }
        }

        if (op[0] & 5) throw op[1];
        return {
          value: op[0] ? op[1] : void 0,
          done: true
        };
      }
    }

    function __exportStar(m, exports) {
      for (var p in m) {
        if (!exports.hasOwnProperty(p)) exports[p] = m[p];
      }
    }

    function __values(o) {
      var m = typeof Symbol === "function" && o[Symbol.iterator],
          i = 0;
      if (m) return m.call(o);
      return {
        next: function next() {
          if (o && i >= o.length) o = void 0;
          return {
            value: o && o[i++],
            done: !o
          };
        }
      };
    }

    function __read(o, n) {
      var m = typeof Symbol === "function" && o[Symbol.iterator];
      if (!m) return o;
      var i = m.call(o),
          r,
          ar = [],
          e;

      try {
        while ((n === void 0 || n-- > 0) && !(r = i.next()).done) {
          ar.push(r.value);
        }
      } catch (error) {
        e = {
          error: error
        };
      } finally {
        try {
          if (r && !r.done && (m = i["return"])) m.call(i);
        } finally {
          if (e) throw e.error;
        }
      }

      return ar;
    }

    function __spread() {
      for (var ar = [], i = 0; i < arguments.length; i++) {
        ar = ar.concat(__read(arguments[i]));
      }

      return ar;
    }

    function __spreadArrays() {
      for (var s = 0, i = 0, il = arguments.length; i < il; i++) {
        s += arguments[i].length;
      }

      for (var r = Array(s), k = 0, i = 0; i < il; i++) {
        for (var a = arguments[i], j = 0, jl = a.length; j < jl; j++, k++) {
          r[k] = a[j];
        }
      }

      return r;
    }

    ;

    function __await(v) {
      return this instanceof __await ? (this.v = v, this) : new __await(v);
    }

    function __asyncGenerator(thisArg, _arguments, generator) {
      if (!Symbol.asyncIterator) throw new TypeError("Symbol.asyncIterator is not defined.");
      var g = generator.apply(thisArg, _arguments || []),
          i,
          q = [];
      return i = {}, verb("next"), verb("throw"), verb("return"), i[Symbol.asyncIterator] = function () {
        return this;
      }, i;

      function verb(n) {
        if (g[n]) i[n] = function (v) {
          return new Promise(function (a, b) {
            q.push([n, v, a, b]) > 1 || resume(n, v);
          });
        };
      }

      function resume(n, v) {
        try {
          step(g[n](v));
        } catch (e) {
          settle(q[0][3], e);
        }
      }

      function step(r) {
        r.value instanceof __await ? Promise.resolve(r.value.v).then(fulfill, reject) : settle(q[0][2], r);
      }

      function fulfill(value) {
        resume("next", value);
      }

      function reject(value) {
        resume("throw", value);
      }

      function settle(f, v) {
        if (f(v), q.shift(), q.length) resume(q[0][0], q[0][1]);
      }
    }

    function __asyncDelegator(o) {
      var i, p;
      return i = {}, verb("next"), verb("throw", function (e) {
        throw e;
      }), verb("return"), i[Symbol.iterator] = function () {
        return this;
      }, i;

      function verb(n, f) {
        i[n] = o[n] ? function (v) {
          return (p = !p) ? {
            value: __await(o[n](v)),
            done: n === "return"
          } : f ? f(v) : v;
        } : f;
      }
    }

    function __asyncValues(o) {
      if (!Symbol.asyncIterator) throw new TypeError("Symbol.asyncIterator is not defined.");
      var m = o[Symbol.asyncIterator],
          i;
      return m ? m.call(o) : (o = typeof __values === "function" ? __values(o) : o[Symbol.iterator](), i = {}, verb("next"), verb("throw"), verb("return"), i[Symbol.asyncIterator] = function () {
        return this;
      }, i);

      function verb(n) {
        i[n] = o[n] && function (v) {
          return new Promise(function (resolve, reject) {
            v = o[n](v), settle(resolve, reject, v.done, v.value);
          });
        };
      }

      function settle(resolve, reject, d, v) {
        Promise.resolve(v).then(function (v) {
          resolve({
            value: v,
            done: d
          });
        }, reject);
      }
    }

    function __makeTemplateObject(cooked, raw) {
      if (Object.defineProperty) {
        Object.defineProperty(cooked, "raw", {
          value: raw
        });
      } else {
        cooked.raw = raw;
      }

      return cooked;
    }

    ;

    function __importStar(mod) {
      if (mod && mod.__esModule) return mod;
      var result = {};
      if (mod != null) for (var k in mod) {
        if (Object.hasOwnProperty.call(mod, k)) result[k] = mod[k];
      }
      result.default = mod;
      return result;
    }

    function __importDefault(mod) {
      return mod && mod.__esModule ? mod : {
        default: mod
      };
    }
    /***/

  },

  /***/
  "./src/app/activity-description-detail/activity-description-detail.component.css":
  /*!***************************************************************************************!*\
    !*** ./src/app/activity-description-detail/activity-description-detail.component.css ***!
    \***************************************************************************************/

  /*! exports provided: default */

  /***/
  function srcAppActivityDescriptionDetailActivityDescriptionDetailComponentCss(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony default export */


    __webpack_exports__["default"] = "*[data-descr] {\n  position: relative;\n  cursor: help;\n}\n\n*[data-descr]:after {\n  vertical-align: top;\n  color: inherit;\n  font-size: small;\n  content: \"?\";\n}\n\n*[data-descr]:hover::after,\n*[data-descr]:focus::after {\n  content: attr(data-descr);\n\n  position: absolute;\n  left: auto;\n  min-width: 200px;\n  border: 1px #aaaaaa solid;\n  border-radius: 10px;\n  background-color: #0b4a92;\n  padding: 12px;\n  color: #e0e0e0;\n\n  font-size: 14px;\n  font-style: normal;\n  font-weight: lighter;\n  z-index: 1;\n  text-align: center;\n  opacity: 0.9;\n  -webkit-transition: opacity 1s;\n  transition: opacity 1s;\n}\n\noption[title]:hover:after,\noption[title]:focus:after {\n  content: attr(title);\n}\n\n/* Tooltip container\n.tooltip {\n  position: relative;\n}\n\n/* Tooltip text\n.tooltip .tooltiptext {\n  visibility: hidden;\n  width: 200px;\n  background-color: #555;\n  color: #fff;\n  text-align: center;\n  padding: 10px 0;\n  border-radius: 6px;\n  margin: 10px;\n  font-size: small;\n\n  /* Position the tooltip text\n  position: absolute;\n  z-index: 1;\n  bottom: 125%;\n  left: 50%;\n  margin-left: -100px;\n\n  /* Fade in tooltip\n  opacity: 0;\n  transition: opacity 0.5s;\n}\n\n.tooltip::after {\n  vertical-align: top;\n  color: inherit;\n  font-size: small;\n  content: \"?\";\n}\n\n/* Tooltip arrow\n.tooltip .tooltiptext::after {\n  content: \"\";\n  position: absolute;\n  top: 100%;\n  left: 50%;\n  margin-left: -5px;\n  border-width: 5px;\n  border-style: solid;\n  border-color: #555 transparent transparent transparent;\n}\n\n/* Show the tooltip text when you mouse over the tooltip container\n.tooltip:hover .tooltiptext {\n  visibility: visible;\n  opacity: 1;\n} */\n\n* {\n  color: #ddd;\n  background-color: #222;\n  font-family: Arial, Helvetica, sans-serif;\n  border-color: #ddd;\n}\n\n/* Application-wide Styles */\n\nh1 {\n  color: rgb(74, 165, 255);\n  font-family: Arial, Helvetica, sans-serif;\n  font-size: 250%;\n}\n\nh2 {\n  font-family: Arial, Helvetica, sans-serif;\n  font-weight: bolder;\n}\n\nh3 {\n  font-family: Arial, Helvetica, sans-serif;\n  font-weight: normal;\n  padding-top: 1em;\n}\n\nbody {\n  margin: 2em;\n}\n\ninput,\ntextarea,\nselect {\n  font-size: large;\n  color: rgb(61, 228, 192);\n  border-top-style: hidden;\n  border-left-style: hidden;\n  border-right-style: hidden;\n}\n\ninput[type=\"text\"],\ninput[type=\"url\"],\ntextarea {\n  margin-bottom: 0.5em;\n  margin-left: 0.5em;\n  margin-right: 0.5em;\n  margin-top: none;\n  border-top-width: 0px;\n  border-top-style: hidden;\n  border-left-style: hidden;\n  border-right-style: hidden;\n  border-left-width: 0px;\n  border-right-width: 0px;\n  width: 90%;\n  display: block;\n}\n\ninput[type=\"number\"] {\n  width: 50px;\n  text-align: center;\n  -webkit-appearance: textfield;\n     -moz-appearance: textfield;\n          appearance: textfield;\n}\n\ntextarea {\n  width: 90%;\n  resize: vertical;\n}\n\nbutton {\n  color: #ddd;\n  color: rgb(61, 228, 192);\n  background-color: rgb(61, 228, 192);\n  background-color: #222;\n  color: rgb(61, 228, 192);\n  border-color: #ddd;\n  font-family: Arial, Helvetica, sans-serif;\n  font-weight: bold;\n  margin-bottom: 0.5em;\n  margin-left: 0.5em;\n  margin-right: 0.5em;\n  margin-top: 0.5em;\n  border-radius: 5px;\n  min-height: 30px;\n  text-overflow: clip;\n}\n\nbutton > fa-icon {\n  color: inherit;\n  background-color: inherit;\n}\n\nbutton:disabled {\n  color: #aaa;\n  background-color: #222;\n  font-weight: lighter;\n}\n\nbutton.next {\n  right: 0px;\n  color: rgb(61, 228, 192);\n  border-color: rgb(61, 228, 192);\n}\n\nselect {\n  min-width: 10em;\n}\n\n/* everywhere else */\n\n* {\n  font-family: Arial, Helvetica, sans-serif;\n}\n\nlabel {\n  display: block;\n  margin-top: 1em;\n  margin-bottom: 1em;\n}\n\n.main {\n  width: 100%;\n  display: -webkit-box;\n  display: flex;\n  -webkit-box-orient: horizontal;\n  -webkit-box-direction: normal;\n          flex-direction: row;\n}\n\n.navigation {\n  width: 20%;\n  display: -webkit-box;\n  display: flex;\n  -webkit-box-orient: vertical;\n  -webkit-box-direction: normal;\n          flex-direction: column;\n  -webkit-box-align: stretch;\n          align-items: stretch;\n  margin-right: 20px;\n}\n\n.step-detail {\n  width: 80%;\n  border: 1px;\n  border-left-style: dashed;\n  border-right-style: hidden;\n  border-top-style: hidden;\n  border-bottom-style: hidden;\n  padding: 1em;\n  margin-bottom: 0.5em;\n}\n\n/* .step-detail {\n  width: 80%;\n  border: 1px;\n  border-left-style: dashed;\n  border-right-style: hidden;\n  border-top-style: hidden;\n  border-bottom-style: hidden;\n  padding: 1em;\n  margin-bottom: 0.5em;\n} */\n\n/* .model {\n  width: 80%;\n  border: 1px;\n  border-left-style: dashed;\n  border-right-style: hidden;\n  border-top-style: hidden;\n  border-bottom-style: hidden;\n  padding: 1em;\n  margin-bottom: 0.5em;\n} */\n\ninput:invalid {\n  border: red solid 3px;\n}\n\ndiv .parameter,\n.input-dataset,\n.output-dataset {\n  border: 1px;\n  border-color: black;\n  border-style: dashed;\n  padding: 1em;\n  margin-bottom: 0.5em;\n}\n\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbInNyYy9hcHAvdG9vbHRpcC5jc3MiLCJzcmMvYXBwL2FwcC5jb21wb25lbnQuY3NzIiwic3JjL2FwcC9hY3Rpdml0eS1kZXNjcmlwdGlvbi1kZXRhaWwvYWN0aXZpdHktZGVzY3JpcHRpb24tZGV0YWlsLmNvbXBvbmVudC5jc3MiXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IkFBQUE7RUFDRSxrQkFBa0I7RUFDbEIsWUFBWTtBQUNkOztBQUVBO0VBQ0UsbUJBQW1CO0VBQ25CLGNBQWM7RUFDZCxnQkFBZ0I7RUFDaEIsWUFBWTtBQUNkOztBQUVBOztFQUVFLHlCQUF5Qjs7RUFFekIsa0JBQWtCO0VBQ2xCLFVBQVU7RUFDVixnQkFBZ0I7RUFDaEIseUJBQXlCO0VBQ3pCLG1CQUFtQjtFQUNuQix5QkFBeUI7RUFDekIsYUFBYTtFQUNiLGNBQWM7O0VBRWQsZUFBZTtFQUNmLGtCQUFrQjtFQUNsQixvQkFBb0I7RUFDcEIsVUFBVTtFQUNWLGtCQUFrQjtFQUNsQixZQUFZO0VBQ1osOEJBQXNCO0VBQXRCLHNCQUFzQjtBQUN4Qjs7QUFFQTs7RUFFRSxvQkFBb0I7QUFDdEI7O0FBRUE7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7R0FvREc7O0FDekZIO0VBQ0UsV0FBVztFQUNYLHNCQUFzQjtFQUN0Qix5Q0FBeUM7RUFDekMsa0JBQWtCO0FBQ3BCOztBQUVBLDRCQUE0Qjs7QUFDNUI7RUFDRSx3QkFBd0I7RUFDeEIseUNBQXlDO0VBQ3pDLGVBQWU7QUFDakI7O0FBRUE7RUFDRSx5Q0FBeUM7RUFDekMsbUJBQW1CO0FBQ3JCOztBQUVBO0VBQ0UseUNBQXlDO0VBQ3pDLG1CQUFtQjtFQUNuQixnQkFBZ0I7QUFDbEI7O0FBRUE7RUFDRSxXQUFXO0FBQ2I7O0FBRUE7OztFQUdFLGdCQUFnQjtFQUNoQix3QkFBd0I7RUFDeEIsd0JBQXdCO0VBQ3hCLHlCQUF5QjtFQUN6QiwwQkFBMEI7QUFDNUI7O0FBRUE7OztFQUdFLG9CQUFvQjtFQUNwQixrQkFBa0I7RUFDbEIsbUJBQW1CO0VBQ25CLGdCQUFnQjtFQUNoQixxQkFBcUI7RUFDckIsd0JBQXdCO0VBQ3hCLHlCQUF5QjtFQUN6QiwwQkFBMEI7RUFDMUIsc0JBQXNCO0VBQ3RCLHVCQUF1QjtFQUN2QixVQUFVO0VBQ1YsY0FBYztBQUNoQjs7QUFFQTtFQUNFLFdBQVc7RUFDWCxrQkFBa0I7RUFDbEIsNkJBQXFCO0tBQXJCLDBCQUFxQjtVQUFyQixxQkFBcUI7QUFDdkI7O0FBRUE7RUFDRSxVQUFVO0VBQ1YsZ0JBQWdCO0FBQ2xCOztBQUVBO0VBQ0UsV0FBVztFQUNYLHdCQUF3QjtFQUN4QixtQ0FBbUM7RUFDbkMsc0JBQXNCO0VBQ3RCLHdCQUF3QjtFQUN4QixrQkFBa0I7RUFDbEIseUNBQXlDO0VBQ3pDLGlCQUFpQjtFQUNqQixvQkFBb0I7RUFDcEIsa0JBQWtCO0VBQ2xCLG1CQUFtQjtFQUNuQixpQkFBaUI7RUFDakIsa0JBQWtCO0VBQ2xCLGdCQUFnQjtFQUNoQixtQkFBbUI7QUFDckI7O0FBRUE7RUFDRSxjQUFjO0VBQ2QseUJBQXlCO0FBQzNCOztBQUVBO0VBQ0UsV0FBVztFQUNYLHNCQUFzQjtFQUN0QixvQkFBb0I7QUFDdEI7O0FBRUE7RUFDRSxVQUFVO0VBQ1Ysd0JBQXdCO0VBQ3hCLCtCQUErQjtBQUNqQzs7QUFFQTtFQUNFLGVBQWU7QUFDakI7O0FBRUEsb0JBQW9COztBQUVwQjtFQUNFLHlDQUF5QztBQUMzQzs7QUFFQTtFQUNFLGNBQWM7RUFDZCxlQUFlO0VBQ2Ysa0JBQWtCO0FBQ3BCOztBQUVBO0VBQ0UsV0FBVztFQUNYLG9CQUFhO0VBQWIsYUFBYTtFQUNiLDhCQUFtQjtFQUFuQiw2QkFBbUI7VUFBbkIsbUJBQW1CO0FBQ3JCOztBQUVBO0VBQ0UsVUFBVTtFQUNWLG9CQUFhO0VBQWIsYUFBYTtFQUNiLDRCQUFzQjtFQUF0Qiw2QkFBc0I7VUFBdEIsc0JBQXNCO0VBQ3RCLDBCQUFvQjtVQUFwQixvQkFBb0I7RUFDcEIsa0JBQWtCO0FBQ3BCOztBQUVBO0VBQ0UsVUFBVTtFQUNWLFdBQVc7RUFDWCx5QkFBeUI7RUFDekIsMEJBQTBCO0VBQzFCLHdCQUF3QjtFQUN4QiwyQkFBMkI7RUFDM0IsWUFBWTtFQUNaLG9CQUFvQjtBQUN0Qjs7QUFFQTs7Ozs7Ozs7O0dBU0c7O0FBRUg7Ozs7Ozs7OztHQVNHOztBQUVIO0VBQ0UscUJBQXFCO0FBQ3ZCOztBQ3ZLQTs7O0VBR0UsV0FBVztFQUNYLG1CQUFtQjtFQUNuQixvQkFBb0I7RUFDcEIsWUFBWTtFQUNaLG9CQUFvQjtBQUN0QiIsImZpbGUiOiJzcmMvYXBwL2FjdGl2aXR5LWRlc2NyaXB0aW9uLWRldGFpbC9hY3Rpdml0eS1kZXNjcmlwdGlvbi1kZXRhaWwuY29tcG9uZW50LmNzcyIsInNvdXJjZXNDb250ZW50IjpbIipbZGF0YS1kZXNjcl0ge1xuICBwb3NpdGlvbjogcmVsYXRpdmU7XG4gIGN1cnNvcjogaGVscDtcbn1cblxuKltkYXRhLWRlc2NyXTphZnRlciB7XG4gIHZlcnRpY2FsLWFsaWduOiB0b3A7XG4gIGNvbG9yOiBpbmhlcml0O1xuICBmb250LXNpemU6IHNtYWxsO1xuICBjb250ZW50OiBcIj9cIjtcbn1cblxuKltkYXRhLWRlc2NyXTpob3Zlcjo6YWZ0ZXIsXG4qW2RhdGEtZGVzY3JdOmZvY3VzOjphZnRlciB7XG4gIGNvbnRlbnQ6IGF0dHIoZGF0YS1kZXNjcik7XG5cbiAgcG9zaXRpb246IGFic29sdXRlO1xuICBsZWZ0OiBhdXRvO1xuICBtaW4td2lkdGg6IDIwMHB4O1xuICBib3JkZXI6IDFweCAjYWFhYWFhIHNvbGlkO1xuICBib3JkZXItcmFkaXVzOiAxMHB4O1xuICBiYWNrZ3JvdW5kLWNvbG9yOiAjMGI0YTkyO1xuICBwYWRkaW5nOiAxMnB4O1xuICBjb2xvcjogI2UwZTBlMDtcblxuICBmb250LXNpemU6IDE0cHg7XG4gIGZvbnQtc3R5bGU6IG5vcm1hbDtcbiAgZm9udC13ZWlnaHQ6IGxpZ2h0ZXI7XG4gIHotaW5kZXg6IDE7XG4gIHRleHQtYWxpZ246IGNlbnRlcjtcbiAgb3BhY2l0eTogMC45O1xuICB0cmFuc2l0aW9uOiBvcGFjaXR5IDFzO1xufVxuXG5vcHRpb25bdGl0bGVdOmhvdmVyOmFmdGVyLFxub3B0aW9uW3RpdGxlXTpmb2N1czphZnRlciB7XG4gIGNvbnRlbnQ6IGF0dHIodGl0bGUpO1xufVxuXG4vKiBUb29sdGlwIGNvbnRhaW5lclxuLnRvb2x0aXAge1xuICBwb3NpdGlvbjogcmVsYXRpdmU7XG59XG5cbi8qIFRvb2x0aXAgdGV4dFxuLnRvb2x0aXAgLnRvb2x0aXB0ZXh0IHtcbiAgdmlzaWJpbGl0eTogaGlkZGVuO1xuICB3aWR0aDogMjAwcHg7XG4gIGJhY2tncm91bmQtY29sb3I6ICM1NTU7XG4gIGNvbG9yOiAjZmZmO1xuICB0ZXh0LWFsaWduOiBjZW50ZXI7XG4gIHBhZGRpbmc6IDEwcHggMDtcbiAgYm9yZGVyLXJhZGl1czogNnB4O1xuICBtYXJnaW46IDEwcHg7XG4gIGZvbnQtc2l6ZTogc21hbGw7XG5cbiAgLyogUG9zaXRpb24gdGhlIHRvb2x0aXAgdGV4dFxuICBwb3NpdGlvbjogYWJzb2x1dGU7XG4gIHotaW5kZXg6IDE7XG4gIGJvdHRvbTogMTI1JTtcbiAgbGVmdDogNTAlO1xuICBtYXJnaW4tbGVmdDogLTEwMHB4O1xuXG4gIC8qIEZhZGUgaW4gdG9vbHRpcFxuICBvcGFjaXR5OiAwO1xuICB0cmFuc2l0aW9uOiBvcGFjaXR5IDAuNXM7XG59XG5cbi50b29sdGlwOjphZnRlciB7XG4gIHZlcnRpY2FsLWFsaWduOiB0b3A7XG4gIGNvbG9yOiBpbmhlcml0O1xuICBmb250LXNpemU6IHNtYWxsO1xuICBjb250ZW50OiBcIj9cIjtcbn1cblxuLyogVG9vbHRpcCBhcnJvd1xuLnRvb2x0aXAgLnRvb2x0aXB0ZXh0OjphZnRlciB7XG4gIGNvbnRlbnQ6IFwiXCI7XG4gIHBvc2l0aW9uOiBhYnNvbHV0ZTtcbiAgdG9wOiAxMDAlO1xuICBsZWZ0OiA1MCU7XG4gIG1hcmdpbi1sZWZ0OiAtNXB4O1xuICBib3JkZXItd2lkdGg6IDVweDtcbiAgYm9yZGVyLXN0eWxlOiBzb2xpZDtcbiAgYm9yZGVyLWNvbG9yOiAjNTU1IHRyYW5zcGFyZW50IHRyYW5zcGFyZW50IHRyYW5zcGFyZW50O1xufVxuXG4vKiBTaG93IHRoZSB0b29sdGlwIHRleHQgd2hlbiB5b3UgbW91c2Ugb3ZlciB0aGUgdG9vbHRpcCBjb250YWluZXJcbi50b29sdGlwOmhvdmVyIC50b29sdGlwdGV4dCB7XG4gIHZpc2liaWxpdHk6IHZpc2libGU7XG4gIG9wYWNpdHk6IDE7XG59ICovXG4iLCJAaW1wb3J0IFwiLi90b29sdGlwLmNzc1wiO1xuXG4qIHtcbiAgY29sb3I6ICNkZGQ7XG4gIGJhY2tncm91bmQtY29sb3I6ICMyMjI7XG4gIGZvbnQtZmFtaWx5OiBBcmlhbCwgSGVsdmV0aWNhLCBzYW5zLXNlcmlmO1xuICBib3JkZXItY29sb3I6ICNkZGQ7XG59XG5cbi8qIEFwcGxpY2F0aW9uLXdpZGUgU3R5bGVzICovXG5oMSB7XG4gIGNvbG9yOiByZ2IoNzQsIDE2NSwgMjU1KTtcbiAgZm9udC1mYW1pbHk6IEFyaWFsLCBIZWx2ZXRpY2EsIHNhbnMtc2VyaWY7XG4gIGZvbnQtc2l6ZTogMjUwJTtcbn1cblxuaDIge1xuICBmb250LWZhbWlseTogQXJpYWwsIEhlbHZldGljYSwgc2Fucy1zZXJpZjtcbiAgZm9udC13ZWlnaHQ6IGJvbGRlcjtcbn1cblxuaDMge1xuICBmb250LWZhbWlseTogQXJpYWwsIEhlbHZldGljYSwgc2Fucy1zZXJpZjtcbiAgZm9udC13ZWlnaHQ6IG5vcm1hbDtcbiAgcGFkZGluZy10b3A6IDFlbTtcbn1cblxuYm9keSB7XG4gIG1hcmdpbjogMmVtO1xufVxuXG5pbnB1dCxcbnRleHRhcmVhLFxuc2VsZWN0IHtcbiAgZm9udC1zaXplOiBsYXJnZTtcbiAgY29sb3I6IHJnYig2MSwgMjI4LCAxOTIpO1xuICBib3JkZXItdG9wLXN0eWxlOiBoaWRkZW47XG4gIGJvcmRlci1sZWZ0LXN0eWxlOiBoaWRkZW47XG4gIGJvcmRlci1yaWdodC1zdHlsZTogaGlkZGVuO1xufVxuXG5pbnB1dFt0eXBlPVwidGV4dFwiXSxcbmlucHV0W3R5cGU9XCJ1cmxcIl0sXG50ZXh0YXJlYSB7XG4gIG1hcmdpbi1ib3R0b206IDAuNWVtO1xuICBtYXJnaW4tbGVmdDogMC41ZW07XG4gIG1hcmdpbi1yaWdodDogMC41ZW07XG4gIG1hcmdpbi10b3A6IG5vbmU7XG4gIGJvcmRlci10b3Atd2lkdGg6IDBweDtcbiAgYm9yZGVyLXRvcC1zdHlsZTogaGlkZGVuO1xuICBib3JkZXItbGVmdC1zdHlsZTogaGlkZGVuO1xuICBib3JkZXItcmlnaHQtc3R5bGU6IGhpZGRlbjtcbiAgYm9yZGVyLWxlZnQtd2lkdGg6IDBweDtcbiAgYm9yZGVyLXJpZ2h0LXdpZHRoOiAwcHg7XG4gIHdpZHRoOiA5MCU7XG4gIGRpc3BsYXk6IGJsb2NrO1xufVxuXG5pbnB1dFt0eXBlPVwibnVtYmVyXCJdIHtcbiAgd2lkdGg6IDUwcHg7XG4gIHRleHQtYWxpZ246IGNlbnRlcjtcbiAgYXBwZWFyYW5jZTogdGV4dGZpZWxkO1xufVxuXG50ZXh0YXJlYSB7XG4gIHdpZHRoOiA5MCU7XG4gIHJlc2l6ZTogdmVydGljYWw7XG59XG5cbmJ1dHRvbiB7XG4gIGNvbG9yOiAjZGRkO1xuICBjb2xvcjogcmdiKDYxLCAyMjgsIDE5Mik7XG4gIGJhY2tncm91bmQtY29sb3I6IHJnYig2MSwgMjI4LCAxOTIpO1xuICBiYWNrZ3JvdW5kLWNvbG9yOiAjMjIyO1xuICBjb2xvcjogcmdiKDYxLCAyMjgsIDE5Mik7XG4gIGJvcmRlci1jb2xvcjogI2RkZDtcbiAgZm9udC1mYW1pbHk6IEFyaWFsLCBIZWx2ZXRpY2EsIHNhbnMtc2VyaWY7XG4gIGZvbnQtd2VpZ2h0OiBib2xkO1xuICBtYXJnaW4tYm90dG9tOiAwLjVlbTtcbiAgbWFyZ2luLWxlZnQ6IDAuNWVtO1xuICBtYXJnaW4tcmlnaHQ6IDAuNWVtO1xuICBtYXJnaW4tdG9wOiAwLjVlbTtcbiAgYm9yZGVyLXJhZGl1czogNXB4O1xuICBtaW4taGVpZ2h0OiAzMHB4O1xuICB0ZXh0LW92ZXJmbG93OiBjbGlwO1xufVxuXG5idXR0b24gPiBmYS1pY29uIHtcbiAgY29sb3I6IGluaGVyaXQ7XG4gIGJhY2tncm91bmQtY29sb3I6IGluaGVyaXQ7XG59XG5cbmJ1dHRvbjpkaXNhYmxlZCB7XG4gIGNvbG9yOiAjYWFhO1xuICBiYWNrZ3JvdW5kLWNvbG9yOiAjMjIyO1xuICBmb250LXdlaWdodDogbGlnaHRlcjtcbn1cblxuYnV0dG9uLm5leHQge1xuICByaWdodDogMHB4O1xuICBjb2xvcjogcmdiKDYxLCAyMjgsIDE5Mik7XG4gIGJvcmRlci1jb2xvcjogcmdiKDYxLCAyMjgsIDE5Mik7XG59XG5cbnNlbGVjdCB7XG4gIG1pbi13aWR0aDogMTBlbTtcbn1cblxuLyogZXZlcnl3aGVyZSBlbHNlICovXG5cbioge1xuICBmb250LWZhbWlseTogQXJpYWwsIEhlbHZldGljYSwgc2Fucy1zZXJpZjtcbn1cblxubGFiZWwge1xuICBkaXNwbGF5OiBibG9jaztcbiAgbWFyZ2luLXRvcDogMWVtO1xuICBtYXJnaW4tYm90dG9tOiAxZW07XG59XG5cbi5tYWluIHtcbiAgd2lkdGg6IDEwMCU7XG4gIGRpc3BsYXk6IGZsZXg7XG4gIGZsZXgtZGlyZWN0aW9uOiByb3c7XG59XG5cbi5uYXZpZ2F0aW9uIHtcbiAgd2lkdGg6IDIwJTtcbiAgZGlzcGxheTogZmxleDtcbiAgZmxleC1kaXJlY3Rpb246IGNvbHVtbjtcbiAgYWxpZ24taXRlbXM6IHN0cmV0Y2g7XG4gIG1hcmdpbi1yaWdodDogMjBweDtcbn1cblxuLnN0ZXAtZGV0YWlsIHtcbiAgd2lkdGg6IDgwJTtcbiAgYm9yZGVyOiAxcHg7XG4gIGJvcmRlci1sZWZ0LXN0eWxlOiBkYXNoZWQ7XG4gIGJvcmRlci1yaWdodC1zdHlsZTogaGlkZGVuO1xuICBib3JkZXItdG9wLXN0eWxlOiBoaWRkZW47XG4gIGJvcmRlci1ib3R0b20tc3R5bGU6IGhpZGRlbjtcbiAgcGFkZGluZzogMWVtO1xuICBtYXJnaW4tYm90dG9tOiAwLjVlbTtcbn1cblxuLyogLnN0ZXAtZGV0YWlsIHtcbiAgd2lkdGg6IDgwJTtcbiAgYm9yZGVyOiAxcHg7XG4gIGJvcmRlci1sZWZ0LXN0eWxlOiBkYXNoZWQ7XG4gIGJvcmRlci1yaWdodC1zdHlsZTogaGlkZGVuO1xuICBib3JkZXItdG9wLXN0eWxlOiBoaWRkZW47XG4gIGJvcmRlci1ib3R0b20tc3R5bGU6IGhpZGRlbjtcbiAgcGFkZGluZzogMWVtO1xuICBtYXJnaW4tYm90dG9tOiAwLjVlbTtcbn0gKi9cblxuLyogLm1vZGVsIHtcbiAgd2lkdGg6IDgwJTtcbiAgYm9yZGVyOiAxcHg7XG4gIGJvcmRlci1sZWZ0LXN0eWxlOiBkYXNoZWQ7XG4gIGJvcmRlci1yaWdodC1zdHlsZTogaGlkZGVuO1xuICBib3JkZXItdG9wLXN0eWxlOiBoaWRkZW47XG4gIGJvcmRlci1ib3R0b20tc3R5bGU6IGhpZGRlbjtcbiAgcGFkZGluZzogMWVtO1xuICBtYXJnaW4tYm90dG9tOiAwLjVlbTtcbn0gKi9cblxuaW5wdXQ6aW52YWxpZCB7XG4gIGJvcmRlcjogcmVkIHNvbGlkIDNweDtcbn1cbiIsIkBpbXBvcnQgXCIuLi9hcHAuY29tcG9uZW50LmNzc1wiO1xuXG5kaXYgLnBhcmFtZXRlcixcbi5pbnB1dC1kYXRhc2V0LFxuLm91dHB1dC1kYXRhc2V0IHtcbiAgYm9yZGVyOiAxcHg7XG4gIGJvcmRlci1jb2xvcjogYmxhY2s7XG4gIGJvcmRlci1zdHlsZTogZGFzaGVkO1xuICBwYWRkaW5nOiAxZW07XG4gIG1hcmdpbi1ib3R0b206IDAuNWVtO1xufVxuIl19 */";
    /***/
  },

  /***/
  "./src/app/activity-description-detail/activity-description-detail.component.ts":
  /*!**************************************************************************************!*\
    !*** ./src/app/activity-description-detail/activity-description-detail.component.ts ***!
    \**************************************************************************************/

  /*! exports provided: ActivityDescriptionDetailComponent */

  /***/
  function srcAppActivityDescriptionDetailActivityDescriptionDetailComponentTs(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "ActivityDescriptionDetailComponent", function () {
      return ActivityDescriptionDetailComponent;
    });
    /* harmony import */


    var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
    /*! tslib */
    "./node_modules/tslib/tslib.es6.js");
    /* harmony import */


    var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
    /*! @angular/core */
    "./node_modules/@angular/core/fesm2015/core.js");
    /* harmony import */


    var src_model_activity_description__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(
    /*! src/model/activity-description */
    "./src/model/activity-description.ts");
    /* harmony import */


    var _lang__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(
    /*! ../lang */
    "./src/app/lang.ts");

    var ActivityDescriptionDetailComponent =
    /*#__PURE__*/
    function () {
      function ActivityDescriptionDetailComponent() {
        _classCallCheck(this, ActivityDescriptionDetailComponent);

        this.keys = Object.keys;
        this.parameterTypes = src_model_activity_description__WEBPACK_IMPORTED_MODULE_2__["ParameterType"];
        this.lang = _lang__WEBPACK_IMPORTED_MODULE_3__["Lang"].getInstance();
      }

      _createClass(ActivityDescriptionDetailComponent, [{
        key: "ngOnInit",
        value: function ngOnInit() {}
      }, {
        key: "isParameter",
        value: function isParameter(t) {
          return t instanceof src_model_activity_description__WEBPACK_IMPORTED_MODULE_2__["Parameter"];
        }
      }, {
        key: "isInputDataset",
        value: function isInputDataset(t) {
          return t instanceof src_model_activity_description__WEBPACK_IMPORTED_MODULE_2__["InputDataset"];
        }
      }, {
        key: "isOutputDataset",
        value: function isOutputDataset(t) {
          return t instanceof src_model_activity_description__WEBPACK_IMPORTED_MODULE_2__["OutputDataset"];
        }
      }]);

      return ActivityDescriptionDetailComponent;
    }();

    tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Input"])()], ActivityDescriptionDetailComponent.prototype, "detailedComponent", void 0);
    ActivityDescriptionDetailComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
      selector: "app-activity-description-detail",
      template: tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(
      /*! raw-loader!./activity-description-detail.component.html */
      "./node_modules/raw-loader/dist/cjs.js!./src/app/activity-description-detail/activity-description-detail.component.html")).default,
      styles: [tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(
      /*! ./activity-description-detail.component.css */
      "./src/app/activity-description-detail/activity-description-detail.component.css")).default]
    })], ActivityDescriptionDetailComponent);
    /***/
  },

  /***/
  "./src/app/activity-description/activity-description.component.css":
  /*!*************************************************************************!*\
    !*** ./src/app/activity-description/activity-description.component.css ***!
    \*************************************************************************/

  /*! exports provided: default */

  /***/
  function srcAppActivityDescriptionActivityDescriptionComponentCss(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony default export */


    __webpack_exports__["default"] = "*[data-descr] {\n  position: relative;\n  cursor: help;\n}\n\n*[data-descr]:after {\n  vertical-align: top;\n  color: inherit;\n  font-size: small;\n  content: \"?\";\n}\n\n*[data-descr]:hover::after,\n*[data-descr]:focus::after {\n  content: attr(data-descr);\n\n  position: absolute;\n  left: auto;\n  min-width: 200px;\n  border: 1px #aaaaaa solid;\n  border-radius: 10px;\n  background-color: #0b4a92;\n  padding: 12px;\n  color: #e0e0e0;\n\n  font-size: 14px;\n  font-style: normal;\n  font-weight: lighter;\n  z-index: 1;\n  text-align: center;\n  opacity: 0.9;\n  -webkit-transition: opacity 1s;\n  transition: opacity 1s;\n}\n\noption[title]:hover:after,\noption[title]:focus:after {\n  content: attr(title);\n}\n\n/* Tooltip container\n.tooltip {\n  position: relative;\n}\n\n/* Tooltip text\n.tooltip .tooltiptext {\n  visibility: hidden;\n  width: 200px;\n  background-color: #555;\n  color: #fff;\n  text-align: center;\n  padding: 10px 0;\n  border-radius: 6px;\n  margin: 10px;\n  font-size: small;\n\n  /* Position the tooltip text\n  position: absolute;\n  z-index: 1;\n  bottom: 125%;\n  left: 50%;\n  margin-left: -100px;\n\n  /* Fade in tooltip\n  opacity: 0;\n  transition: opacity 0.5s;\n}\n\n.tooltip::after {\n  vertical-align: top;\n  color: inherit;\n  font-size: small;\n  content: \"?\";\n}\n\n/* Tooltip arrow\n.tooltip .tooltiptext::after {\n  content: \"\";\n  position: absolute;\n  top: 100%;\n  left: 50%;\n  margin-left: -5px;\n  border-width: 5px;\n  border-style: solid;\n  border-color: #555 transparent transparent transparent;\n}\n\n/* Show the tooltip text when you mouse over the tooltip container\n.tooltip:hover .tooltiptext {\n  visibility: visible;\n  opacity: 1;\n} */\n\n* {\n  color: #ddd;\n  background-color: #222;\n  font-family: Arial, Helvetica, sans-serif;\n  border-color: #ddd;\n}\n\n/* Application-wide Styles */\n\nh1 {\n  color: rgb(74, 165, 255);\n  font-family: Arial, Helvetica, sans-serif;\n  font-size: 250%;\n}\n\nh2 {\n  font-family: Arial, Helvetica, sans-serif;\n  font-weight: bolder;\n}\n\nh3 {\n  font-family: Arial, Helvetica, sans-serif;\n  font-weight: normal;\n  padding-top: 1em;\n}\n\nbody {\n  margin: 2em;\n}\n\ninput,\ntextarea,\nselect {\n  font-size: large;\n  color: rgb(61, 228, 192);\n  border-top-style: hidden;\n  border-left-style: hidden;\n  border-right-style: hidden;\n}\n\ninput[type=\"text\"],\ninput[type=\"url\"],\ntextarea {\n  margin-bottom: 0.5em;\n  margin-left: 0.5em;\n  margin-right: 0.5em;\n  margin-top: none;\n  border-top-width: 0px;\n  border-top-style: hidden;\n  border-left-style: hidden;\n  border-right-style: hidden;\n  border-left-width: 0px;\n  border-right-width: 0px;\n  width: 90%;\n  display: block;\n}\n\ninput[type=\"number\"] {\n  width: 50px;\n  text-align: center;\n  -webkit-appearance: textfield;\n     -moz-appearance: textfield;\n          appearance: textfield;\n}\n\ntextarea {\n  width: 90%;\n  resize: vertical;\n}\n\nbutton {\n  color: #ddd;\n  color: rgb(61, 228, 192);\n  background-color: rgb(61, 228, 192);\n  background-color: #222;\n  color: rgb(61, 228, 192);\n  border-color: #ddd;\n  font-family: Arial, Helvetica, sans-serif;\n  font-weight: bold;\n  margin-bottom: 0.5em;\n  margin-left: 0.5em;\n  margin-right: 0.5em;\n  margin-top: 0.5em;\n  border-radius: 5px;\n  min-height: 30px;\n  text-overflow: clip;\n}\n\nbutton > fa-icon {\n  color: inherit;\n  background-color: inherit;\n}\n\nbutton:disabled {\n  color: #aaa;\n  background-color: #222;\n  font-weight: lighter;\n}\n\nbutton.next {\n  right: 0px;\n  color: rgb(61, 228, 192);\n  border-color: rgb(61, 228, 192);\n}\n\nselect {\n  min-width: 10em;\n}\n\n/* everywhere else */\n\n* {\n  font-family: Arial, Helvetica, sans-serif;\n}\n\nlabel {\n  display: block;\n  margin-top: 1em;\n  margin-bottom: 1em;\n}\n\n.main {\n  width: 100%;\n  display: -webkit-box;\n  display: flex;\n  -webkit-box-orient: horizontal;\n  -webkit-box-direction: normal;\n          flex-direction: row;\n}\n\n.navigation {\n  width: 20%;\n  display: -webkit-box;\n  display: flex;\n  -webkit-box-orient: vertical;\n  -webkit-box-direction: normal;\n          flex-direction: column;\n  -webkit-box-align: stretch;\n          align-items: stretch;\n  margin-right: 20px;\n}\n\n.step-detail {\n  width: 80%;\n  border: 1px;\n  border-left-style: dashed;\n  border-right-style: hidden;\n  border-top-style: hidden;\n  border-bottom-style: hidden;\n  padding: 1em;\n  margin-bottom: 0.5em;\n}\n\n/* .step-detail {\n  width: 80%;\n  border: 1px;\n  border-left-style: dashed;\n  border-right-style: hidden;\n  border-top-style: hidden;\n  border-bottom-style: hidden;\n  padding: 1em;\n  margin-bottom: 0.5em;\n} */\n\n/* .model {\n  width: 80%;\n  border: 1px;\n  border-left-style: dashed;\n  border-right-style: hidden;\n  border-top-style: hidden;\n  border-bottom-style: hidden;\n  padding: 1em;\n  margin-bottom: 0.5em;\n} */\n\ninput:invalid {\n  border: red solid 3px;\n}\n\n.main {\n  display: -webkit-box;\n  display: flex;\n  -webkit-box-orient: horizontal;\n  -webkit-box-direction: normal;\n          flex-direction: row;\n}\n\n.model {\n  width: 40%;\n}\n\n.detail {\n  width: 60%;\n}\n\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbInNyYy9hcHAvdG9vbHRpcC5jc3MiLCJzcmMvYXBwL2FwcC5jb21wb25lbnQuY3NzIiwic3JjL2FwcC9hY3Rpdml0eS1kZXNjcmlwdGlvbi9hY3Rpdml0eS1kZXNjcmlwdGlvbi5jb21wb25lbnQuY3NzIl0sIm5hbWVzIjpbXSwibWFwcGluZ3MiOiJBQUFBO0VBQ0Usa0JBQWtCO0VBQ2xCLFlBQVk7QUFDZDs7QUFFQTtFQUNFLG1CQUFtQjtFQUNuQixjQUFjO0VBQ2QsZ0JBQWdCO0VBQ2hCLFlBQVk7QUFDZDs7QUFFQTs7RUFFRSx5QkFBeUI7O0VBRXpCLGtCQUFrQjtFQUNsQixVQUFVO0VBQ1YsZ0JBQWdCO0VBQ2hCLHlCQUF5QjtFQUN6QixtQkFBbUI7RUFDbkIseUJBQXlCO0VBQ3pCLGFBQWE7RUFDYixjQUFjOztFQUVkLGVBQWU7RUFDZixrQkFBa0I7RUFDbEIsb0JBQW9CO0VBQ3BCLFVBQVU7RUFDVixrQkFBa0I7RUFDbEIsWUFBWTtFQUNaLDhCQUFzQjtFQUF0QixzQkFBc0I7QUFDeEI7O0FBRUE7O0VBRUUsb0JBQW9CO0FBQ3RCOztBQUVBOzs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7O0dBb0RHOztBQ3pGSDtFQUNFLFdBQVc7RUFDWCxzQkFBc0I7RUFDdEIseUNBQXlDO0VBQ3pDLGtCQUFrQjtBQUNwQjs7QUFFQSw0QkFBNEI7O0FBQzVCO0VBQ0Usd0JBQXdCO0VBQ3hCLHlDQUF5QztFQUN6QyxlQUFlO0FBQ2pCOztBQUVBO0VBQ0UseUNBQXlDO0VBQ3pDLG1CQUFtQjtBQUNyQjs7QUFFQTtFQUNFLHlDQUF5QztFQUN6QyxtQkFBbUI7RUFDbkIsZ0JBQWdCO0FBQ2xCOztBQUVBO0VBQ0UsV0FBVztBQUNiOztBQUVBOzs7RUFHRSxnQkFBZ0I7RUFDaEIsd0JBQXdCO0VBQ3hCLHdCQUF3QjtFQUN4Qix5QkFBeUI7RUFDekIsMEJBQTBCO0FBQzVCOztBQUVBOzs7RUFHRSxvQkFBb0I7RUFDcEIsa0JBQWtCO0VBQ2xCLG1CQUFtQjtFQUNuQixnQkFBZ0I7RUFDaEIscUJBQXFCO0VBQ3JCLHdCQUF3QjtFQUN4Qix5QkFBeUI7RUFDekIsMEJBQTBCO0VBQzFCLHNCQUFzQjtFQUN0Qix1QkFBdUI7RUFDdkIsVUFBVTtFQUNWLGNBQWM7QUFDaEI7O0FBRUE7RUFDRSxXQUFXO0VBQ1gsa0JBQWtCO0VBQ2xCLDZCQUFxQjtLQUFyQiwwQkFBcUI7VUFBckIscUJBQXFCO0FBQ3ZCOztBQUVBO0VBQ0UsVUFBVTtFQUNWLGdCQUFnQjtBQUNsQjs7QUFFQTtFQUNFLFdBQVc7RUFDWCx3QkFBd0I7RUFDeEIsbUNBQW1DO0VBQ25DLHNCQUFzQjtFQUN0Qix3QkFBd0I7RUFDeEIsa0JBQWtCO0VBQ2xCLHlDQUF5QztFQUN6QyxpQkFBaUI7RUFDakIsb0JBQW9CO0VBQ3BCLGtCQUFrQjtFQUNsQixtQkFBbUI7RUFDbkIsaUJBQWlCO0VBQ2pCLGtCQUFrQjtFQUNsQixnQkFBZ0I7RUFDaEIsbUJBQW1CO0FBQ3JCOztBQUVBO0VBQ0UsY0FBYztFQUNkLHlCQUF5QjtBQUMzQjs7QUFFQTtFQUNFLFdBQVc7RUFDWCxzQkFBc0I7RUFDdEIsb0JBQW9CO0FBQ3RCOztBQUVBO0VBQ0UsVUFBVTtFQUNWLHdCQUF3QjtFQUN4QiwrQkFBK0I7QUFDakM7O0FBRUE7RUFDRSxlQUFlO0FBQ2pCOztBQUVBLG9CQUFvQjs7QUFFcEI7RUFDRSx5Q0FBeUM7QUFDM0M7O0FBRUE7RUFDRSxjQUFjO0VBQ2QsZUFBZTtFQUNmLGtCQUFrQjtBQUNwQjs7QUFFQTtFQUNFLFdBQVc7RUFDWCxvQkFBYTtFQUFiLGFBQWE7RUFDYiw4QkFBbUI7RUFBbkIsNkJBQW1CO1VBQW5CLG1CQUFtQjtBQUNyQjs7QUFFQTtFQUNFLFVBQVU7RUFDVixvQkFBYTtFQUFiLGFBQWE7RUFDYiw0QkFBc0I7RUFBdEIsNkJBQXNCO1VBQXRCLHNCQUFzQjtFQUN0QiwwQkFBb0I7VUFBcEIsb0JBQW9CO0VBQ3BCLGtCQUFrQjtBQUNwQjs7QUFFQTtFQUNFLFVBQVU7RUFDVixXQUFXO0VBQ1gseUJBQXlCO0VBQ3pCLDBCQUEwQjtFQUMxQix3QkFBd0I7RUFDeEIsMkJBQTJCO0VBQzNCLFlBQVk7RUFDWixvQkFBb0I7QUFDdEI7O0FBRUE7Ozs7Ozs7OztHQVNHOztBQUVIOzs7Ozs7Ozs7R0FTRzs7QUFFSDtFQUNFLHFCQUFxQjtBQUN2Qjs7QUN2S0E7RUFDRSxvQkFBYTtFQUFiLGFBQWE7RUFDYiw4QkFBbUI7RUFBbkIsNkJBQW1CO1VBQW5CLG1CQUFtQjtBQUNyQjs7QUFFQTtFQUNFLFVBQVU7QUFDWjs7QUFFQTtFQUNFLFVBQVU7QUFDWiIsImZpbGUiOiJzcmMvYXBwL2FjdGl2aXR5LWRlc2NyaXB0aW9uL2FjdGl2aXR5LWRlc2NyaXB0aW9uLmNvbXBvbmVudC5jc3MiLCJzb3VyY2VzQ29udGVudCI6WyIqW2RhdGEtZGVzY3JdIHtcbiAgcG9zaXRpb246IHJlbGF0aXZlO1xuICBjdXJzb3I6IGhlbHA7XG59XG5cbipbZGF0YS1kZXNjcl06YWZ0ZXIge1xuICB2ZXJ0aWNhbC1hbGlnbjogdG9wO1xuICBjb2xvcjogaW5oZXJpdDtcbiAgZm9udC1zaXplOiBzbWFsbDtcbiAgY29udGVudDogXCI/XCI7XG59XG5cbipbZGF0YS1kZXNjcl06aG92ZXI6OmFmdGVyLFxuKltkYXRhLWRlc2NyXTpmb2N1czo6YWZ0ZXIge1xuICBjb250ZW50OiBhdHRyKGRhdGEtZGVzY3IpO1xuXG4gIHBvc2l0aW9uOiBhYnNvbHV0ZTtcbiAgbGVmdDogYXV0bztcbiAgbWluLXdpZHRoOiAyMDBweDtcbiAgYm9yZGVyOiAxcHggI2FhYWFhYSBzb2xpZDtcbiAgYm9yZGVyLXJhZGl1czogMTBweDtcbiAgYmFja2dyb3VuZC1jb2xvcjogIzBiNGE5MjtcbiAgcGFkZGluZzogMTJweDtcbiAgY29sb3I6ICNlMGUwZTA7XG5cbiAgZm9udC1zaXplOiAxNHB4O1xuICBmb250LXN0eWxlOiBub3JtYWw7XG4gIGZvbnQtd2VpZ2h0OiBsaWdodGVyO1xuICB6LWluZGV4OiAxO1xuICB0ZXh0LWFsaWduOiBjZW50ZXI7XG4gIG9wYWNpdHk6IDAuOTtcbiAgdHJhbnNpdGlvbjogb3BhY2l0eSAxcztcbn1cblxub3B0aW9uW3RpdGxlXTpob3ZlcjphZnRlcixcbm9wdGlvblt0aXRsZV06Zm9jdXM6YWZ0ZXIge1xuICBjb250ZW50OiBhdHRyKHRpdGxlKTtcbn1cblxuLyogVG9vbHRpcCBjb250YWluZXJcbi50b29sdGlwIHtcbiAgcG9zaXRpb246IHJlbGF0aXZlO1xufVxuXG4vKiBUb29sdGlwIHRleHRcbi50b29sdGlwIC50b29sdGlwdGV4dCB7XG4gIHZpc2liaWxpdHk6IGhpZGRlbjtcbiAgd2lkdGg6IDIwMHB4O1xuICBiYWNrZ3JvdW5kLWNvbG9yOiAjNTU1O1xuICBjb2xvcjogI2ZmZjtcbiAgdGV4dC1hbGlnbjogY2VudGVyO1xuICBwYWRkaW5nOiAxMHB4IDA7XG4gIGJvcmRlci1yYWRpdXM6IDZweDtcbiAgbWFyZ2luOiAxMHB4O1xuICBmb250LXNpemU6IHNtYWxsO1xuXG4gIC8qIFBvc2l0aW9uIHRoZSB0b29sdGlwIHRleHRcbiAgcG9zaXRpb246IGFic29sdXRlO1xuICB6LWluZGV4OiAxO1xuICBib3R0b206IDEyNSU7XG4gIGxlZnQ6IDUwJTtcbiAgbWFyZ2luLWxlZnQ6IC0xMDBweDtcblxuICAvKiBGYWRlIGluIHRvb2x0aXBcbiAgb3BhY2l0eTogMDtcbiAgdHJhbnNpdGlvbjogb3BhY2l0eSAwLjVzO1xufVxuXG4udG9vbHRpcDo6YWZ0ZXIge1xuICB2ZXJ0aWNhbC1hbGlnbjogdG9wO1xuICBjb2xvcjogaW5oZXJpdDtcbiAgZm9udC1zaXplOiBzbWFsbDtcbiAgY29udGVudDogXCI/XCI7XG59XG5cbi8qIFRvb2x0aXAgYXJyb3dcbi50b29sdGlwIC50b29sdGlwdGV4dDo6YWZ0ZXIge1xuICBjb250ZW50OiBcIlwiO1xuICBwb3NpdGlvbjogYWJzb2x1dGU7XG4gIHRvcDogMTAwJTtcbiAgbGVmdDogNTAlO1xuICBtYXJnaW4tbGVmdDogLTVweDtcbiAgYm9yZGVyLXdpZHRoOiA1cHg7XG4gIGJvcmRlci1zdHlsZTogc29saWQ7XG4gIGJvcmRlci1jb2xvcjogIzU1NSB0cmFuc3BhcmVudCB0cmFuc3BhcmVudCB0cmFuc3BhcmVudDtcbn1cblxuLyogU2hvdyB0aGUgdG9vbHRpcCB0ZXh0IHdoZW4geW91IG1vdXNlIG92ZXIgdGhlIHRvb2x0aXAgY29udGFpbmVyXG4udG9vbHRpcDpob3ZlciAudG9vbHRpcHRleHQge1xuICB2aXNpYmlsaXR5OiB2aXNpYmxlO1xuICBvcGFjaXR5OiAxO1xufSAqL1xuIiwiQGltcG9ydCBcIi4vdG9vbHRpcC5jc3NcIjtcblxuKiB7XG4gIGNvbG9yOiAjZGRkO1xuICBiYWNrZ3JvdW5kLWNvbG9yOiAjMjIyO1xuICBmb250LWZhbWlseTogQXJpYWwsIEhlbHZldGljYSwgc2Fucy1zZXJpZjtcbiAgYm9yZGVyLWNvbG9yOiAjZGRkO1xufVxuXG4vKiBBcHBsaWNhdGlvbi13aWRlIFN0eWxlcyAqL1xuaDEge1xuICBjb2xvcjogcmdiKDc0LCAxNjUsIDI1NSk7XG4gIGZvbnQtZmFtaWx5OiBBcmlhbCwgSGVsdmV0aWNhLCBzYW5zLXNlcmlmO1xuICBmb250LXNpemU6IDI1MCU7XG59XG5cbmgyIHtcbiAgZm9udC1mYW1pbHk6IEFyaWFsLCBIZWx2ZXRpY2EsIHNhbnMtc2VyaWY7XG4gIGZvbnQtd2VpZ2h0OiBib2xkZXI7XG59XG5cbmgzIHtcbiAgZm9udC1mYW1pbHk6IEFyaWFsLCBIZWx2ZXRpY2EsIHNhbnMtc2VyaWY7XG4gIGZvbnQtd2VpZ2h0OiBub3JtYWw7XG4gIHBhZGRpbmctdG9wOiAxZW07XG59XG5cbmJvZHkge1xuICBtYXJnaW46IDJlbTtcbn1cblxuaW5wdXQsXG50ZXh0YXJlYSxcbnNlbGVjdCB7XG4gIGZvbnQtc2l6ZTogbGFyZ2U7XG4gIGNvbG9yOiByZ2IoNjEsIDIyOCwgMTkyKTtcbiAgYm9yZGVyLXRvcC1zdHlsZTogaGlkZGVuO1xuICBib3JkZXItbGVmdC1zdHlsZTogaGlkZGVuO1xuICBib3JkZXItcmlnaHQtc3R5bGU6IGhpZGRlbjtcbn1cblxuaW5wdXRbdHlwZT1cInRleHRcIl0sXG5pbnB1dFt0eXBlPVwidXJsXCJdLFxudGV4dGFyZWEge1xuICBtYXJnaW4tYm90dG9tOiAwLjVlbTtcbiAgbWFyZ2luLWxlZnQ6IDAuNWVtO1xuICBtYXJnaW4tcmlnaHQ6IDAuNWVtO1xuICBtYXJnaW4tdG9wOiBub25lO1xuICBib3JkZXItdG9wLXdpZHRoOiAwcHg7XG4gIGJvcmRlci10b3Atc3R5bGU6IGhpZGRlbjtcbiAgYm9yZGVyLWxlZnQtc3R5bGU6IGhpZGRlbjtcbiAgYm9yZGVyLXJpZ2h0LXN0eWxlOiBoaWRkZW47XG4gIGJvcmRlci1sZWZ0LXdpZHRoOiAwcHg7XG4gIGJvcmRlci1yaWdodC13aWR0aDogMHB4O1xuICB3aWR0aDogOTAlO1xuICBkaXNwbGF5OiBibG9jaztcbn1cblxuaW5wdXRbdHlwZT1cIm51bWJlclwiXSB7XG4gIHdpZHRoOiA1MHB4O1xuICB0ZXh0LWFsaWduOiBjZW50ZXI7XG4gIGFwcGVhcmFuY2U6IHRleHRmaWVsZDtcbn1cblxudGV4dGFyZWEge1xuICB3aWR0aDogOTAlO1xuICByZXNpemU6IHZlcnRpY2FsO1xufVxuXG5idXR0b24ge1xuICBjb2xvcjogI2RkZDtcbiAgY29sb3I6IHJnYig2MSwgMjI4LCAxOTIpO1xuICBiYWNrZ3JvdW5kLWNvbG9yOiByZ2IoNjEsIDIyOCwgMTkyKTtcbiAgYmFja2dyb3VuZC1jb2xvcjogIzIyMjtcbiAgY29sb3I6IHJnYig2MSwgMjI4LCAxOTIpO1xuICBib3JkZXItY29sb3I6ICNkZGQ7XG4gIGZvbnQtZmFtaWx5OiBBcmlhbCwgSGVsdmV0aWNhLCBzYW5zLXNlcmlmO1xuICBmb250LXdlaWdodDogYm9sZDtcbiAgbWFyZ2luLWJvdHRvbTogMC41ZW07XG4gIG1hcmdpbi1sZWZ0OiAwLjVlbTtcbiAgbWFyZ2luLXJpZ2h0OiAwLjVlbTtcbiAgbWFyZ2luLXRvcDogMC41ZW07XG4gIGJvcmRlci1yYWRpdXM6IDVweDtcbiAgbWluLWhlaWdodDogMzBweDtcbiAgdGV4dC1vdmVyZmxvdzogY2xpcDtcbn1cblxuYnV0dG9uID4gZmEtaWNvbiB7XG4gIGNvbG9yOiBpbmhlcml0O1xuICBiYWNrZ3JvdW5kLWNvbG9yOiBpbmhlcml0O1xufVxuXG5idXR0b246ZGlzYWJsZWQge1xuICBjb2xvcjogI2FhYTtcbiAgYmFja2dyb3VuZC1jb2xvcjogIzIyMjtcbiAgZm9udC13ZWlnaHQ6IGxpZ2h0ZXI7XG59XG5cbmJ1dHRvbi5uZXh0IHtcbiAgcmlnaHQ6IDBweDtcbiAgY29sb3I6IHJnYig2MSwgMjI4LCAxOTIpO1xuICBib3JkZXItY29sb3I6IHJnYig2MSwgMjI4LCAxOTIpO1xufVxuXG5zZWxlY3Qge1xuICBtaW4td2lkdGg6IDEwZW07XG59XG5cbi8qIGV2ZXJ5d2hlcmUgZWxzZSAqL1xuXG4qIHtcbiAgZm9udC1mYW1pbHk6IEFyaWFsLCBIZWx2ZXRpY2EsIHNhbnMtc2VyaWY7XG59XG5cbmxhYmVsIHtcbiAgZGlzcGxheTogYmxvY2s7XG4gIG1hcmdpbi10b3A6IDFlbTtcbiAgbWFyZ2luLWJvdHRvbTogMWVtO1xufVxuXG4ubWFpbiB7XG4gIHdpZHRoOiAxMDAlO1xuICBkaXNwbGF5OiBmbGV4O1xuICBmbGV4LWRpcmVjdGlvbjogcm93O1xufVxuXG4ubmF2aWdhdGlvbiB7XG4gIHdpZHRoOiAyMCU7XG4gIGRpc3BsYXk6IGZsZXg7XG4gIGZsZXgtZGlyZWN0aW9uOiBjb2x1bW47XG4gIGFsaWduLWl0ZW1zOiBzdHJldGNoO1xuICBtYXJnaW4tcmlnaHQ6IDIwcHg7XG59XG5cbi5zdGVwLWRldGFpbCB7XG4gIHdpZHRoOiA4MCU7XG4gIGJvcmRlcjogMXB4O1xuICBib3JkZXItbGVmdC1zdHlsZTogZGFzaGVkO1xuICBib3JkZXItcmlnaHQtc3R5bGU6IGhpZGRlbjtcbiAgYm9yZGVyLXRvcC1zdHlsZTogaGlkZGVuO1xuICBib3JkZXItYm90dG9tLXN0eWxlOiBoaWRkZW47XG4gIHBhZGRpbmc6IDFlbTtcbiAgbWFyZ2luLWJvdHRvbTogMC41ZW07XG59XG5cbi8qIC5zdGVwLWRldGFpbCB7XG4gIHdpZHRoOiA4MCU7XG4gIGJvcmRlcjogMXB4O1xuICBib3JkZXItbGVmdC1zdHlsZTogZGFzaGVkO1xuICBib3JkZXItcmlnaHQtc3R5bGU6IGhpZGRlbjtcbiAgYm9yZGVyLXRvcC1zdHlsZTogaGlkZGVuO1xuICBib3JkZXItYm90dG9tLXN0eWxlOiBoaWRkZW47XG4gIHBhZGRpbmc6IDFlbTtcbiAgbWFyZ2luLWJvdHRvbTogMC41ZW07XG59ICovXG5cbi8qIC5tb2RlbCB7XG4gIHdpZHRoOiA4MCU7XG4gIGJvcmRlcjogMXB4O1xuICBib3JkZXItbGVmdC1zdHlsZTogZGFzaGVkO1xuICBib3JkZXItcmlnaHQtc3R5bGU6IGhpZGRlbjtcbiAgYm9yZGVyLXRvcC1zdHlsZTogaGlkZGVuO1xuICBib3JkZXItYm90dG9tLXN0eWxlOiBoaWRkZW47XG4gIHBhZGRpbmc6IDFlbTtcbiAgbWFyZ2luLWJvdHRvbTogMC41ZW07XG59ICovXG5cbmlucHV0OmludmFsaWQge1xuICBib3JkZXI6IHJlZCBzb2xpZCAzcHg7XG59XG4iLCJAaW1wb3J0IFwiLi4vYXBwLmNvbXBvbmVudC5jc3NcIjtcblxuLm1haW4ge1xuICBkaXNwbGF5OiBmbGV4O1xuICBmbGV4LWRpcmVjdGlvbjogcm93O1xufVxuXG4ubW9kZWwge1xuICB3aWR0aDogNDAlO1xufVxuXG4uZGV0YWlsIHtcbiAgd2lkdGg6IDYwJTtcbn1cbiJdfQ== */";
    /***/
  },

  /***/
  "./src/app/activity-description/activity-description.component.ts":
  /*!************************************************************************!*\
    !*** ./src/app/activity-description/activity-description.component.ts ***!
    \************************************************************************/

  /*! exports provided: ActivityDescriptionComponent */

  /***/
  function srcAppActivityDescriptionActivityDescriptionComponentTs(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "ActivityDescriptionComponent", function () {
      return ActivityDescriptionComponent;
    });
    /* harmony import */


    var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
    /*! tslib */
    "./node_modules/tslib/tslib.es6.js");
    /* harmony import */


    var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
    /*! @angular/core */
    "./node_modules/@angular/core/fesm2015/core.js");
    /* harmony import */


    var src_model_activity_description__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(
    /*! src/model/activity-description */
    "./src/model/activity-description.ts");
    /* harmony import */


    var _lang__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(
    /*! ../lang */
    "./src/app/lang.ts");
    /* harmony import */


    var _fortawesome_free_solid_svg_icons__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(
    /*! @fortawesome/free-solid-svg-icons */
    "./node_modules/@fortawesome/free-solid-svg-icons/index.es.js");

    var ActivityDescriptionComponent =
    /*#__PURE__*/
    function () {
      function ActivityDescriptionComponent() {
        _classCallCheck(this, ActivityDescriptionComponent);

        this.keys = Object.keys;
        this.parameterTypes = src_model_activity_description__WEBPACK_IMPORTED_MODULE_2__["ParameterType"];
        this.detail = null;
        this.parameterIdSequence = 0;
        this.inputDatasetIdSequence = 0;
        this.outputDatasetIdSequence = 0;
        this.iconAdd = _fortawesome_free_solid_svg_icons__WEBPACK_IMPORTED_MODULE_4__["faPlus"];
        this.iconRemove = _fortawesome_free_solid_svg_icons__WEBPACK_IMPORTED_MODULE_4__["faTimes"];
        this.lang = _lang__WEBPACK_IMPORTED_MODULE_3__["Lang"].getInstance();
      }

      _createClass(ActivityDescriptionComponent, [{
        key: "ngOnInit",
        value: function ngOnInit() {}
      }, {
        key: "addParameter",
        value: function addParameter() {
          var parameter = new src_model_activity_description__WEBPACK_IMPORTED_MODULE_2__["Parameter"]();
          parameter.name = "parameter-" + this.parameterIdSequence++;
          this.activity.parameters.push(parameter);
          this.showDetail(parameter);
        }
      }, {
        key: "removeParameter",
        value: function removeParameter(parameter) {
          var index = this.activity.parameters.indexOf(parameter);
          this.activity.parameters.splice(index, 1);
        }
      }, {
        key: "addInputDataset",
        value: function addInputDataset() {
          var dataset = new src_model_activity_description__WEBPACK_IMPORTED_MODULE_2__["InputDataset"]();
          dataset.name = "input-dataset-" + this.inputDatasetIdSequence++;
          this.activity.inputDatasets.push(dataset);
          this.showDetail(dataset);
        }
      }, {
        key: "removeInputDataset",
        value: function removeInputDataset(inputDataset) {
          var index = this.activity.inputDatasets.indexOf(inputDataset);
          this.activity.inputDatasets.splice(index, 1);
        }
      }, {
        key: "addOutputDataset",
        value: function addOutputDataset() {
          var dataset = new src_model_activity_description__WEBPACK_IMPORTED_MODULE_2__["OutputDataset"]();
          dataset.name = "output-dataset-" + this.outputDatasetIdSequence++;
          this.activity.outputDatasets.push(dataset);
          this.showDetail(dataset);
        }
      }, {
        key: "removeOutputDataset",
        value: function removeOutputDataset(outputDataset) {
          var index = this.activity.outputDatasets.indexOf(outputDataset);
          this.activity.outputDatasets.splice(index, 1);
        }
      }, {
        key: "showDetail",
        value: function showDetail(e) {
          this.detail = e;
        }
      }]);

      return ActivityDescriptionComponent;
    }();

    tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Input"])()], ActivityDescriptionComponent.prototype, "activity", void 0);
    ActivityDescriptionComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
      selector: "app-activity-description",
      template: tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(
      /*! raw-loader!./activity-description.component.html */
      "./node_modules/raw-loader/dist/cjs.js!./src/app/activity-description/activity-description.component.html")).default,
      styles: [tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(
      /*! ./activity-description.component.css */
      "./src/app/activity-description/activity-description.component.css")).default]
    })], ActivityDescriptionComponent);
    /***/
  },

  /***/
  "./src/app/app.component.css":
  /*!***********************************!*\
    !*** ./src/app/app.component.css ***!
    \***********************************/

  /*! exports provided: default */

  /***/
  function srcAppAppComponentCss(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony default export */


    __webpack_exports__["default"] = "*[data-descr] {\n  position: relative;\n  cursor: help;\n}\n\n*[data-descr]:after {\n  vertical-align: top;\n  color: inherit;\n  font-size: small;\n  content: \"?\";\n}\n\n*[data-descr]:hover::after,\n*[data-descr]:focus::after {\n  content: attr(data-descr);\n\n  position: absolute;\n  left: auto;\n  min-width: 200px;\n  border: 1px #aaaaaa solid;\n  border-radius: 10px;\n  background-color: #0b4a92;\n  padding: 12px;\n  color: #e0e0e0;\n\n  font-size: 14px;\n  font-style: normal;\n  font-weight: lighter;\n  z-index: 1;\n  text-align: center;\n  opacity: 0.9;\n  -webkit-transition: opacity 1s;\n  transition: opacity 1s;\n}\n\noption[title]:hover:after,\noption[title]:focus:after {\n  content: attr(title);\n}\n\n/* Tooltip container\n.tooltip {\n  position: relative;\n}\n\n/* Tooltip text\n.tooltip .tooltiptext {\n  visibility: hidden;\n  width: 200px;\n  background-color: #555;\n  color: #fff;\n  text-align: center;\n  padding: 10px 0;\n  border-radius: 6px;\n  margin: 10px;\n  font-size: small;\n\n  /* Position the tooltip text\n  position: absolute;\n  z-index: 1;\n  bottom: 125%;\n  left: 50%;\n  margin-left: -100px;\n\n  /* Fade in tooltip\n  opacity: 0;\n  transition: opacity 0.5s;\n}\n\n.tooltip::after {\n  vertical-align: top;\n  color: inherit;\n  font-size: small;\n  content: \"?\";\n}\n\n/* Tooltip arrow\n.tooltip .tooltiptext::after {\n  content: \"\";\n  position: absolute;\n  top: 100%;\n  left: 50%;\n  margin-left: -5px;\n  border-width: 5px;\n  border-style: solid;\n  border-color: #555 transparent transparent transparent;\n}\n\n/* Show the tooltip text when you mouse over the tooltip container\n.tooltip:hover .tooltiptext {\n  visibility: visible;\n  opacity: 1;\n} */\n\n* {\n  color: #ddd;\n  background-color: #222;\n  font-family: Arial, Helvetica, sans-serif;\n  border-color: #ddd;\n}\n\n/* Application-wide Styles */\n\nh1 {\n  color: rgb(74, 165, 255);\n  font-family: Arial, Helvetica, sans-serif;\n  font-size: 250%;\n}\n\nh2 {\n  font-family: Arial, Helvetica, sans-serif;\n  font-weight: bolder;\n}\n\nh3 {\n  font-family: Arial, Helvetica, sans-serif;\n  font-weight: normal;\n  padding-top: 1em;\n}\n\nbody {\n  margin: 2em;\n}\n\ninput,\ntextarea,\nselect {\n  font-size: large;\n  color: rgb(61, 228, 192);\n  border-top-style: hidden;\n  border-left-style: hidden;\n  border-right-style: hidden;\n}\n\ninput[type=\"text\"],\ninput[type=\"url\"],\ntextarea {\n  margin-bottom: 0.5em;\n  margin-left: 0.5em;\n  margin-right: 0.5em;\n  margin-top: none;\n  border-top-width: 0px;\n  border-top-style: hidden;\n  border-left-style: hidden;\n  border-right-style: hidden;\n  border-left-width: 0px;\n  border-right-width: 0px;\n  width: 90%;\n  display: block;\n}\n\ninput[type=\"number\"] {\n  width: 50px;\n  text-align: center;\n  -webkit-appearance: textfield;\n     -moz-appearance: textfield;\n          appearance: textfield;\n}\n\ntextarea {\n  width: 90%;\n  resize: vertical;\n}\n\nbutton {\n  color: #ddd;\n  color: rgb(61, 228, 192);\n  background-color: rgb(61, 228, 192);\n  background-color: #222;\n  color: rgb(61, 228, 192);\n  border-color: #ddd;\n  font-family: Arial, Helvetica, sans-serif;\n  font-weight: bold;\n  margin-bottom: 0.5em;\n  margin-left: 0.5em;\n  margin-right: 0.5em;\n  margin-top: 0.5em;\n  border-radius: 5px;\n  min-height: 30px;\n  text-overflow: clip;\n}\n\nbutton > fa-icon {\n  color: inherit;\n  background-color: inherit;\n}\n\nbutton:disabled {\n  color: #aaa;\n  background-color: #222;\n  font-weight: lighter;\n}\n\nbutton.next {\n  right: 0px;\n  color: rgb(61, 228, 192);\n  border-color: rgb(61, 228, 192);\n}\n\nselect {\n  min-width: 10em;\n}\n\n/* everywhere else */\n\n* {\n  font-family: Arial, Helvetica, sans-serif;\n}\n\nlabel {\n  display: block;\n  margin-top: 1em;\n  margin-bottom: 1em;\n}\n\n.main {\n  width: 100%;\n  display: -webkit-box;\n  display: flex;\n  -webkit-box-orient: horizontal;\n  -webkit-box-direction: normal;\n          flex-direction: row;\n}\n\n.navigation {\n  width: 20%;\n  display: -webkit-box;\n  display: flex;\n  -webkit-box-orient: vertical;\n  -webkit-box-direction: normal;\n          flex-direction: column;\n  -webkit-box-align: stretch;\n          align-items: stretch;\n  margin-right: 20px;\n}\n\n.step-detail {\n  width: 80%;\n  border: 1px;\n  border-left-style: dashed;\n  border-right-style: hidden;\n  border-top-style: hidden;\n  border-bottom-style: hidden;\n  padding: 1em;\n  margin-bottom: 0.5em;\n}\n\n/* .step-detail {\n  width: 80%;\n  border: 1px;\n  border-left-style: dashed;\n  border-right-style: hidden;\n  border-top-style: hidden;\n  border-bottom-style: hidden;\n  padding: 1em;\n  margin-bottom: 0.5em;\n} */\n\n/* .model {\n  width: 80%;\n  border: 1px;\n  border-left-style: dashed;\n  border-right-style: hidden;\n  border-top-style: hidden;\n  border-bottom-style: hidden;\n  padding: 1em;\n  margin-bottom: 0.5em;\n} */\n\ninput:invalid {\n  border: red solid 3px;\n}\n\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbInNyYy9hcHAvdG9vbHRpcC5jc3MiLCJzcmMvYXBwL2FwcC5jb21wb25lbnQuY3NzIl0sIm5hbWVzIjpbXSwibWFwcGluZ3MiOiJBQUFBO0VBQ0Usa0JBQWtCO0VBQ2xCLFlBQVk7QUFDZDs7QUFFQTtFQUNFLG1CQUFtQjtFQUNuQixjQUFjO0VBQ2QsZ0JBQWdCO0VBQ2hCLFlBQVk7QUFDZDs7QUFFQTs7RUFFRSx5QkFBeUI7O0VBRXpCLGtCQUFrQjtFQUNsQixVQUFVO0VBQ1YsZ0JBQWdCO0VBQ2hCLHlCQUF5QjtFQUN6QixtQkFBbUI7RUFDbkIseUJBQXlCO0VBQ3pCLGFBQWE7RUFDYixjQUFjOztFQUVkLGVBQWU7RUFDZixrQkFBa0I7RUFDbEIsb0JBQW9CO0VBQ3BCLFVBQVU7RUFDVixrQkFBa0I7RUFDbEIsWUFBWTtFQUNaLDhCQUFzQjtFQUF0QixzQkFBc0I7QUFDeEI7O0FBRUE7O0VBRUUsb0JBQW9CO0FBQ3RCOztBQUVBOzs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7O0dBb0RHOztBQ3pGSDtFQUNFLFdBQVc7RUFDWCxzQkFBc0I7RUFDdEIseUNBQXlDO0VBQ3pDLGtCQUFrQjtBQUNwQjs7QUFFQSw0QkFBNEI7O0FBQzVCO0VBQ0Usd0JBQXdCO0VBQ3hCLHlDQUF5QztFQUN6QyxlQUFlO0FBQ2pCOztBQUVBO0VBQ0UseUNBQXlDO0VBQ3pDLG1CQUFtQjtBQUNyQjs7QUFFQTtFQUNFLHlDQUF5QztFQUN6QyxtQkFBbUI7RUFDbkIsZ0JBQWdCO0FBQ2xCOztBQUVBO0VBQ0UsV0FBVztBQUNiOztBQUVBOzs7RUFHRSxnQkFBZ0I7RUFDaEIsd0JBQXdCO0VBQ3hCLHdCQUF3QjtFQUN4Qix5QkFBeUI7RUFDekIsMEJBQTBCO0FBQzVCOztBQUVBOzs7RUFHRSxvQkFBb0I7RUFDcEIsa0JBQWtCO0VBQ2xCLG1CQUFtQjtFQUNuQixnQkFBZ0I7RUFDaEIscUJBQXFCO0VBQ3JCLHdCQUF3QjtFQUN4Qix5QkFBeUI7RUFDekIsMEJBQTBCO0VBQzFCLHNCQUFzQjtFQUN0Qix1QkFBdUI7RUFDdkIsVUFBVTtFQUNWLGNBQWM7QUFDaEI7O0FBRUE7RUFDRSxXQUFXO0VBQ1gsa0JBQWtCO0VBQ2xCLDZCQUFxQjtLQUFyQiwwQkFBcUI7VUFBckIscUJBQXFCO0FBQ3ZCOztBQUVBO0VBQ0UsVUFBVTtFQUNWLGdCQUFnQjtBQUNsQjs7QUFFQTtFQUNFLFdBQVc7RUFDWCx3QkFBd0I7RUFDeEIsbUNBQW1DO0VBQ25DLHNCQUFzQjtFQUN0Qix3QkFBd0I7RUFDeEIsa0JBQWtCO0VBQ2xCLHlDQUF5QztFQUN6QyxpQkFBaUI7RUFDakIsb0JBQW9CO0VBQ3BCLGtCQUFrQjtFQUNsQixtQkFBbUI7RUFDbkIsaUJBQWlCO0VBQ2pCLGtCQUFrQjtFQUNsQixnQkFBZ0I7RUFDaEIsbUJBQW1CO0FBQ3JCOztBQUVBO0VBQ0UsY0FBYztFQUNkLHlCQUF5QjtBQUMzQjs7QUFFQTtFQUNFLFdBQVc7RUFDWCxzQkFBc0I7RUFDdEIsb0JBQW9CO0FBQ3RCOztBQUVBO0VBQ0UsVUFBVTtFQUNWLHdCQUF3QjtFQUN4QiwrQkFBK0I7QUFDakM7O0FBRUE7RUFDRSxlQUFlO0FBQ2pCOztBQUVBLG9CQUFvQjs7QUFFcEI7RUFDRSx5Q0FBeUM7QUFDM0M7O0FBRUE7RUFDRSxjQUFjO0VBQ2QsZUFBZTtFQUNmLGtCQUFrQjtBQUNwQjs7QUFFQTtFQUNFLFdBQVc7RUFDWCxvQkFBYTtFQUFiLGFBQWE7RUFDYiw4QkFBbUI7RUFBbkIsNkJBQW1CO1VBQW5CLG1CQUFtQjtBQUNyQjs7QUFFQTtFQUNFLFVBQVU7RUFDVixvQkFBYTtFQUFiLGFBQWE7RUFDYiw0QkFBc0I7RUFBdEIsNkJBQXNCO1VBQXRCLHNCQUFzQjtFQUN0QiwwQkFBb0I7VUFBcEIsb0JBQW9CO0VBQ3BCLGtCQUFrQjtBQUNwQjs7QUFFQTtFQUNFLFVBQVU7RUFDVixXQUFXO0VBQ1gseUJBQXlCO0VBQ3pCLDBCQUEwQjtFQUMxQix3QkFBd0I7RUFDeEIsMkJBQTJCO0VBQzNCLFlBQVk7RUFDWixvQkFBb0I7QUFDdEI7O0FBRUE7Ozs7Ozs7OztHQVNHOztBQUVIOzs7Ozs7Ozs7R0FTRzs7QUFFSDtFQUNFLHFCQUFxQjtBQUN2QiIsImZpbGUiOiJzcmMvYXBwL2FwcC5jb21wb25lbnQuY3NzIiwic291cmNlc0NvbnRlbnQiOlsiKltkYXRhLWRlc2NyXSB7XG4gIHBvc2l0aW9uOiByZWxhdGl2ZTtcbiAgY3Vyc29yOiBoZWxwO1xufVxuXG4qW2RhdGEtZGVzY3JdOmFmdGVyIHtcbiAgdmVydGljYWwtYWxpZ246IHRvcDtcbiAgY29sb3I6IGluaGVyaXQ7XG4gIGZvbnQtc2l6ZTogc21hbGw7XG4gIGNvbnRlbnQ6IFwiP1wiO1xufVxuXG4qW2RhdGEtZGVzY3JdOmhvdmVyOjphZnRlcixcbipbZGF0YS1kZXNjcl06Zm9jdXM6OmFmdGVyIHtcbiAgY29udGVudDogYXR0cihkYXRhLWRlc2NyKTtcblxuICBwb3NpdGlvbjogYWJzb2x1dGU7XG4gIGxlZnQ6IGF1dG87XG4gIG1pbi13aWR0aDogMjAwcHg7XG4gIGJvcmRlcjogMXB4ICNhYWFhYWEgc29saWQ7XG4gIGJvcmRlci1yYWRpdXM6IDEwcHg7XG4gIGJhY2tncm91bmQtY29sb3I6ICMwYjRhOTI7XG4gIHBhZGRpbmc6IDEycHg7XG4gIGNvbG9yOiAjZTBlMGUwO1xuXG4gIGZvbnQtc2l6ZTogMTRweDtcbiAgZm9udC1zdHlsZTogbm9ybWFsO1xuICBmb250LXdlaWdodDogbGlnaHRlcjtcbiAgei1pbmRleDogMTtcbiAgdGV4dC1hbGlnbjogY2VudGVyO1xuICBvcGFjaXR5OiAwLjk7XG4gIHRyYW5zaXRpb246IG9wYWNpdHkgMXM7XG59XG5cbm9wdGlvblt0aXRsZV06aG92ZXI6YWZ0ZXIsXG5vcHRpb25bdGl0bGVdOmZvY3VzOmFmdGVyIHtcbiAgY29udGVudDogYXR0cih0aXRsZSk7XG59XG5cbi8qIFRvb2x0aXAgY29udGFpbmVyXG4udG9vbHRpcCB7XG4gIHBvc2l0aW9uOiByZWxhdGl2ZTtcbn1cblxuLyogVG9vbHRpcCB0ZXh0XG4udG9vbHRpcCAudG9vbHRpcHRleHQge1xuICB2aXNpYmlsaXR5OiBoaWRkZW47XG4gIHdpZHRoOiAyMDBweDtcbiAgYmFja2dyb3VuZC1jb2xvcjogIzU1NTtcbiAgY29sb3I6ICNmZmY7XG4gIHRleHQtYWxpZ246IGNlbnRlcjtcbiAgcGFkZGluZzogMTBweCAwO1xuICBib3JkZXItcmFkaXVzOiA2cHg7XG4gIG1hcmdpbjogMTBweDtcbiAgZm9udC1zaXplOiBzbWFsbDtcblxuICAvKiBQb3NpdGlvbiB0aGUgdG9vbHRpcCB0ZXh0XG4gIHBvc2l0aW9uOiBhYnNvbHV0ZTtcbiAgei1pbmRleDogMTtcbiAgYm90dG9tOiAxMjUlO1xuICBsZWZ0OiA1MCU7XG4gIG1hcmdpbi1sZWZ0OiAtMTAwcHg7XG5cbiAgLyogRmFkZSBpbiB0b29sdGlwXG4gIG9wYWNpdHk6IDA7XG4gIHRyYW5zaXRpb246IG9wYWNpdHkgMC41cztcbn1cblxuLnRvb2x0aXA6OmFmdGVyIHtcbiAgdmVydGljYWwtYWxpZ246IHRvcDtcbiAgY29sb3I6IGluaGVyaXQ7XG4gIGZvbnQtc2l6ZTogc21hbGw7XG4gIGNvbnRlbnQ6IFwiP1wiO1xufVxuXG4vKiBUb29sdGlwIGFycm93XG4udG9vbHRpcCAudG9vbHRpcHRleHQ6OmFmdGVyIHtcbiAgY29udGVudDogXCJcIjtcbiAgcG9zaXRpb246IGFic29sdXRlO1xuICB0b3A6IDEwMCU7XG4gIGxlZnQ6IDUwJTtcbiAgbWFyZ2luLWxlZnQ6IC01cHg7XG4gIGJvcmRlci13aWR0aDogNXB4O1xuICBib3JkZXItc3R5bGU6IHNvbGlkO1xuICBib3JkZXItY29sb3I6ICM1NTUgdHJhbnNwYXJlbnQgdHJhbnNwYXJlbnQgdHJhbnNwYXJlbnQ7XG59XG5cbi8qIFNob3cgdGhlIHRvb2x0aXAgdGV4dCB3aGVuIHlvdSBtb3VzZSBvdmVyIHRoZSB0b29sdGlwIGNvbnRhaW5lclxuLnRvb2x0aXA6aG92ZXIgLnRvb2x0aXB0ZXh0IHtcbiAgdmlzaWJpbGl0eTogdmlzaWJsZTtcbiAgb3BhY2l0eTogMTtcbn0gKi9cbiIsIkBpbXBvcnQgXCIuL3Rvb2x0aXAuY3NzXCI7XG5cbioge1xuICBjb2xvcjogI2RkZDtcbiAgYmFja2dyb3VuZC1jb2xvcjogIzIyMjtcbiAgZm9udC1mYW1pbHk6IEFyaWFsLCBIZWx2ZXRpY2EsIHNhbnMtc2VyaWY7XG4gIGJvcmRlci1jb2xvcjogI2RkZDtcbn1cblxuLyogQXBwbGljYXRpb24td2lkZSBTdHlsZXMgKi9cbmgxIHtcbiAgY29sb3I6IHJnYig3NCwgMTY1LCAyNTUpO1xuICBmb250LWZhbWlseTogQXJpYWwsIEhlbHZldGljYSwgc2Fucy1zZXJpZjtcbiAgZm9udC1zaXplOiAyNTAlO1xufVxuXG5oMiB7XG4gIGZvbnQtZmFtaWx5OiBBcmlhbCwgSGVsdmV0aWNhLCBzYW5zLXNlcmlmO1xuICBmb250LXdlaWdodDogYm9sZGVyO1xufVxuXG5oMyB7XG4gIGZvbnQtZmFtaWx5OiBBcmlhbCwgSGVsdmV0aWNhLCBzYW5zLXNlcmlmO1xuICBmb250LXdlaWdodDogbm9ybWFsO1xuICBwYWRkaW5nLXRvcDogMWVtO1xufVxuXG5ib2R5IHtcbiAgbWFyZ2luOiAyZW07XG59XG5cbmlucHV0LFxudGV4dGFyZWEsXG5zZWxlY3Qge1xuICBmb250LXNpemU6IGxhcmdlO1xuICBjb2xvcjogcmdiKDYxLCAyMjgsIDE5Mik7XG4gIGJvcmRlci10b3Atc3R5bGU6IGhpZGRlbjtcbiAgYm9yZGVyLWxlZnQtc3R5bGU6IGhpZGRlbjtcbiAgYm9yZGVyLXJpZ2h0LXN0eWxlOiBoaWRkZW47XG59XG5cbmlucHV0W3R5cGU9XCJ0ZXh0XCJdLFxuaW5wdXRbdHlwZT1cInVybFwiXSxcbnRleHRhcmVhIHtcbiAgbWFyZ2luLWJvdHRvbTogMC41ZW07XG4gIG1hcmdpbi1sZWZ0OiAwLjVlbTtcbiAgbWFyZ2luLXJpZ2h0OiAwLjVlbTtcbiAgbWFyZ2luLXRvcDogbm9uZTtcbiAgYm9yZGVyLXRvcC13aWR0aDogMHB4O1xuICBib3JkZXItdG9wLXN0eWxlOiBoaWRkZW47XG4gIGJvcmRlci1sZWZ0LXN0eWxlOiBoaWRkZW47XG4gIGJvcmRlci1yaWdodC1zdHlsZTogaGlkZGVuO1xuICBib3JkZXItbGVmdC13aWR0aDogMHB4O1xuICBib3JkZXItcmlnaHQtd2lkdGg6IDBweDtcbiAgd2lkdGg6IDkwJTtcbiAgZGlzcGxheTogYmxvY2s7XG59XG5cbmlucHV0W3R5cGU9XCJudW1iZXJcIl0ge1xuICB3aWR0aDogNTBweDtcbiAgdGV4dC1hbGlnbjogY2VudGVyO1xuICBhcHBlYXJhbmNlOiB0ZXh0ZmllbGQ7XG59XG5cbnRleHRhcmVhIHtcbiAgd2lkdGg6IDkwJTtcbiAgcmVzaXplOiB2ZXJ0aWNhbDtcbn1cblxuYnV0dG9uIHtcbiAgY29sb3I6ICNkZGQ7XG4gIGNvbG9yOiByZ2IoNjEsIDIyOCwgMTkyKTtcbiAgYmFja2dyb3VuZC1jb2xvcjogcmdiKDYxLCAyMjgsIDE5Mik7XG4gIGJhY2tncm91bmQtY29sb3I6ICMyMjI7XG4gIGNvbG9yOiByZ2IoNjEsIDIyOCwgMTkyKTtcbiAgYm9yZGVyLWNvbG9yOiAjZGRkO1xuICBmb250LWZhbWlseTogQXJpYWwsIEhlbHZldGljYSwgc2Fucy1zZXJpZjtcbiAgZm9udC13ZWlnaHQ6IGJvbGQ7XG4gIG1hcmdpbi1ib3R0b206IDAuNWVtO1xuICBtYXJnaW4tbGVmdDogMC41ZW07XG4gIG1hcmdpbi1yaWdodDogMC41ZW07XG4gIG1hcmdpbi10b3A6IDAuNWVtO1xuICBib3JkZXItcmFkaXVzOiA1cHg7XG4gIG1pbi1oZWlnaHQ6IDMwcHg7XG4gIHRleHQtb3ZlcmZsb3c6IGNsaXA7XG59XG5cbmJ1dHRvbiA+IGZhLWljb24ge1xuICBjb2xvcjogaW5oZXJpdDtcbiAgYmFja2dyb3VuZC1jb2xvcjogaW5oZXJpdDtcbn1cblxuYnV0dG9uOmRpc2FibGVkIHtcbiAgY29sb3I6ICNhYWE7XG4gIGJhY2tncm91bmQtY29sb3I6ICMyMjI7XG4gIGZvbnQtd2VpZ2h0OiBsaWdodGVyO1xufVxuXG5idXR0b24ubmV4dCB7XG4gIHJpZ2h0OiAwcHg7XG4gIGNvbG9yOiByZ2IoNjEsIDIyOCwgMTkyKTtcbiAgYm9yZGVyLWNvbG9yOiByZ2IoNjEsIDIyOCwgMTkyKTtcbn1cblxuc2VsZWN0IHtcbiAgbWluLXdpZHRoOiAxMGVtO1xufVxuXG4vKiBldmVyeXdoZXJlIGVsc2UgKi9cblxuKiB7XG4gIGZvbnQtZmFtaWx5OiBBcmlhbCwgSGVsdmV0aWNhLCBzYW5zLXNlcmlmO1xufVxuXG5sYWJlbCB7XG4gIGRpc3BsYXk6IGJsb2NrO1xuICBtYXJnaW4tdG9wOiAxZW07XG4gIG1hcmdpbi1ib3R0b206IDFlbTtcbn1cblxuLm1haW4ge1xuICB3aWR0aDogMTAwJTtcbiAgZGlzcGxheTogZmxleDtcbiAgZmxleC1kaXJlY3Rpb246IHJvdztcbn1cblxuLm5hdmlnYXRpb24ge1xuICB3aWR0aDogMjAlO1xuICBkaXNwbGF5OiBmbGV4O1xuICBmbGV4LWRpcmVjdGlvbjogY29sdW1uO1xuICBhbGlnbi1pdGVtczogc3RyZXRjaDtcbiAgbWFyZ2luLXJpZ2h0OiAyMHB4O1xufVxuXG4uc3RlcC1kZXRhaWwge1xuICB3aWR0aDogODAlO1xuICBib3JkZXI6IDFweDtcbiAgYm9yZGVyLWxlZnQtc3R5bGU6IGRhc2hlZDtcbiAgYm9yZGVyLXJpZ2h0LXN0eWxlOiBoaWRkZW47XG4gIGJvcmRlci10b3Atc3R5bGU6IGhpZGRlbjtcbiAgYm9yZGVyLWJvdHRvbS1zdHlsZTogaGlkZGVuO1xuICBwYWRkaW5nOiAxZW07XG4gIG1hcmdpbi1ib3R0b206IDAuNWVtO1xufVxuXG4vKiAuc3RlcC1kZXRhaWwge1xuICB3aWR0aDogODAlO1xuICBib3JkZXI6IDFweDtcbiAgYm9yZGVyLWxlZnQtc3R5bGU6IGRhc2hlZDtcbiAgYm9yZGVyLXJpZ2h0LXN0eWxlOiBoaWRkZW47XG4gIGJvcmRlci10b3Atc3R5bGU6IGhpZGRlbjtcbiAgYm9yZGVyLWJvdHRvbS1zdHlsZTogaGlkZGVuO1xuICBwYWRkaW5nOiAxZW07XG4gIG1hcmdpbi1ib3R0b206IDAuNWVtO1xufSAqL1xuXG4vKiAubW9kZWwge1xuICB3aWR0aDogODAlO1xuICBib3JkZXI6IDFweDtcbiAgYm9yZGVyLWxlZnQtc3R5bGU6IGRhc2hlZDtcbiAgYm9yZGVyLXJpZ2h0LXN0eWxlOiBoaWRkZW47XG4gIGJvcmRlci10b3Atc3R5bGU6IGhpZGRlbjtcbiAgYm9yZGVyLWJvdHRvbS1zdHlsZTogaGlkZGVuO1xuICBwYWRkaW5nOiAxZW07XG4gIG1hcmdpbi1ib3R0b206IDAuNWVtO1xufSAqL1xuXG5pbnB1dDppbnZhbGlkIHtcbiAgYm9yZGVyOiByZWQgc29saWQgM3B4O1xufVxuIl19 */";
    /***/
  },

  /***/
  "./src/app/app.component.ts":
  /*!**********************************!*\
    !*** ./src/app/app.component.ts ***!
    \**********************************/

  /*! exports provided: AppComponent */

  /***/
  function srcAppAppComponentTs(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "AppComponent", function () {
      return AppComponent;
    });
    /* harmony import */


    var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
    /*! tslib */
    "./node_modules/tslib/tslib.es6.js");
    /* harmony import */


    var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
    /*! @angular/core */
    "./node_modules/@angular/core/fesm2015/core.js");
    /* harmony import */


    var src_model_activity_description__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(
    /*! src/model/activity-description */
    "./src/model/activity-description.ts");
    /* harmony import */


    var src_model_deployment_description__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(
    /*! src/model/deployment-description */
    "./src/model/deployment-description.ts");
    /* harmony import */


    var src_model_tool_description__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(
    /*! src/model/tool-description */
    "./src/model/tool-description.ts");
    /* harmony import */


    var _project_generator_service__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(
    /*! ./project-generator.service */
    "./src/app/project-generator.service.ts");
    /* harmony import */


    var _angular_common_http__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(
    /*! @angular/common/http */
    "./node_modules/@angular/common/fesm2015/http.js");

    var AppComponent =
    /*#__PURE__*/
    function () {
      function AppComponent(http) {
        _classCallCheck(this, AppComponent);

        this.http = http;
        this.title = "Activity-REST Bootstrap";
        this.state = "ACTIVITY";
        this.isFunctionalEntityEnabled = false;
        this.isDeploymentEnabled = false;
        this.isGenerationEnabled = false;
      }

      _createClass(AppComponent, [{
        key: "ngOnInit",
        value: function ngOnInit() {
          console.log("executou");
          this.activity = new src_model_activity_description__WEBPACK_IMPORTED_MODULE_2__["Activity"]();
          this.activity.name = "MyActivity";
          this.functionalEntity = new src_model_tool_description__WEBPACK_IMPORTED_MODULE_4__["CommandLineTool"]();
          this.functionalEntity.name = "tool";
          this.deployment = new src_model_deployment_description__WEBPACK_IMPORTED_MODULE_3__["Deployment"]();
          this.generatorService = new _project_generator_service__WEBPACK_IMPORTED_MODULE_5__["ProjectGeneratorService"](this.http);
        }
      }, {
        key: "showActivity",
        value: function showActivity() {
          this.state = "ACTIVITY";
        }
      }, {
        key: "showFunctionalEntity",
        value: function showFunctionalEntity() {
          this.state = "FUNCTIONAL_ENTITY";
        }
      }, {
        key: "showDeployment",
        value: function showDeployment() {
          this.state = "DEPLOYMENT";
        }
      }, {
        key: "showGenerationScreen",
        value: function showGenerationScreen() {
          this.state = "GENERATION";
        }
      }, {
        key: "moveToNextScreen",
        value: function moveToNextScreen() {
          switch (this.state) {
            case "ACTIVITY":
              this.isFunctionalEntityEnabled = true;
              this.state = "FUNCTIONAL_ENTITY";
              break;

            case "FUNCTIONAL_ENTITY":
              this.isDeploymentEnabled = true;
              this.state = "DEPLOYMENT";
              break;

            case "DEPLOYMENT":
              this.isGenerationEnabled = true;
              this.state = "GENERATION";
              break;
          }
        }
      }, {
        key: "log",
        value: function log() {
          console.log(this.activity);
          console.log(this.functionalEntity);
          console.log(this.deployment);
          console.log(this.state);
        }
      }]);

      return AppComponent;
    }();

    AppComponent.ctorParameters = function () {
      return [{
        type: _angular_common_http__WEBPACK_IMPORTED_MODULE_6__["HttpClient"]
      }];
    };

    AppComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
      selector: "app-root",
      template: tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(
      /*! raw-loader!./app.component.html */
      "./node_modules/raw-loader/dist/cjs.js!./src/app/app.component.html")).default,
      styles: [tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(
      /*! ./app.component.css */
      "./src/app/app.component.css")).default]
    })], AppComponent);
    /***/
  },

  /***/
  "./src/app/app.module.ts":
  /*!*******************************!*\
    !*** ./src/app/app.module.ts ***!
    \*******************************/

  /*! exports provided: AppModule */

  /***/
  function srcAppAppModuleTs(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "AppModule", function () {
      return AppModule;
    });
    /* harmony import */


    var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
    /*! tslib */
    "./node_modules/tslib/tslib.es6.js");
    /* harmony import */


    var _angular_platform_browser__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
    /*! @angular/platform-browser */
    "./node_modules/@angular/platform-browser/fesm2015/platform-browser.js");
    /* harmony import */


    var _angular_common_http__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(
    /*! @angular/common/http */
    "./node_modules/@angular/common/fesm2015/http.js");
    /* harmony import */


    var _angular_core__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(
    /*! @angular/core */
    "./node_modules/@angular/core/fesm2015/core.js");
    /* harmony import */


    var _angular_forms__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(
    /*! @angular/forms */
    "./node_modules/@angular/forms/fesm2015/forms.js");
    /* harmony import */


    var _fortawesome_angular_fontawesome__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(
    /*! @fortawesome/angular-fontawesome */
    "./node_modules/@fortawesome/angular-fontawesome/fesm2015/angular-fontawesome.js");
    /* harmony import */


    var _app_component__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(
    /*! ./app.component */
    "./src/app/app.component.ts");
    /* harmony import */


    var _activity_description_activity_description_component__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(
    /*! ./activity-description/activity-description.component */
    "./src/app/activity-description/activity-description.component.ts");
    /* harmony import */


    var _functional_entity_functional_entity_component__WEBPACK_IMPORTED_MODULE_8__ = __webpack_require__(
    /*! ./functional-entity/functional-entity.component */
    "./src/app/functional-entity/functional-entity.component.ts");
    /* harmony import */


    var _deployment_model_deployment_model_component__WEBPACK_IMPORTED_MODULE_9__ = __webpack_require__(
    /*! ./deployment-model/deployment-model.component */
    "./src/app/deployment-model/deployment-model.component.ts");
    /* harmony import */


    var _exit_code_detail_exit_code_detail_component__WEBPACK_IMPORTED_MODULE_10__ = __webpack_require__(
    /*! ./exit-code-detail/exit-code-detail.component */
    "./src/app/exit-code-detail/exit-code-detail.component.ts");
    /* harmony import */


    var _command_line_template_command_line_template_component__WEBPACK_IMPORTED_MODULE_11__ = __webpack_require__(
    /*! ./command-line-template/command-line-template.component */
    "./src/app/command-line-template/command-line-template.component.ts");
    /* harmony import */


    var _literal_command_line_template_literal_command_line_template_component__WEBPACK_IMPORTED_MODULE_12__ = __webpack_require__(
    /*! ./literal-command-line-template/literal-command-line-template.component */
    "./src/app/literal-command-line-template/literal-command-line-template.component.ts");
    /* harmony import */


    var _string_list_manipulators_string_list_manipulators_component__WEBPACK_IMPORTED_MODULE_13__ = __webpack_require__(
    /*! ./string-list-manipulators/string-list-manipulators.component */
    "./src/app/string-list-manipulators/string-list-manipulators.component.ts");
    /* harmony import */


    var _artifacts_generation_artifacts_generation_component__WEBPACK_IMPORTED_MODULE_14__ = __webpack_require__(
    /*! ./artifacts-generation/artifacts-generation.component */
    "./src/app/artifacts-generation/artifacts-generation.component.ts");
    /* harmony import */


    var _activity_description_detail_activity_description_detail_component__WEBPACK_IMPORTED_MODULE_15__ = __webpack_require__(
    /*! ./activity-description-detail/activity-description-detail.component */
    "./src/app/activity-description-detail/activity-description-detail.component.ts");
    /* harmony import */


    var _functional_entity_detail_functional_entity_detail_component__WEBPACK_IMPORTED_MODULE_16__ = __webpack_require__(
    /*! ./functional-entity-detail/functional-entity-detail.component */
    "./src/app/functional-entity-detail/functional-entity-detail.component.ts");
    /* harmony import */


    var _angular_platform_browser_animations__WEBPACK_IMPORTED_MODULE_17__ = __webpack_require__(
    /*! @angular/platform-browser/animations */
    "./node_modules/@angular/platform-browser/fesm2015/animations.js");

    var AppModule = function AppModule() {
      _classCallCheck(this, AppModule);
    };

    AppModule = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_3__["NgModule"])({
      declarations: [_app_component__WEBPACK_IMPORTED_MODULE_6__["AppComponent"], _activity_description_activity_description_component__WEBPACK_IMPORTED_MODULE_7__["ActivityDescriptionComponent"], _functional_entity_functional_entity_component__WEBPACK_IMPORTED_MODULE_8__["FunctionalEntityComponent"], _deployment_model_deployment_model_component__WEBPACK_IMPORTED_MODULE_9__["DeploymentModelComponent"], _exit_code_detail_exit_code_detail_component__WEBPACK_IMPORTED_MODULE_10__["ExitCodeDetailComponent"], _command_line_template_command_line_template_component__WEBPACK_IMPORTED_MODULE_11__["CommandLineTemplateComponent"], _literal_command_line_template_literal_command_line_template_component__WEBPACK_IMPORTED_MODULE_12__["LiteralCommandLineTemplateComponent"], _string_list_manipulators_string_list_manipulators_component__WEBPACK_IMPORTED_MODULE_13__["StringListManipulatorsComponent"], _artifacts_generation_artifacts_generation_component__WEBPACK_IMPORTED_MODULE_14__["ArtifactsGenerationComponent"], _activity_description_detail_activity_description_detail_component__WEBPACK_IMPORTED_MODULE_15__["ActivityDescriptionDetailComponent"], _functional_entity_detail_functional_entity_detail_component__WEBPACK_IMPORTED_MODULE_16__["FunctionalEntityDetailComponent"]],
      imports: [_angular_platform_browser__WEBPACK_IMPORTED_MODULE_1__["BrowserModule"], _angular_forms__WEBPACK_IMPORTED_MODULE_4__["FormsModule"], _angular_common_http__WEBPACK_IMPORTED_MODULE_2__["HttpClientModule"], _fortawesome_angular_fontawesome__WEBPACK_IMPORTED_MODULE_5__["FontAwesomeModule"], _angular_platform_browser_animations__WEBPACK_IMPORTED_MODULE_17__["BrowserAnimationsModule"]],
      providers: [],
      bootstrap: [_app_component__WEBPACK_IMPORTED_MODULE_6__["AppComponent"]]
    })], AppModule);
    /***/
  },

  /***/
  "./src/app/artifacts-generation/artifacts-generation.component.css":
  /*!*************************************************************************!*\
    !*** ./src/app/artifacts-generation/artifacts-generation.component.css ***!
    \*************************************************************************/

  /*! exports provided: default */

  /***/
  function srcAppArtifactsGenerationArtifactsGenerationComponentCss(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony default export */


    __webpack_exports__["default"] = "*[data-descr] {\n  position: relative;\n  cursor: help;\n}\n\n*[data-descr]:after {\n  vertical-align: top;\n  color: inherit;\n  font-size: small;\n  content: \"?\";\n}\n\n*[data-descr]:hover::after,\n*[data-descr]:focus::after {\n  content: attr(data-descr);\n\n  position: absolute;\n  left: auto;\n  min-width: 200px;\n  border: 1px #aaaaaa solid;\n  border-radius: 10px;\n  background-color: #0b4a92;\n  padding: 12px;\n  color: #e0e0e0;\n\n  font-size: 14px;\n  font-style: normal;\n  font-weight: lighter;\n  z-index: 1;\n  text-align: center;\n  opacity: 0.9;\n  -webkit-transition: opacity 1s;\n  transition: opacity 1s;\n}\n\noption[title]:hover:after,\noption[title]:focus:after {\n  content: attr(title);\n}\n\n/* Tooltip container\n.tooltip {\n  position: relative;\n}\n\n/* Tooltip text\n.tooltip .tooltiptext {\n  visibility: hidden;\n  width: 200px;\n  background-color: #555;\n  color: #fff;\n  text-align: center;\n  padding: 10px 0;\n  border-radius: 6px;\n  margin: 10px;\n  font-size: small;\n\n  /* Position the tooltip text\n  position: absolute;\n  z-index: 1;\n  bottom: 125%;\n  left: 50%;\n  margin-left: -100px;\n\n  /* Fade in tooltip\n  opacity: 0;\n  transition: opacity 0.5s;\n}\n\n.tooltip::after {\n  vertical-align: top;\n  color: inherit;\n  font-size: small;\n  content: \"?\";\n}\n\n/* Tooltip arrow\n.tooltip .tooltiptext::after {\n  content: \"\";\n  position: absolute;\n  top: 100%;\n  left: 50%;\n  margin-left: -5px;\n  border-width: 5px;\n  border-style: solid;\n  border-color: #555 transparent transparent transparent;\n}\n\n/* Show the tooltip text when you mouse over the tooltip container\n.tooltip:hover .tooltiptext {\n  visibility: visible;\n  opacity: 1;\n} */\n\n* {\n  color: #ddd;\n  background-color: #222;\n  font-family: Arial, Helvetica, sans-serif;\n  border-color: #ddd;\n}\n\n/* Application-wide Styles */\n\nh1 {\n  color: rgb(74, 165, 255);\n  font-family: Arial, Helvetica, sans-serif;\n  font-size: 250%;\n}\n\nh2 {\n  font-family: Arial, Helvetica, sans-serif;\n  font-weight: bolder;\n}\n\nh3 {\n  font-family: Arial, Helvetica, sans-serif;\n  font-weight: normal;\n  padding-top: 1em;\n}\n\nbody {\n  margin: 2em;\n}\n\ninput,\ntextarea,\nselect {\n  font-size: large;\n  color: rgb(61, 228, 192);\n  border-top-style: hidden;\n  border-left-style: hidden;\n  border-right-style: hidden;\n}\n\ninput[type=\"text\"],\ninput[type=\"url\"],\ntextarea {\n  margin-bottom: 0.5em;\n  margin-left: 0.5em;\n  margin-right: 0.5em;\n  margin-top: none;\n  border-top-width: 0px;\n  border-top-style: hidden;\n  border-left-style: hidden;\n  border-right-style: hidden;\n  border-left-width: 0px;\n  border-right-width: 0px;\n  width: 90%;\n  display: block;\n}\n\ninput[type=\"number\"] {\n  width: 50px;\n  text-align: center;\n  -webkit-appearance: textfield;\n     -moz-appearance: textfield;\n          appearance: textfield;\n}\n\ntextarea {\n  width: 90%;\n  resize: vertical;\n}\n\nbutton {\n  color: #ddd;\n  color: rgb(61, 228, 192);\n  background-color: rgb(61, 228, 192);\n  background-color: #222;\n  color: rgb(61, 228, 192);\n  border-color: #ddd;\n  font-family: Arial, Helvetica, sans-serif;\n  font-weight: bold;\n  margin-bottom: 0.5em;\n  margin-left: 0.5em;\n  margin-right: 0.5em;\n  margin-top: 0.5em;\n  border-radius: 5px;\n  min-height: 30px;\n  text-overflow: clip;\n}\n\nbutton > fa-icon {\n  color: inherit;\n  background-color: inherit;\n}\n\nbutton:disabled {\n  color: #aaa;\n  background-color: #222;\n  font-weight: lighter;\n}\n\nbutton.next {\n  right: 0px;\n  color: rgb(61, 228, 192);\n  border-color: rgb(61, 228, 192);\n}\n\nselect {\n  min-width: 10em;\n}\n\n/* everywhere else */\n\n* {\n  font-family: Arial, Helvetica, sans-serif;\n}\n\nlabel {\n  display: block;\n  margin-top: 1em;\n  margin-bottom: 1em;\n}\n\n.main {\n  width: 100%;\n  display: -webkit-box;\n  display: flex;\n  -webkit-box-orient: horizontal;\n  -webkit-box-direction: normal;\n          flex-direction: row;\n}\n\n.navigation {\n  width: 20%;\n  display: -webkit-box;\n  display: flex;\n  -webkit-box-orient: vertical;\n  -webkit-box-direction: normal;\n          flex-direction: column;\n  -webkit-box-align: stretch;\n          align-items: stretch;\n  margin-right: 20px;\n}\n\n.step-detail {\n  width: 80%;\n  border: 1px;\n  border-left-style: dashed;\n  border-right-style: hidden;\n  border-top-style: hidden;\n  border-bottom-style: hidden;\n  padding: 1em;\n  margin-bottom: 0.5em;\n}\n\n/* .step-detail {\n  width: 80%;\n  border: 1px;\n  border-left-style: dashed;\n  border-right-style: hidden;\n  border-top-style: hidden;\n  border-bottom-style: hidden;\n  padding: 1em;\n  margin-bottom: 0.5em;\n} */\n\n/* .model {\n  width: 80%;\n  border: 1px;\n  border-left-style: dashed;\n  border-right-style: hidden;\n  border-top-style: hidden;\n  border-bottom-style: hidden;\n  padding: 1em;\n  margin-bottom: 0.5em;\n} */\n\ninput:invalid {\n  border: red solid 3px;\n}\n\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbInNyYy9hcHAvdG9vbHRpcC5jc3MiLCJzcmMvYXBwL2FwcC5jb21wb25lbnQuY3NzIl0sIm5hbWVzIjpbXSwibWFwcGluZ3MiOiJBQUFBO0VBQ0Usa0JBQWtCO0VBQ2xCLFlBQVk7QUFDZDs7QUFFQTtFQUNFLG1CQUFtQjtFQUNuQixjQUFjO0VBQ2QsZ0JBQWdCO0VBQ2hCLFlBQVk7QUFDZDs7QUFFQTs7RUFFRSx5QkFBeUI7O0VBRXpCLGtCQUFrQjtFQUNsQixVQUFVO0VBQ1YsZ0JBQWdCO0VBQ2hCLHlCQUF5QjtFQUN6QixtQkFBbUI7RUFDbkIseUJBQXlCO0VBQ3pCLGFBQWE7RUFDYixjQUFjOztFQUVkLGVBQWU7RUFDZixrQkFBa0I7RUFDbEIsb0JBQW9CO0VBQ3BCLFVBQVU7RUFDVixrQkFBa0I7RUFDbEIsWUFBWTtFQUNaLDhCQUFzQjtFQUF0QixzQkFBc0I7QUFDeEI7O0FBRUE7O0VBRUUsb0JBQW9CO0FBQ3RCOztBQUVBOzs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7O0dBb0RHOztBQ3pGSDtFQUNFLFdBQVc7RUFDWCxzQkFBc0I7RUFDdEIseUNBQXlDO0VBQ3pDLGtCQUFrQjtBQUNwQjs7QUFFQSw0QkFBNEI7O0FBQzVCO0VBQ0Usd0JBQXdCO0VBQ3hCLHlDQUF5QztFQUN6QyxlQUFlO0FBQ2pCOztBQUVBO0VBQ0UseUNBQXlDO0VBQ3pDLG1CQUFtQjtBQUNyQjs7QUFFQTtFQUNFLHlDQUF5QztFQUN6QyxtQkFBbUI7RUFDbkIsZ0JBQWdCO0FBQ2xCOztBQUVBO0VBQ0UsV0FBVztBQUNiOztBQUVBOzs7RUFHRSxnQkFBZ0I7RUFDaEIsd0JBQXdCO0VBQ3hCLHdCQUF3QjtFQUN4Qix5QkFBeUI7RUFDekIsMEJBQTBCO0FBQzVCOztBQUVBOzs7RUFHRSxvQkFBb0I7RUFDcEIsa0JBQWtCO0VBQ2xCLG1CQUFtQjtFQUNuQixnQkFBZ0I7RUFDaEIscUJBQXFCO0VBQ3JCLHdCQUF3QjtFQUN4Qix5QkFBeUI7RUFDekIsMEJBQTBCO0VBQzFCLHNCQUFzQjtFQUN0Qix1QkFBdUI7RUFDdkIsVUFBVTtFQUNWLGNBQWM7QUFDaEI7O0FBRUE7RUFDRSxXQUFXO0VBQ1gsa0JBQWtCO0VBQ2xCLDZCQUFxQjtLQUFyQiwwQkFBcUI7VUFBckIscUJBQXFCO0FBQ3ZCOztBQUVBO0VBQ0UsVUFBVTtFQUNWLGdCQUFnQjtBQUNsQjs7QUFFQTtFQUNFLFdBQVc7RUFDWCx3QkFBd0I7RUFDeEIsbUNBQW1DO0VBQ25DLHNCQUFzQjtFQUN0Qix3QkFBd0I7RUFDeEIsa0JBQWtCO0VBQ2xCLHlDQUF5QztFQUN6QyxpQkFBaUI7RUFDakIsb0JBQW9CO0VBQ3BCLGtCQUFrQjtFQUNsQixtQkFBbUI7RUFDbkIsaUJBQWlCO0VBQ2pCLGtCQUFrQjtFQUNsQixnQkFBZ0I7RUFDaEIsbUJBQW1CO0FBQ3JCOztBQUVBO0VBQ0UsY0FBYztFQUNkLHlCQUF5QjtBQUMzQjs7QUFFQTtFQUNFLFdBQVc7RUFDWCxzQkFBc0I7RUFDdEIsb0JBQW9CO0FBQ3RCOztBQUVBO0VBQ0UsVUFBVTtFQUNWLHdCQUF3QjtFQUN4QiwrQkFBK0I7QUFDakM7O0FBRUE7RUFDRSxlQUFlO0FBQ2pCOztBQUVBLG9CQUFvQjs7QUFFcEI7RUFDRSx5Q0FBeUM7QUFDM0M7O0FBRUE7RUFDRSxjQUFjO0VBQ2QsZUFBZTtFQUNmLGtCQUFrQjtBQUNwQjs7QUFFQTtFQUNFLFdBQVc7RUFDWCxvQkFBYTtFQUFiLGFBQWE7RUFDYiw4QkFBbUI7RUFBbkIsNkJBQW1CO1VBQW5CLG1CQUFtQjtBQUNyQjs7QUFFQTtFQUNFLFVBQVU7RUFDVixvQkFBYTtFQUFiLGFBQWE7RUFDYiw0QkFBc0I7RUFBdEIsNkJBQXNCO1VBQXRCLHNCQUFzQjtFQUN0QiwwQkFBb0I7VUFBcEIsb0JBQW9CO0VBQ3BCLGtCQUFrQjtBQUNwQjs7QUFFQTtFQUNFLFVBQVU7RUFDVixXQUFXO0VBQ1gseUJBQXlCO0VBQ3pCLDBCQUEwQjtFQUMxQix3QkFBd0I7RUFDeEIsMkJBQTJCO0VBQzNCLFlBQVk7RUFDWixvQkFBb0I7QUFDdEI7O0FBRUE7Ozs7Ozs7OztHQVNHOztBQUVIOzs7Ozs7Ozs7R0FTRzs7QUFFSDtFQUNFLHFCQUFxQjtBQUN2QiIsImZpbGUiOiJzcmMvYXBwL2FydGlmYWN0cy1nZW5lcmF0aW9uL2FydGlmYWN0cy1nZW5lcmF0aW9uLmNvbXBvbmVudC5jc3MiLCJzb3VyY2VzQ29udGVudCI6WyIqW2RhdGEtZGVzY3JdIHtcbiAgcG9zaXRpb246IHJlbGF0aXZlO1xuICBjdXJzb3I6IGhlbHA7XG59XG5cbipbZGF0YS1kZXNjcl06YWZ0ZXIge1xuICB2ZXJ0aWNhbC1hbGlnbjogdG9wO1xuICBjb2xvcjogaW5oZXJpdDtcbiAgZm9udC1zaXplOiBzbWFsbDtcbiAgY29udGVudDogXCI/XCI7XG59XG5cbipbZGF0YS1kZXNjcl06aG92ZXI6OmFmdGVyLFxuKltkYXRhLWRlc2NyXTpmb2N1czo6YWZ0ZXIge1xuICBjb250ZW50OiBhdHRyKGRhdGEtZGVzY3IpO1xuXG4gIHBvc2l0aW9uOiBhYnNvbHV0ZTtcbiAgbGVmdDogYXV0bztcbiAgbWluLXdpZHRoOiAyMDBweDtcbiAgYm9yZGVyOiAxcHggI2FhYWFhYSBzb2xpZDtcbiAgYm9yZGVyLXJhZGl1czogMTBweDtcbiAgYmFja2dyb3VuZC1jb2xvcjogIzBiNGE5MjtcbiAgcGFkZGluZzogMTJweDtcbiAgY29sb3I6ICNlMGUwZTA7XG5cbiAgZm9udC1zaXplOiAxNHB4O1xuICBmb250LXN0eWxlOiBub3JtYWw7XG4gIGZvbnQtd2VpZ2h0OiBsaWdodGVyO1xuICB6LWluZGV4OiAxO1xuICB0ZXh0LWFsaWduOiBjZW50ZXI7XG4gIG9wYWNpdHk6IDAuOTtcbiAgdHJhbnNpdGlvbjogb3BhY2l0eSAxcztcbn1cblxub3B0aW9uW3RpdGxlXTpob3ZlcjphZnRlcixcbm9wdGlvblt0aXRsZV06Zm9jdXM6YWZ0ZXIge1xuICBjb250ZW50OiBhdHRyKHRpdGxlKTtcbn1cblxuLyogVG9vbHRpcCBjb250YWluZXJcbi50b29sdGlwIHtcbiAgcG9zaXRpb246IHJlbGF0aXZlO1xufVxuXG4vKiBUb29sdGlwIHRleHRcbi50b29sdGlwIC50b29sdGlwdGV4dCB7XG4gIHZpc2liaWxpdHk6IGhpZGRlbjtcbiAgd2lkdGg6IDIwMHB4O1xuICBiYWNrZ3JvdW5kLWNvbG9yOiAjNTU1O1xuICBjb2xvcjogI2ZmZjtcbiAgdGV4dC1hbGlnbjogY2VudGVyO1xuICBwYWRkaW5nOiAxMHB4IDA7XG4gIGJvcmRlci1yYWRpdXM6IDZweDtcbiAgbWFyZ2luOiAxMHB4O1xuICBmb250LXNpemU6IHNtYWxsO1xuXG4gIC8qIFBvc2l0aW9uIHRoZSB0b29sdGlwIHRleHRcbiAgcG9zaXRpb246IGFic29sdXRlO1xuICB6LWluZGV4OiAxO1xuICBib3R0b206IDEyNSU7XG4gIGxlZnQ6IDUwJTtcbiAgbWFyZ2luLWxlZnQ6IC0xMDBweDtcblxuICAvKiBGYWRlIGluIHRvb2x0aXBcbiAgb3BhY2l0eTogMDtcbiAgdHJhbnNpdGlvbjogb3BhY2l0eSAwLjVzO1xufVxuXG4udG9vbHRpcDo6YWZ0ZXIge1xuICB2ZXJ0aWNhbC1hbGlnbjogdG9wO1xuICBjb2xvcjogaW5oZXJpdDtcbiAgZm9udC1zaXplOiBzbWFsbDtcbiAgY29udGVudDogXCI/XCI7XG59XG5cbi8qIFRvb2x0aXAgYXJyb3dcbi50b29sdGlwIC50b29sdGlwdGV4dDo6YWZ0ZXIge1xuICBjb250ZW50OiBcIlwiO1xuICBwb3NpdGlvbjogYWJzb2x1dGU7XG4gIHRvcDogMTAwJTtcbiAgbGVmdDogNTAlO1xuICBtYXJnaW4tbGVmdDogLTVweDtcbiAgYm9yZGVyLXdpZHRoOiA1cHg7XG4gIGJvcmRlci1zdHlsZTogc29saWQ7XG4gIGJvcmRlci1jb2xvcjogIzU1NSB0cmFuc3BhcmVudCB0cmFuc3BhcmVudCB0cmFuc3BhcmVudDtcbn1cblxuLyogU2hvdyB0aGUgdG9vbHRpcCB0ZXh0IHdoZW4geW91IG1vdXNlIG92ZXIgdGhlIHRvb2x0aXAgY29udGFpbmVyXG4udG9vbHRpcDpob3ZlciAudG9vbHRpcHRleHQge1xuICB2aXNpYmlsaXR5OiB2aXNpYmxlO1xuICBvcGFjaXR5OiAxO1xufSAqL1xuIiwiQGltcG9ydCBcIi4vdG9vbHRpcC5jc3NcIjtcblxuKiB7XG4gIGNvbG9yOiAjZGRkO1xuICBiYWNrZ3JvdW5kLWNvbG9yOiAjMjIyO1xuICBmb250LWZhbWlseTogQXJpYWwsIEhlbHZldGljYSwgc2Fucy1zZXJpZjtcbiAgYm9yZGVyLWNvbG9yOiAjZGRkO1xufVxuXG4vKiBBcHBsaWNhdGlvbi13aWRlIFN0eWxlcyAqL1xuaDEge1xuICBjb2xvcjogcmdiKDc0LCAxNjUsIDI1NSk7XG4gIGZvbnQtZmFtaWx5OiBBcmlhbCwgSGVsdmV0aWNhLCBzYW5zLXNlcmlmO1xuICBmb250LXNpemU6IDI1MCU7XG59XG5cbmgyIHtcbiAgZm9udC1mYW1pbHk6IEFyaWFsLCBIZWx2ZXRpY2EsIHNhbnMtc2VyaWY7XG4gIGZvbnQtd2VpZ2h0OiBib2xkZXI7XG59XG5cbmgzIHtcbiAgZm9udC1mYW1pbHk6IEFyaWFsLCBIZWx2ZXRpY2EsIHNhbnMtc2VyaWY7XG4gIGZvbnQtd2VpZ2h0OiBub3JtYWw7XG4gIHBhZGRpbmctdG9wOiAxZW07XG59XG5cbmJvZHkge1xuICBtYXJnaW46IDJlbTtcbn1cblxuaW5wdXQsXG50ZXh0YXJlYSxcbnNlbGVjdCB7XG4gIGZvbnQtc2l6ZTogbGFyZ2U7XG4gIGNvbG9yOiByZ2IoNjEsIDIyOCwgMTkyKTtcbiAgYm9yZGVyLXRvcC1zdHlsZTogaGlkZGVuO1xuICBib3JkZXItbGVmdC1zdHlsZTogaGlkZGVuO1xuICBib3JkZXItcmlnaHQtc3R5bGU6IGhpZGRlbjtcbn1cblxuaW5wdXRbdHlwZT1cInRleHRcIl0sXG5pbnB1dFt0eXBlPVwidXJsXCJdLFxudGV4dGFyZWEge1xuICBtYXJnaW4tYm90dG9tOiAwLjVlbTtcbiAgbWFyZ2luLWxlZnQ6IDAuNWVtO1xuICBtYXJnaW4tcmlnaHQ6IDAuNWVtO1xuICBtYXJnaW4tdG9wOiBub25lO1xuICBib3JkZXItdG9wLXdpZHRoOiAwcHg7XG4gIGJvcmRlci10b3Atc3R5bGU6IGhpZGRlbjtcbiAgYm9yZGVyLWxlZnQtc3R5bGU6IGhpZGRlbjtcbiAgYm9yZGVyLXJpZ2h0LXN0eWxlOiBoaWRkZW47XG4gIGJvcmRlci1sZWZ0LXdpZHRoOiAwcHg7XG4gIGJvcmRlci1yaWdodC13aWR0aDogMHB4O1xuICB3aWR0aDogOTAlO1xuICBkaXNwbGF5OiBibG9jaztcbn1cblxuaW5wdXRbdHlwZT1cIm51bWJlclwiXSB7XG4gIHdpZHRoOiA1MHB4O1xuICB0ZXh0LWFsaWduOiBjZW50ZXI7XG4gIGFwcGVhcmFuY2U6IHRleHRmaWVsZDtcbn1cblxudGV4dGFyZWEge1xuICB3aWR0aDogOTAlO1xuICByZXNpemU6IHZlcnRpY2FsO1xufVxuXG5idXR0b24ge1xuICBjb2xvcjogI2RkZDtcbiAgY29sb3I6IHJnYig2MSwgMjI4LCAxOTIpO1xuICBiYWNrZ3JvdW5kLWNvbG9yOiByZ2IoNjEsIDIyOCwgMTkyKTtcbiAgYmFja2dyb3VuZC1jb2xvcjogIzIyMjtcbiAgY29sb3I6IHJnYig2MSwgMjI4LCAxOTIpO1xuICBib3JkZXItY29sb3I6ICNkZGQ7XG4gIGZvbnQtZmFtaWx5OiBBcmlhbCwgSGVsdmV0aWNhLCBzYW5zLXNlcmlmO1xuICBmb250LXdlaWdodDogYm9sZDtcbiAgbWFyZ2luLWJvdHRvbTogMC41ZW07XG4gIG1hcmdpbi1sZWZ0OiAwLjVlbTtcbiAgbWFyZ2luLXJpZ2h0OiAwLjVlbTtcbiAgbWFyZ2luLXRvcDogMC41ZW07XG4gIGJvcmRlci1yYWRpdXM6IDVweDtcbiAgbWluLWhlaWdodDogMzBweDtcbiAgdGV4dC1vdmVyZmxvdzogY2xpcDtcbn1cblxuYnV0dG9uID4gZmEtaWNvbiB7XG4gIGNvbG9yOiBpbmhlcml0O1xuICBiYWNrZ3JvdW5kLWNvbG9yOiBpbmhlcml0O1xufVxuXG5idXR0b246ZGlzYWJsZWQge1xuICBjb2xvcjogI2FhYTtcbiAgYmFja2dyb3VuZC1jb2xvcjogIzIyMjtcbiAgZm9udC13ZWlnaHQ6IGxpZ2h0ZXI7XG59XG5cbmJ1dHRvbi5uZXh0IHtcbiAgcmlnaHQ6IDBweDtcbiAgY29sb3I6IHJnYig2MSwgMjI4LCAxOTIpO1xuICBib3JkZXItY29sb3I6IHJnYig2MSwgMjI4LCAxOTIpO1xufVxuXG5zZWxlY3Qge1xuICBtaW4td2lkdGg6IDEwZW07XG59XG5cbi8qIGV2ZXJ5d2hlcmUgZWxzZSAqL1xuXG4qIHtcbiAgZm9udC1mYW1pbHk6IEFyaWFsLCBIZWx2ZXRpY2EsIHNhbnMtc2VyaWY7XG59XG5cbmxhYmVsIHtcbiAgZGlzcGxheTogYmxvY2s7XG4gIG1hcmdpbi10b3A6IDFlbTtcbiAgbWFyZ2luLWJvdHRvbTogMWVtO1xufVxuXG4ubWFpbiB7XG4gIHdpZHRoOiAxMDAlO1xuICBkaXNwbGF5OiBmbGV4O1xuICBmbGV4LWRpcmVjdGlvbjogcm93O1xufVxuXG4ubmF2aWdhdGlvbiB7XG4gIHdpZHRoOiAyMCU7XG4gIGRpc3BsYXk6IGZsZXg7XG4gIGZsZXgtZGlyZWN0aW9uOiBjb2x1bW47XG4gIGFsaWduLWl0ZW1zOiBzdHJldGNoO1xuICBtYXJnaW4tcmlnaHQ6IDIwcHg7XG59XG5cbi5zdGVwLWRldGFpbCB7XG4gIHdpZHRoOiA4MCU7XG4gIGJvcmRlcjogMXB4O1xuICBib3JkZXItbGVmdC1zdHlsZTogZGFzaGVkO1xuICBib3JkZXItcmlnaHQtc3R5bGU6IGhpZGRlbjtcbiAgYm9yZGVyLXRvcC1zdHlsZTogaGlkZGVuO1xuICBib3JkZXItYm90dG9tLXN0eWxlOiBoaWRkZW47XG4gIHBhZGRpbmc6IDFlbTtcbiAgbWFyZ2luLWJvdHRvbTogMC41ZW07XG59XG5cbi8qIC5zdGVwLWRldGFpbCB7XG4gIHdpZHRoOiA4MCU7XG4gIGJvcmRlcjogMXB4O1xuICBib3JkZXItbGVmdC1zdHlsZTogZGFzaGVkO1xuICBib3JkZXItcmlnaHQtc3R5bGU6IGhpZGRlbjtcbiAgYm9yZGVyLXRvcC1zdHlsZTogaGlkZGVuO1xuICBib3JkZXItYm90dG9tLXN0eWxlOiBoaWRkZW47XG4gIHBhZGRpbmc6IDFlbTtcbiAgbWFyZ2luLWJvdHRvbTogMC41ZW07XG59ICovXG5cbi8qIC5tb2RlbCB7XG4gIHdpZHRoOiA4MCU7XG4gIGJvcmRlcjogMXB4O1xuICBib3JkZXItbGVmdC1zdHlsZTogZGFzaGVkO1xuICBib3JkZXItcmlnaHQtc3R5bGU6IGhpZGRlbjtcbiAgYm9yZGVyLXRvcC1zdHlsZTogaGlkZGVuO1xuICBib3JkZXItYm90dG9tLXN0eWxlOiBoaWRkZW47XG4gIHBhZGRpbmc6IDFlbTtcbiAgbWFyZ2luLWJvdHRvbTogMC41ZW07XG59ICovXG5cbmlucHV0OmludmFsaWQge1xuICBib3JkZXI6IHJlZCBzb2xpZCAzcHg7XG59XG4iXX0= */";
    /***/
  },

  /***/
  "./src/app/artifacts-generation/artifacts-generation.component.ts":
  /*!************************************************************************!*\
    !*** ./src/app/artifacts-generation/artifacts-generation.component.ts ***!
    \************************************************************************/

  /*! exports provided: ArtifactsGenerationComponent */

  /***/
  function srcAppArtifactsGenerationArtifactsGenerationComponentTs(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "ArtifactsGenerationComponent", function () {
      return ArtifactsGenerationComponent;
    });
    /* harmony import */


    var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
    /*! tslib */
    "./node_modules/tslib/tslib.es6.js");
    /* harmony import */


    var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
    /*! @angular/core */
    "./node_modules/@angular/core/fesm2015/core.js");

    var ArtifactsGenerationComponent =
    /*#__PURE__*/
    function () {
      function ArtifactsGenerationComponent() {
        _classCallCheck(this, ArtifactsGenerationComponent);
      }

      _createClass(ArtifactsGenerationComponent, [{
        key: "ngOnInit",
        value: function ngOnInit() {}
      }]);

      return ArtifactsGenerationComponent;
    }();

    tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Input"])()], ArtifactsGenerationComponent.prototype, "generatorService", void 0);
    tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Input"])()], ArtifactsGenerationComponent.prototype, "activity", void 0);
    tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Input"])()], ArtifactsGenerationComponent.prototype, "functionalEntity", void 0);
    tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Input"])()], ArtifactsGenerationComponent.prototype, "deployment", void 0);
    ArtifactsGenerationComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
      selector: "app-artifacts-generation",
      template: tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(
      /*! raw-loader!./artifacts-generation.component.html */
      "./node_modules/raw-loader/dist/cjs.js!./src/app/artifacts-generation/artifacts-generation.component.html")).default,
      styles: [tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(
      /*! ./artifacts-generation.component.css */
      "./src/app/artifacts-generation/artifacts-generation.component.css")).default]
    })], ArtifactsGenerationComponent);
    /***/
  },

  /***/
  "./src/app/command-line-template/command-line-template.component.css":
  /*!***************************************************************************!*\
    !*** ./src/app/command-line-template/command-line-template.component.css ***!
    \***************************************************************************/

  /*! exports provided: default */

  /***/
  function srcAppCommandLineTemplateCommandLineTemplateComponentCss(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony default export */


    __webpack_exports__["default"] = "*[data-descr] {\n  position: relative;\n  cursor: help;\n}\n\n*[data-descr]:after {\n  vertical-align: top;\n  color: inherit;\n  font-size: small;\n  content: \"?\";\n}\n\n*[data-descr]:hover::after,\n*[data-descr]:focus::after {\n  content: attr(data-descr);\n\n  position: absolute;\n  left: auto;\n  min-width: 200px;\n  border: 1px #aaaaaa solid;\n  border-radius: 10px;\n  background-color: #0b4a92;\n  padding: 12px;\n  color: #e0e0e0;\n\n  font-size: 14px;\n  font-style: normal;\n  font-weight: lighter;\n  z-index: 1;\n  text-align: center;\n  opacity: 0.9;\n  -webkit-transition: opacity 1s;\n  transition: opacity 1s;\n}\n\noption[title]:hover:after,\noption[title]:focus:after {\n  content: attr(title);\n}\n\n/* Tooltip container\n.tooltip {\n  position: relative;\n}\n\n/* Tooltip text\n.tooltip .tooltiptext {\n  visibility: hidden;\n  width: 200px;\n  background-color: #555;\n  color: #fff;\n  text-align: center;\n  padding: 10px 0;\n  border-radius: 6px;\n  margin: 10px;\n  font-size: small;\n\n  /* Position the tooltip text\n  position: absolute;\n  z-index: 1;\n  bottom: 125%;\n  left: 50%;\n  margin-left: -100px;\n\n  /* Fade in tooltip\n  opacity: 0;\n  transition: opacity 0.5s;\n}\n\n.tooltip::after {\n  vertical-align: top;\n  color: inherit;\n  font-size: small;\n  content: \"?\";\n}\n\n/* Tooltip arrow\n.tooltip .tooltiptext::after {\n  content: \"\";\n  position: absolute;\n  top: 100%;\n  left: 50%;\n  margin-left: -5px;\n  border-width: 5px;\n  border-style: solid;\n  border-color: #555 transparent transparent transparent;\n}\n\n/* Show the tooltip text when you mouse over the tooltip container\n.tooltip:hover .tooltiptext {\n  visibility: visible;\n  opacity: 1;\n} */\n\n* {\n  color: #ddd;\n  background-color: #222;\n  font-family: Arial, Helvetica, sans-serif;\n  border-color: #ddd;\n}\n\n/* Application-wide Styles */\n\nh1 {\n  color: rgb(74, 165, 255);\n  font-family: Arial, Helvetica, sans-serif;\n  font-size: 250%;\n}\n\nh2 {\n  font-family: Arial, Helvetica, sans-serif;\n  font-weight: bolder;\n}\n\nh3 {\n  font-family: Arial, Helvetica, sans-serif;\n  font-weight: normal;\n  padding-top: 1em;\n}\n\nbody {\n  margin: 2em;\n}\n\ninput,\ntextarea,\nselect {\n  font-size: large;\n  color: rgb(61, 228, 192);\n  border-top-style: hidden;\n  border-left-style: hidden;\n  border-right-style: hidden;\n}\n\ninput[type=\"text\"],\ninput[type=\"url\"],\ntextarea {\n  margin-bottom: 0.5em;\n  margin-left: 0.5em;\n  margin-right: 0.5em;\n  margin-top: none;\n  border-top-width: 0px;\n  border-top-style: hidden;\n  border-left-style: hidden;\n  border-right-style: hidden;\n  border-left-width: 0px;\n  border-right-width: 0px;\n  width: 90%;\n  display: block;\n}\n\ninput[type=\"number\"] {\n  width: 50px;\n  text-align: center;\n  -webkit-appearance: textfield;\n     -moz-appearance: textfield;\n          appearance: textfield;\n}\n\ntextarea {\n  width: 90%;\n  resize: vertical;\n}\n\nbutton {\n  color: #ddd;\n  color: rgb(61, 228, 192);\n  background-color: rgb(61, 228, 192);\n  background-color: #222;\n  color: rgb(61, 228, 192);\n  border-color: #ddd;\n  font-family: Arial, Helvetica, sans-serif;\n  font-weight: bold;\n  margin-bottom: 0.5em;\n  margin-left: 0.5em;\n  margin-right: 0.5em;\n  margin-top: 0.5em;\n  border-radius: 5px;\n  min-height: 30px;\n  text-overflow: clip;\n}\n\nbutton > fa-icon {\n  color: inherit;\n  background-color: inherit;\n}\n\nbutton:disabled {\n  color: #aaa;\n  background-color: #222;\n  font-weight: lighter;\n}\n\nbutton.next {\n  right: 0px;\n  color: rgb(61, 228, 192);\n  border-color: rgb(61, 228, 192);\n}\n\nselect {\n  min-width: 10em;\n}\n\n/* everywhere else */\n\n* {\n  font-family: Arial, Helvetica, sans-serif;\n}\n\nlabel {\n  display: block;\n  margin-top: 1em;\n  margin-bottom: 1em;\n}\n\n.main {\n  width: 100%;\n  display: -webkit-box;\n  display: flex;\n  -webkit-box-orient: horizontal;\n  -webkit-box-direction: normal;\n          flex-direction: row;\n}\n\n.navigation {\n  width: 20%;\n  display: -webkit-box;\n  display: flex;\n  -webkit-box-orient: vertical;\n  -webkit-box-direction: normal;\n          flex-direction: column;\n  -webkit-box-align: stretch;\n          align-items: stretch;\n  margin-right: 20px;\n}\n\n.step-detail {\n  width: 80%;\n  border: 1px;\n  border-left-style: dashed;\n  border-right-style: hidden;\n  border-top-style: hidden;\n  border-bottom-style: hidden;\n  padding: 1em;\n  margin-bottom: 0.5em;\n}\n\n/* .step-detail {\n  width: 80%;\n  border: 1px;\n  border-left-style: dashed;\n  border-right-style: hidden;\n  border-top-style: hidden;\n  border-bottom-style: hidden;\n  padding: 1em;\n  margin-bottom: 0.5em;\n} */\n\n/* .model {\n  width: 80%;\n  border: 1px;\n  border-left-style: dashed;\n  border-right-style: hidden;\n  border-top-style: hidden;\n  border-bottom-style: hidden;\n  padding: 1em;\n  margin-bottom: 0.5em;\n} */\n\ninput:invalid {\n  border: red solid 3px;\n}\n\ndiv {\n  margin-top: 1em;\n  margin-bottom: 1em;\n}\n\n.command-line-entry {\n  border: 1px;\n  border-color: black;\n  border-style: dashed;\n  padding: 1em;\n}\n\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbInNyYy9hcHAvdG9vbHRpcC5jc3MiLCJzcmMvYXBwL2FwcC5jb21wb25lbnQuY3NzIiwic3JjL2FwcC9jb21tYW5kLWxpbmUtdGVtcGxhdGUvY29tbWFuZC1saW5lLXRlbXBsYXRlLmNvbXBvbmVudC5jc3MiXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IkFBQUE7RUFDRSxrQkFBa0I7RUFDbEIsWUFBWTtBQUNkOztBQUVBO0VBQ0UsbUJBQW1CO0VBQ25CLGNBQWM7RUFDZCxnQkFBZ0I7RUFDaEIsWUFBWTtBQUNkOztBQUVBOztFQUVFLHlCQUF5Qjs7RUFFekIsa0JBQWtCO0VBQ2xCLFVBQVU7RUFDVixnQkFBZ0I7RUFDaEIseUJBQXlCO0VBQ3pCLG1CQUFtQjtFQUNuQix5QkFBeUI7RUFDekIsYUFBYTtFQUNiLGNBQWM7O0VBRWQsZUFBZTtFQUNmLGtCQUFrQjtFQUNsQixvQkFBb0I7RUFDcEIsVUFBVTtFQUNWLGtCQUFrQjtFQUNsQixZQUFZO0VBQ1osOEJBQXNCO0VBQXRCLHNCQUFzQjtBQUN4Qjs7QUFFQTs7RUFFRSxvQkFBb0I7QUFDdEI7O0FBRUE7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7R0FvREc7O0FDekZIO0VBQ0UsV0FBVztFQUNYLHNCQUFzQjtFQUN0Qix5Q0FBeUM7RUFDekMsa0JBQWtCO0FBQ3BCOztBQUVBLDRCQUE0Qjs7QUFDNUI7RUFDRSx3QkFBd0I7RUFDeEIseUNBQXlDO0VBQ3pDLGVBQWU7QUFDakI7O0FBRUE7RUFDRSx5Q0FBeUM7RUFDekMsbUJBQW1CO0FBQ3JCOztBQUVBO0VBQ0UseUNBQXlDO0VBQ3pDLG1CQUFtQjtFQUNuQixnQkFBZ0I7QUFDbEI7O0FBRUE7RUFDRSxXQUFXO0FBQ2I7O0FBRUE7OztFQUdFLGdCQUFnQjtFQUNoQix3QkFBd0I7RUFDeEIsd0JBQXdCO0VBQ3hCLHlCQUF5QjtFQUN6QiwwQkFBMEI7QUFDNUI7O0FBRUE7OztFQUdFLG9CQUFvQjtFQUNwQixrQkFBa0I7RUFDbEIsbUJBQW1CO0VBQ25CLGdCQUFnQjtFQUNoQixxQkFBcUI7RUFDckIsd0JBQXdCO0VBQ3hCLHlCQUF5QjtFQUN6QiwwQkFBMEI7RUFDMUIsc0JBQXNCO0VBQ3RCLHVCQUF1QjtFQUN2QixVQUFVO0VBQ1YsY0FBYztBQUNoQjs7QUFFQTtFQUNFLFdBQVc7RUFDWCxrQkFBa0I7RUFDbEIsNkJBQXFCO0tBQXJCLDBCQUFxQjtVQUFyQixxQkFBcUI7QUFDdkI7O0FBRUE7RUFDRSxVQUFVO0VBQ1YsZ0JBQWdCO0FBQ2xCOztBQUVBO0VBQ0UsV0FBVztFQUNYLHdCQUF3QjtFQUN4QixtQ0FBbUM7RUFDbkMsc0JBQXNCO0VBQ3RCLHdCQUF3QjtFQUN4QixrQkFBa0I7RUFDbEIseUNBQXlDO0VBQ3pDLGlCQUFpQjtFQUNqQixvQkFBb0I7RUFDcEIsa0JBQWtCO0VBQ2xCLG1CQUFtQjtFQUNuQixpQkFBaUI7RUFDakIsa0JBQWtCO0VBQ2xCLGdCQUFnQjtFQUNoQixtQkFBbUI7QUFDckI7O0FBRUE7RUFDRSxjQUFjO0VBQ2QseUJBQXlCO0FBQzNCOztBQUVBO0VBQ0UsV0FBVztFQUNYLHNCQUFzQjtFQUN0QixvQkFBb0I7QUFDdEI7O0FBRUE7RUFDRSxVQUFVO0VBQ1Ysd0JBQXdCO0VBQ3hCLCtCQUErQjtBQUNqQzs7QUFFQTtFQUNFLGVBQWU7QUFDakI7O0FBRUEsb0JBQW9COztBQUVwQjtFQUNFLHlDQUF5QztBQUMzQzs7QUFFQTtFQUNFLGNBQWM7RUFDZCxlQUFlO0VBQ2Ysa0JBQWtCO0FBQ3BCOztBQUVBO0VBQ0UsV0FBVztFQUNYLG9CQUFhO0VBQWIsYUFBYTtFQUNiLDhCQUFtQjtFQUFuQiw2QkFBbUI7VUFBbkIsbUJBQW1CO0FBQ3JCOztBQUVBO0VBQ0UsVUFBVTtFQUNWLG9CQUFhO0VBQWIsYUFBYTtFQUNiLDRCQUFzQjtFQUF0Qiw2QkFBc0I7VUFBdEIsc0JBQXNCO0VBQ3RCLDBCQUFvQjtVQUFwQixvQkFBb0I7RUFDcEIsa0JBQWtCO0FBQ3BCOztBQUVBO0VBQ0UsVUFBVTtFQUNWLFdBQVc7RUFDWCx5QkFBeUI7RUFDekIsMEJBQTBCO0VBQzFCLHdCQUF3QjtFQUN4QiwyQkFBMkI7RUFDM0IsWUFBWTtFQUNaLG9CQUFvQjtBQUN0Qjs7QUFFQTs7Ozs7Ozs7O0dBU0c7O0FBRUg7Ozs7Ozs7OztHQVNHOztBQUVIO0VBQ0UscUJBQXFCO0FBQ3ZCOztBQ3ZLQTtFQUNFLGVBQWU7RUFDZixrQkFBa0I7QUFDcEI7O0FBRUE7RUFDRSxXQUFXO0VBQ1gsbUJBQW1CO0VBQ25CLG9CQUFvQjtFQUNwQixZQUFZO0FBQ2QiLCJmaWxlIjoic3JjL2FwcC9jb21tYW5kLWxpbmUtdGVtcGxhdGUvY29tbWFuZC1saW5lLXRlbXBsYXRlLmNvbXBvbmVudC5jc3MiLCJzb3VyY2VzQ29udGVudCI6WyIqW2RhdGEtZGVzY3JdIHtcbiAgcG9zaXRpb246IHJlbGF0aXZlO1xuICBjdXJzb3I6IGhlbHA7XG59XG5cbipbZGF0YS1kZXNjcl06YWZ0ZXIge1xuICB2ZXJ0aWNhbC1hbGlnbjogdG9wO1xuICBjb2xvcjogaW5oZXJpdDtcbiAgZm9udC1zaXplOiBzbWFsbDtcbiAgY29udGVudDogXCI/XCI7XG59XG5cbipbZGF0YS1kZXNjcl06aG92ZXI6OmFmdGVyLFxuKltkYXRhLWRlc2NyXTpmb2N1czo6YWZ0ZXIge1xuICBjb250ZW50OiBhdHRyKGRhdGEtZGVzY3IpO1xuXG4gIHBvc2l0aW9uOiBhYnNvbHV0ZTtcbiAgbGVmdDogYXV0bztcbiAgbWluLXdpZHRoOiAyMDBweDtcbiAgYm9yZGVyOiAxcHggI2FhYWFhYSBzb2xpZDtcbiAgYm9yZGVyLXJhZGl1czogMTBweDtcbiAgYmFja2dyb3VuZC1jb2xvcjogIzBiNGE5MjtcbiAgcGFkZGluZzogMTJweDtcbiAgY29sb3I6ICNlMGUwZTA7XG5cbiAgZm9udC1zaXplOiAxNHB4O1xuICBmb250LXN0eWxlOiBub3JtYWw7XG4gIGZvbnQtd2VpZ2h0OiBsaWdodGVyO1xuICB6LWluZGV4OiAxO1xuICB0ZXh0LWFsaWduOiBjZW50ZXI7XG4gIG9wYWNpdHk6IDAuOTtcbiAgdHJhbnNpdGlvbjogb3BhY2l0eSAxcztcbn1cblxub3B0aW9uW3RpdGxlXTpob3ZlcjphZnRlcixcbm9wdGlvblt0aXRsZV06Zm9jdXM6YWZ0ZXIge1xuICBjb250ZW50OiBhdHRyKHRpdGxlKTtcbn1cblxuLyogVG9vbHRpcCBjb250YWluZXJcbi50b29sdGlwIHtcbiAgcG9zaXRpb246IHJlbGF0aXZlO1xufVxuXG4vKiBUb29sdGlwIHRleHRcbi50b29sdGlwIC50b29sdGlwdGV4dCB7XG4gIHZpc2liaWxpdHk6IGhpZGRlbjtcbiAgd2lkdGg6IDIwMHB4O1xuICBiYWNrZ3JvdW5kLWNvbG9yOiAjNTU1O1xuICBjb2xvcjogI2ZmZjtcbiAgdGV4dC1hbGlnbjogY2VudGVyO1xuICBwYWRkaW5nOiAxMHB4IDA7XG4gIGJvcmRlci1yYWRpdXM6IDZweDtcbiAgbWFyZ2luOiAxMHB4O1xuICBmb250LXNpemU6IHNtYWxsO1xuXG4gIC8qIFBvc2l0aW9uIHRoZSB0b29sdGlwIHRleHRcbiAgcG9zaXRpb246IGFic29sdXRlO1xuICB6LWluZGV4OiAxO1xuICBib3R0b206IDEyNSU7XG4gIGxlZnQ6IDUwJTtcbiAgbWFyZ2luLWxlZnQ6IC0xMDBweDtcblxuICAvKiBGYWRlIGluIHRvb2x0aXBcbiAgb3BhY2l0eTogMDtcbiAgdHJhbnNpdGlvbjogb3BhY2l0eSAwLjVzO1xufVxuXG4udG9vbHRpcDo6YWZ0ZXIge1xuICB2ZXJ0aWNhbC1hbGlnbjogdG9wO1xuICBjb2xvcjogaW5oZXJpdDtcbiAgZm9udC1zaXplOiBzbWFsbDtcbiAgY29udGVudDogXCI/XCI7XG59XG5cbi8qIFRvb2x0aXAgYXJyb3dcbi50b29sdGlwIC50b29sdGlwdGV4dDo6YWZ0ZXIge1xuICBjb250ZW50OiBcIlwiO1xuICBwb3NpdGlvbjogYWJzb2x1dGU7XG4gIHRvcDogMTAwJTtcbiAgbGVmdDogNTAlO1xuICBtYXJnaW4tbGVmdDogLTVweDtcbiAgYm9yZGVyLXdpZHRoOiA1cHg7XG4gIGJvcmRlci1zdHlsZTogc29saWQ7XG4gIGJvcmRlci1jb2xvcjogIzU1NSB0cmFuc3BhcmVudCB0cmFuc3BhcmVudCB0cmFuc3BhcmVudDtcbn1cblxuLyogU2hvdyB0aGUgdG9vbHRpcCB0ZXh0IHdoZW4geW91IG1vdXNlIG92ZXIgdGhlIHRvb2x0aXAgY29udGFpbmVyXG4udG9vbHRpcDpob3ZlciAudG9vbHRpcHRleHQge1xuICB2aXNpYmlsaXR5OiB2aXNpYmxlO1xuICBvcGFjaXR5OiAxO1xufSAqL1xuIiwiQGltcG9ydCBcIi4vdG9vbHRpcC5jc3NcIjtcblxuKiB7XG4gIGNvbG9yOiAjZGRkO1xuICBiYWNrZ3JvdW5kLWNvbG9yOiAjMjIyO1xuICBmb250LWZhbWlseTogQXJpYWwsIEhlbHZldGljYSwgc2Fucy1zZXJpZjtcbiAgYm9yZGVyLWNvbG9yOiAjZGRkO1xufVxuXG4vKiBBcHBsaWNhdGlvbi13aWRlIFN0eWxlcyAqL1xuaDEge1xuICBjb2xvcjogcmdiKDc0LCAxNjUsIDI1NSk7XG4gIGZvbnQtZmFtaWx5OiBBcmlhbCwgSGVsdmV0aWNhLCBzYW5zLXNlcmlmO1xuICBmb250LXNpemU6IDI1MCU7XG59XG5cbmgyIHtcbiAgZm9udC1mYW1pbHk6IEFyaWFsLCBIZWx2ZXRpY2EsIHNhbnMtc2VyaWY7XG4gIGZvbnQtd2VpZ2h0OiBib2xkZXI7XG59XG5cbmgzIHtcbiAgZm9udC1mYW1pbHk6IEFyaWFsLCBIZWx2ZXRpY2EsIHNhbnMtc2VyaWY7XG4gIGZvbnQtd2VpZ2h0OiBub3JtYWw7XG4gIHBhZGRpbmctdG9wOiAxZW07XG59XG5cbmJvZHkge1xuICBtYXJnaW46IDJlbTtcbn1cblxuaW5wdXQsXG50ZXh0YXJlYSxcbnNlbGVjdCB7XG4gIGZvbnQtc2l6ZTogbGFyZ2U7XG4gIGNvbG9yOiByZ2IoNjEsIDIyOCwgMTkyKTtcbiAgYm9yZGVyLXRvcC1zdHlsZTogaGlkZGVuO1xuICBib3JkZXItbGVmdC1zdHlsZTogaGlkZGVuO1xuICBib3JkZXItcmlnaHQtc3R5bGU6IGhpZGRlbjtcbn1cblxuaW5wdXRbdHlwZT1cInRleHRcIl0sXG5pbnB1dFt0eXBlPVwidXJsXCJdLFxudGV4dGFyZWEge1xuICBtYXJnaW4tYm90dG9tOiAwLjVlbTtcbiAgbWFyZ2luLWxlZnQ6IDAuNWVtO1xuICBtYXJnaW4tcmlnaHQ6IDAuNWVtO1xuICBtYXJnaW4tdG9wOiBub25lO1xuICBib3JkZXItdG9wLXdpZHRoOiAwcHg7XG4gIGJvcmRlci10b3Atc3R5bGU6IGhpZGRlbjtcbiAgYm9yZGVyLWxlZnQtc3R5bGU6IGhpZGRlbjtcbiAgYm9yZGVyLXJpZ2h0LXN0eWxlOiBoaWRkZW47XG4gIGJvcmRlci1sZWZ0LXdpZHRoOiAwcHg7XG4gIGJvcmRlci1yaWdodC13aWR0aDogMHB4O1xuICB3aWR0aDogOTAlO1xuICBkaXNwbGF5OiBibG9jaztcbn1cblxuaW5wdXRbdHlwZT1cIm51bWJlclwiXSB7XG4gIHdpZHRoOiA1MHB4O1xuICB0ZXh0LWFsaWduOiBjZW50ZXI7XG4gIGFwcGVhcmFuY2U6IHRleHRmaWVsZDtcbn1cblxudGV4dGFyZWEge1xuICB3aWR0aDogOTAlO1xuICByZXNpemU6IHZlcnRpY2FsO1xufVxuXG5idXR0b24ge1xuICBjb2xvcjogI2RkZDtcbiAgY29sb3I6IHJnYig2MSwgMjI4LCAxOTIpO1xuICBiYWNrZ3JvdW5kLWNvbG9yOiByZ2IoNjEsIDIyOCwgMTkyKTtcbiAgYmFja2dyb3VuZC1jb2xvcjogIzIyMjtcbiAgY29sb3I6IHJnYig2MSwgMjI4LCAxOTIpO1xuICBib3JkZXItY29sb3I6ICNkZGQ7XG4gIGZvbnQtZmFtaWx5OiBBcmlhbCwgSGVsdmV0aWNhLCBzYW5zLXNlcmlmO1xuICBmb250LXdlaWdodDogYm9sZDtcbiAgbWFyZ2luLWJvdHRvbTogMC41ZW07XG4gIG1hcmdpbi1sZWZ0OiAwLjVlbTtcbiAgbWFyZ2luLXJpZ2h0OiAwLjVlbTtcbiAgbWFyZ2luLXRvcDogMC41ZW07XG4gIGJvcmRlci1yYWRpdXM6IDVweDtcbiAgbWluLWhlaWdodDogMzBweDtcbiAgdGV4dC1vdmVyZmxvdzogY2xpcDtcbn1cblxuYnV0dG9uID4gZmEtaWNvbiB7XG4gIGNvbG9yOiBpbmhlcml0O1xuICBiYWNrZ3JvdW5kLWNvbG9yOiBpbmhlcml0O1xufVxuXG5idXR0b246ZGlzYWJsZWQge1xuICBjb2xvcjogI2FhYTtcbiAgYmFja2dyb3VuZC1jb2xvcjogIzIyMjtcbiAgZm9udC13ZWlnaHQ6IGxpZ2h0ZXI7XG59XG5cbmJ1dHRvbi5uZXh0IHtcbiAgcmlnaHQ6IDBweDtcbiAgY29sb3I6IHJnYig2MSwgMjI4LCAxOTIpO1xuICBib3JkZXItY29sb3I6IHJnYig2MSwgMjI4LCAxOTIpO1xufVxuXG5zZWxlY3Qge1xuICBtaW4td2lkdGg6IDEwZW07XG59XG5cbi8qIGV2ZXJ5d2hlcmUgZWxzZSAqL1xuXG4qIHtcbiAgZm9udC1mYW1pbHk6IEFyaWFsLCBIZWx2ZXRpY2EsIHNhbnMtc2VyaWY7XG59XG5cbmxhYmVsIHtcbiAgZGlzcGxheTogYmxvY2s7XG4gIG1hcmdpbi10b3A6IDFlbTtcbiAgbWFyZ2luLWJvdHRvbTogMWVtO1xufVxuXG4ubWFpbiB7XG4gIHdpZHRoOiAxMDAlO1xuICBkaXNwbGF5OiBmbGV4O1xuICBmbGV4LWRpcmVjdGlvbjogcm93O1xufVxuXG4ubmF2aWdhdGlvbiB7XG4gIHdpZHRoOiAyMCU7XG4gIGRpc3BsYXk6IGZsZXg7XG4gIGZsZXgtZGlyZWN0aW9uOiBjb2x1bW47XG4gIGFsaWduLWl0ZW1zOiBzdHJldGNoO1xuICBtYXJnaW4tcmlnaHQ6IDIwcHg7XG59XG5cbi5zdGVwLWRldGFpbCB7XG4gIHdpZHRoOiA4MCU7XG4gIGJvcmRlcjogMXB4O1xuICBib3JkZXItbGVmdC1zdHlsZTogZGFzaGVkO1xuICBib3JkZXItcmlnaHQtc3R5bGU6IGhpZGRlbjtcbiAgYm9yZGVyLXRvcC1zdHlsZTogaGlkZGVuO1xuICBib3JkZXItYm90dG9tLXN0eWxlOiBoaWRkZW47XG4gIHBhZGRpbmc6IDFlbTtcbiAgbWFyZ2luLWJvdHRvbTogMC41ZW07XG59XG5cbi8qIC5zdGVwLWRldGFpbCB7XG4gIHdpZHRoOiA4MCU7XG4gIGJvcmRlcjogMXB4O1xuICBib3JkZXItbGVmdC1zdHlsZTogZGFzaGVkO1xuICBib3JkZXItcmlnaHQtc3R5bGU6IGhpZGRlbjtcbiAgYm9yZGVyLXRvcC1zdHlsZTogaGlkZGVuO1xuICBib3JkZXItYm90dG9tLXN0eWxlOiBoaWRkZW47XG4gIHBhZGRpbmc6IDFlbTtcbiAgbWFyZ2luLWJvdHRvbTogMC41ZW07XG59ICovXG5cbi8qIC5tb2RlbCB7XG4gIHdpZHRoOiA4MCU7XG4gIGJvcmRlcjogMXB4O1xuICBib3JkZXItbGVmdC1zdHlsZTogZGFzaGVkO1xuICBib3JkZXItcmlnaHQtc3R5bGU6IGhpZGRlbjtcbiAgYm9yZGVyLXRvcC1zdHlsZTogaGlkZGVuO1xuICBib3JkZXItYm90dG9tLXN0eWxlOiBoaWRkZW47XG4gIHBhZGRpbmc6IDFlbTtcbiAgbWFyZ2luLWJvdHRvbTogMC41ZW07XG59ICovXG5cbmlucHV0OmludmFsaWQge1xuICBib3JkZXI6IHJlZCBzb2xpZCAzcHg7XG59XG4iLCJAaW1wb3J0IFwiLi4vYXBwLmNvbXBvbmVudC5jc3NcIjtcblxuZGl2IHtcbiAgbWFyZ2luLXRvcDogMWVtO1xuICBtYXJnaW4tYm90dG9tOiAxZW07XG59XG5cbi5jb21tYW5kLWxpbmUtZW50cnkge1xuICBib3JkZXI6IDFweDtcbiAgYm9yZGVyLWNvbG9yOiBibGFjaztcbiAgYm9yZGVyLXN0eWxlOiBkYXNoZWQ7XG4gIHBhZGRpbmc6IDFlbTtcbn1cbiJdfQ== */";
    /***/
  },

  /***/
  "./src/app/command-line-template/command-line-template.component.ts":
  /*!**************************************************************************!*\
    !*** ./src/app/command-line-template/command-line-template.component.ts ***!
    \**************************************************************************/

  /*! exports provided: CommandLineTemplateComponent */

  /***/
  function srcAppCommandLineTemplateCommandLineTemplateComponentTs(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "CommandLineTemplateComponent", function () {
      return CommandLineTemplateComponent;
    });
    /* harmony import */


    var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
    /*! tslib */
    "./node_modules/tslib/tslib.es6.js");
    /* harmony import */


    var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
    /*! @angular/core */
    "./node_modules/@angular/core/fesm2015/core.js");
    /* harmony import */


    var _fortawesome_free_solid_svg_icons__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(
    /*! @fortawesome/free-solid-svg-icons */
    "./node_modules/@fortawesome/free-solid-svg-icons/index.es.js");
    /* harmony import */


    var src_model_tool_description__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(
    /*! src/model/tool-description */
    "./src/model/tool-description.ts");

    var CommandLineTemplateComponent =
    /*#__PURE__*/
    function () {
      function CommandLineTemplateComponent() {
        _classCallCheck(this, CommandLineTemplateComponent);

        this.iconAdd = _fortawesome_free_solid_svg_icons__WEBPACK_IMPORTED_MODULE_2__["faPlus"];
        this.iconRemove = _fortawesome_free_solid_svg_icons__WEBPACK_IMPORTED_MODULE_2__["faTimes"];
        this.iconUp = _fortawesome_free_solid_svg_icons__WEBPACK_IMPORTED_MODULE_2__["faArrowUp"];
        this.iconDown = _fortawesome_free_solid_svg_icons__WEBPACK_IMPORTED_MODULE_2__["faArrowDown"];
      }

      _createClass(CommandLineTemplateComponent, [{
        key: "ngOnInit",
        value: function ngOnInit() {}
      }, {
        key: "isLiteralTemplate",
        value: function isLiteralTemplate(t) {
          return t instanceof src_model_tool_description__WEBPACK_IMPORTED_MODULE_3__["LiteralCommandLineEntryList"];
        }
      }, {
        key: "isParameterTemplate",
        value: function isParameterTemplate(t) {
          return t instanceof src_model_tool_description__WEBPACK_IMPORTED_MODULE_3__["ParameterCommandLineEntryList"];
        }
      }, {
        key: "isDatasetTemplate",
        value: function isDatasetTemplate(t) {
          return t instanceof src_model_tool_description__WEBPACK_IMPORTED_MODULE_3__["DatasetCommandLineEntryList"];
        }
      }]);

      return CommandLineTemplateComponent;
    }();

    tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Input"])()], CommandLineTemplateComponent.prototype, "entryList", void 0);
    tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Input"])()], CommandLineTemplateComponent.prototype, "parameters", void 0);
    tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Input"])()], CommandLineTemplateComponent.prototype, "inputDatasets", void 0);
    tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Input"])()], CommandLineTemplateComponent.prototype, "outputDatasets", void 0);
    CommandLineTemplateComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
      selector: "app-command-line-template",
      template: tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(
      /*! raw-loader!./command-line-template.component.html */
      "./node_modules/raw-loader/dist/cjs.js!./src/app/command-line-template/command-line-template.component.html")).default,
      styles: [tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(
      /*! ./command-line-template.component.css */
      "./src/app/command-line-template/command-line-template.component.css")).default]
    })], CommandLineTemplateComponent);
    /***/
  },

  /***/
  "./src/app/deployment-model/deployment-model.component.css":
  /*!*****************************************************************!*\
    !*** ./src/app/deployment-model/deployment-model.component.css ***!
    \*****************************************************************/

  /*! exports provided: default */

  /***/
  function srcAppDeploymentModelDeploymentModelComponentCss(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony default export */


    __webpack_exports__["default"] = "*[data-descr] {\n  position: relative;\n  cursor: help;\n}\n\n*[data-descr]:after {\n  vertical-align: top;\n  color: inherit;\n  font-size: small;\n  content: \"?\";\n}\n\n*[data-descr]:hover::after,\n*[data-descr]:focus::after {\n  content: attr(data-descr);\n\n  position: absolute;\n  left: auto;\n  min-width: 200px;\n  border: 1px #aaaaaa solid;\n  border-radius: 10px;\n  background-color: #0b4a92;\n  padding: 12px;\n  color: #e0e0e0;\n\n  font-size: 14px;\n  font-style: normal;\n  font-weight: lighter;\n  z-index: 1;\n  text-align: center;\n  opacity: 0.9;\n  -webkit-transition: opacity 1s;\n  transition: opacity 1s;\n}\n\noption[title]:hover:after,\noption[title]:focus:after {\n  content: attr(title);\n}\n\n/* Tooltip container\n.tooltip {\n  position: relative;\n}\n\n/* Tooltip text\n.tooltip .tooltiptext {\n  visibility: hidden;\n  width: 200px;\n  background-color: #555;\n  color: #fff;\n  text-align: center;\n  padding: 10px 0;\n  border-radius: 6px;\n  margin: 10px;\n  font-size: small;\n\n  /* Position the tooltip text\n  position: absolute;\n  z-index: 1;\n  bottom: 125%;\n  left: 50%;\n  margin-left: -100px;\n\n  /* Fade in tooltip\n  opacity: 0;\n  transition: opacity 0.5s;\n}\n\n.tooltip::after {\n  vertical-align: top;\n  color: inherit;\n  font-size: small;\n  content: \"?\";\n}\n\n/* Tooltip arrow\n.tooltip .tooltiptext::after {\n  content: \"\";\n  position: absolute;\n  top: 100%;\n  left: 50%;\n  margin-left: -5px;\n  border-width: 5px;\n  border-style: solid;\n  border-color: #555 transparent transparent transparent;\n}\n\n/* Show the tooltip text when you mouse over the tooltip container\n.tooltip:hover .tooltiptext {\n  visibility: visible;\n  opacity: 1;\n} */\n\n* {\n  color: #ddd;\n  background-color: #222;\n  font-family: Arial, Helvetica, sans-serif;\n  border-color: #ddd;\n}\n\n/* Application-wide Styles */\n\nh1 {\n  color: rgb(74, 165, 255);\n  font-family: Arial, Helvetica, sans-serif;\n  font-size: 250%;\n}\n\nh2 {\n  font-family: Arial, Helvetica, sans-serif;\n  font-weight: bolder;\n}\n\nh3 {\n  font-family: Arial, Helvetica, sans-serif;\n  font-weight: normal;\n  padding-top: 1em;\n}\n\nbody {\n  margin: 2em;\n}\n\ninput,\ntextarea,\nselect {\n  font-size: large;\n  color: rgb(61, 228, 192);\n  border-top-style: hidden;\n  border-left-style: hidden;\n  border-right-style: hidden;\n}\n\ninput[type=\"text\"],\ninput[type=\"url\"],\ntextarea {\n  margin-bottom: 0.5em;\n  margin-left: 0.5em;\n  margin-right: 0.5em;\n  margin-top: none;\n  border-top-width: 0px;\n  border-top-style: hidden;\n  border-left-style: hidden;\n  border-right-style: hidden;\n  border-left-width: 0px;\n  border-right-width: 0px;\n  width: 90%;\n  display: block;\n}\n\ninput[type=\"number\"] {\n  width: 50px;\n  text-align: center;\n  -webkit-appearance: textfield;\n     -moz-appearance: textfield;\n          appearance: textfield;\n}\n\ntextarea {\n  width: 90%;\n  resize: vertical;\n}\n\nbutton {\n  color: #ddd;\n  color: rgb(61, 228, 192);\n  background-color: rgb(61, 228, 192);\n  background-color: #222;\n  color: rgb(61, 228, 192);\n  border-color: #ddd;\n  font-family: Arial, Helvetica, sans-serif;\n  font-weight: bold;\n  margin-bottom: 0.5em;\n  margin-left: 0.5em;\n  margin-right: 0.5em;\n  margin-top: 0.5em;\n  border-radius: 5px;\n  min-height: 30px;\n  text-overflow: clip;\n}\n\nbutton > fa-icon {\n  color: inherit;\n  background-color: inherit;\n}\n\nbutton:disabled {\n  color: #aaa;\n  background-color: #222;\n  font-weight: lighter;\n}\n\nbutton.next {\n  right: 0px;\n  color: rgb(61, 228, 192);\n  border-color: rgb(61, 228, 192);\n}\n\nselect {\n  min-width: 10em;\n}\n\n/* everywhere else */\n\n* {\n  font-family: Arial, Helvetica, sans-serif;\n}\n\nlabel {\n  display: block;\n  margin-top: 1em;\n  margin-bottom: 1em;\n}\n\n.main {\n  width: 100%;\n  display: -webkit-box;\n  display: flex;\n  -webkit-box-orient: horizontal;\n  -webkit-box-direction: normal;\n          flex-direction: row;\n}\n\n.navigation {\n  width: 20%;\n  display: -webkit-box;\n  display: flex;\n  -webkit-box-orient: vertical;\n  -webkit-box-direction: normal;\n          flex-direction: column;\n  -webkit-box-align: stretch;\n          align-items: stretch;\n  margin-right: 20px;\n}\n\n.step-detail {\n  width: 80%;\n  border: 1px;\n  border-left-style: dashed;\n  border-right-style: hidden;\n  border-top-style: hidden;\n  border-bottom-style: hidden;\n  padding: 1em;\n  margin-bottom: 0.5em;\n}\n\n/* .step-detail {\n  width: 80%;\n  border: 1px;\n  border-left-style: dashed;\n  border-right-style: hidden;\n  border-top-style: hidden;\n  border-bottom-style: hidden;\n  padding: 1em;\n  margin-bottom: 0.5em;\n} */\n\n/* .model {\n  width: 80%;\n  border: 1px;\n  border-left-style: dashed;\n  border-right-style: hidden;\n  border-top-style: hidden;\n  border-bottom-style: hidden;\n  padding: 1em;\n  margin-bottom: 0.5em;\n} */\n\ninput:invalid {\n  border: red solid 3px;\n}\n\n/* div {\n  border: 1px;\n  border-style: dashed;\n  padding: 1em;\n  margin-bottom: 0.5em;\n} */\n\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbInNyYy9hcHAvdG9vbHRpcC5jc3MiLCJzcmMvYXBwL2FwcC5jb21wb25lbnQuY3NzIiwic3JjL2FwcC9kZXBsb3ltZW50LW1vZGVsL2RlcGxveW1lbnQtbW9kZWwuY29tcG9uZW50LmNzcyJdLCJuYW1lcyI6W10sIm1hcHBpbmdzIjoiQUFBQTtFQUNFLGtCQUFrQjtFQUNsQixZQUFZO0FBQ2Q7O0FBRUE7RUFDRSxtQkFBbUI7RUFDbkIsY0FBYztFQUNkLGdCQUFnQjtFQUNoQixZQUFZO0FBQ2Q7O0FBRUE7O0VBRUUseUJBQXlCOztFQUV6QixrQkFBa0I7RUFDbEIsVUFBVTtFQUNWLGdCQUFnQjtFQUNoQix5QkFBeUI7RUFDekIsbUJBQW1CO0VBQ25CLHlCQUF5QjtFQUN6QixhQUFhO0VBQ2IsY0FBYzs7RUFFZCxlQUFlO0VBQ2Ysa0JBQWtCO0VBQ2xCLG9CQUFvQjtFQUNwQixVQUFVO0VBQ1Ysa0JBQWtCO0VBQ2xCLFlBQVk7RUFDWiw4QkFBc0I7RUFBdEIsc0JBQXNCO0FBQ3hCOztBQUVBOztFQUVFLG9CQUFvQjtBQUN0Qjs7QUFFQTs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7OztHQW9ERzs7QUN6Rkg7RUFDRSxXQUFXO0VBQ1gsc0JBQXNCO0VBQ3RCLHlDQUF5QztFQUN6QyxrQkFBa0I7QUFDcEI7O0FBRUEsNEJBQTRCOztBQUM1QjtFQUNFLHdCQUF3QjtFQUN4Qix5Q0FBeUM7RUFDekMsZUFBZTtBQUNqQjs7QUFFQTtFQUNFLHlDQUF5QztFQUN6QyxtQkFBbUI7QUFDckI7O0FBRUE7RUFDRSx5Q0FBeUM7RUFDekMsbUJBQW1CO0VBQ25CLGdCQUFnQjtBQUNsQjs7QUFFQTtFQUNFLFdBQVc7QUFDYjs7QUFFQTs7O0VBR0UsZ0JBQWdCO0VBQ2hCLHdCQUF3QjtFQUN4Qix3QkFBd0I7RUFDeEIseUJBQXlCO0VBQ3pCLDBCQUEwQjtBQUM1Qjs7QUFFQTs7O0VBR0Usb0JBQW9CO0VBQ3BCLGtCQUFrQjtFQUNsQixtQkFBbUI7RUFDbkIsZ0JBQWdCO0VBQ2hCLHFCQUFxQjtFQUNyQix3QkFBd0I7RUFDeEIseUJBQXlCO0VBQ3pCLDBCQUEwQjtFQUMxQixzQkFBc0I7RUFDdEIsdUJBQXVCO0VBQ3ZCLFVBQVU7RUFDVixjQUFjO0FBQ2hCOztBQUVBO0VBQ0UsV0FBVztFQUNYLGtCQUFrQjtFQUNsQiw2QkFBcUI7S0FBckIsMEJBQXFCO1VBQXJCLHFCQUFxQjtBQUN2Qjs7QUFFQTtFQUNFLFVBQVU7RUFDVixnQkFBZ0I7QUFDbEI7O0FBRUE7RUFDRSxXQUFXO0VBQ1gsd0JBQXdCO0VBQ3hCLG1DQUFtQztFQUNuQyxzQkFBc0I7RUFDdEIsd0JBQXdCO0VBQ3hCLGtCQUFrQjtFQUNsQix5Q0FBeUM7RUFDekMsaUJBQWlCO0VBQ2pCLG9CQUFvQjtFQUNwQixrQkFBa0I7RUFDbEIsbUJBQW1CO0VBQ25CLGlCQUFpQjtFQUNqQixrQkFBa0I7RUFDbEIsZ0JBQWdCO0VBQ2hCLG1CQUFtQjtBQUNyQjs7QUFFQTtFQUNFLGNBQWM7RUFDZCx5QkFBeUI7QUFDM0I7O0FBRUE7RUFDRSxXQUFXO0VBQ1gsc0JBQXNCO0VBQ3RCLG9CQUFvQjtBQUN0Qjs7QUFFQTtFQUNFLFVBQVU7RUFDVix3QkFBd0I7RUFDeEIsK0JBQStCO0FBQ2pDOztBQUVBO0VBQ0UsZUFBZTtBQUNqQjs7QUFFQSxvQkFBb0I7O0FBRXBCO0VBQ0UseUNBQXlDO0FBQzNDOztBQUVBO0VBQ0UsY0FBYztFQUNkLGVBQWU7RUFDZixrQkFBa0I7QUFDcEI7O0FBRUE7RUFDRSxXQUFXO0VBQ1gsb0JBQWE7RUFBYixhQUFhO0VBQ2IsOEJBQW1CO0VBQW5CLDZCQUFtQjtVQUFuQixtQkFBbUI7QUFDckI7O0FBRUE7RUFDRSxVQUFVO0VBQ1Ysb0JBQWE7RUFBYixhQUFhO0VBQ2IsNEJBQXNCO0VBQXRCLDZCQUFzQjtVQUF0QixzQkFBc0I7RUFDdEIsMEJBQW9CO1VBQXBCLG9CQUFvQjtFQUNwQixrQkFBa0I7QUFDcEI7O0FBRUE7RUFDRSxVQUFVO0VBQ1YsV0FBVztFQUNYLHlCQUF5QjtFQUN6QiwwQkFBMEI7RUFDMUIsd0JBQXdCO0VBQ3hCLDJCQUEyQjtFQUMzQixZQUFZO0VBQ1osb0JBQW9CO0FBQ3RCOztBQUVBOzs7Ozs7Ozs7R0FTRzs7QUFFSDs7Ozs7Ozs7O0dBU0c7O0FBRUg7RUFDRSxxQkFBcUI7QUFDdkI7O0FDdktBOzs7OztHQUtHIiwiZmlsZSI6InNyYy9hcHAvZGVwbG95bWVudC1tb2RlbC9kZXBsb3ltZW50LW1vZGVsLmNvbXBvbmVudC5jc3MiLCJzb3VyY2VzQ29udGVudCI6WyIqW2RhdGEtZGVzY3JdIHtcbiAgcG9zaXRpb246IHJlbGF0aXZlO1xuICBjdXJzb3I6IGhlbHA7XG59XG5cbipbZGF0YS1kZXNjcl06YWZ0ZXIge1xuICB2ZXJ0aWNhbC1hbGlnbjogdG9wO1xuICBjb2xvcjogaW5oZXJpdDtcbiAgZm9udC1zaXplOiBzbWFsbDtcbiAgY29udGVudDogXCI/XCI7XG59XG5cbipbZGF0YS1kZXNjcl06aG92ZXI6OmFmdGVyLFxuKltkYXRhLWRlc2NyXTpmb2N1czo6YWZ0ZXIge1xuICBjb250ZW50OiBhdHRyKGRhdGEtZGVzY3IpO1xuXG4gIHBvc2l0aW9uOiBhYnNvbHV0ZTtcbiAgbGVmdDogYXV0bztcbiAgbWluLXdpZHRoOiAyMDBweDtcbiAgYm9yZGVyOiAxcHggI2FhYWFhYSBzb2xpZDtcbiAgYm9yZGVyLXJhZGl1czogMTBweDtcbiAgYmFja2dyb3VuZC1jb2xvcjogIzBiNGE5MjtcbiAgcGFkZGluZzogMTJweDtcbiAgY29sb3I6ICNlMGUwZTA7XG5cbiAgZm9udC1zaXplOiAxNHB4O1xuICBmb250LXN0eWxlOiBub3JtYWw7XG4gIGZvbnQtd2VpZ2h0OiBsaWdodGVyO1xuICB6LWluZGV4OiAxO1xuICB0ZXh0LWFsaWduOiBjZW50ZXI7XG4gIG9wYWNpdHk6IDAuOTtcbiAgdHJhbnNpdGlvbjogb3BhY2l0eSAxcztcbn1cblxub3B0aW9uW3RpdGxlXTpob3ZlcjphZnRlcixcbm9wdGlvblt0aXRsZV06Zm9jdXM6YWZ0ZXIge1xuICBjb250ZW50OiBhdHRyKHRpdGxlKTtcbn1cblxuLyogVG9vbHRpcCBjb250YWluZXJcbi50b29sdGlwIHtcbiAgcG9zaXRpb246IHJlbGF0aXZlO1xufVxuXG4vKiBUb29sdGlwIHRleHRcbi50b29sdGlwIC50b29sdGlwdGV4dCB7XG4gIHZpc2liaWxpdHk6IGhpZGRlbjtcbiAgd2lkdGg6IDIwMHB4O1xuICBiYWNrZ3JvdW5kLWNvbG9yOiAjNTU1O1xuICBjb2xvcjogI2ZmZjtcbiAgdGV4dC1hbGlnbjogY2VudGVyO1xuICBwYWRkaW5nOiAxMHB4IDA7XG4gIGJvcmRlci1yYWRpdXM6IDZweDtcbiAgbWFyZ2luOiAxMHB4O1xuICBmb250LXNpemU6IHNtYWxsO1xuXG4gIC8qIFBvc2l0aW9uIHRoZSB0b29sdGlwIHRleHRcbiAgcG9zaXRpb246IGFic29sdXRlO1xuICB6LWluZGV4OiAxO1xuICBib3R0b206IDEyNSU7XG4gIGxlZnQ6IDUwJTtcbiAgbWFyZ2luLWxlZnQ6IC0xMDBweDtcblxuICAvKiBGYWRlIGluIHRvb2x0aXBcbiAgb3BhY2l0eTogMDtcbiAgdHJhbnNpdGlvbjogb3BhY2l0eSAwLjVzO1xufVxuXG4udG9vbHRpcDo6YWZ0ZXIge1xuICB2ZXJ0aWNhbC1hbGlnbjogdG9wO1xuICBjb2xvcjogaW5oZXJpdDtcbiAgZm9udC1zaXplOiBzbWFsbDtcbiAgY29udGVudDogXCI/XCI7XG59XG5cbi8qIFRvb2x0aXAgYXJyb3dcbi50b29sdGlwIC50b29sdGlwdGV4dDo6YWZ0ZXIge1xuICBjb250ZW50OiBcIlwiO1xuICBwb3NpdGlvbjogYWJzb2x1dGU7XG4gIHRvcDogMTAwJTtcbiAgbGVmdDogNTAlO1xuICBtYXJnaW4tbGVmdDogLTVweDtcbiAgYm9yZGVyLXdpZHRoOiA1cHg7XG4gIGJvcmRlci1zdHlsZTogc29saWQ7XG4gIGJvcmRlci1jb2xvcjogIzU1NSB0cmFuc3BhcmVudCB0cmFuc3BhcmVudCB0cmFuc3BhcmVudDtcbn1cblxuLyogU2hvdyB0aGUgdG9vbHRpcCB0ZXh0IHdoZW4geW91IG1vdXNlIG92ZXIgdGhlIHRvb2x0aXAgY29udGFpbmVyXG4udG9vbHRpcDpob3ZlciAudG9vbHRpcHRleHQge1xuICB2aXNpYmlsaXR5OiB2aXNpYmxlO1xuICBvcGFjaXR5OiAxO1xufSAqL1xuIiwiQGltcG9ydCBcIi4vdG9vbHRpcC5jc3NcIjtcblxuKiB7XG4gIGNvbG9yOiAjZGRkO1xuICBiYWNrZ3JvdW5kLWNvbG9yOiAjMjIyO1xuICBmb250LWZhbWlseTogQXJpYWwsIEhlbHZldGljYSwgc2Fucy1zZXJpZjtcbiAgYm9yZGVyLWNvbG9yOiAjZGRkO1xufVxuXG4vKiBBcHBsaWNhdGlvbi13aWRlIFN0eWxlcyAqL1xuaDEge1xuICBjb2xvcjogcmdiKDc0LCAxNjUsIDI1NSk7XG4gIGZvbnQtZmFtaWx5OiBBcmlhbCwgSGVsdmV0aWNhLCBzYW5zLXNlcmlmO1xuICBmb250LXNpemU6IDI1MCU7XG59XG5cbmgyIHtcbiAgZm9udC1mYW1pbHk6IEFyaWFsLCBIZWx2ZXRpY2EsIHNhbnMtc2VyaWY7XG4gIGZvbnQtd2VpZ2h0OiBib2xkZXI7XG59XG5cbmgzIHtcbiAgZm9udC1mYW1pbHk6IEFyaWFsLCBIZWx2ZXRpY2EsIHNhbnMtc2VyaWY7XG4gIGZvbnQtd2VpZ2h0OiBub3JtYWw7XG4gIHBhZGRpbmctdG9wOiAxZW07XG59XG5cbmJvZHkge1xuICBtYXJnaW46IDJlbTtcbn1cblxuaW5wdXQsXG50ZXh0YXJlYSxcbnNlbGVjdCB7XG4gIGZvbnQtc2l6ZTogbGFyZ2U7XG4gIGNvbG9yOiByZ2IoNjEsIDIyOCwgMTkyKTtcbiAgYm9yZGVyLXRvcC1zdHlsZTogaGlkZGVuO1xuICBib3JkZXItbGVmdC1zdHlsZTogaGlkZGVuO1xuICBib3JkZXItcmlnaHQtc3R5bGU6IGhpZGRlbjtcbn1cblxuaW5wdXRbdHlwZT1cInRleHRcIl0sXG5pbnB1dFt0eXBlPVwidXJsXCJdLFxudGV4dGFyZWEge1xuICBtYXJnaW4tYm90dG9tOiAwLjVlbTtcbiAgbWFyZ2luLWxlZnQ6IDAuNWVtO1xuICBtYXJnaW4tcmlnaHQ6IDAuNWVtO1xuICBtYXJnaW4tdG9wOiBub25lO1xuICBib3JkZXItdG9wLXdpZHRoOiAwcHg7XG4gIGJvcmRlci10b3Atc3R5bGU6IGhpZGRlbjtcbiAgYm9yZGVyLWxlZnQtc3R5bGU6IGhpZGRlbjtcbiAgYm9yZGVyLXJpZ2h0LXN0eWxlOiBoaWRkZW47XG4gIGJvcmRlci1sZWZ0LXdpZHRoOiAwcHg7XG4gIGJvcmRlci1yaWdodC13aWR0aDogMHB4O1xuICB3aWR0aDogOTAlO1xuICBkaXNwbGF5OiBibG9jaztcbn1cblxuaW5wdXRbdHlwZT1cIm51bWJlclwiXSB7XG4gIHdpZHRoOiA1MHB4O1xuICB0ZXh0LWFsaWduOiBjZW50ZXI7XG4gIGFwcGVhcmFuY2U6IHRleHRmaWVsZDtcbn1cblxudGV4dGFyZWEge1xuICB3aWR0aDogOTAlO1xuICByZXNpemU6IHZlcnRpY2FsO1xufVxuXG5idXR0b24ge1xuICBjb2xvcjogI2RkZDtcbiAgY29sb3I6IHJnYig2MSwgMjI4LCAxOTIpO1xuICBiYWNrZ3JvdW5kLWNvbG9yOiByZ2IoNjEsIDIyOCwgMTkyKTtcbiAgYmFja2dyb3VuZC1jb2xvcjogIzIyMjtcbiAgY29sb3I6IHJnYig2MSwgMjI4LCAxOTIpO1xuICBib3JkZXItY29sb3I6ICNkZGQ7XG4gIGZvbnQtZmFtaWx5OiBBcmlhbCwgSGVsdmV0aWNhLCBzYW5zLXNlcmlmO1xuICBmb250LXdlaWdodDogYm9sZDtcbiAgbWFyZ2luLWJvdHRvbTogMC41ZW07XG4gIG1hcmdpbi1sZWZ0OiAwLjVlbTtcbiAgbWFyZ2luLXJpZ2h0OiAwLjVlbTtcbiAgbWFyZ2luLXRvcDogMC41ZW07XG4gIGJvcmRlci1yYWRpdXM6IDVweDtcbiAgbWluLWhlaWdodDogMzBweDtcbiAgdGV4dC1vdmVyZmxvdzogY2xpcDtcbn1cblxuYnV0dG9uID4gZmEtaWNvbiB7XG4gIGNvbG9yOiBpbmhlcml0O1xuICBiYWNrZ3JvdW5kLWNvbG9yOiBpbmhlcml0O1xufVxuXG5idXR0b246ZGlzYWJsZWQge1xuICBjb2xvcjogI2FhYTtcbiAgYmFja2dyb3VuZC1jb2xvcjogIzIyMjtcbiAgZm9udC13ZWlnaHQ6IGxpZ2h0ZXI7XG59XG5cbmJ1dHRvbi5uZXh0IHtcbiAgcmlnaHQ6IDBweDtcbiAgY29sb3I6IHJnYig2MSwgMjI4LCAxOTIpO1xuICBib3JkZXItY29sb3I6IHJnYig2MSwgMjI4LCAxOTIpO1xufVxuXG5zZWxlY3Qge1xuICBtaW4td2lkdGg6IDEwZW07XG59XG5cbi8qIGV2ZXJ5d2hlcmUgZWxzZSAqL1xuXG4qIHtcbiAgZm9udC1mYW1pbHk6IEFyaWFsLCBIZWx2ZXRpY2EsIHNhbnMtc2VyaWY7XG59XG5cbmxhYmVsIHtcbiAgZGlzcGxheTogYmxvY2s7XG4gIG1hcmdpbi10b3A6IDFlbTtcbiAgbWFyZ2luLWJvdHRvbTogMWVtO1xufVxuXG4ubWFpbiB7XG4gIHdpZHRoOiAxMDAlO1xuICBkaXNwbGF5OiBmbGV4O1xuICBmbGV4LWRpcmVjdGlvbjogcm93O1xufVxuXG4ubmF2aWdhdGlvbiB7XG4gIHdpZHRoOiAyMCU7XG4gIGRpc3BsYXk6IGZsZXg7XG4gIGZsZXgtZGlyZWN0aW9uOiBjb2x1bW47XG4gIGFsaWduLWl0ZW1zOiBzdHJldGNoO1xuICBtYXJnaW4tcmlnaHQ6IDIwcHg7XG59XG5cbi5zdGVwLWRldGFpbCB7XG4gIHdpZHRoOiA4MCU7XG4gIGJvcmRlcjogMXB4O1xuICBib3JkZXItbGVmdC1zdHlsZTogZGFzaGVkO1xuICBib3JkZXItcmlnaHQtc3R5bGU6IGhpZGRlbjtcbiAgYm9yZGVyLXRvcC1zdHlsZTogaGlkZGVuO1xuICBib3JkZXItYm90dG9tLXN0eWxlOiBoaWRkZW47XG4gIHBhZGRpbmc6IDFlbTtcbiAgbWFyZ2luLWJvdHRvbTogMC41ZW07XG59XG5cbi8qIC5zdGVwLWRldGFpbCB7XG4gIHdpZHRoOiA4MCU7XG4gIGJvcmRlcjogMXB4O1xuICBib3JkZXItbGVmdC1zdHlsZTogZGFzaGVkO1xuICBib3JkZXItcmlnaHQtc3R5bGU6IGhpZGRlbjtcbiAgYm9yZGVyLXRvcC1zdHlsZTogaGlkZGVuO1xuICBib3JkZXItYm90dG9tLXN0eWxlOiBoaWRkZW47XG4gIHBhZGRpbmc6IDFlbTtcbiAgbWFyZ2luLWJvdHRvbTogMC41ZW07XG59ICovXG5cbi8qIC5tb2RlbCB7XG4gIHdpZHRoOiA4MCU7XG4gIGJvcmRlcjogMXB4O1xuICBib3JkZXItbGVmdC1zdHlsZTogZGFzaGVkO1xuICBib3JkZXItcmlnaHQtc3R5bGU6IGhpZGRlbjtcbiAgYm9yZGVyLXRvcC1zdHlsZTogaGlkZGVuO1xuICBib3JkZXItYm90dG9tLXN0eWxlOiBoaWRkZW47XG4gIHBhZGRpbmc6IDFlbTtcbiAgbWFyZ2luLWJvdHRvbTogMC41ZW07XG59ICovXG5cbmlucHV0OmludmFsaWQge1xuICBib3JkZXI6IHJlZCBzb2xpZCAzcHg7XG59XG4iLCJAaW1wb3J0IFwiLi4vYXBwLmNvbXBvbmVudC5jc3NcIjtcblxuLyogZGl2IHtcbiAgYm9yZGVyOiAxcHg7XG4gIGJvcmRlci1zdHlsZTogZGFzaGVkO1xuICBwYWRkaW5nOiAxZW07XG4gIG1hcmdpbi1ib3R0b206IDAuNWVtO1xufSAqL1xuIl19 */";
    /***/
  },

  /***/
  "./src/app/deployment-model/deployment-model.component.ts":
  /*!****************************************************************!*\
    !*** ./src/app/deployment-model/deployment-model.component.ts ***!
    \****************************************************************/

  /*! exports provided: DeploymentModelComponent */

  /***/
  function srcAppDeploymentModelDeploymentModelComponentTs(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "DeploymentModelComponent", function () {
      return DeploymentModelComponent;
    });
    /* harmony import */


    var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
    /*! tslib */
    "./node_modules/tslib/tslib.es6.js");
    /* harmony import */


    var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
    /*! @angular/core */
    "./node_modules/@angular/core/fesm2015/core.js");
    /* harmony import */


    var _lang__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(
    /*! ../lang */
    "./src/app/lang.ts");

    var DeploymentModelComponent =
    /*#__PURE__*/
    function () {
      function DeploymentModelComponent() {
        _classCallCheck(this, DeploymentModelComponent);

        this.lang = _lang__WEBPACK_IMPORTED_MODULE_2__["Lang"].getInstance();
      }

      _createClass(DeploymentModelComponent, [{
        key: "ngOnInit",
        value: function ngOnInit() {}
      }]);

      return DeploymentModelComponent;
    }();

    tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Input"])()], DeploymentModelComponent.prototype, "deploymentModel", void 0);
    DeploymentModelComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
      selector: "app-deployment-model",
      template: tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(
      /*! raw-loader!./deployment-model.component.html */
      "./node_modules/raw-loader/dist/cjs.js!./src/app/deployment-model/deployment-model.component.html")).default,
      styles: [tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(
      /*! ./deployment-model.component.css */
      "./src/app/deployment-model/deployment-model.component.css")).default]
    })], DeploymentModelComponent);
    /***/
  },

  /***/
  "./src/app/exit-code-detail/exit-code-detail.component.css":
  /*!*****************************************************************!*\
    !*** ./src/app/exit-code-detail/exit-code-detail.component.css ***!
    \*****************************************************************/

  /*! exports provided: default */

  /***/
  function srcAppExitCodeDetailExitCodeDetailComponentCss(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony default export */


    __webpack_exports__["default"] = "*[data-descr] {\n  position: relative;\n  cursor: help;\n}\n\n*[data-descr]:after {\n  vertical-align: top;\n  color: inherit;\n  font-size: small;\n  content: \"?\";\n}\n\n*[data-descr]:hover::after,\n*[data-descr]:focus::after {\n  content: attr(data-descr);\n\n  position: absolute;\n  left: auto;\n  min-width: 200px;\n  border: 1px #aaaaaa solid;\n  border-radius: 10px;\n  background-color: #0b4a92;\n  padding: 12px;\n  color: #e0e0e0;\n\n  font-size: 14px;\n  font-style: normal;\n  font-weight: lighter;\n  z-index: 1;\n  text-align: center;\n  opacity: 0.9;\n  -webkit-transition: opacity 1s;\n  transition: opacity 1s;\n}\n\noption[title]:hover:after,\noption[title]:focus:after {\n  content: attr(title);\n}\n\n/* Tooltip container\n.tooltip {\n  position: relative;\n}\n\n/* Tooltip text\n.tooltip .tooltiptext {\n  visibility: hidden;\n  width: 200px;\n  background-color: #555;\n  color: #fff;\n  text-align: center;\n  padding: 10px 0;\n  border-radius: 6px;\n  margin: 10px;\n  font-size: small;\n\n  /* Position the tooltip text\n  position: absolute;\n  z-index: 1;\n  bottom: 125%;\n  left: 50%;\n  margin-left: -100px;\n\n  /* Fade in tooltip\n  opacity: 0;\n  transition: opacity 0.5s;\n}\n\n.tooltip::after {\n  vertical-align: top;\n  color: inherit;\n  font-size: small;\n  content: \"?\";\n}\n\n/* Tooltip arrow\n.tooltip .tooltiptext::after {\n  content: \"\";\n  position: absolute;\n  top: 100%;\n  left: 50%;\n  margin-left: -5px;\n  border-width: 5px;\n  border-style: solid;\n  border-color: #555 transparent transparent transparent;\n}\n\n/* Show the tooltip text when you mouse over the tooltip container\n.tooltip:hover .tooltiptext {\n  visibility: visible;\n  opacity: 1;\n} */\n\n* {\n  color: #ddd;\n  background-color: #222;\n  font-family: Arial, Helvetica, sans-serif;\n  border-color: #ddd;\n}\n\n/* Application-wide Styles */\n\nh1 {\n  color: rgb(74, 165, 255);\n  font-family: Arial, Helvetica, sans-serif;\n  font-size: 250%;\n}\n\nh2 {\n  font-family: Arial, Helvetica, sans-serif;\n  font-weight: bolder;\n}\n\nh3 {\n  font-family: Arial, Helvetica, sans-serif;\n  font-weight: normal;\n  padding-top: 1em;\n}\n\nbody {\n  margin: 2em;\n}\n\ninput,\ntextarea,\nselect {\n  font-size: large;\n  color: rgb(61, 228, 192);\n  border-top-style: hidden;\n  border-left-style: hidden;\n  border-right-style: hidden;\n}\n\ninput[type=\"text\"],\ninput[type=\"url\"],\ntextarea {\n  margin-bottom: 0.5em;\n  margin-left: 0.5em;\n  margin-right: 0.5em;\n  margin-top: none;\n  border-top-width: 0px;\n  border-top-style: hidden;\n  border-left-style: hidden;\n  border-right-style: hidden;\n  border-left-width: 0px;\n  border-right-width: 0px;\n  width: 90%;\n  display: block;\n}\n\ninput[type=\"number\"] {\n  width: 50px;\n  text-align: center;\n  -webkit-appearance: textfield;\n     -moz-appearance: textfield;\n          appearance: textfield;\n}\n\ntextarea {\n  width: 90%;\n  resize: vertical;\n}\n\nbutton {\n  color: #ddd;\n  color: rgb(61, 228, 192);\n  background-color: rgb(61, 228, 192);\n  background-color: #222;\n  color: rgb(61, 228, 192);\n  border-color: #ddd;\n  font-family: Arial, Helvetica, sans-serif;\n  font-weight: bold;\n  margin-bottom: 0.5em;\n  margin-left: 0.5em;\n  margin-right: 0.5em;\n  margin-top: 0.5em;\n  border-radius: 5px;\n  min-height: 30px;\n  text-overflow: clip;\n}\n\nbutton > fa-icon {\n  color: inherit;\n  background-color: inherit;\n}\n\nbutton:disabled {\n  color: #aaa;\n  background-color: #222;\n  font-weight: lighter;\n}\n\nbutton.next {\n  right: 0px;\n  color: rgb(61, 228, 192);\n  border-color: rgb(61, 228, 192);\n}\n\nselect {\n  min-width: 10em;\n}\n\n/* everywhere else */\n\n* {\n  font-family: Arial, Helvetica, sans-serif;\n}\n\nlabel {\n  display: block;\n  margin-top: 1em;\n  margin-bottom: 1em;\n}\n\n.main {\n  width: 100%;\n  display: -webkit-box;\n  display: flex;\n  -webkit-box-orient: horizontal;\n  -webkit-box-direction: normal;\n          flex-direction: row;\n}\n\n.navigation {\n  width: 20%;\n  display: -webkit-box;\n  display: flex;\n  -webkit-box-orient: vertical;\n  -webkit-box-direction: normal;\n          flex-direction: column;\n  -webkit-box-align: stretch;\n          align-items: stretch;\n  margin-right: 20px;\n}\n\n.step-detail {\n  width: 80%;\n  border: 1px;\n  border-left-style: dashed;\n  border-right-style: hidden;\n  border-top-style: hidden;\n  border-bottom-style: hidden;\n  padding: 1em;\n  margin-bottom: 0.5em;\n}\n\n/* .step-detail {\n  width: 80%;\n  border: 1px;\n  border-left-style: dashed;\n  border-right-style: hidden;\n  border-top-style: hidden;\n  border-bottom-style: hidden;\n  padding: 1em;\n  margin-bottom: 0.5em;\n} */\n\n/* .model {\n  width: 80%;\n  border: 1px;\n  border-left-style: dashed;\n  border-right-style: hidden;\n  border-top-style: hidden;\n  border-bottom-style: hidden;\n  padding: 1em;\n  margin-bottom: 0.5em;\n} */\n\ninput:invalid {\n  border: red solid 3px;\n}\n\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbInNyYy9hcHAvdG9vbHRpcC5jc3MiLCJzcmMvYXBwL2FwcC5jb21wb25lbnQuY3NzIl0sIm5hbWVzIjpbXSwibWFwcGluZ3MiOiJBQUFBO0VBQ0Usa0JBQWtCO0VBQ2xCLFlBQVk7QUFDZDs7QUFFQTtFQUNFLG1CQUFtQjtFQUNuQixjQUFjO0VBQ2QsZ0JBQWdCO0VBQ2hCLFlBQVk7QUFDZDs7QUFFQTs7RUFFRSx5QkFBeUI7O0VBRXpCLGtCQUFrQjtFQUNsQixVQUFVO0VBQ1YsZ0JBQWdCO0VBQ2hCLHlCQUF5QjtFQUN6QixtQkFBbUI7RUFDbkIseUJBQXlCO0VBQ3pCLGFBQWE7RUFDYixjQUFjOztFQUVkLGVBQWU7RUFDZixrQkFBa0I7RUFDbEIsb0JBQW9CO0VBQ3BCLFVBQVU7RUFDVixrQkFBa0I7RUFDbEIsWUFBWTtFQUNaLDhCQUFzQjtFQUF0QixzQkFBc0I7QUFDeEI7O0FBRUE7O0VBRUUsb0JBQW9CO0FBQ3RCOztBQUVBOzs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7O0dBb0RHOztBQ3pGSDtFQUNFLFdBQVc7RUFDWCxzQkFBc0I7RUFDdEIseUNBQXlDO0VBQ3pDLGtCQUFrQjtBQUNwQjs7QUFFQSw0QkFBNEI7O0FBQzVCO0VBQ0Usd0JBQXdCO0VBQ3hCLHlDQUF5QztFQUN6QyxlQUFlO0FBQ2pCOztBQUVBO0VBQ0UseUNBQXlDO0VBQ3pDLG1CQUFtQjtBQUNyQjs7QUFFQTtFQUNFLHlDQUF5QztFQUN6QyxtQkFBbUI7RUFDbkIsZ0JBQWdCO0FBQ2xCOztBQUVBO0VBQ0UsV0FBVztBQUNiOztBQUVBOzs7RUFHRSxnQkFBZ0I7RUFDaEIsd0JBQXdCO0VBQ3hCLHdCQUF3QjtFQUN4Qix5QkFBeUI7RUFDekIsMEJBQTBCO0FBQzVCOztBQUVBOzs7RUFHRSxvQkFBb0I7RUFDcEIsa0JBQWtCO0VBQ2xCLG1CQUFtQjtFQUNuQixnQkFBZ0I7RUFDaEIscUJBQXFCO0VBQ3JCLHdCQUF3QjtFQUN4Qix5QkFBeUI7RUFDekIsMEJBQTBCO0VBQzFCLHNCQUFzQjtFQUN0Qix1QkFBdUI7RUFDdkIsVUFBVTtFQUNWLGNBQWM7QUFDaEI7O0FBRUE7RUFDRSxXQUFXO0VBQ1gsa0JBQWtCO0VBQ2xCLDZCQUFxQjtLQUFyQiwwQkFBcUI7VUFBckIscUJBQXFCO0FBQ3ZCOztBQUVBO0VBQ0UsVUFBVTtFQUNWLGdCQUFnQjtBQUNsQjs7QUFFQTtFQUNFLFdBQVc7RUFDWCx3QkFBd0I7RUFDeEIsbUNBQW1DO0VBQ25DLHNCQUFzQjtFQUN0Qix3QkFBd0I7RUFDeEIsa0JBQWtCO0VBQ2xCLHlDQUF5QztFQUN6QyxpQkFBaUI7RUFDakIsb0JBQW9CO0VBQ3BCLGtCQUFrQjtFQUNsQixtQkFBbUI7RUFDbkIsaUJBQWlCO0VBQ2pCLGtCQUFrQjtFQUNsQixnQkFBZ0I7RUFDaEIsbUJBQW1CO0FBQ3JCOztBQUVBO0VBQ0UsY0FBYztFQUNkLHlCQUF5QjtBQUMzQjs7QUFFQTtFQUNFLFdBQVc7RUFDWCxzQkFBc0I7RUFDdEIsb0JBQW9CO0FBQ3RCOztBQUVBO0VBQ0UsVUFBVTtFQUNWLHdCQUF3QjtFQUN4QiwrQkFBK0I7QUFDakM7O0FBRUE7RUFDRSxlQUFlO0FBQ2pCOztBQUVBLG9CQUFvQjs7QUFFcEI7RUFDRSx5Q0FBeUM7QUFDM0M7O0FBRUE7RUFDRSxjQUFjO0VBQ2QsZUFBZTtFQUNmLGtCQUFrQjtBQUNwQjs7QUFFQTtFQUNFLFdBQVc7RUFDWCxvQkFBYTtFQUFiLGFBQWE7RUFDYiw4QkFBbUI7RUFBbkIsNkJBQW1CO1VBQW5CLG1CQUFtQjtBQUNyQjs7QUFFQTtFQUNFLFVBQVU7RUFDVixvQkFBYTtFQUFiLGFBQWE7RUFDYiw0QkFBc0I7RUFBdEIsNkJBQXNCO1VBQXRCLHNCQUFzQjtFQUN0QiwwQkFBb0I7VUFBcEIsb0JBQW9CO0VBQ3BCLGtCQUFrQjtBQUNwQjs7QUFFQTtFQUNFLFVBQVU7RUFDVixXQUFXO0VBQ1gseUJBQXlCO0VBQ3pCLDBCQUEwQjtFQUMxQix3QkFBd0I7RUFDeEIsMkJBQTJCO0VBQzNCLFlBQVk7RUFDWixvQkFBb0I7QUFDdEI7O0FBRUE7Ozs7Ozs7OztHQVNHOztBQUVIOzs7Ozs7Ozs7R0FTRzs7QUFFSDtFQUNFLHFCQUFxQjtBQUN2QiIsImZpbGUiOiJzcmMvYXBwL2V4aXQtY29kZS1kZXRhaWwvZXhpdC1jb2RlLWRldGFpbC5jb21wb25lbnQuY3NzIiwic291cmNlc0NvbnRlbnQiOlsiKltkYXRhLWRlc2NyXSB7XG4gIHBvc2l0aW9uOiByZWxhdGl2ZTtcbiAgY3Vyc29yOiBoZWxwO1xufVxuXG4qW2RhdGEtZGVzY3JdOmFmdGVyIHtcbiAgdmVydGljYWwtYWxpZ246IHRvcDtcbiAgY29sb3I6IGluaGVyaXQ7XG4gIGZvbnQtc2l6ZTogc21hbGw7XG4gIGNvbnRlbnQ6IFwiP1wiO1xufVxuXG4qW2RhdGEtZGVzY3JdOmhvdmVyOjphZnRlcixcbipbZGF0YS1kZXNjcl06Zm9jdXM6OmFmdGVyIHtcbiAgY29udGVudDogYXR0cihkYXRhLWRlc2NyKTtcblxuICBwb3NpdGlvbjogYWJzb2x1dGU7XG4gIGxlZnQ6IGF1dG87XG4gIG1pbi13aWR0aDogMjAwcHg7XG4gIGJvcmRlcjogMXB4ICNhYWFhYWEgc29saWQ7XG4gIGJvcmRlci1yYWRpdXM6IDEwcHg7XG4gIGJhY2tncm91bmQtY29sb3I6ICMwYjRhOTI7XG4gIHBhZGRpbmc6IDEycHg7XG4gIGNvbG9yOiAjZTBlMGUwO1xuXG4gIGZvbnQtc2l6ZTogMTRweDtcbiAgZm9udC1zdHlsZTogbm9ybWFsO1xuICBmb250LXdlaWdodDogbGlnaHRlcjtcbiAgei1pbmRleDogMTtcbiAgdGV4dC1hbGlnbjogY2VudGVyO1xuICBvcGFjaXR5OiAwLjk7XG4gIHRyYW5zaXRpb246IG9wYWNpdHkgMXM7XG59XG5cbm9wdGlvblt0aXRsZV06aG92ZXI6YWZ0ZXIsXG5vcHRpb25bdGl0bGVdOmZvY3VzOmFmdGVyIHtcbiAgY29udGVudDogYXR0cih0aXRsZSk7XG59XG5cbi8qIFRvb2x0aXAgY29udGFpbmVyXG4udG9vbHRpcCB7XG4gIHBvc2l0aW9uOiByZWxhdGl2ZTtcbn1cblxuLyogVG9vbHRpcCB0ZXh0XG4udG9vbHRpcCAudG9vbHRpcHRleHQge1xuICB2aXNpYmlsaXR5OiBoaWRkZW47XG4gIHdpZHRoOiAyMDBweDtcbiAgYmFja2dyb3VuZC1jb2xvcjogIzU1NTtcbiAgY29sb3I6ICNmZmY7XG4gIHRleHQtYWxpZ246IGNlbnRlcjtcbiAgcGFkZGluZzogMTBweCAwO1xuICBib3JkZXItcmFkaXVzOiA2cHg7XG4gIG1hcmdpbjogMTBweDtcbiAgZm9udC1zaXplOiBzbWFsbDtcblxuICAvKiBQb3NpdGlvbiB0aGUgdG9vbHRpcCB0ZXh0XG4gIHBvc2l0aW9uOiBhYnNvbHV0ZTtcbiAgei1pbmRleDogMTtcbiAgYm90dG9tOiAxMjUlO1xuICBsZWZ0OiA1MCU7XG4gIG1hcmdpbi1sZWZ0OiAtMTAwcHg7XG5cbiAgLyogRmFkZSBpbiB0b29sdGlwXG4gIG9wYWNpdHk6IDA7XG4gIHRyYW5zaXRpb246IG9wYWNpdHkgMC41cztcbn1cblxuLnRvb2x0aXA6OmFmdGVyIHtcbiAgdmVydGljYWwtYWxpZ246IHRvcDtcbiAgY29sb3I6IGluaGVyaXQ7XG4gIGZvbnQtc2l6ZTogc21hbGw7XG4gIGNvbnRlbnQ6IFwiP1wiO1xufVxuXG4vKiBUb29sdGlwIGFycm93XG4udG9vbHRpcCAudG9vbHRpcHRleHQ6OmFmdGVyIHtcbiAgY29udGVudDogXCJcIjtcbiAgcG9zaXRpb246IGFic29sdXRlO1xuICB0b3A6IDEwMCU7XG4gIGxlZnQ6IDUwJTtcbiAgbWFyZ2luLWxlZnQ6IC01cHg7XG4gIGJvcmRlci13aWR0aDogNXB4O1xuICBib3JkZXItc3R5bGU6IHNvbGlkO1xuICBib3JkZXItY29sb3I6ICM1NTUgdHJhbnNwYXJlbnQgdHJhbnNwYXJlbnQgdHJhbnNwYXJlbnQ7XG59XG5cbi8qIFNob3cgdGhlIHRvb2x0aXAgdGV4dCB3aGVuIHlvdSBtb3VzZSBvdmVyIHRoZSB0b29sdGlwIGNvbnRhaW5lclxuLnRvb2x0aXA6aG92ZXIgLnRvb2x0aXB0ZXh0IHtcbiAgdmlzaWJpbGl0eTogdmlzaWJsZTtcbiAgb3BhY2l0eTogMTtcbn0gKi9cbiIsIkBpbXBvcnQgXCIuL3Rvb2x0aXAuY3NzXCI7XG5cbioge1xuICBjb2xvcjogI2RkZDtcbiAgYmFja2dyb3VuZC1jb2xvcjogIzIyMjtcbiAgZm9udC1mYW1pbHk6IEFyaWFsLCBIZWx2ZXRpY2EsIHNhbnMtc2VyaWY7XG4gIGJvcmRlci1jb2xvcjogI2RkZDtcbn1cblxuLyogQXBwbGljYXRpb24td2lkZSBTdHlsZXMgKi9cbmgxIHtcbiAgY29sb3I6IHJnYig3NCwgMTY1LCAyNTUpO1xuICBmb250LWZhbWlseTogQXJpYWwsIEhlbHZldGljYSwgc2Fucy1zZXJpZjtcbiAgZm9udC1zaXplOiAyNTAlO1xufVxuXG5oMiB7XG4gIGZvbnQtZmFtaWx5OiBBcmlhbCwgSGVsdmV0aWNhLCBzYW5zLXNlcmlmO1xuICBmb250LXdlaWdodDogYm9sZGVyO1xufVxuXG5oMyB7XG4gIGZvbnQtZmFtaWx5OiBBcmlhbCwgSGVsdmV0aWNhLCBzYW5zLXNlcmlmO1xuICBmb250LXdlaWdodDogbm9ybWFsO1xuICBwYWRkaW5nLXRvcDogMWVtO1xufVxuXG5ib2R5IHtcbiAgbWFyZ2luOiAyZW07XG59XG5cbmlucHV0LFxudGV4dGFyZWEsXG5zZWxlY3Qge1xuICBmb250LXNpemU6IGxhcmdlO1xuICBjb2xvcjogcmdiKDYxLCAyMjgsIDE5Mik7XG4gIGJvcmRlci10b3Atc3R5bGU6IGhpZGRlbjtcbiAgYm9yZGVyLWxlZnQtc3R5bGU6IGhpZGRlbjtcbiAgYm9yZGVyLXJpZ2h0LXN0eWxlOiBoaWRkZW47XG59XG5cbmlucHV0W3R5cGU9XCJ0ZXh0XCJdLFxuaW5wdXRbdHlwZT1cInVybFwiXSxcbnRleHRhcmVhIHtcbiAgbWFyZ2luLWJvdHRvbTogMC41ZW07XG4gIG1hcmdpbi1sZWZ0OiAwLjVlbTtcbiAgbWFyZ2luLXJpZ2h0OiAwLjVlbTtcbiAgbWFyZ2luLXRvcDogbm9uZTtcbiAgYm9yZGVyLXRvcC13aWR0aDogMHB4O1xuICBib3JkZXItdG9wLXN0eWxlOiBoaWRkZW47XG4gIGJvcmRlci1sZWZ0LXN0eWxlOiBoaWRkZW47XG4gIGJvcmRlci1yaWdodC1zdHlsZTogaGlkZGVuO1xuICBib3JkZXItbGVmdC13aWR0aDogMHB4O1xuICBib3JkZXItcmlnaHQtd2lkdGg6IDBweDtcbiAgd2lkdGg6IDkwJTtcbiAgZGlzcGxheTogYmxvY2s7XG59XG5cbmlucHV0W3R5cGU9XCJudW1iZXJcIl0ge1xuICB3aWR0aDogNTBweDtcbiAgdGV4dC1hbGlnbjogY2VudGVyO1xuICBhcHBlYXJhbmNlOiB0ZXh0ZmllbGQ7XG59XG5cbnRleHRhcmVhIHtcbiAgd2lkdGg6IDkwJTtcbiAgcmVzaXplOiB2ZXJ0aWNhbDtcbn1cblxuYnV0dG9uIHtcbiAgY29sb3I6ICNkZGQ7XG4gIGNvbG9yOiByZ2IoNjEsIDIyOCwgMTkyKTtcbiAgYmFja2dyb3VuZC1jb2xvcjogcmdiKDYxLCAyMjgsIDE5Mik7XG4gIGJhY2tncm91bmQtY29sb3I6ICMyMjI7XG4gIGNvbG9yOiByZ2IoNjEsIDIyOCwgMTkyKTtcbiAgYm9yZGVyLWNvbG9yOiAjZGRkO1xuICBmb250LWZhbWlseTogQXJpYWwsIEhlbHZldGljYSwgc2Fucy1zZXJpZjtcbiAgZm9udC13ZWlnaHQ6IGJvbGQ7XG4gIG1hcmdpbi1ib3R0b206IDAuNWVtO1xuICBtYXJnaW4tbGVmdDogMC41ZW07XG4gIG1hcmdpbi1yaWdodDogMC41ZW07XG4gIG1hcmdpbi10b3A6IDAuNWVtO1xuICBib3JkZXItcmFkaXVzOiA1cHg7XG4gIG1pbi1oZWlnaHQ6IDMwcHg7XG4gIHRleHQtb3ZlcmZsb3c6IGNsaXA7XG59XG5cbmJ1dHRvbiA+IGZhLWljb24ge1xuICBjb2xvcjogaW5oZXJpdDtcbiAgYmFja2dyb3VuZC1jb2xvcjogaW5oZXJpdDtcbn1cblxuYnV0dG9uOmRpc2FibGVkIHtcbiAgY29sb3I6ICNhYWE7XG4gIGJhY2tncm91bmQtY29sb3I6ICMyMjI7XG4gIGZvbnQtd2VpZ2h0OiBsaWdodGVyO1xufVxuXG5idXR0b24ubmV4dCB7XG4gIHJpZ2h0OiAwcHg7XG4gIGNvbG9yOiByZ2IoNjEsIDIyOCwgMTkyKTtcbiAgYm9yZGVyLWNvbG9yOiByZ2IoNjEsIDIyOCwgMTkyKTtcbn1cblxuc2VsZWN0IHtcbiAgbWluLXdpZHRoOiAxMGVtO1xufVxuXG4vKiBldmVyeXdoZXJlIGVsc2UgKi9cblxuKiB7XG4gIGZvbnQtZmFtaWx5OiBBcmlhbCwgSGVsdmV0aWNhLCBzYW5zLXNlcmlmO1xufVxuXG5sYWJlbCB7XG4gIGRpc3BsYXk6IGJsb2NrO1xuICBtYXJnaW4tdG9wOiAxZW07XG4gIG1hcmdpbi1ib3R0b206IDFlbTtcbn1cblxuLm1haW4ge1xuICB3aWR0aDogMTAwJTtcbiAgZGlzcGxheTogZmxleDtcbiAgZmxleC1kaXJlY3Rpb246IHJvdztcbn1cblxuLm5hdmlnYXRpb24ge1xuICB3aWR0aDogMjAlO1xuICBkaXNwbGF5OiBmbGV4O1xuICBmbGV4LWRpcmVjdGlvbjogY29sdW1uO1xuICBhbGlnbi1pdGVtczogc3RyZXRjaDtcbiAgbWFyZ2luLXJpZ2h0OiAyMHB4O1xufVxuXG4uc3RlcC1kZXRhaWwge1xuICB3aWR0aDogODAlO1xuICBib3JkZXI6IDFweDtcbiAgYm9yZGVyLWxlZnQtc3R5bGU6IGRhc2hlZDtcbiAgYm9yZGVyLXJpZ2h0LXN0eWxlOiBoaWRkZW47XG4gIGJvcmRlci10b3Atc3R5bGU6IGhpZGRlbjtcbiAgYm9yZGVyLWJvdHRvbS1zdHlsZTogaGlkZGVuO1xuICBwYWRkaW5nOiAxZW07XG4gIG1hcmdpbi1ib3R0b206IDAuNWVtO1xufVxuXG4vKiAuc3RlcC1kZXRhaWwge1xuICB3aWR0aDogODAlO1xuICBib3JkZXI6IDFweDtcbiAgYm9yZGVyLWxlZnQtc3R5bGU6IGRhc2hlZDtcbiAgYm9yZGVyLXJpZ2h0LXN0eWxlOiBoaWRkZW47XG4gIGJvcmRlci10b3Atc3R5bGU6IGhpZGRlbjtcbiAgYm9yZGVyLWJvdHRvbS1zdHlsZTogaGlkZGVuO1xuICBwYWRkaW5nOiAxZW07XG4gIG1hcmdpbi1ib3R0b206IDAuNWVtO1xufSAqL1xuXG4vKiAubW9kZWwge1xuICB3aWR0aDogODAlO1xuICBib3JkZXI6IDFweDtcbiAgYm9yZGVyLWxlZnQtc3R5bGU6IGRhc2hlZDtcbiAgYm9yZGVyLXJpZ2h0LXN0eWxlOiBoaWRkZW47XG4gIGJvcmRlci10b3Atc3R5bGU6IGhpZGRlbjtcbiAgYm9yZGVyLWJvdHRvbS1zdHlsZTogaGlkZGVuO1xuICBwYWRkaW5nOiAxZW07XG4gIG1hcmdpbi1ib3R0b206IDAuNWVtO1xufSAqL1xuXG5pbnB1dDppbnZhbGlkIHtcbiAgYm9yZGVyOiByZWQgc29saWQgM3B4O1xufVxuIl19 */";
    /***/
  },

  /***/
  "./src/app/exit-code-detail/exit-code-detail.component.ts":
  /*!****************************************************************!*\
    !*** ./src/app/exit-code-detail/exit-code-detail.component.ts ***!
    \****************************************************************/

  /*! exports provided: ExitCodeDetailComponent */

  /***/
  function srcAppExitCodeDetailExitCodeDetailComponentTs(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "ExitCodeDetailComponent", function () {
      return ExitCodeDetailComponent;
    });
    /* harmony import */


    var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
    /*! tslib */
    "./node_modules/tslib/tslib.es6.js");
    /* harmony import */


    var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
    /*! @angular/core */
    "./node_modules/@angular/core/fesm2015/core.js");
    /* harmony import */


    var src_model_tool_description__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(
    /*! src/model/tool-description */
    "./src/model/tool-description.ts");
    /* harmony import */


    var _lang__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(
    /*! ../lang */
    "./src/app/lang.ts");

    var ExitCodeDetailComponent =
    /*#__PURE__*/
    function () {
      function ExitCodeDetailComponent() {
        _classCallCheck(this, ExitCodeDetailComponent);

        this.keys = Object.keys;
        this.terminationStatus = src_model_tool_description__WEBPACK_IMPORTED_MODULE_2__["TerminationStatus"];
        this.lang = _lang__WEBPACK_IMPORTED_MODULE_3__["Lang"].getInstance();
      }

      _createClass(ExitCodeDetailComponent, [{
        key: "ngOnInit",
        value: function ngOnInit() {}
      }]);

      return ExitCodeDetailComponent;
    }();

    tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Input"])()], ExitCodeDetailComponent.prototype, "exitCode", void 0);
    ExitCodeDetailComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
      selector: "app-exit-code-detail",
      template: tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(
      /*! raw-loader!./exit-code-detail.component.html */
      "./node_modules/raw-loader/dist/cjs.js!./src/app/exit-code-detail/exit-code-detail.component.html")).default,
      styles: [tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(
      /*! ./exit-code-detail.component.css */
      "./src/app/exit-code-detail/exit-code-detail.component.css")).default]
    })], ExitCodeDetailComponent);
    /***/
  },

  /***/
  "./src/app/functional-entity-detail/functional-entity-detail.component.css":
  /*!*********************************************************************************!*\
    !*** ./src/app/functional-entity-detail/functional-entity-detail.component.css ***!
    \*********************************************************************************/

  /*! exports provided: default */

  /***/
  function srcAppFunctionalEntityDetailFunctionalEntityDetailComponentCss(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony default export */


    __webpack_exports__["default"] = "\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL2Z1bmN0aW9uYWwtZW50aXR5LWRldGFpbC9mdW5jdGlvbmFsLWVudGl0eS1kZXRhaWwuY29tcG9uZW50LmNzcyJ9 */";
    /***/
  },

  /***/
  "./src/app/functional-entity-detail/functional-entity-detail.component.ts":
  /*!********************************************************************************!*\
    !*** ./src/app/functional-entity-detail/functional-entity-detail.component.ts ***!
    \********************************************************************************/

  /*! exports provided: FunctionalEntityDetailComponent */

  /***/
  function srcAppFunctionalEntityDetailFunctionalEntityDetailComponentTs(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "FunctionalEntityDetailComponent", function () {
      return FunctionalEntityDetailComponent;
    });
    /* harmony import */


    var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
    /*! tslib */
    "./node_modules/tslib/tslib.es6.js");
    /* harmony import */


    var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
    /*! @angular/core */
    "./node_modules/@angular/core/fesm2015/core.js");
    /* harmony import */


    var src_model_tool_description__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(
    /*! src/model/tool-description */
    "./src/model/tool-description.ts");

    var FunctionalEntityDetailComponent =
    /*#__PURE__*/
    function () {
      function FunctionalEntityDetailComponent() {
        _classCallCheck(this, FunctionalEntityDetailComponent);
      }

      _createClass(FunctionalEntityDetailComponent, [{
        key: "ngOnInit",
        value: function ngOnInit() {}
      }, {
        key: "isExitCode",
        value: function isExitCode(e) {
          return e instanceof src_model_tool_description__WEBPACK_IMPORTED_MODULE_2__["ExitCode"];
        }
      }, {
        key: "isCommandLineEntryList",
        value: function isCommandLineEntryList(e) {
          return e instanceof src_model_tool_description__WEBPACK_IMPORTED_MODULE_2__["CommandLineEntryList"];
        }
      }]);

      return FunctionalEntityDetailComponent;
    }();

    tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Input"])()], FunctionalEntityDetailComponent.prototype, "detailedComponent", void 0);
    tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Input"])()], FunctionalEntityDetailComponent.prototype, "activity", void 0);
    FunctionalEntityDetailComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
      selector: "app-functional-entity-detail",
      template: tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(
      /*! raw-loader!./functional-entity-detail.component.html */
      "./node_modules/raw-loader/dist/cjs.js!./src/app/functional-entity-detail/functional-entity-detail.component.html")).default,
      styles: [tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(
      /*! ./functional-entity-detail.component.css */
      "./src/app/functional-entity-detail/functional-entity-detail.component.css")).default]
    })], FunctionalEntityDetailComponent);
    /***/
  },

  /***/
  "./src/app/functional-entity/functional-entity.component.css":
  /*!*******************************************************************!*\
    !*** ./src/app/functional-entity/functional-entity.component.css ***!
    \*******************************************************************/

  /*! exports provided: default */

  /***/
  function srcAppFunctionalEntityFunctionalEntityComponentCss(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony default export */


    __webpack_exports__["default"] = "*[data-descr] {\n  position: relative;\n  cursor: help;\n}\n\n*[data-descr]:after {\n  vertical-align: top;\n  color: inherit;\n  font-size: small;\n  content: \"?\";\n}\n\n*[data-descr]:hover::after,\n*[data-descr]:focus::after {\n  content: attr(data-descr);\n\n  position: absolute;\n  left: auto;\n  min-width: 200px;\n  border: 1px #aaaaaa solid;\n  border-radius: 10px;\n  background-color: #0b4a92;\n  padding: 12px;\n  color: #e0e0e0;\n\n  font-size: 14px;\n  font-style: normal;\n  font-weight: lighter;\n  z-index: 1;\n  text-align: center;\n  opacity: 0.9;\n  -webkit-transition: opacity 1s;\n  transition: opacity 1s;\n}\n\noption[title]:hover:after,\noption[title]:focus:after {\n  content: attr(title);\n}\n\n/* Tooltip container\n.tooltip {\n  position: relative;\n}\n\n/* Tooltip text\n.tooltip .tooltiptext {\n  visibility: hidden;\n  width: 200px;\n  background-color: #555;\n  color: #fff;\n  text-align: center;\n  padding: 10px 0;\n  border-radius: 6px;\n  margin: 10px;\n  font-size: small;\n\n  /* Position the tooltip text\n  position: absolute;\n  z-index: 1;\n  bottom: 125%;\n  left: 50%;\n  margin-left: -100px;\n\n  /* Fade in tooltip\n  opacity: 0;\n  transition: opacity 0.5s;\n}\n\n.tooltip::after {\n  vertical-align: top;\n  color: inherit;\n  font-size: small;\n  content: \"?\";\n}\n\n/* Tooltip arrow\n.tooltip .tooltiptext::after {\n  content: \"\";\n  position: absolute;\n  top: 100%;\n  left: 50%;\n  margin-left: -5px;\n  border-width: 5px;\n  border-style: solid;\n  border-color: #555 transparent transparent transparent;\n}\n\n/* Show the tooltip text when you mouse over the tooltip container\n.tooltip:hover .tooltiptext {\n  visibility: visible;\n  opacity: 1;\n} */\n\n* {\n  color: #ddd;\n  background-color: #222;\n  font-family: Arial, Helvetica, sans-serif;\n  border-color: #ddd;\n}\n\n/* Application-wide Styles */\n\nh1 {\n  color: rgb(74, 165, 255);\n  font-family: Arial, Helvetica, sans-serif;\n  font-size: 250%;\n}\n\nh2 {\n  font-family: Arial, Helvetica, sans-serif;\n  font-weight: bolder;\n}\n\nh3 {\n  font-family: Arial, Helvetica, sans-serif;\n  font-weight: normal;\n  padding-top: 1em;\n}\n\nbody {\n  margin: 2em;\n}\n\ninput,\ntextarea,\nselect {\n  font-size: large;\n  color: rgb(61, 228, 192);\n  border-top-style: hidden;\n  border-left-style: hidden;\n  border-right-style: hidden;\n}\n\ninput[type=\"text\"],\ninput[type=\"url\"],\ntextarea {\n  margin-bottom: 0.5em;\n  margin-left: 0.5em;\n  margin-right: 0.5em;\n  margin-top: none;\n  border-top-width: 0px;\n  border-top-style: hidden;\n  border-left-style: hidden;\n  border-right-style: hidden;\n  border-left-width: 0px;\n  border-right-width: 0px;\n  width: 90%;\n  display: block;\n}\n\ninput[type=\"number\"] {\n  width: 50px;\n  text-align: center;\n  -webkit-appearance: textfield;\n     -moz-appearance: textfield;\n          appearance: textfield;\n}\n\ntextarea {\n  width: 90%;\n  resize: vertical;\n}\n\nbutton {\n  color: #ddd;\n  color: rgb(61, 228, 192);\n  background-color: rgb(61, 228, 192);\n  background-color: #222;\n  color: rgb(61, 228, 192);\n  border-color: #ddd;\n  font-family: Arial, Helvetica, sans-serif;\n  font-weight: bold;\n  margin-bottom: 0.5em;\n  margin-left: 0.5em;\n  margin-right: 0.5em;\n  margin-top: 0.5em;\n  border-radius: 5px;\n  min-height: 30px;\n  text-overflow: clip;\n}\n\nbutton > fa-icon {\n  color: inherit;\n  background-color: inherit;\n}\n\nbutton:disabled {\n  color: #aaa;\n  background-color: #222;\n  font-weight: lighter;\n}\n\nbutton.next {\n  right: 0px;\n  color: rgb(61, 228, 192);\n  border-color: rgb(61, 228, 192);\n}\n\nselect {\n  min-width: 10em;\n}\n\n/* everywhere else */\n\n* {\n  font-family: Arial, Helvetica, sans-serif;\n}\n\nlabel {\n  display: block;\n  margin-top: 1em;\n  margin-bottom: 1em;\n}\n\n.main {\n  width: 100%;\n  display: -webkit-box;\n  display: flex;\n  -webkit-box-orient: horizontal;\n  -webkit-box-direction: normal;\n          flex-direction: row;\n}\n\n.navigation {\n  width: 20%;\n  display: -webkit-box;\n  display: flex;\n  -webkit-box-orient: vertical;\n  -webkit-box-direction: normal;\n          flex-direction: column;\n  -webkit-box-align: stretch;\n          align-items: stretch;\n  margin-right: 20px;\n}\n\n.step-detail {\n  width: 80%;\n  border: 1px;\n  border-left-style: dashed;\n  border-right-style: hidden;\n  border-top-style: hidden;\n  border-bottom-style: hidden;\n  padding: 1em;\n  margin-bottom: 0.5em;\n}\n\n/* .step-detail {\n  width: 80%;\n  border: 1px;\n  border-left-style: dashed;\n  border-right-style: hidden;\n  border-top-style: hidden;\n  border-bottom-style: hidden;\n  padding: 1em;\n  margin-bottom: 0.5em;\n} */\n\n/* .model {\n  width: 80%;\n  border: 1px;\n  border-left-style: dashed;\n  border-right-style: hidden;\n  border-top-style: hidden;\n  border-bottom-style: hidden;\n  padding: 1em;\n  margin-bottom: 0.5em;\n} */\n\ninput:invalid {\n  border: red solid 3px;\n}\n\n.model {\n  width: 40%;\n}\n\n.detail {\n  width: 40%;\n}\n\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbInNyYy9hcHAvdG9vbHRpcC5jc3MiLCJzcmMvYXBwL2FwcC5jb21wb25lbnQuY3NzIiwic3JjL2FwcC9mdW5jdGlvbmFsLWVudGl0eS9mdW5jdGlvbmFsLWVudGl0eS5jb21wb25lbnQuY3NzIl0sIm5hbWVzIjpbXSwibWFwcGluZ3MiOiJBQUFBO0VBQ0Usa0JBQWtCO0VBQ2xCLFlBQVk7QUFDZDs7QUFFQTtFQUNFLG1CQUFtQjtFQUNuQixjQUFjO0VBQ2QsZ0JBQWdCO0VBQ2hCLFlBQVk7QUFDZDs7QUFFQTs7RUFFRSx5QkFBeUI7O0VBRXpCLGtCQUFrQjtFQUNsQixVQUFVO0VBQ1YsZ0JBQWdCO0VBQ2hCLHlCQUF5QjtFQUN6QixtQkFBbUI7RUFDbkIseUJBQXlCO0VBQ3pCLGFBQWE7RUFDYixjQUFjOztFQUVkLGVBQWU7RUFDZixrQkFBa0I7RUFDbEIsb0JBQW9CO0VBQ3BCLFVBQVU7RUFDVixrQkFBa0I7RUFDbEIsWUFBWTtFQUNaLDhCQUFzQjtFQUF0QixzQkFBc0I7QUFDeEI7O0FBRUE7O0VBRUUsb0JBQW9CO0FBQ3RCOztBQUVBOzs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7O0dBb0RHOztBQ3pGSDtFQUNFLFdBQVc7RUFDWCxzQkFBc0I7RUFDdEIseUNBQXlDO0VBQ3pDLGtCQUFrQjtBQUNwQjs7QUFFQSw0QkFBNEI7O0FBQzVCO0VBQ0Usd0JBQXdCO0VBQ3hCLHlDQUF5QztFQUN6QyxlQUFlO0FBQ2pCOztBQUVBO0VBQ0UseUNBQXlDO0VBQ3pDLG1CQUFtQjtBQUNyQjs7QUFFQTtFQUNFLHlDQUF5QztFQUN6QyxtQkFBbUI7RUFDbkIsZ0JBQWdCO0FBQ2xCOztBQUVBO0VBQ0UsV0FBVztBQUNiOztBQUVBOzs7RUFHRSxnQkFBZ0I7RUFDaEIsd0JBQXdCO0VBQ3hCLHdCQUF3QjtFQUN4Qix5QkFBeUI7RUFDekIsMEJBQTBCO0FBQzVCOztBQUVBOzs7RUFHRSxvQkFBb0I7RUFDcEIsa0JBQWtCO0VBQ2xCLG1CQUFtQjtFQUNuQixnQkFBZ0I7RUFDaEIscUJBQXFCO0VBQ3JCLHdCQUF3QjtFQUN4Qix5QkFBeUI7RUFDekIsMEJBQTBCO0VBQzFCLHNCQUFzQjtFQUN0Qix1QkFBdUI7RUFDdkIsVUFBVTtFQUNWLGNBQWM7QUFDaEI7O0FBRUE7RUFDRSxXQUFXO0VBQ1gsa0JBQWtCO0VBQ2xCLDZCQUFxQjtLQUFyQiwwQkFBcUI7VUFBckIscUJBQXFCO0FBQ3ZCOztBQUVBO0VBQ0UsVUFBVTtFQUNWLGdCQUFnQjtBQUNsQjs7QUFFQTtFQUNFLFdBQVc7RUFDWCx3QkFBd0I7RUFDeEIsbUNBQW1DO0VBQ25DLHNCQUFzQjtFQUN0Qix3QkFBd0I7RUFDeEIsa0JBQWtCO0VBQ2xCLHlDQUF5QztFQUN6QyxpQkFBaUI7RUFDakIsb0JBQW9CO0VBQ3BCLGtCQUFrQjtFQUNsQixtQkFBbUI7RUFDbkIsaUJBQWlCO0VBQ2pCLGtCQUFrQjtFQUNsQixnQkFBZ0I7RUFDaEIsbUJBQW1CO0FBQ3JCOztBQUVBO0VBQ0UsY0FBYztFQUNkLHlCQUF5QjtBQUMzQjs7QUFFQTtFQUNFLFdBQVc7RUFDWCxzQkFBc0I7RUFDdEIsb0JBQW9CO0FBQ3RCOztBQUVBO0VBQ0UsVUFBVTtFQUNWLHdCQUF3QjtFQUN4QiwrQkFBK0I7QUFDakM7O0FBRUE7RUFDRSxlQUFlO0FBQ2pCOztBQUVBLG9CQUFvQjs7QUFFcEI7RUFDRSx5Q0FBeUM7QUFDM0M7O0FBRUE7RUFDRSxjQUFjO0VBQ2QsZUFBZTtFQUNmLGtCQUFrQjtBQUNwQjs7QUFFQTtFQUNFLFdBQVc7RUFDWCxvQkFBYTtFQUFiLGFBQWE7RUFDYiw4QkFBbUI7RUFBbkIsNkJBQW1CO1VBQW5CLG1CQUFtQjtBQUNyQjs7QUFFQTtFQUNFLFVBQVU7RUFDVixvQkFBYTtFQUFiLGFBQWE7RUFDYiw0QkFBc0I7RUFBdEIsNkJBQXNCO1VBQXRCLHNCQUFzQjtFQUN0QiwwQkFBb0I7VUFBcEIsb0JBQW9CO0VBQ3BCLGtCQUFrQjtBQUNwQjs7QUFFQTtFQUNFLFVBQVU7RUFDVixXQUFXO0VBQ1gseUJBQXlCO0VBQ3pCLDBCQUEwQjtFQUMxQix3QkFBd0I7RUFDeEIsMkJBQTJCO0VBQzNCLFlBQVk7RUFDWixvQkFBb0I7QUFDdEI7O0FBRUE7Ozs7Ozs7OztHQVNHOztBQUVIOzs7Ozs7Ozs7R0FTRzs7QUFFSDtFQUNFLHFCQUFxQjtBQUN2Qjs7QUN2S0E7RUFDRSxVQUFVO0FBQ1o7O0FBRUE7RUFDRSxVQUFVO0FBQ1oiLCJmaWxlIjoic3JjL2FwcC9mdW5jdGlvbmFsLWVudGl0eS9mdW5jdGlvbmFsLWVudGl0eS5jb21wb25lbnQuY3NzIiwic291cmNlc0NvbnRlbnQiOlsiKltkYXRhLWRlc2NyXSB7XG4gIHBvc2l0aW9uOiByZWxhdGl2ZTtcbiAgY3Vyc29yOiBoZWxwO1xufVxuXG4qW2RhdGEtZGVzY3JdOmFmdGVyIHtcbiAgdmVydGljYWwtYWxpZ246IHRvcDtcbiAgY29sb3I6IGluaGVyaXQ7XG4gIGZvbnQtc2l6ZTogc21hbGw7XG4gIGNvbnRlbnQ6IFwiP1wiO1xufVxuXG4qW2RhdGEtZGVzY3JdOmhvdmVyOjphZnRlcixcbipbZGF0YS1kZXNjcl06Zm9jdXM6OmFmdGVyIHtcbiAgY29udGVudDogYXR0cihkYXRhLWRlc2NyKTtcblxuICBwb3NpdGlvbjogYWJzb2x1dGU7XG4gIGxlZnQ6IGF1dG87XG4gIG1pbi13aWR0aDogMjAwcHg7XG4gIGJvcmRlcjogMXB4ICNhYWFhYWEgc29saWQ7XG4gIGJvcmRlci1yYWRpdXM6IDEwcHg7XG4gIGJhY2tncm91bmQtY29sb3I6ICMwYjRhOTI7XG4gIHBhZGRpbmc6IDEycHg7XG4gIGNvbG9yOiAjZTBlMGUwO1xuXG4gIGZvbnQtc2l6ZTogMTRweDtcbiAgZm9udC1zdHlsZTogbm9ybWFsO1xuICBmb250LXdlaWdodDogbGlnaHRlcjtcbiAgei1pbmRleDogMTtcbiAgdGV4dC1hbGlnbjogY2VudGVyO1xuICBvcGFjaXR5OiAwLjk7XG4gIHRyYW5zaXRpb246IG9wYWNpdHkgMXM7XG59XG5cbm9wdGlvblt0aXRsZV06aG92ZXI6YWZ0ZXIsXG5vcHRpb25bdGl0bGVdOmZvY3VzOmFmdGVyIHtcbiAgY29udGVudDogYXR0cih0aXRsZSk7XG59XG5cbi8qIFRvb2x0aXAgY29udGFpbmVyXG4udG9vbHRpcCB7XG4gIHBvc2l0aW9uOiByZWxhdGl2ZTtcbn1cblxuLyogVG9vbHRpcCB0ZXh0XG4udG9vbHRpcCAudG9vbHRpcHRleHQge1xuICB2aXNpYmlsaXR5OiBoaWRkZW47XG4gIHdpZHRoOiAyMDBweDtcbiAgYmFja2dyb3VuZC1jb2xvcjogIzU1NTtcbiAgY29sb3I6ICNmZmY7XG4gIHRleHQtYWxpZ246IGNlbnRlcjtcbiAgcGFkZGluZzogMTBweCAwO1xuICBib3JkZXItcmFkaXVzOiA2cHg7XG4gIG1hcmdpbjogMTBweDtcbiAgZm9udC1zaXplOiBzbWFsbDtcblxuICAvKiBQb3NpdGlvbiB0aGUgdG9vbHRpcCB0ZXh0XG4gIHBvc2l0aW9uOiBhYnNvbHV0ZTtcbiAgei1pbmRleDogMTtcbiAgYm90dG9tOiAxMjUlO1xuICBsZWZ0OiA1MCU7XG4gIG1hcmdpbi1sZWZ0OiAtMTAwcHg7XG5cbiAgLyogRmFkZSBpbiB0b29sdGlwXG4gIG9wYWNpdHk6IDA7XG4gIHRyYW5zaXRpb246IG9wYWNpdHkgMC41cztcbn1cblxuLnRvb2x0aXA6OmFmdGVyIHtcbiAgdmVydGljYWwtYWxpZ246IHRvcDtcbiAgY29sb3I6IGluaGVyaXQ7XG4gIGZvbnQtc2l6ZTogc21hbGw7XG4gIGNvbnRlbnQ6IFwiP1wiO1xufVxuXG4vKiBUb29sdGlwIGFycm93XG4udG9vbHRpcCAudG9vbHRpcHRleHQ6OmFmdGVyIHtcbiAgY29udGVudDogXCJcIjtcbiAgcG9zaXRpb246IGFic29sdXRlO1xuICB0b3A6IDEwMCU7XG4gIGxlZnQ6IDUwJTtcbiAgbWFyZ2luLWxlZnQ6IC01cHg7XG4gIGJvcmRlci13aWR0aDogNXB4O1xuICBib3JkZXItc3R5bGU6IHNvbGlkO1xuICBib3JkZXItY29sb3I6ICM1NTUgdHJhbnNwYXJlbnQgdHJhbnNwYXJlbnQgdHJhbnNwYXJlbnQ7XG59XG5cbi8qIFNob3cgdGhlIHRvb2x0aXAgdGV4dCB3aGVuIHlvdSBtb3VzZSBvdmVyIHRoZSB0b29sdGlwIGNvbnRhaW5lclxuLnRvb2x0aXA6aG92ZXIgLnRvb2x0aXB0ZXh0IHtcbiAgdmlzaWJpbGl0eTogdmlzaWJsZTtcbiAgb3BhY2l0eTogMTtcbn0gKi9cbiIsIkBpbXBvcnQgXCIuL3Rvb2x0aXAuY3NzXCI7XG5cbioge1xuICBjb2xvcjogI2RkZDtcbiAgYmFja2dyb3VuZC1jb2xvcjogIzIyMjtcbiAgZm9udC1mYW1pbHk6IEFyaWFsLCBIZWx2ZXRpY2EsIHNhbnMtc2VyaWY7XG4gIGJvcmRlci1jb2xvcjogI2RkZDtcbn1cblxuLyogQXBwbGljYXRpb24td2lkZSBTdHlsZXMgKi9cbmgxIHtcbiAgY29sb3I6IHJnYig3NCwgMTY1LCAyNTUpO1xuICBmb250LWZhbWlseTogQXJpYWwsIEhlbHZldGljYSwgc2Fucy1zZXJpZjtcbiAgZm9udC1zaXplOiAyNTAlO1xufVxuXG5oMiB7XG4gIGZvbnQtZmFtaWx5OiBBcmlhbCwgSGVsdmV0aWNhLCBzYW5zLXNlcmlmO1xuICBmb250LXdlaWdodDogYm9sZGVyO1xufVxuXG5oMyB7XG4gIGZvbnQtZmFtaWx5OiBBcmlhbCwgSGVsdmV0aWNhLCBzYW5zLXNlcmlmO1xuICBmb250LXdlaWdodDogbm9ybWFsO1xuICBwYWRkaW5nLXRvcDogMWVtO1xufVxuXG5ib2R5IHtcbiAgbWFyZ2luOiAyZW07XG59XG5cbmlucHV0LFxudGV4dGFyZWEsXG5zZWxlY3Qge1xuICBmb250LXNpemU6IGxhcmdlO1xuICBjb2xvcjogcmdiKDYxLCAyMjgsIDE5Mik7XG4gIGJvcmRlci10b3Atc3R5bGU6IGhpZGRlbjtcbiAgYm9yZGVyLWxlZnQtc3R5bGU6IGhpZGRlbjtcbiAgYm9yZGVyLXJpZ2h0LXN0eWxlOiBoaWRkZW47XG59XG5cbmlucHV0W3R5cGU9XCJ0ZXh0XCJdLFxuaW5wdXRbdHlwZT1cInVybFwiXSxcbnRleHRhcmVhIHtcbiAgbWFyZ2luLWJvdHRvbTogMC41ZW07XG4gIG1hcmdpbi1sZWZ0OiAwLjVlbTtcbiAgbWFyZ2luLXJpZ2h0OiAwLjVlbTtcbiAgbWFyZ2luLXRvcDogbm9uZTtcbiAgYm9yZGVyLXRvcC13aWR0aDogMHB4O1xuICBib3JkZXItdG9wLXN0eWxlOiBoaWRkZW47XG4gIGJvcmRlci1sZWZ0LXN0eWxlOiBoaWRkZW47XG4gIGJvcmRlci1yaWdodC1zdHlsZTogaGlkZGVuO1xuICBib3JkZXItbGVmdC13aWR0aDogMHB4O1xuICBib3JkZXItcmlnaHQtd2lkdGg6IDBweDtcbiAgd2lkdGg6IDkwJTtcbiAgZGlzcGxheTogYmxvY2s7XG59XG5cbmlucHV0W3R5cGU9XCJudW1iZXJcIl0ge1xuICB3aWR0aDogNTBweDtcbiAgdGV4dC1hbGlnbjogY2VudGVyO1xuICBhcHBlYXJhbmNlOiB0ZXh0ZmllbGQ7XG59XG5cbnRleHRhcmVhIHtcbiAgd2lkdGg6IDkwJTtcbiAgcmVzaXplOiB2ZXJ0aWNhbDtcbn1cblxuYnV0dG9uIHtcbiAgY29sb3I6ICNkZGQ7XG4gIGNvbG9yOiByZ2IoNjEsIDIyOCwgMTkyKTtcbiAgYmFja2dyb3VuZC1jb2xvcjogcmdiKDYxLCAyMjgsIDE5Mik7XG4gIGJhY2tncm91bmQtY29sb3I6ICMyMjI7XG4gIGNvbG9yOiByZ2IoNjEsIDIyOCwgMTkyKTtcbiAgYm9yZGVyLWNvbG9yOiAjZGRkO1xuICBmb250LWZhbWlseTogQXJpYWwsIEhlbHZldGljYSwgc2Fucy1zZXJpZjtcbiAgZm9udC13ZWlnaHQ6IGJvbGQ7XG4gIG1hcmdpbi1ib3R0b206IDAuNWVtO1xuICBtYXJnaW4tbGVmdDogMC41ZW07XG4gIG1hcmdpbi1yaWdodDogMC41ZW07XG4gIG1hcmdpbi10b3A6IDAuNWVtO1xuICBib3JkZXItcmFkaXVzOiA1cHg7XG4gIG1pbi1oZWlnaHQ6IDMwcHg7XG4gIHRleHQtb3ZlcmZsb3c6IGNsaXA7XG59XG5cbmJ1dHRvbiA+IGZhLWljb24ge1xuICBjb2xvcjogaW5oZXJpdDtcbiAgYmFja2dyb3VuZC1jb2xvcjogaW5oZXJpdDtcbn1cblxuYnV0dG9uOmRpc2FibGVkIHtcbiAgY29sb3I6ICNhYWE7XG4gIGJhY2tncm91bmQtY29sb3I6ICMyMjI7XG4gIGZvbnQtd2VpZ2h0OiBsaWdodGVyO1xufVxuXG5idXR0b24ubmV4dCB7XG4gIHJpZ2h0OiAwcHg7XG4gIGNvbG9yOiByZ2IoNjEsIDIyOCwgMTkyKTtcbiAgYm9yZGVyLWNvbG9yOiByZ2IoNjEsIDIyOCwgMTkyKTtcbn1cblxuc2VsZWN0IHtcbiAgbWluLXdpZHRoOiAxMGVtO1xufVxuXG4vKiBldmVyeXdoZXJlIGVsc2UgKi9cblxuKiB7XG4gIGZvbnQtZmFtaWx5OiBBcmlhbCwgSGVsdmV0aWNhLCBzYW5zLXNlcmlmO1xufVxuXG5sYWJlbCB7XG4gIGRpc3BsYXk6IGJsb2NrO1xuICBtYXJnaW4tdG9wOiAxZW07XG4gIG1hcmdpbi1ib3R0b206IDFlbTtcbn1cblxuLm1haW4ge1xuICB3aWR0aDogMTAwJTtcbiAgZGlzcGxheTogZmxleDtcbiAgZmxleC1kaXJlY3Rpb246IHJvdztcbn1cblxuLm5hdmlnYXRpb24ge1xuICB3aWR0aDogMjAlO1xuICBkaXNwbGF5OiBmbGV4O1xuICBmbGV4LWRpcmVjdGlvbjogY29sdW1uO1xuICBhbGlnbi1pdGVtczogc3RyZXRjaDtcbiAgbWFyZ2luLXJpZ2h0OiAyMHB4O1xufVxuXG4uc3RlcC1kZXRhaWwge1xuICB3aWR0aDogODAlO1xuICBib3JkZXI6IDFweDtcbiAgYm9yZGVyLWxlZnQtc3R5bGU6IGRhc2hlZDtcbiAgYm9yZGVyLXJpZ2h0LXN0eWxlOiBoaWRkZW47XG4gIGJvcmRlci10b3Atc3R5bGU6IGhpZGRlbjtcbiAgYm9yZGVyLWJvdHRvbS1zdHlsZTogaGlkZGVuO1xuICBwYWRkaW5nOiAxZW07XG4gIG1hcmdpbi1ib3R0b206IDAuNWVtO1xufVxuXG4vKiAuc3RlcC1kZXRhaWwge1xuICB3aWR0aDogODAlO1xuICBib3JkZXI6IDFweDtcbiAgYm9yZGVyLWxlZnQtc3R5bGU6IGRhc2hlZDtcbiAgYm9yZGVyLXJpZ2h0LXN0eWxlOiBoaWRkZW47XG4gIGJvcmRlci10b3Atc3R5bGU6IGhpZGRlbjtcbiAgYm9yZGVyLWJvdHRvbS1zdHlsZTogaGlkZGVuO1xuICBwYWRkaW5nOiAxZW07XG4gIG1hcmdpbi1ib3R0b206IDAuNWVtO1xufSAqL1xuXG4vKiAubW9kZWwge1xuICB3aWR0aDogODAlO1xuICBib3JkZXI6IDFweDtcbiAgYm9yZGVyLWxlZnQtc3R5bGU6IGRhc2hlZDtcbiAgYm9yZGVyLXJpZ2h0LXN0eWxlOiBoaWRkZW47XG4gIGJvcmRlci10b3Atc3R5bGU6IGhpZGRlbjtcbiAgYm9yZGVyLWJvdHRvbS1zdHlsZTogaGlkZGVuO1xuICBwYWRkaW5nOiAxZW07XG4gIG1hcmdpbi1ib3R0b206IDAuNWVtO1xufSAqL1xuXG5pbnB1dDppbnZhbGlkIHtcbiAgYm9yZGVyOiByZWQgc29saWQgM3B4O1xufVxuIiwiQGltcG9ydCBcIi4uL2FwcC5jb21wb25lbnQuY3NzXCI7XG5cbi5tb2RlbCB7XG4gIHdpZHRoOiA0MCU7XG59XG5cbi5kZXRhaWwge1xuICB3aWR0aDogNDAlO1xufVxuIl19 */";
    /***/
  },

  /***/
  "./src/app/functional-entity/functional-entity.component.ts":
  /*!******************************************************************!*\
    !*** ./src/app/functional-entity/functional-entity.component.ts ***!
    \******************************************************************/

  /*! exports provided: FunctionalEntityComponent */

  /***/
  function srcAppFunctionalEntityFunctionalEntityComponentTs(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "FunctionalEntityComponent", function () {
      return FunctionalEntityComponent;
    });
    /* harmony import */


    var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
    /*! tslib */
    "./node_modules/tslib/tslib.es6.js");
    /* harmony import */


    var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
    /*! @angular/core */
    "./node_modules/@angular/core/fesm2015/core.js");
    /* harmony import */


    var _fortawesome_free_solid_svg_icons__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(
    /*! @fortawesome/free-solid-svg-icons */
    "./node_modules/@fortawesome/free-solid-svg-icons/index.es.js");
    /* harmony import */


    var src_model_tool_description__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(
    /*! src/model/tool-description */
    "./src/model/tool-description.ts");
    /* harmony import */


    var _lang__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(
    /*! ../lang */
    "./src/app/lang.ts");

    var FunctionalEntityComponent =
    /*#__PURE__*/
    function () {
      function FunctionalEntityComponent() {
        _classCallCheck(this, FunctionalEntityComponent);

        this.detail = null;
        this.iconAdd = _fortawesome_free_solid_svg_icons__WEBPACK_IMPORTED_MODULE_2__["faPlus"];
        this.iconRemove = _fortawesome_free_solid_svg_icons__WEBPACK_IMPORTED_MODULE_2__["faTimes"];
        this.iconUp = _fortawesome_free_solid_svg_icons__WEBPACK_IMPORTED_MODULE_2__["faArrowUp"];
        this.iconDown = _fortawesome_free_solid_svg_icons__WEBPACK_IMPORTED_MODULE_2__["faArrowDown"];
        this.lang = _lang__WEBPACK_IMPORTED_MODULE_4__["Lang"].getInstance();
      }

      _createClass(FunctionalEntityComponent, [{
        key: "ngOnInit",
        value: function ngOnInit() {}
        /** @internal */

      }, {
        key: "isCommandLineTool",
        value: function isCommandLineTool(f) {
          return f instanceof src_model_tool_description__WEBPACK_IMPORTED_MODULE_3__["CommandLineTool"];
        }
      }, {
        key: "addExitCode",
        value: function addExitCode() {
          var newExitCode = new src_model_tool_description__WEBPACK_IMPORTED_MODULE_3__["ExitCode"]();
          newExitCode.code = 0;
          newExitCode.status = src_model_tool_description__WEBPACK_IMPORTED_MODULE_3__["TerminationStatus"].SUCCEEDED;
          newExitCode.reportMessage = "";
          this.showDetails(newExitCode);
          this.commandLineTool.exitCodes.push(newExitCode);
        }
      }, {
        key: "removeExitCode",
        value: function removeExitCode(e) {
          var index = this.commandLineTool.exitCodes.indexOf(e);
          this.commandLineTool.exitCodes.splice(index, 1);
        }
      }, {
        key: "showDetails",
        value: function showDetails(e) {
          this.detail = e;
        }
      }, {
        key: "addLiteralCommandLineEntry",
        value: function addLiteralCommandLineEntry() {
          var entry = new src_model_tool_description__WEBPACK_IMPORTED_MODULE_3__["LiteralCommandLineEntryList"]();
          this.commandLineTool.commandLineTemplate.push(entry);
          this.showDetails(entry);
        }
      }, {
        key: "addParameterCommandLineEntry",
        value: function addParameterCommandLineEntry() {
          var entry = new src_model_tool_description__WEBPACK_IMPORTED_MODULE_3__["ParameterCommandLineEntryList"]();
          this.commandLineTool.commandLineTemplate.push(entry);
          this.showDetails(entry);
        }
      }, {
        key: "addDatasetCommandLineEntry",
        value: function addDatasetCommandLineEntry() {
          var entry = new src_model_tool_description__WEBPACK_IMPORTED_MODULE_3__["DatasetCommandLineEntryList"]();
          this.commandLineTool.commandLineTemplate.push(entry);
          this.showDetails(entry);
        }
      }, {
        key: "remove",
        value: function remove(t) {
          var index = this.commandLineTool.commandLineTemplate.indexOf(t);
          this.commandLineTool.commandLineTemplate.splice(index, 1);
        }
      }, {
        key: "moveEntryListUp",
        value: function moveEntryListUp(t) {
          var index = this.commandLineTool.commandLineTemplate.indexOf(t);
          this.remove(t);
          this.commandLineTool.commandLineTemplate.splice(index - 1, 0, t);
        }
      }, {
        key: "moveEntryListDown",
        value: function moveEntryListDown(t) {
          var index = this.commandLineTool.commandLineTemplate.indexOf(t);
          this.remove(t);
          this.commandLineTool.commandLineTemplate.splice(index + 1, 0, t);
        }
      }, {
        key: "getExampleCommandLine",
        value: function getExampleCommandLine(l) {
          if (l instanceof src_model_tool_description__WEBPACK_IMPORTED_MODULE_3__["LiteralCommandLineEntryList"]) {
            return l.getCommandLineEntries(l.literals).join(" ");
          } else if (l instanceof src_model_tool_description__WEBPACK_IMPORTED_MODULE_3__["ParameterCommandLineEntryList"]) {
            this.getParameterExample(l);
          } else if (l instanceof src_model_tool_description__WEBPACK_IMPORTED_MODULE_3__["DatasetCommandLineEntryList"]) {
            this.getDatasetExample(l);
          }
        }
      }, {
        key: "getParameterExample",
        value: function getParameterExample(l) {
          if (l.parameter) {
            var parameter = this.activity.parameters.find(function (e) {
              return e.name == l.parameter;
            });
            return l.getCommandLineEntries(parameter.getExampleValues()).join(" ");
          } else {
            return "PARAMETER";
          }
        }
      }, {
        key: "getDatasetExample",
        value: function getDatasetExample(l) {
          if (l.dataset) {
            var dataset = this.activity.parameters.find(function (e) {
              return e.name == l.dataset;
            });
            return l.getCommandLineEntries(dataset.getExampleValues()).join(" ");
          } else {
            return "DATASET";
          }
        }
      }]);

      return FunctionalEntityComponent;
    }();

    tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Input"])()], FunctionalEntityComponent.prototype, "commandLineTool", void 0);
    tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Input"])()], FunctionalEntityComponent.prototype, "activity", void 0);
    FunctionalEntityComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
      selector: "app-functional-entity",
      template: tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(
      /*! raw-loader!./functional-entity.component.html */
      "./node_modules/raw-loader/dist/cjs.js!./src/app/functional-entity/functional-entity.component.html")).default,
      styles: [tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(
      /*! ./functional-entity.component.css */
      "./src/app/functional-entity/functional-entity.component.css")).default]
    })], FunctionalEntityComponent);
    /***/
  },

  /***/
  "./src/app/lang.ts":
  /*!*************************!*\
    !*** ./src/app/lang.ts ***!
    \*************************/

  /*! exports provided: Lang */

  /***/
  function srcAppLangTs(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "Lang", function () {
      return Lang;
    });
    /* harmony import */


    var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
    /*! tslib */
    "./node_modules/tslib/tslib.es6.js");

    var Lang =
    /*#__PURE__*/
    function () {
      function Lang() {
        _classCallCheck(this, Lang);

        this.activity = "An activity consists of a process executed on a number of (input) datasets in order to obtain a number of (output) datasets as result. This process can also be guided by execution parameters.";
        this.activityName = "An identifier to the activity. Only letters, digits, hyfens and  underscores are allowed.";
        this.parameter = "An execution parameter consists of user-provided values that guides the execution of the analysis activity. These values are passed to the underlying tool as its arguments.";
        this.parameterName = "An identifier to the parameter. Only letters, digits, hyfens and  underscores are allowed.";
        this.inputDataset = "An input dataset consists of a set of user-provided files that are processed as the main source of data for the analysis activity. These files are passed to the underlying tool by their paths or by the process' standard input stream.";
        this.datasetName = "An identifier to the dataset. Only letters, digits, hyfens and  underscores are allowed.";
        this.outputDataset = "An output dataset consists of a set of files produced as the results f the analysis activity. The final location of these files are passed to the underlying tool by their paths. ";
        this.remarks = "A description of the element, form-free.";
        this.parameterType = "The primitive type of the parameter values";
        this.parameterMinimumCardinality = "The minimun number of values the user may submit to a parameter. No parameter may receive less than 1 value.";
        this.parameterMaximumCardinality = "The maximum number of values the user may submit to a parameter. -1 represents unbounded cardinality.";
        this.parameterRemove = "Remove parameter";
        this.parameterEdit = "Edit parameter";
        this.parameterAdd = "Add parameter";
        this.datasetMinimumCardinality = "The minimun number of files the user may submit to an input dataset or that are produced in a output dataset. No dataset may have minimum cardinality less than 1.";
        this.datasetMaximumCardinality = "The maximum number of files the user may submit to an input dataset dataset or that are produced in an output dataset. -1 represents unbounded cardinality.";
        this.datasetMimeType = "The MIME type of the dataset files";
        this.datasetRemove = "Remove dataset";
        this.datasetAdd = "Add dataset";
        this.datasetEdit = "Edit dataset";
        this.commandLineTool = "The analysis tool that is wrapped by the service and is used to perform the analysis activity.";
        this.toolName = "The tool executable/identifier. Only letters, digits, hyfens and  underscores are allowed.";
        this.commandLineTemplate = "Command line template defines an ordered list of arguments that will be passed to the underlying tool. These arguments are constructed on-the-fly using the parameter values and input/output datasets that where submitted by the user. An example of these arguments may be constructed are provided below.";
        this.commandLineTemplateEdit = "Edit entry list template.";
        this.commandLineTemplateRemove = "Remove entry list template.";
        this.commandLineTemplateMoveUp = "Move the entry list to previous position.";
        this.commandLineTemplateMoveDown = "Move the entry list to next position.";
        this.commandLineTemplateAddLiterals = "Add entries composed of pre-defined strings.";
        this.commandLineTemplateAddParameter = "Add entries based on a parameter's values.";
        this.commandLineTemplateAddDataset = "Add entries based on a dataset's values.";
        this.exitCodes = "The exit codes the underlying tool returns after its execution. Usually a 0 exit code represents success. Other exit codes may be described in the tool manual.";
        this.exitCodeEdit = "Edit exit code";
        this.exitCodeAdd = "Add exit code";
        this.exitCodeRemove = "Remove exit code";
        this.exitCodeCode = "The integer returned after the process ends.";
        this.exitCodeStatus = "If the code represents either success or failure.";
        this.exitCodeDescription = "A small description of the exit code meaning, usually found in tool documentation.";
        this.streamRedirections = "Stream redirections allow to redirect the standard streams of the executing processes from/to the input/output datasets.";
        this.literalAdd = "Add a string to the literals list";
        this.literalRemove = "Remove item from literals list.";
        this.slm = new StringListManipulatorsLang();
        this.paramsTypes = new ParameterTypeLang();
        this.deploy = new DeploymentLang();
      }

      _createClass(Lang, null, [{
        key: "getInstance",
        value: function getInstance() {
          if (!Lang.instance) {
            Lang.instance = new Lang();
          }

          return Lang.instance;
        }
      }]);

      return Lang;
    }();

    var ParameterTypeLang = function ParameterTypeLang() {
      _classCallCheck(this, ParameterTypeLang);

      this.STRING = "STRING defines parameters represented as sequence of characters. White spaces are permitted.";
      this.REAL = "REAL defines parameters represented as real numbers, with dots separating the integer part and the decimal part.";
      this.INTEGER = "INTEGER defines parameters represented as sequence of interger numbers.";
      this.BOOLEAN = "BOOLEAN defines parameters represented by one of two values: 'true' or 'false'.";
    };

    var StringListManipulatorsLang = function StringListManipulatorsLang() {
      _classCallCheck(this, StringListManipulatorsLang);

      this.Join = "Join unites all the values in a single string. A delimiter may be provided to separate the entries.";
      this.PrependEach = "PrependEach adds a given string to the beginning  of each value of the list it receives. The number of elements of the list remains constant.";
      this.AppendEach = "AppendEach adds a given string to the end  of each value of the list it receives. The number of elements of the list remains constant.";
      this.PrependListWith = "PrependListWith adds a new item to the beginning of the list it receives. The number of items in the new list is the number of items of the previous list + 1.";
      this.AppendListWith = "AppendListWith adds a new item to the end of the list it receives. The number of items in the new list is the number of items of the previous list + 1.";
      this.ToFlag = "ToFlag substitutes the boolean values provided for a parameter into two different values: one if the value is true and other if the value is false. The number of items in the list remains constant.";
      this.remove = "Remove this manipulator";
      this.up = "Execute this manipulator early.";
      this.down = "Execute this manipulator later.";
      this.stringListManipulators = "A list of operations to transform the initial list before adding  it to the tool's execution arguments.";
    };

    var DeploymentLang = function DeploymentLang() {
      _classCallCheck(this, DeploymentLang);

      this.serviceName = "An identifier for the service. Only letters, digits, hyfens and  underscores are allowed.";
      this.serviceVersion = "The service version.";
      this.containerName = "An identifier for the container. Only letters, digits, hyfens and  underscores are allowed.";
      this.containerUrl = "The base URL of the new service's  root resource.";
      this.contactName = "The name of the service's maintainer.";
      this.contactEmail = "The email address of the maintainer";
      this.contactUrl = "An optional address to maintainer's site";
    };
    /***/

  },

  /***/
  "./src/app/literal-command-line-template/literal-command-line-template.component.css":
  /*!*******************************************************************************************!*\
    !*** ./src/app/literal-command-line-template/literal-command-line-template.component.css ***!
    \*******************************************************************************************/

  /*! exports provided: default */

  /***/
  function srcAppLiteralCommandLineTemplateLiteralCommandLineTemplateComponentCss(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony default export */


    __webpack_exports__["default"] = "*[data-descr] {\n  position: relative;\n  cursor: help;\n}\n\n*[data-descr]:after {\n  vertical-align: top;\n  color: inherit;\n  font-size: small;\n  content: \"?\";\n}\n\n*[data-descr]:hover::after,\n*[data-descr]:focus::after {\n  content: attr(data-descr);\n\n  position: absolute;\n  left: auto;\n  min-width: 200px;\n  border: 1px #aaaaaa solid;\n  border-radius: 10px;\n  background-color: #0b4a92;\n  padding: 12px;\n  color: #e0e0e0;\n\n  font-size: 14px;\n  font-style: normal;\n  font-weight: lighter;\n  z-index: 1;\n  text-align: center;\n  opacity: 0.9;\n  -webkit-transition: opacity 1s;\n  transition: opacity 1s;\n}\n\noption[title]:hover:after,\noption[title]:focus:after {\n  content: attr(title);\n}\n\n/* Tooltip container\n.tooltip {\n  position: relative;\n}\n\n/* Tooltip text\n.tooltip .tooltiptext {\n  visibility: hidden;\n  width: 200px;\n  background-color: #555;\n  color: #fff;\n  text-align: center;\n  padding: 10px 0;\n  border-radius: 6px;\n  margin: 10px;\n  font-size: small;\n\n  /* Position the tooltip text\n  position: absolute;\n  z-index: 1;\n  bottom: 125%;\n  left: 50%;\n  margin-left: -100px;\n\n  /* Fade in tooltip\n  opacity: 0;\n  transition: opacity 0.5s;\n}\n\n.tooltip::after {\n  vertical-align: top;\n  color: inherit;\n  font-size: small;\n  content: \"?\";\n}\n\n/* Tooltip arrow\n.tooltip .tooltiptext::after {\n  content: \"\";\n  position: absolute;\n  top: 100%;\n  left: 50%;\n  margin-left: -5px;\n  border-width: 5px;\n  border-style: solid;\n  border-color: #555 transparent transparent transparent;\n}\n\n/* Show the tooltip text when you mouse over the tooltip container\n.tooltip:hover .tooltiptext {\n  visibility: visible;\n  opacity: 1;\n} */\n\n* {\n  color: #ddd;\n  background-color: #222;\n  font-family: Arial, Helvetica, sans-serif;\n  border-color: #ddd;\n}\n\n/* Application-wide Styles */\n\nh1 {\n  color: rgb(74, 165, 255);\n  font-family: Arial, Helvetica, sans-serif;\n  font-size: 250%;\n}\n\nh2 {\n  font-family: Arial, Helvetica, sans-serif;\n  font-weight: bolder;\n}\n\nh3 {\n  font-family: Arial, Helvetica, sans-serif;\n  font-weight: normal;\n  padding-top: 1em;\n}\n\nbody {\n  margin: 2em;\n}\n\ninput,\ntextarea,\nselect {\n  font-size: large;\n  color: rgb(61, 228, 192);\n  border-top-style: hidden;\n  border-left-style: hidden;\n  border-right-style: hidden;\n}\n\ninput[type=\"text\"],\ninput[type=\"url\"],\ntextarea {\n  margin-bottom: 0.5em;\n  margin-left: 0.5em;\n  margin-right: 0.5em;\n  margin-top: none;\n  border-top-width: 0px;\n  border-top-style: hidden;\n  border-left-style: hidden;\n  border-right-style: hidden;\n  border-left-width: 0px;\n  border-right-width: 0px;\n  width: 90%;\n  display: block;\n}\n\ninput[type=\"number\"] {\n  width: 50px;\n  text-align: center;\n  -webkit-appearance: textfield;\n     -moz-appearance: textfield;\n          appearance: textfield;\n}\n\ntextarea {\n  width: 90%;\n  resize: vertical;\n}\n\nbutton {\n  color: #ddd;\n  color: rgb(61, 228, 192);\n  background-color: rgb(61, 228, 192);\n  background-color: #222;\n  color: rgb(61, 228, 192);\n  border-color: #ddd;\n  font-family: Arial, Helvetica, sans-serif;\n  font-weight: bold;\n  margin-bottom: 0.5em;\n  margin-left: 0.5em;\n  margin-right: 0.5em;\n  margin-top: 0.5em;\n  border-radius: 5px;\n  min-height: 30px;\n  text-overflow: clip;\n}\n\nbutton > fa-icon {\n  color: inherit;\n  background-color: inherit;\n}\n\nbutton:disabled {\n  color: #aaa;\n  background-color: #222;\n  font-weight: lighter;\n}\n\nbutton.next {\n  right: 0px;\n  color: rgb(61, 228, 192);\n  border-color: rgb(61, 228, 192);\n}\n\nselect {\n  min-width: 10em;\n}\n\n/* everywhere else */\n\n* {\n  font-family: Arial, Helvetica, sans-serif;\n}\n\nlabel {\n  display: block;\n  margin-top: 1em;\n  margin-bottom: 1em;\n}\n\n.main {\n  width: 100%;\n  display: -webkit-box;\n  display: flex;\n  -webkit-box-orient: horizontal;\n  -webkit-box-direction: normal;\n          flex-direction: row;\n}\n\n.navigation {\n  width: 20%;\n  display: -webkit-box;\n  display: flex;\n  -webkit-box-orient: vertical;\n  -webkit-box-direction: normal;\n          flex-direction: column;\n  -webkit-box-align: stretch;\n          align-items: stretch;\n  margin-right: 20px;\n}\n\n.step-detail {\n  width: 80%;\n  border: 1px;\n  border-left-style: dashed;\n  border-right-style: hidden;\n  border-top-style: hidden;\n  border-bottom-style: hidden;\n  padding: 1em;\n  margin-bottom: 0.5em;\n}\n\n/* .step-detail {\n  width: 80%;\n  border: 1px;\n  border-left-style: dashed;\n  border-right-style: hidden;\n  border-top-style: hidden;\n  border-bottom-style: hidden;\n  padding: 1em;\n  margin-bottom: 0.5em;\n} */\n\n/* .model {\n  width: 80%;\n  border: 1px;\n  border-left-style: dashed;\n  border-right-style: hidden;\n  border-top-style: hidden;\n  border-bottom-style: hidden;\n  padding: 1em;\n  margin-bottom: 0.5em;\n} */\n\ninput:invalid {\n  border: red solid 3px;\n}\n\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbInNyYy9hcHAvdG9vbHRpcC5jc3MiLCJzcmMvYXBwL2FwcC5jb21wb25lbnQuY3NzIl0sIm5hbWVzIjpbXSwibWFwcGluZ3MiOiJBQUFBO0VBQ0Usa0JBQWtCO0VBQ2xCLFlBQVk7QUFDZDs7QUFFQTtFQUNFLG1CQUFtQjtFQUNuQixjQUFjO0VBQ2QsZ0JBQWdCO0VBQ2hCLFlBQVk7QUFDZDs7QUFFQTs7RUFFRSx5QkFBeUI7O0VBRXpCLGtCQUFrQjtFQUNsQixVQUFVO0VBQ1YsZ0JBQWdCO0VBQ2hCLHlCQUF5QjtFQUN6QixtQkFBbUI7RUFDbkIseUJBQXlCO0VBQ3pCLGFBQWE7RUFDYixjQUFjOztFQUVkLGVBQWU7RUFDZixrQkFBa0I7RUFDbEIsb0JBQW9CO0VBQ3BCLFVBQVU7RUFDVixrQkFBa0I7RUFDbEIsWUFBWTtFQUNaLDhCQUFzQjtFQUF0QixzQkFBc0I7QUFDeEI7O0FBRUE7O0VBRUUsb0JBQW9CO0FBQ3RCOztBQUVBOzs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7O0dBb0RHOztBQ3pGSDtFQUNFLFdBQVc7RUFDWCxzQkFBc0I7RUFDdEIseUNBQXlDO0VBQ3pDLGtCQUFrQjtBQUNwQjs7QUFFQSw0QkFBNEI7O0FBQzVCO0VBQ0Usd0JBQXdCO0VBQ3hCLHlDQUF5QztFQUN6QyxlQUFlO0FBQ2pCOztBQUVBO0VBQ0UseUNBQXlDO0VBQ3pDLG1CQUFtQjtBQUNyQjs7QUFFQTtFQUNFLHlDQUF5QztFQUN6QyxtQkFBbUI7RUFDbkIsZ0JBQWdCO0FBQ2xCOztBQUVBO0VBQ0UsV0FBVztBQUNiOztBQUVBOzs7RUFHRSxnQkFBZ0I7RUFDaEIsd0JBQXdCO0VBQ3hCLHdCQUF3QjtFQUN4Qix5QkFBeUI7RUFDekIsMEJBQTBCO0FBQzVCOztBQUVBOzs7RUFHRSxvQkFBb0I7RUFDcEIsa0JBQWtCO0VBQ2xCLG1CQUFtQjtFQUNuQixnQkFBZ0I7RUFDaEIscUJBQXFCO0VBQ3JCLHdCQUF3QjtFQUN4Qix5QkFBeUI7RUFDekIsMEJBQTBCO0VBQzFCLHNCQUFzQjtFQUN0Qix1QkFBdUI7RUFDdkIsVUFBVTtFQUNWLGNBQWM7QUFDaEI7O0FBRUE7RUFDRSxXQUFXO0VBQ1gsa0JBQWtCO0VBQ2xCLDZCQUFxQjtLQUFyQiwwQkFBcUI7VUFBckIscUJBQXFCO0FBQ3ZCOztBQUVBO0VBQ0UsVUFBVTtFQUNWLGdCQUFnQjtBQUNsQjs7QUFFQTtFQUNFLFdBQVc7RUFDWCx3QkFBd0I7RUFDeEIsbUNBQW1DO0VBQ25DLHNCQUFzQjtFQUN0Qix3QkFBd0I7RUFDeEIsa0JBQWtCO0VBQ2xCLHlDQUF5QztFQUN6QyxpQkFBaUI7RUFDakIsb0JBQW9CO0VBQ3BCLGtCQUFrQjtFQUNsQixtQkFBbUI7RUFDbkIsaUJBQWlCO0VBQ2pCLGtCQUFrQjtFQUNsQixnQkFBZ0I7RUFDaEIsbUJBQW1CO0FBQ3JCOztBQUVBO0VBQ0UsY0FBYztFQUNkLHlCQUF5QjtBQUMzQjs7QUFFQTtFQUNFLFdBQVc7RUFDWCxzQkFBc0I7RUFDdEIsb0JBQW9CO0FBQ3RCOztBQUVBO0VBQ0UsVUFBVTtFQUNWLHdCQUF3QjtFQUN4QiwrQkFBK0I7QUFDakM7O0FBRUE7RUFDRSxlQUFlO0FBQ2pCOztBQUVBLG9CQUFvQjs7QUFFcEI7RUFDRSx5Q0FBeUM7QUFDM0M7O0FBRUE7RUFDRSxjQUFjO0VBQ2QsZUFBZTtFQUNmLGtCQUFrQjtBQUNwQjs7QUFFQTtFQUNFLFdBQVc7RUFDWCxvQkFBYTtFQUFiLGFBQWE7RUFDYiw4QkFBbUI7RUFBbkIsNkJBQW1CO1VBQW5CLG1CQUFtQjtBQUNyQjs7QUFFQTtFQUNFLFVBQVU7RUFDVixvQkFBYTtFQUFiLGFBQWE7RUFDYiw0QkFBc0I7RUFBdEIsNkJBQXNCO1VBQXRCLHNCQUFzQjtFQUN0QiwwQkFBb0I7VUFBcEIsb0JBQW9CO0VBQ3BCLGtCQUFrQjtBQUNwQjs7QUFFQTtFQUNFLFVBQVU7RUFDVixXQUFXO0VBQ1gseUJBQXlCO0VBQ3pCLDBCQUEwQjtFQUMxQix3QkFBd0I7RUFDeEIsMkJBQTJCO0VBQzNCLFlBQVk7RUFDWixvQkFBb0I7QUFDdEI7O0FBRUE7Ozs7Ozs7OztHQVNHOztBQUVIOzs7Ozs7Ozs7R0FTRzs7QUFFSDtFQUNFLHFCQUFxQjtBQUN2QiIsImZpbGUiOiJzcmMvYXBwL2xpdGVyYWwtY29tbWFuZC1saW5lLXRlbXBsYXRlL2xpdGVyYWwtY29tbWFuZC1saW5lLXRlbXBsYXRlLmNvbXBvbmVudC5jc3MiLCJzb3VyY2VzQ29udGVudCI6WyIqW2RhdGEtZGVzY3JdIHtcbiAgcG9zaXRpb246IHJlbGF0aXZlO1xuICBjdXJzb3I6IGhlbHA7XG59XG5cbipbZGF0YS1kZXNjcl06YWZ0ZXIge1xuICB2ZXJ0aWNhbC1hbGlnbjogdG9wO1xuICBjb2xvcjogaW5oZXJpdDtcbiAgZm9udC1zaXplOiBzbWFsbDtcbiAgY29udGVudDogXCI/XCI7XG59XG5cbipbZGF0YS1kZXNjcl06aG92ZXI6OmFmdGVyLFxuKltkYXRhLWRlc2NyXTpmb2N1czo6YWZ0ZXIge1xuICBjb250ZW50OiBhdHRyKGRhdGEtZGVzY3IpO1xuXG4gIHBvc2l0aW9uOiBhYnNvbHV0ZTtcbiAgbGVmdDogYXV0bztcbiAgbWluLXdpZHRoOiAyMDBweDtcbiAgYm9yZGVyOiAxcHggI2FhYWFhYSBzb2xpZDtcbiAgYm9yZGVyLXJhZGl1czogMTBweDtcbiAgYmFja2dyb3VuZC1jb2xvcjogIzBiNGE5MjtcbiAgcGFkZGluZzogMTJweDtcbiAgY29sb3I6ICNlMGUwZTA7XG5cbiAgZm9udC1zaXplOiAxNHB4O1xuICBmb250LXN0eWxlOiBub3JtYWw7XG4gIGZvbnQtd2VpZ2h0OiBsaWdodGVyO1xuICB6LWluZGV4OiAxO1xuICB0ZXh0LWFsaWduOiBjZW50ZXI7XG4gIG9wYWNpdHk6IDAuOTtcbiAgdHJhbnNpdGlvbjogb3BhY2l0eSAxcztcbn1cblxub3B0aW9uW3RpdGxlXTpob3ZlcjphZnRlcixcbm9wdGlvblt0aXRsZV06Zm9jdXM6YWZ0ZXIge1xuICBjb250ZW50OiBhdHRyKHRpdGxlKTtcbn1cblxuLyogVG9vbHRpcCBjb250YWluZXJcbi50b29sdGlwIHtcbiAgcG9zaXRpb246IHJlbGF0aXZlO1xufVxuXG4vKiBUb29sdGlwIHRleHRcbi50b29sdGlwIC50b29sdGlwdGV4dCB7XG4gIHZpc2liaWxpdHk6IGhpZGRlbjtcbiAgd2lkdGg6IDIwMHB4O1xuICBiYWNrZ3JvdW5kLWNvbG9yOiAjNTU1O1xuICBjb2xvcjogI2ZmZjtcbiAgdGV4dC1hbGlnbjogY2VudGVyO1xuICBwYWRkaW5nOiAxMHB4IDA7XG4gIGJvcmRlci1yYWRpdXM6IDZweDtcbiAgbWFyZ2luOiAxMHB4O1xuICBmb250LXNpemU6IHNtYWxsO1xuXG4gIC8qIFBvc2l0aW9uIHRoZSB0b29sdGlwIHRleHRcbiAgcG9zaXRpb246IGFic29sdXRlO1xuICB6LWluZGV4OiAxO1xuICBib3R0b206IDEyNSU7XG4gIGxlZnQ6IDUwJTtcbiAgbWFyZ2luLWxlZnQ6IC0xMDBweDtcblxuICAvKiBGYWRlIGluIHRvb2x0aXBcbiAgb3BhY2l0eTogMDtcbiAgdHJhbnNpdGlvbjogb3BhY2l0eSAwLjVzO1xufVxuXG4udG9vbHRpcDo6YWZ0ZXIge1xuICB2ZXJ0aWNhbC1hbGlnbjogdG9wO1xuICBjb2xvcjogaW5oZXJpdDtcbiAgZm9udC1zaXplOiBzbWFsbDtcbiAgY29udGVudDogXCI/XCI7XG59XG5cbi8qIFRvb2x0aXAgYXJyb3dcbi50b29sdGlwIC50b29sdGlwdGV4dDo6YWZ0ZXIge1xuICBjb250ZW50OiBcIlwiO1xuICBwb3NpdGlvbjogYWJzb2x1dGU7XG4gIHRvcDogMTAwJTtcbiAgbGVmdDogNTAlO1xuICBtYXJnaW4tbGVmdDogLTVweDtcbiAgYm9yZGVyLXdpZHRoOiA1cHg7XG4gIGJvcmRlci1zdHlsZTogc29saWQ7XG4gIGJvcmRlci1jb2xvcjogIzU1NSB0cmFuc3BhcmVudCB0cmFuc3BhcmVudCB0cmFuc3BhcmVudDtcbn1cblxuLyogU2hvdyB0aGUgdG9vbHRpcCB0ZXh0IHdoZW4geW91IG1vdXNlIG92ZXIgdGhlIHRvb2x0aXAgY29udGFpbmVyXG4udG9vbHRpcDpob3ZlciAudG9vbHRpcHRleHQge1xuICB2aXNpYmlsaXR5OiB2aXNpYmxlO1xuICBvcGFjaXR5OiAxO1xufSAqL1xuIiwiQGltcG9ydCBcIi4vdG9vbHRpcC5jc3NcIjtcblxuKiB7XG4gIGNvbG9yOiAjZGRkO1xuICBiYWNrZ3JvdW5kLWNvbG9yOiAjMjIyO1xuICBmb250LWZhbWlseTogQXJpYWwsIEhlbHZldGljYSwgc2Fucy1zZXJpZjtcbiAgYm9yZGVyLWNvbG9yOiAjZGRkO1xufVxuXG4vKiBBcHBsaWNhdGlvbi13aWRlIFN0eWxlcyAqL1xuaDEge1xuICBjb2xvcjogcmdiKDc0LCAxNjUsIDI1NSk7XG4gIGZvbnQtZmFtaWx5OiBBcmlhbCwgSGVsdmV0aWNhLCBzYW5zLXNlcmlmO1xuICBmb250LXNpemU6IDI1MCU7XG59XG5cbmgyIHtcbiAgZm9udC1mYW1pbHk6IEFyaWFsLCBIZWx2ZXRpY2EsIHNhbnMtc2VyaWY7XG4gIGZvbnQtd2VpZ2h0OiBib2xkZXI7XG59XG5cbmgzIHtcbiAgZm9udC1mYW1pbHk6IEFyaWFsLCBIZWx2ZXRpY2EsIHNhbnMtc2VyaWY7XG4gIGZvbnQtd2VpZ2h0OiBub3JtYWw7XG4gIHBhZGRpbmctdG9wOiAxZW07XG59XG5cbmJvZHkge1xuICBtYXJnaW46IDJlbTtcbn1cblxuaW5wdXQsXG50ZXh0YXJlYSxcbnNlbGVjdCB7XG4gIGZvbnQtc2l6ZTogbGFyZ2U7XG4gIGNvbG9yOiByZ2IoNjEsIDIyOCwgMTkyKTtcbiAgYm9yZGVyLXRvcC1zdHlsZTogaGlkZGVuO1xuICBib3JkZXItbGVmdC1zdHlsZTogaGlkZGVuO1xuICBib3JkZXItcmlnaHQtc3R5bGU6IGhpZGRlbjtcbn1cblxuaW5wdXRbdHlwZT1cInRleHRcIl0sXG5pbnB1dFt0eXBlPVwidXJsXCJdLFxudGV4dGFyZWEge1xuICBtYXJnaW4tYm90dG9tOiAwLjVlbTtcbiAgbWFyZ2luLWxlZnQ6IDAuNWVtO1xuICBtYXJnaW4tcmlnaHQ6IDAuNWVtO1xuICBtYXJnaW4tdG9wOiBub25lO1xuICBib3JkZXItdG9wLXdpZHRoOiAwcHg7XG4gIGJvcmRlci10b3Atc3R5bGU6IGhpZGRlbjtcbiAgYm9yZGVyLWxlZnQtc3R5bGU6IGhpZGRlbjtcbiAgYm9yZGVyLXJpZ2h0LXN0eWxlOiBoaWRkZW47XG4gIGJvcmRlci1sZWZ0LXdpZHRoOiAwcHg7XG4gIGJvcmRlci1yaWdodC13aWR0aDogMHB4O1xuICB3aWR0aDogOTAlO1xuICBkaXNwbGF5OiBibG9jaztcbn1cblxuaW5wdXRbdHlwZT1cIm51bWJlclwiXSB7XG4gIHdpZHRoOiA1MHB4O1xuICB0ZXh0LWFsaWduOiBjZW50ZXI7XG4gIGFwcGVhcmFuY2U6IHRleHRmaWVsZDtcbn1cblxudGV4dGFyZWEge1xuICB3aWR0aDogOTAlO1xuICByZXNpemU6IHZlcnRpY2FsO1xufVxuXG5idXR0b24ge1xuICBjb2xvcjogI2RkZDtcbiAgY29sb3I6IHJnYig2MSwgMjI4LCAxOTIpO1xuICBiYWNrZ3JvdW5kLWNvbG9yOiByZ2IoNjEsIDIyOCwgMTkyKTtcbiAgYmFja2dyb3VuZC1jb2xvcjogIzIyMjtcbiAgY29sb3I6IHJnYig2MSwgMjI4LCAxOTIpO1xuICBib3JkZXItY29sb3I6ICNkZGQ7XG4gIGZvbnQtZmFtaWx5OiBBcmlhbCwgSGVsdmV0aWNhLCBzYW5zLXNlcmlmO1xuICBmb250LXdlaWdodDogYm9sZDtcbiAgbWFyZ2luLWJvdHRvbTogMC41ZW07XG4gIG1hcmdpbi1sZWZ0OiAwLjVlbTtcbiAgbWFyZ2luLXJpZ2h0OiAwLjVlbTtcbiAgbWFyZ2luLXRvcDogMC41ZW07XG4gIGJvcmRlci1yYWRpdXM6IDVweDtcbiAgbWluLWhlaWdodDogMzBweDtcbiAgdGV4dC1vdmVyZmxvdzogY2xpcDtcbn1cblxuYnV0dG9uID4gZmEtaWNvbiB7XG4gIGNvbG9yOiBpbmhlcml0O1xuICBiYWNrZ3JvdW5kLWNvbG9yOiBpbmhlcml0O1xufVxuXG5idXR0b246ZGlzYWJsZWQge1xuICBjb2xvcjogI2FhYTtcbiAgYmFja2dyb3VuZC1jb2xvcjogIzIyMjtcbiAgZm9udC13ZWlnaHQ6IGxpZ2h0ZXI7XG59XG5cbmJ1dHRvbi5uZXh0IHtcbiAgcmlnaHQ6IDBweDtcbiAgY29sb3I6IHJnYig2MSwgMjI4LCAxOTIpO1xuICBib3JkZXItY29sb3I6IHJnYig2MSwgMjI4LCAxOTIpO1xufVxuXG5zZWxlY3Qge1xuICBtaW4td2lkdGg6IDEwZW07XG59XG5cbi8qIGV2ZXJ5d2hlcmUgZWxzZSAqL1xuXG4qIHtcbiAgZm9udC1mYW1pbHk6IEFyaWFsLCBIZWx2ZXRpY2EsIHNhbnMtc2VyaWY7XG59XG5cbmxhYmVsIHtcbiAgZGlzcGxheTogYmxvY2s7XG4gIG1hcmdpbi10b3A6IDFlbTtcbiAgbWFyZ2luLWJvdHRvbTogMWVtO1xufVxuXG4ubWFpbiB7XG4gIHdpZHRoOiAxMDAlO1xuICBkaXNwbGF5OiBmbGV4O1xuICBmbGV4LWRpcmVjdGlvbjogcm93O1xufVxuXG4ubmF2aWdhdGlvbiB7XG4gIHdpZHRoOiAyMCU7XG4gIGRpc3BsYXk6IGZsZXg7XG4gIGZsZXgtZGlyZWN0aW9uOiBjb2x1bW47XG4gIGFsaWduLWl0ZW1zOiBzdHJldGNoO1xuICBtYXJnaW4tcmlnaHQ6IDIwcHg7XG59XG5cbi5zdGVwLWRldGFpbCB7XG4gIHdpZHRoOiA4MCU7XG4gIGJvcmRlcjogMXB4O1xuICBib3JkZXItbGVmdC1zdHlsZTogZGFzaGVkO1xuICBib3JkZXItcmlnaHQtc3R5bGU6IGhpZGRlbjtcbiAgYm9yZGVyLXRvcC1zdHlsZTogaGlkZGVuO1xuICBib3JkZXItYm90dG9tLXN0eWxlOiBoaWRkZW47XG4gIHBhZGRpbmc6IDFlbTtcbiAgbWFyZ2luLWJvdHRvbTogMC41ZW07XG59XG5cbi8qIC5zdGVwLWRldGFpbCB7XG4gIHdpZHRoOiA4MCU7XG4gIGJvcmRlcjogMXB4O1xuICBib3JkZXItbGVmdC1zdHlsZTogZGFzaGVkO1xuICBib3JkZXItcmlnaHQtc3R5bGU6IGhpZGRlbjtcbiAgYm9yZGVyLXRvcC1zdHlsZTogaGlkZGVuO1xuICBib3JkZXItYm90dG9tLXN0eWxlOiBoaWRkZW47XG4gIHBhZGRpbmc6IDFlbTtcbiAgbWFyZ2luLWJvdHRvbTogMC41ZW07XG59ICovXG5cbi8qIC5tb2RlbCB7XG4gIHdpZHRoOiA4MCU7XG4gIGJvcmRlcjogMXB4O1xuICBib3JkZXItbGVmdC1zdHlsZTogZGFzaGVkO1xuICBib3JkZXItcmlnaHQtc3R5bGU6IGhpZGRlbjtcbiAgYm9yZGVyLXRvcC1zdHlsZTogaGlkZGVuO1xuICBib3JkZXItYm90dG9tLXN0eWxlOiBoaWRkZW47XG4gIHBhZGRpbmc6IDFlbTtcbiAgbWFyZ2luLWJvdHRvbTogMC41ZW07XG59ICovXG5cbmlucHV0OmludmFsaWQge1xuICBib3JkZXI6IHJlZCBzb2xpZCAzcHg7XG59XG4iXX0= */";
    /***/
  },

  /***/
  "./src/app/literal-command-line-template/literal-command-line-template.component.ts":
  /*!******************************************************************************************!*\
    !*** ./src/app/literal-command-line-template/literal-command-line-template.component.ts ***!
    \******************************************************************************************/

  /*! exports provided: LiteralCommandLineTemplateComponent */

  /***/
  function srcAppLiteralCommandLineTemplateLiteralCommandLineTemplateComponentTs(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "LiteralCommandLineTemplateComponent", function () {
      return LiteralCommandLineTemplateComponent;
    });
    /* harmony import */


    var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
    /*! tslib */
    "./node_modules/tslib/tslib.es6.js");
    /* harmony import */


    var _fortawesome_free_solid_svg_icons__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
    /*! @fortawesome/free-solid-svg-icons */
    "./node_modules/@fortawesome/free-solid-svg-icons/index.es.js");
    /* harmony import */


    var _angular_core__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(
    /*! @angular/core */
    "./node_modules/@angular/core/fesm2015/core.js");
    /* harmony import */


    var _lang__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(
    /*! ../lang */
    "./src/app/lang.ts");

    var LiteralCommandLineTemplateComponent =
    /*#__PURE__*/
    function () {
      function LiteralCommandLineTemplateComponent() {
        _classCallCheck(this, LiteralCommandLineTemplateComponent);

        this.iconAdd = _fortawesome_free_solid_svg_icons__WEBPACK_IMPORTED_MODULE_1__["faPlus"];
        this.iconRemove = _fortawesome_free_solid_svg_icons__WEBPACK_IMPORTED_MODULE_1__["faTimes"];
        this.iconUp = _fortawesome_free_solid_svg_icons__WEBPACK_IMPORTED_MODULE_1__["faArrowUp"];
        this.iconDown = _fortawesome_free_solid_svg_icons__WEBPACK_IMPORTED_MODULE_1__["faArrowDown"];
        this.lang = _lang__WEBPACK_IMPORTED_MODULE_3__["Lang"].getInstance();
      }

      _createClass(LiteralCommandLineTemplateComponent, [{
        key: "ngOnInit",
        value: function ngOnInit() {}
      }, {
        key: "addLiteral",
        value: function addLiteral() {
          this.literals.literals.push("");
        }
      }, {
        key: "removeLiteral",
        value: function removeLiteral(l) {
          var index = this.literals.literals.indexOf(l);
          this.literals.literals.splice(index, 1);
        }
      }, {
        key: "trackByIndex",
        value: function trackByIndex(index, obj) {
          return index;
        }
      }]);

      return LiteralCommandLineTemplateComponent;
    }();

    tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_2__["Input"])()], LiteralCommandLineTemplateComponent.prototype, "literals", void 0);
    LiteralCommandLineTemplateComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_2__["Component"])({
      selector: "app-literal-command-line-template",
      template: tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(
      /*! raw-loader!./literal-command-line-template.component.html */
      "./node_modules/raw-loader/dist/cjs.js!./src/app/literal-command-line-template/literal-command-line-template.component.html")).default,
      styles: [tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(
      /*! ./literal-command-line-template.component.css */
      "./src/app/literal-command-line-template/literal-command-line-template.component.css")).default]
    })], LiteralCommandLineTemplateComponent);
    /***/
  },

  /***/
  "./src/app/project-generator.service.ts":
  /*!**********************************************!*\
    !*** ./src/app/project-generator.service.ts ***!
    \**********************************************/

  /*! exports provided: ProjectGeneratorService */

  /***/
  function srcAppProjectGeneratorServiceTs(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "ProjectGeneratorService", function () {
      return ProjectGeneratorService;
    });
    /* harmony import */


    var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
    /*! tslib */
    "./node_modules/tslib/tslib.es6.js");
    /* harmony import */


    var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
    /*! @angular/core */
    "./node_modules/@angular/core/fesm2015/core.js");
    /* harmony import */


    var _angular_common_http__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(
    /*! @angular/common/http */
    "./node_modules/@angular/common/fesm2015/http.js");
    /* harmony import */


    var file_saver__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(
    /*! file-saver */
    "./node_modules/file-saver/dist/FileSaver.min.js");
    /* harmony import */


    var file_saver__WEBPACK_IMPORTED_MODULE_3___default =
    /*#__PURE__*/
    __webpack_require__.n(file_saver__WEBPACK_IMPORTED_MODULE_3__);

    var ProjectGeneratorService =
    /*#__PURE__*/
    //  providedIn: "root"
    //}
    function () {
      function ProjectGeneratorService(http) {
        _classCallCheck(this, ProjectGeneratorService);

        this.http = http;
        this.host = "http://localhost:8080";
        this.generateGalaxyClientPath = "/bootstrap-server/generate-galaxy-client";
        this.generateServicePath = "/boostrap-server/generate-service";
      }

      _createClass(ProjectGeneratorService, [{
        key: "generateClient",
        value: function generateClient(activity, functionalEntity, deployment) {
          console.log("Generating client: ");
          console.log(activity);
          console.log(functionalEntity);
          console.log(deployment);
          var url = "".concat(this.host).concat(this.generateGalaxyClientPath);
          this.http.post(url, {
            activity: activity,
            deployment: deployment
          }, {
            responseType: "blob"
          }).subscribe(function (data) {
            return Object(file_saver__WEBPACK_IMPORTED_MODULE_3__["saveAs"])(data, "client.zip");
          }), //      .subscribe((data: any) => this.downloadFile(data))),
          function (error) {
            return console.log("Error downloading the file. ".concat(error));
          }, function () {
            return console.info("OK");
          };
        }
      }, {
        key: "generateService",
        value: function generateService(activity, functionalEntity, deployment) {
          console.log("Generating client: ");
          console.log(activity);
          console.log(functionalEntity);
          console.log(deployment);
          var url = "".concat(this.host).concat(this.generateServicePath);
          this.http.post(url, {
            activity: activity,
            functionalEntity: functionalEntity,
            deployment: deployment
          }, {
            responseType: "blob"
          }).subscribe(function (data) {
            return Object(file_saver__WEBPACK_IMPORTED_MODULE_3__["saveAs"])(data, "service.zip");
          }), // .subscribe((data: any) => this.downloadFile(data)),
          function (error) {
            return console.log("Error downloading the file. ".concat(error));
          }, function () {
            return console.info("OK");
          };
        }
      }, {
        key: "downloadFile",
        value: function downloadFile(data) {
          console.log(data);
          var blob = new Blob([data], {
            type: "application/octet-stream"
          }); //const blob = data.blob();

          var url = window.URL.createObjectURL(blob);
          window.open(url);
        }
      }]);

      return ProjectGeneratorService;
    }();

    ProjectGeneratorService.ctorParameters = function () {
      return [{
        type: _angular_common_http__WEBPACK_IMPORTED_MODULE_2__["HttpClient"]
      }];
    };

    ProjectGeneratorService = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Injectable"])() //{
    //  providedIn: "root"
    //}
    ], ProjectGeneratorService);
    /***/
  },

  /***/
  "./src/app/string-list-manipulators/string-list-manipulators.component.css":
  /*!*********************************************************************************!*\
    !*** ./src/app/string-list-manipulators/string-list-manipulators.component.css ***!
    \*********************************************************************************/

  /*! exports provided: default */

  /***/
  function srcAppStringListManipulatorsStringListManipulatorsComponentCss(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony default export */


    __webpack_exports__["default"] = "*[data-descr] {\n  position: relative;\n  cursor: help;\n}\n\n*[data-descr]:after {\n  vertical-align: top;\n  color: inherit;\n  font-size: small;\n  content: \"?\";\n}\n\n*[data-descr]:hover::after,\n*[data-descr]:focus::after {\n  content: attr(data-descr);\n\n  position: absolute;\n  left: auto;\n  min-width: 200px;\n  border: 1px #aaaaaa solid;\n  border-radius: 10px;\n  background-color: #0b4a92;\n  padding: 12px;\n  color: #e0e0e0;\n\n  font-size: 14px;\n  font-style: normal;\n  font-weight: lighter;\n  z-index: 1;\n  text-align: center;\n  opacity: 0.9;\n  -webkit-transition: opacity 1s;\n  transition: opacity 1s;\n}\n\noption[title]:hover:after,\noption[title]:focus:after {\n  content: attr(title);\n}\n\n/* Tooltip container\n.tooltip {\n  position: relative;\n}\n\n/* Tooltip text\n.tooltip .tooltiptext {\n  visibility: hidden;\n  width: 200px;\n  background-color: #555;\n  color: #fff;\n  text-align: center;\n  padding: 10px 0;\n  border-radius: 6px;\n  margin: 10px;\n  font-size: small;\n\n  /* Position the tooltip text\n  position: absolute;\n  z-index: 1;\n  bottom: 125%;\n  left: 50%;\n  margin-left: -100px;\n\n  /* Fade in tooltip\n  opacity: 0;\n  transition: opacity 0.5s;\n}\n\n.tooltip::after {\n  vertical-align: top;\n  color: inherit;\n  font-size: small;\n  content: \"?\";\n}\n\n/* Tooltip arrow\n.tooltip .tooltiptext::after {\n  content: \"\";\n  position: absolute;\n  top: 100%;\n  left: 50%;\n  margin-left: -5px;\n  border-width: 5px;\n  border-style: solid;\n  border-color: #555 transparent transparent transparent;\n}\n\n/* Show the tooltip text when you mouse over the tooltip container\n.tooltip:hover .tooltiptext {\n  visibility: visible;\n  opacity: 1;\n} */\n\n* {\n  color: #ddd;\n  background-color: #222;\n  font-family: Arial, Helvetica, sans-serif;\n  border-color: #ddd;\n}\n\n/* Application-wide Styles */\n\nh1 {\n  color: rgb(74, 165, 255);\n  font-family: Arial, Helvetica, sans-serif;\n  font-size: 250%;\n}\n\nh2 {\n  font-family: Arial, Helvetica, sans-serif;\n  font-weight: bolder;\n}\n\nh3 {\n  font-family: Arial, Helvetica, sans-serif;\n  font-weight: normal;\n  padding-top: 1em;\n}\n\nbody {\n  margin: 2em;\n}\n\ninput,\ntextarea,\nselect {\n  font-size: large;\n  color: rgb(61, 228, 192);\n  border-top-style: hidden;\n  border-left-style: hidden;\n  border-right-style: hidden;\n}\n\ninput[type=\"text\"],\ninput[type=\"url\"],\ntextarea {\n  margin-bottom: 0.5em;\n  margin-left: 0.5em;\n  margin-right: 0.5em;\n  margin-top: none;\n  border-top-width: 0px;\n  border-top-style: hidden;\n  border-left-style: hidden;\n  border-right-style: hidden;\n  border-left-width: 0px;\n  border-right-width: 0px;\n  width: 90%;\n  display: block;\n}\n\ninput[type=\"number\"] {\n  width: 50px;\n  text-align: center;\n  -webkit-appearance: textfield;\n     -moz-appearance: textfield;\n          appearance: textfield;\n}\n\ntextarea {\n  width: 90%;\n  resize: vertical;\n}\n\nbutton {\n  color: #ddd;\n  color: rgb(61, 228, 192);\n  background-color: rgb(61, 228, 192);\n  background-color: #222;\n  color: rgb(61, 228, 192);\n  border-color: #ddd;\n  font-family: Arial, Helvetica, sans-serif;\n  font-weight: bold;\n  margin-bottom: 0.5em;\n  margin-left: 0.5em;\n  margin-right: 0.5em;\n  margin-top: 0.5em;\n  border-radius: 5px;\n  min-height: 30px;\n  text-overflow: clip;\n}\n\nbutton > fa-icon {\n  color: inherit;\n  background-color: inherit;\n}\n\nbutton:disabled {\n  color: #aaa;\n  background-color: #222;\n  font-weight: lighter;\n}\n\nbutton.next {\n  right: 0px;\n  color: rgb(61, 228, 192);\n  border-color: rgb(61, 228, 192);\n}\n\nselect {\n  min-width: 10em;\n}\n\n/* everywhere else */\n\n* {\n  font-family: Arial, Helvetica, sans-serif;\n}\n\nlabel {\n  display: block;\n  margin-top: 1em;\n  margin-bottom: 1em;\n}\n\n.main {\n  width: 100%;\n  display: -webkit-box;\n  display: flex;\n  -webkit-box-orient: horizontal;\n  -webkit-box-direction: normal;\n          flex-direction: row;\n}\n\n.navigation {\n  width: 20%;\n  display: -webkit-box;\n  display: flex;\n  -webkit-box-orient: vertical;\n  -webkit-box-direction: normal;\n          flex-direction: column;\n  -webkit-box-align: stretch;\n          align-items: stretch;\n  margin-right: 20px;\n}\n\n.step-detail {\n  width: 80%;\n  border: 1px;\n  border-left-style: dashed;\n  border-right-style: hidden;\n  border-top-style: hidden;\n  border-bottom-style: hidden;\n  padding: 1em;\n  margin-bottom: 0.5em;\n}\n\n/* .step-detail {\n  width: 80%;\n  border: 1px;\n  border-left-style: dashed;\n  border-right-style: hidden;\n  border-top-style: hidden;\n  border-bottom-style: hidden;\n  padding: 1em;\n  margin-bottom: 0.5em;\n} */\n\n/* .model {\n  width: 80%;\n  border: 1px;\n  border-left-style: dashed;\n  border-right-style: hidden;\n  border-top-style: hidden;\n  border-bottom-style: hidden;\n  padding: 1em;\n  margin-bottom: 0.5em;\n} */\n\ninput:invalid {\n  border: red solid 3px;\n}\n\ndiv .string-list-manipulator {\n  border: 1px;\n  border-color: black;\n  border-style: dashed;\n  padding: 1em;\n  margin-bottom: 0.5em;\n}\n\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbInNyYy9hcHAvdG9vbHRpcC5jc3MiLCJzcmMvYXBwL2FwcC5jb21wb25lbnQuY3NzIiwic3JjL2FwcC9zdHJpbmctbGlzdC1tYW5pcHVsYXRvcnMvc3RyaW5nLWxpc3QtbWFuaXB1bGF0b3JzLmNvbXBvbmVudC5jc3MiXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IkFBQUE7RUFDRSxrQkFBa0I7RUFDbEIsWUFBWTtBQUNkOztBQUVBO0VBQ0UsbUJBQW1CO0VBQ25CLGNBQWM7RUFDZCxnQkFBZ0I7RUFDaEIsWUFBWTtBQUNkOztBQUVBOztFQUVFLHlCQUF5Qjs7RUFFekIsa0JBQWtCO0VBQ2xCLFVBQVU7RUFDVixnQkFBZ0I7RUFDaEIseUJBQXlCO0VBQ3pCLG1CQUFtQjtFQUNuQix5QkFBeUI7RUFDekIsYUFBYTtFQUNiLGNBQWM7O0VBRWQsZUFBZTtFQUNmLGtCQUFrQjtFQUNsQixvQkFBb0I7RUFDcEIsVUFBVTtFQUNWLGtCQUFrQjtFQUNsQixZQUFZO0VBQ1osOEJBQXNCO0VBQXRCLHNCQUFzQjtBQUN4Qjs7QUFFQTs7RUFFRSxvQkFBb0I7QUFDdEI7O0FBRUE7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7R0FvREc7O0FDekZIO0VBQ0UsV0FBVztFQUNYLHNCQUFzQjtFQUN0Qix5Q0FBeUM7RUFDekMsa0JBQWtCO0FBQ3BCOztBQUVBLDRCQUE0Qjs7QUFDNUI7RUFDRSx3QkFBd0I7RUFDeEIseUNBQXlDO0VBQ3pDLGVBQWU7QUFDakI7O0FBRUE7RUFDRSx5Q0FBeUM7RUFDekMsbUJBQW1CO0FBQ3JCOztBQUVBO0VBQ0UseUNBQXlDO0VBQ3pDLG1CQUFtQjtFQUNuQixnQkFBZ0I7QUFDbEI7O0FBRUE7RUFDRSxXQUFXO0FBQ2I7O0FBRUE7OztFQUdFLGdCQUFnQjtFQUNoQix3QkFBd0I7RUFDeEIsd0JBQXdCO0VBQ3hCLHlCQUF5QjtFQUN6QiwwQkFBMEI7QUFDNUI7O0FBRUE7OztFQUdFLG9CQUFvQjtFQUNwQixrQkFBa0I7RUFDbEIsbUJBQW1CO0VBQ25CLGdCQUFnQjtFQUNoQixxQkFBcUI7RUFDckIsd0JBQXdCO0VBQ3hCLHlCQUF5QjtFQUN6QiwwQkFBMEI7RUFDMUIsc0JBQXNCO0VBQ3RCLHVCQUF1QjtFQUN2QixVQUFVO0VBQ1YsY0FBYztBQUNoQjs7QUFFQTtFQUNFLFdBQVc7RUFDWCxrQkFBa0I7RUFDbEIsNkJBQXFCO0tBQXJCLDBCQUFxQjtVQUFyQixxQkFBcUI7QUFDdkI7O0FBRUE7RUFDRSxVQUFVO0VBQ1YsZ0JBQWdCO0FBQ2xCOztBQUVBO0VBQ0UsV0FBVztFQUNYLHdCQUF3QjtFQUN4QixtQ0FBbUM7RUFDbkMsc0JBQXNCO0VBQ3RCLHdCQUF3QjtFQUN4QixrQkFBa0I7RUFDbEIseUNBQXlDO0VBQ3pDLGlCQUFpQjtFQUNqQixvQkFBb0I7RUFDcEIsa0JBQWtCO0VBQ2xCLG1CQUFtQjtFQUNuQixpQkFBaUI7RUFDakIsa0JBQWtCO0VBQ2xCLGdCQUFnQjtFQUNoQixtQkFBbUI7QUFDckI7O0FBRUE7RUFDRSxjQUFjO0VBQ2QseUJBQXlCO0FBQzNCOztBQUVBO0VBQ0UsV0FBVztFQUNYLHNCQUFzQjtFQUN0QixvQkFBb0I7QUFDdEI7O0FBRUE7RUFDRSxVQUFVO0VBQ1Ysd0JBQXdCO0VBQ3hCLCtCQUErQjtBQUNqQzs7QUFFQTtFQUNFLGVBQWU7QUFDakI7O0FBRUEsb0JBQW9COztBQUVwQjtFQUNFLHlDQUF5QztBQUMzQzs7QUFFQTtFQUNFLGNBQWM7RUFDZCxlQUFlO0VBQ2Ysa0JBQWtCO0FBQ3BCOztBQUVBO0VBQ0UsV0FBVztFQUNYLG9CQUFhO0VBQWIsYUFBYTtFQUNiLDhCQUFtQjtFQUFuQiw2QkFBbUI7VUFBbkIsbUJBQW1CO0FBQ3JCOztBQUVBO0VBQ0UsVUFBVTtFQUNWLG9CQUFhO0VBQWIsYUFBYTtFQUNiLDRCQUFzQjtFQUF0Qiw2QkFBc0I7VUFBdEIsc0JBQXNCO0VBQ3RCLDBCQUFvQjtVQUFwQixvQkFBb0I7RUFDcEIsa0JBQWtCO0FBQ3BCOztBQUVBO0VBQ0UsVUFBVTtFQUNWLFdBQVc7RUFDWCx5QkFBeUI7RUFDekIsMEJBQTBCO0VBQzFCLHdCQUF3QjtFQUN4QiwyQkFBMkI7RUFDM0IsWUFBWTtFQUNaLG9CQUFvQjtBQUN0Qjs7QUFFQTs7Ozs7Ozs7O0dBU0c7O0FBRUg7Ozs7Ozs7OztHQVNHOztBQUVIO0VBQ0UscUJBQXFCO0FBQ3ZCOztBQ3ZLQTtFQUNFLFdBQVc7RUFDWCxtQkFBbUI7RUFDbkIsb0JBQW9CO0VBQ3BCLFlBQVk7RUFDWixvQkFBb0I7QUFDdEIiLCJmaWxlIjoic3JjL2FwcC9zdHJpbmctbGlzdC1tYW5pcHVsYXRvcnMvc3RyaW5nLWxpc3QtbWFuaXB1bGF0b3JzLmNvbXBvbmVudC5jc3MiLCJzb3VyY2VzQ29udGVudCI6WyIqW2RhdGEtZGVzY3JdIHtcbiAgcG9zaXRpb246IHJlbGF0aXZlO1xuICBjdXJzb3I6IGhlbHA7XG59XG5cbipbZGF0YS1kZXNjcl06YWZ0ZXIge1xuICB2ZXJ0aWNhbC1hbGlnbjogdG9wO1xuICBjb2xvcjogaW5oZXJpdDtcbiAgZm9udC1zaXplOiBzbWFsbDtcbiAgY29udGVudDogXCI/XCI7XG59XG5cbipbZGF0YS1kZXNjcl06aG92ZXI6OmFmdGVyLFxuKltkYXRhLWRlc2NyXTpmb2N1czo6YWZ0ZXIge1xuICBjb250ZW50OiBhdHRyKGRhdGEtZGVzY3IpO1xuXG4gIHBvc2l0aW9uOiBhYnNvbHV0ZTtcbiAgbGVmdDogYXV0bztcbiAgbWluLXdpZHRoOiAyMDBweDtcbiAgYm9yZGVyOiAxcHggI2FhYWFhYSBzb2xpZDtcbiAgYm9yZGVyLXJhZGl1czogMTBweDtcbiAgYmFja2dyb3VuZC1jb2xvcjogIzBiNGE5MjtcbiAgcGFkZGluZzogMTJweDtcbiAgY29sb3I6ICNlMGUwZTA7XG5cbiAgZm9udC1zaXplOiAxNHB4O1xuICBmb250LXN0eWxlOiBub3JtYWw7XG4gIGZvbnQtd2VpZ2h0OiBsaWdodGVyO1xuICB6LWluZGV4OiAxO1xuICB0ZXh0LWFsaWduOiBjZW50ZXI7XG4gIG9wYWNpdHk6IDAuOTtcbiAgdHJhbnNpdGlvbjogb3BhY2l0eSAxcztcbn1cblxub3B0aW9uW3RpdGxlXTpob3ZlcjphZnRlcixcbm9wdGlvblt0aXRsZV06Zm9jdXM6YWZ0ZXIge1xuICBjb250ZW50OiBhdHRyKHRpdGxlKTtcbn1cblxuLyogVG9vbHRpcCBjb250YWluZXJcbi50b29sdGlwIHtcbiAgcG9zaXRpb246IHJlbGF0aXZlO1xufVxuXG4vKiBUb29sdGlwIHRleHRcbi50b29sdGlwIC50b29sdGlwdGV4dCB7XG4gIHZpc2liaWxpdHk6IGhpZGRlbjtcbiAgd2lkdGg6IDIwMHB4O1xuICBiYWNrZ3JvdW5kLWNvbG9yOiAjNTU1O1xuICBjb2xvcjogI2ZmZjtcbiAgdGV4dC1hbGlnbjogY2VudGVyO1xuICBwYWRkaW5nOiAxMHB4IDA7XG4gIGJvcmRlci1yYWRpdXM6IDZweDtcbiAgbWFyZ2luOiAxMHB4O1xuICBmb250LXNpemU6IHNtYWxsO1xuXG4gIC8qIFBvc2l0aW9uIHRoZSB0b29sdGlwIHRleHRcbiAgcG9zaXRpb246IGFic29sdXRlO1xuICB6LWluZGV4OiAxO1xuICBib3R0b206IDEyNSU7XG4gIGxlZnQ6IDUwJTtcbiAgbWFyZ2luLWxlZnQ6IC0xMDBweDtcblxuICAvKiBGYWRlIGluIHRvb2x0aXBcbiAgb3BhY2l0eTogMDtcbiAgdHJhbnNpdGlvbjogb3BhY2l0eSAwLjVzO1xufVxuXG4udG9vbHRpcDo6YWZ0ZXIge1xuICB2ZXJ0aWNhbC1hbGlnbjogdG9wO1xuICBjb2xvcjogaW5oZXJpdDtcbiAgZm9udC1zaXplOiBzbWFsbDtcbiAgY29udGVudDogXCI/XCI7XG59XG5cbi8qIFRvb2x0aXAgYXJyb3dcbi50b29sdGlwIC50b29sdGlwdGV4dDo6YWZ0ZXIge1xuICBjb250ZW50OiBcIlwiO1xuICBwb3NpdGlvbjogYWJzb2x1dGU7XG4gIHRvcDogMTAwJTtcbiAgbGVmdDogNTAlO1xuICBtYXJnaW4tbGVmdDogLTVweDtcbiAgYm9yZGVyLXdpZHRoOiA1cHg7XG4gIGJvcmRlci1zdHlsZTogc29saWQ7XG4gIGJvcmRlci1jb2xvcjogIzU1NSB0cmFuc3BhcmVudCB0cmFuc3BhcmVudCB0cmFuc3BhcmVudDtcbn1cblxuLyogU2hvdyB0aGUgdG9vbHRpcCB0ZXh0IHdoZW4geW91IG1vdXNlIG92ZXIgdGhlIHRvb2x0aXAgY29udGFpbmVyXG4udG9vbHRpcDpob3ZlciAudG9vbHRpcHRleHQge1xuICB2aXNpYmlsaXR5OiB2aXNpYmxlO1xuICBvcGFjaXR5OiAxO1xufSAqL1xuIiwiQGltcG9ydCBcIi4vdG9vbHRpcC5jc3NcIjtcblxuKiB7XG4gIGNvbG9yOiAjZGRkO1xuICBiYWNrZ3JvdW5kLWNvbG9yOiAjMjIyO1xuICBmb250LWZhbWlseTogQXJpYWwsIEhlbHZldGljYSwgc2Fucy1zZXJpZjtcbiAgYm9yZGVyLWNvbG9yOiAjZGRkO1xufVxuXG4vKiBBcHBsaWNhdGlvbi13aWRlIFN0eWxlcyAqL1xuaDEge1xuICBjb2xvcjogcmdiKDc0LCAxNjUsIDI1NSk7XG4gIGZvbnQtZmFtaWx5OiBBcmlhbCwgSGVsdmV0aWNhLCBzYW5zLXNlcmlmO1xuICBmb250LXNpemU6IDI1MCU7XG59XG5cbmgyIHtcbiAgZm9udC1mYW1pbHk6IEFyaWFsLCBIZWx2ZXRpY2EsIHNhbnMtc2VyaWY7XG4gIGZvbnQtd2VpZ2h0OiBib2xkZXI7XG59XG5cbmgzIHtcbiAgZm9udC1mYW1pbHk6IEFyaWFsLCBIZWx2ZXRpY2EsIHNhbnMtc2VyaWY7XG4gIGZvbnQtd2VpZ2h0OiBub3JtYWw7XG4gIHBhZGRpbmctdG9wOiAxZW07XG59XG5cbmJvZHkge1xuICBtYXJnaW46IDJlbTtcbn1cblxuaW5wdXQsXG50ZXh0YXJlYSxcbnNlbGVjdCB7XG4gIGZvbnQtc2l6ZTogbGFyZ2U7XG4gIGNvbG9yOiByZ2IoNjEsIDIyOCwgMTkyKTtcbiAgYm9yZGVyLXRvcC1zdHlsZTogaGlkZGVuO1xuICBib3JkZXItbGVmdC1zdHlsZTogaGlkZGVuO1xuICBib3JkZXItcmlnaHQtc3R5bGU6IGhpZGRlbjtcbn1cblxuaW5wdXRbdHlwZT1cInRleHRcIl0sXG5pbnB1dFt0eXBlPVwidXJsXCJdLFxudGV4dGFyZWEge1xuICBtYXJnaW4tYm90dG9tOiAwLjVlbTtcbiAgbWFyZ2luLWxlZnQ6IDAuNWVtO1xuICBtYXJnaW4tcmlnaHQ6IDAuNWVtO1xuICBtYXJnaW4tdG9wOiBub25lO1xuICBib3JkZXItdG9wLXdpZHRoOiAwcHg7XG4gIGJvcmRlci10b3Atc3R5bGU6IGhpZGRlbjtcbiAgYm9yZGVyLWxlZnQtc3R5bGU6IGhpZGRlbjtcbiAgYm9yZGVyLXJpZ2h0LXN0eWxlOiBoaWRkZW47XG4gIGJvcmRlci1sZWZ0LXdpZHRoOiAwcHg7XG4gIGJvcmRlci1yaWdodC13aWR0aDogMHB4O1xuICB3aWR0aDogOTAlO1xuICBkaXNwbGF5OiBibG9jaztcbn1cblxuaW5wdXRbdHlwZT1cIm51bWJlclwiXSB7XG4gIHdpZHRoOiA1MHB4O1xuICB0ZXh0LWFsaWduOiBjZW50ZXI7XG4gIGFwcGVhcmFuY2U6IHRleHRmaWVsZDtcbn1cblxudGV4dGFyZWEge1xuICB3aWR0aDogOTAlO1xuICByZXNpemU6IHZlcnRpY2FsO1xufVxuXG5idXR0b24ge1xuICBjb2xvcjogI2RkZDtcbiAgY29sb3I6IHJnYig2MSwgMjI4LCAxOTIpO1xuICBiYWNrZ3JvdW5kLWNvbG9yOiByZ2IoNjEsIDIyOCwgMTkyKTtcbiAgYmFja2dyb3VuZC1jb2xvcjogIzIyMjtcbiAgY29sb3I6IHJnYig2MSwgMjI4LCAxOTIpO1xuICBib3JkZXItY29sb3I6ICNkZGQ7XG4gIGZvbnQtZmFtaWx5OiBBcmlhbCwgSGVsdmV0aWNhLCBzYW5zLXNlcmlmO1xuICBmb250LXdlaWdodDogYm9sZDtcbiAgbWFyZ2luLWJvdHRvbTogMC41ZW07XG4gIG1hcmdpbi1sZWZ0OiAwLjVlbTtcbiAgbWFyZ2luLXJpZ2h0OiAwLjVlbTtcbiAgbWFyZ2luLXRvcDogMC41ZW07XG4gIGJvcmRlci1yYWRpdXM6IDVweDtcbiAgbWluLWhlaWdodDogMzBweDtcbiAgdGV4dC1vdmVyZmxvdzogY2xpcDtcbn1cblxuYnV0dG9uID4gZmEtaWNvbiB7XG4gIGNvbG9yOiBpbmhlcml0O1xuICBiYWNrZ3JvdW5kLWNvbG9yOiBpbmhlcml0O1xufVxuXG5idXR0b246ZGlzYWJsZWQge1xuICBjb2xvcjogI2FhYTtcbiAgYmFja2dyb3VuZC1jb2xvcjogIzIyMjtcbiAgZm9udC13ZWlnaHQ6IGxpZ2h0ZXI7XG59XG5cbmJ1dHRvbi5uZXh0IHtcbiAgcmlnaHQ6IDBweDtcbiAgY29sb3I6IHJnYig2MSwgMjI4LCAxOTIpO1xuICBib3JkZXItY29sb3I6IHJnYig2MSwgMjI4LCAxOTIpO1xufVxuXG5zZWxlY3Qge1xuICBtaW4td2lkdGg6IDEwZW07XG59XG5cbi8qIGV2ZXJ5d2hlcmUgZWxzZSAqL1xuXG4qIHtcbiAgZm9udC1mYW1pbHk6IEFyaWFsLCBIZWx2ZXRpY2EsIHNhbnMtc2VyaWY7XG59XG5cbmxhYmVsIHtcbiAgZGlzcGxheTogYmxvY2s7XG4gIG1hcmdpbi10b3A6IDFlbTtcbiAgbWFyZ2luLWJvdHRvbTogMWVtO1xufVxuXG4ubWFpbiB7XG4gIHdpZHRoOiAxMDAlO1xuICBkaXNwbGF5OiBmbGV4O1xuICBmbGV4LWRpcmVjdGlvbjogcm93O1xufVxuXG4ubmF2aWdhdGlvbiB7XG4gIHdpZHRoOiAyMCU7XG4gIGRpc3BsYXk6IGZsZXg7XG4gIGZsZXgtZGlyZWN0aW9uOiBjb2x1bW47XG4gIGFsaWduLWl0ZW1zOiBzdHJldGNoO1xuICBtYXJnaW4tcmlnaHQ6IDIwcHg7XG59XG5cbi5zdGVwLWRldGFpbCB7XG4gIHdpZHRoOiA4MCU7XG4gIGJvcmRlcjogMXB4O1xuICBib3JkZXItbGVmdC1zdHlsZTogZGFzaGVkO1xuICBib3JkZXItcmlnaHQtc3R5bGU6IGhpZGRlbjtcbiAgYm9yZGVyLXRvcC1zdHlsZTogaGlkZGVuO1xuICBib3JkZXItYm90dG9tLXN0eWxlOiBoaWRkZW47XG4gIHBhZGRpbmc6IDFlbTtcbiAgbWFyZ2luLWJvdHRvbTogMC41ZW07XG59XG5cbi8qIC5zdGVwLWRldGFpbCB7XG4gIHdpZHRoOiA4MCU7XG4gIGJvcmRlcjogMXB4O1xuICBib3JkZXItbGVmdC1zdHlsZTogZGFzaGVkO1xuICBib3JkZXItcmlnaHQtc3R5bGU6IGhpZGRlbjtcbiAgYm9yZGVyLXRvcC1zdHlsZTogaGlkZGVuO1xuICBib3JkZXItYm90dG9tLXN0eWxlOiBoaWRkZW47XG4gIHBhZGRpbmc6IDFlbTtcbiAgbWFyZ2luLWJvdHRvbTogMC41ZW07XG59ICovXG5cbi8qIC5tb2RlbCB7XG4gIHdpZHRoOiA4MCU7XG4gIGJvcmRlcjogMXB4O1xuICBib3JkZXItbGVmdC1zdHlsZTogZGFzaGVkO1xuICBib3JkZXItcmlnaHQtc3R5bGU6IGhpZGRlbjtcbiAgYm9yZGVyLXRvcC1zdHlsZTogaGlkZGVuO1xuICBib3JkZXItYm90dG9tLXN0eWxlOiBoaWRkZW47XG4gIHBhZGRpbmc6IDFlbTtcbiAgbWFyZ2luLWJvdHRvbTogMC41ZW07XG59ICovXG5cbmlucHV0OmludmFsaWQge1xuICBib3JkZXI6IHJlZCBzb2xpZCAzcHg7XG59XG4iLCJAaW1wb3J0IFwiLi4vYXBwLmNvbXBvbmVudC5jc3NcIjtcblxuZGl2IC5zdHJpbmctbGlzdC1tYW5pcHVsYXRvciB7XG4gIGJvcmRlcjogMXB4O1xuICBib3JkZXItY29sb3I6IGJsYWNrO1xuICBib3JkZXItc3R5bGU6IGRhc2hlZDtcbiAgcGFkZGluZzogMWVtO1xuICBtYXJnaW4tYm90dG9tOiAwLjVlbTtcbn1cbiJdfQ== */";
    /***/
  },

  /***/
  "./src/app/string-list-manipulators/string-list-manipulators.component.ts":
  /*!********************************************************************************!*\
    !*** ./src/app/string-list-manipulators/string-list-manipulators.component.ts ***!
    \********************************************************************************/

  /*! exports provided: StringListManipulatorsComponent */

  /***/
  function srcAppStringListManipulatorsStringListManipulatorsComponentTs(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "StringListManipulatorsComponent", function () {
      return StringListManipulatorsComponent;
    });
    /* harmony import */


    var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
    /*! tslib */
    "./node_modules/tslib/tslib.es6.js");
    /* harmony import */


    var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
    /*! @angular/core */
    "./node_modules/@angular/core/fesm2015/core.js");
    /* harmony import */


    var _fortawesome_free_solid_svg_icons__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(
    /*! @fortawesome/free-solid-svg-icons */
    "./node_modules/@fortawesome/free-solid-svg-icons/index.es.js");
    /* harmony import */


    var src_model_tool_description__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(
    /*! src/model/tool-description */
    "./src/model/tool-description.ts");
    /* harmony import */


    var _lang__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(
    /*! ../lang */
    "./src/app/lang.ts");

    var StringListManipulatorsComponent =
    /*#__PURE__*/
    function () {
      function StringListManipulatorsComponent() {
        _classCallCheck(this, StringListManipulatorsComponent);

        this.iconAdd = _fortawesome_free_solid_svg_icons__WEBPACK_IMPORTED_MODULE_2__["faPlus"];
        this.iconRemove = _fortawesome_free_solid_svg_icons__WEBPACK_IMPORTED_MODULE_2__["faTimes"];
        this.iconUp = _fortawesome_free_solid_svg_icons__WEBPACK_IMPORTED_MODULE_2__["faArrowUp"];
        this.iconDown = _fortawesome_free_solid_svg_icons__WEBPACK_IMPORTED_MODULE_2__["faArrowDown"];
        this.lang = _lang__WEBPACK_IMPORTED_MODULE_4__["Lang"].getInstance();
      }

      _createClass(StringListManipulatorsComponent, [{
        key: "ngOnInit",
        value: function ngOnInit() {
          this.selectedManipulatorClass = "Join";
        }
      }, {
        key: "add",
        value: function add() {
          var m = src_model_tool_description__WEBPACK_IMPORTED_MODULE_3__["StringListManipulatorFactory"].create(this.selectedManipulatorClass);
          this.manipulators.push(m);
        }
      }, {
        key: "remove",
        value: function remove(m) {
          var index = this.manipulators.indexOf(m);
          return this.manipulators.splice(index, 1)[0];
        }
      }, {
        key: "moveUp",
        value: function moveUp(m) {
          var index = this.manipulators.indexOf(m);
          this.remove(m);
          this.manipulators.splice(index - 1, 0, m);
        }
      }, {
        key: "moveDown",
        value: function moveDown(m) {
          var index = this.manipulators.indexOf(m);
          this.remove(m);
          this.manipulators.splice(index + 1, 0, m);
        }
      }, {
        key: "isJoin",
        value: function isJoin(m) {
          return m instanceof src_model_tool_description__WEBPACK_IMPORTED_MODULE_3__["Join"];
        }
      }, {
        key: "isPrependEach",
        value: function isPrependEach(m) {
          return m instanceof src_model_tool_description__WEBPACK_IMPORTED_MODULE_3__["PrependEach"];
        }
      }, {
        key: "isAppendEach",
        value: function isAppendEach(m) {
          return m instanceof src_model_tool_description__WEBPACK_IMPORTED_MODULE_3__["AppendEach"];
        }
      }, {
        key: "isAppendListWith",
        value: function isAppendListWith(m) {
          return m instanceof src_model_tool_description__WEBPACK_IMPORTED_MODULE_3__["AppendListWith"];
        }
      }, {
        key: "isPrependListWith",
        value: function isPrependListWith(m) {
          return m instanceof src_model_tool_description__WEBPACK_IMPORTED_MODULE_3__["PrependListWith"];
        }
      }, {
        key: "isToFlag",
        value: function isToFlag(m) {
          return m instanceof src_model_tool_description__WEBPACK_IMPORTED_MODULE_3__["ToFlag"];
        }
      }]);

      return StringListManipulatorsComponent;
    }();

    tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Input"])()], StringListManipulatorsComponent.prototype, "manipulators", void 0);
    StringListManipulatorsComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
      selector: "app-string-list-manipulators",
      template: tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(
      /*! raw-loader!./string-list-manipulators.component.html */
      "./node_modules/raw-loader/dist/cjs.js!./src/app/string-list-manipulators/string-list-manipulators.component.html")).default,
      styles: [tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(
      /*! ./string-list-manipulators.component.css */
      "./src/app/string-list-manipulators/string-list-manipulators.component.css")).default]
    })], StringListManipulatorsComponent);
    /***/
  },

  /***/
  "./src/environments/environment.ts":
  /*!*****************************************!*\
    !*** ./src/environments/environment.ts ***!
    \*****************************************/

  /*! exports provided: environment */

  /***/
  function srcEnvironmentsEnvironmentTs(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "environment", function () {
      return environment;
    });
    /* harmony import */


    var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
    /*! tslib */
    "./node_modules/tslib/tslib.es6.js"); // This file can be replaced during build by using the `fileReplacements` array.
    // `ng build --prod` replaces `environment.ts` with `environment.prod.ts`.
    // The list of file replacements can be found in `angular.json`.


    var environment = {
      production: false
    };
    /*
     * For easier debugging in development mode, you can import the following file
     * to ignore zone related error stack frames such as `zone.run`, `zoneDelegate.invokeTask`.
     *
     * This import should be commented out in production mode because it will have a negative impact
     * on performance if an error is thrown.
     */
    // import 'zone.js/dist/zone-error';  // Included with Angular CLI.

    /***/
  },

  /***/
  "./src/main.ts":
  /*!*********************!*\
    !*** ./src/main.ts ***!
    \*********************/

  /*! no exports provided */

  /***/
  function srcMainTs(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony import */


    var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
    /*! tslib */
    "./node_modules/tslib/tslib.es6.js");
    /* harmony import */


    var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
    /*! @angular/core */
    "./node_modules/@angular/core/fesm2015/core.js");
    /* harmony import */


    var _angular_platform_browser_dynamic__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(
    /*! @angular/platform-browser-dynamic */
    "./node_modules/@angular/platform-browser-dynamic/fesm2015/platform-browser-dynamic.js");
    /* harmony import */


    var _app_app_module__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(
    /*! ./app/app.module */
    "./src/app/app.module.ts");
    /* harmony import */


    var _environments_environment__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(
    /*! ./environments/environment */
    "./src/environments/environment.ts");

    if (_environments_environment__WEBPACK_IMPORTED_MODULE_4__["environment"].production) {
      Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["enableProdMode"])();
    }

    Object(_angular_platform_browser_dynamic__WEBPACK_IMPORTED_MODULE_2__["platformBrowserDynamic"])().bootstrapModule(_app_app_module__WEBPACK_IMPORTED_MODULE_3__["AppModule"]).catch(function (err) {
      return console.error(err);
    });
    /***/
  },

  /***/
  "./src/model/activity-description.ts":
  /*!*******************************************!*\
    !*** ./src/model/activity-description.ts ***!
    \*******************************************/

  /*! exports provided: Activity, Parameter, ParameterType, InputDataset, OutputDataset, Constraint, FunctionalEntity */

  /***/
  function srcModelActivityDescriptionTs(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "Activity", function () {
      return Activity;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "Parameter", function () {
      return Parameter;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "ParameterType", function () {
      return ParameterType;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "InputDataset", function () {
      return InputDataset;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "OutputDataset", function () {
      return OutputDataset;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "Constraint", function () {
      return Constraint;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "FunctionalEntity", function () {
      return FunctionalEntity;
    });
    /* harmony import */


    var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
    /*! tslib */
    "./node_modules/tslib/tslib.es6.js");
    /*
     * This metaclass describes the information necessary to execute a command
     * line application, as well as its inputs and outputs.
     */


    var Activity = function Activity() {
      _classCallCheck(this, Activity);

      this.parameters = [];
      this.inputDatasets = [];
      this.outputDatasets = []; //functionalEntity: FunctionalEntity | null;
    };
    /*
     * This metaclass describes a parameter of a command line application.
     * A parameter is a argument that is passed by its value.
     * @SeeOther Dataset
     */


    var Parameter =
    /*#__PURE__*/
    function () {
      function Parameter() {
        _classCallCheck(this, Parameter);

        this.minimumCardinality = 1;
        this.maximumCardinality = 1;
        this.parameterType = ParameterType.STRING;
        /*invariant defaultValueCardinalityMustBeLessThanMaximum:
        if maximumCardinality > 1 then
        defaultValue -> size() <= maximumCardinality
                    else true endif;*/
      }

      _createClass(Parameter, [{
        key: "getExampleValues",
        value: function getExampleValues() {
          var values = [];

          if (this.maximumCardinality == 1) {
            values = [this.name.toUpperCase()];
          } else {
            values = [this.name.toUpperCase() + "_0", "...", this.name.toUpperCase() + "_N"];
          }

          return values;
        }
      }]);

      return Parameter;
    }();

    var ParameterType;

    (function (ParameterType) {
      ParameterType["STRING"] = "STRING";
      ParameterType["INTEGER"] = "INTEGER";
      ParameterType["REAL"] = "REAL";
      ParameterType["BOOLEAN"] = "BOOLEAN";
    })(ParameterType || (ParameterType = {}));

    var InputDataset =
    /*#__PURE__*/
    function () {
      function InputDataset() {
        _classCallCheck(this, InputDataset);

        this.minimumCardinality = 1;
        this.maximumCardinality = 1;
      }

      _createClass(InputDataset, [{
        key: "getExampleValues",
        value: function getExampleValues() {
          var values = [];
          console.log(this.maximumCardinality);

          if (this.maximumCardinality === 1) {
            values = [this.name.toUpperCase()];
          } else {
            values = [this.name.toUpperCase() + "_0", "...", this.name.toUpperCase() + "_N"];
          }

          return values;
        }
      }]);

      return InputDataset;
    }();

    var OutputDataset =
    /*#__PURE__*/
    function () {
      function OutputDataset() {
        _classCallCheck(this, OutputDataset);

        this.minimumCardinality = 1;
        this.maximumCardinality = 1;
      }

      _createClass(OutputDataset, [{
        key: "getExampleValues",
        value: function getExampleValues() {
          var values = [];

          if (this.maximumCardinality == 1) {
            values = [this.name.toUpperCase()];
          } else {
            values = [this.name.toUpperCase() + "_0", "...", this.name.toUpperCase() + "_N"];
          }

          return values;
        }
      }]);

      return OutputDataset;
    }();

    var Constraint = function Constraint() {
      _classCallCheck(this, Constraint);
    };
    /*
     * Abstract class to describe a functional entity that can executes
     * an analysis activity.
     */


    var FunctionalEntity = function FunctionalEntity() {
      _classCallCheck(this, FunctionalEntity);
    };
    /***/

  },

  /***/
  "./src/model/deployment-description.ts":
  /*!*********************************************!*\
    !*** ./src/model/deployment-description.ts ***!
    \*********************************************/

  /*! exports provided: Deployment, Service, ServiceContainer, Contact */

  /***/
  function srcModelDeploymentDescriptionTs(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "Deployment", function () {
      return Deployment;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "Service", function () {
      return Service;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "ServiceContainer", function () {
      return ServiceContainer;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "Contact", function () {
      return Contact;
    });
    /* harmony import */


    var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
    /*! tslib */
    "./node_modules/tslib/tslib.es6.js");

    var Deployment = function Deployment() {
      _classCallCheck(this, Deployment);

      this.service = new Service();
      this.container = new ServiceContainer();
      this.contactInformation = new Contact();
    };

    var Service = function Service() {
      _classCallCheck(this, Service);
    };

    var ServiceContainer = function ServiceContainer() {
      _classCallCheck(this, ServiceContainer);
    };

    var Contact = function Contact() {
      _classCallCheck(this, Contact);
    }; //export class URL { }

    /***/

  },

  /***/
  "./src/model/tool-description.ts":
  /*!***************************************!*\
    !*** ./src/model/tool-description.ts ***!
    \***************************************/

  /*! exports provided: CommandLineTool, ExitCode, TerminationStatus, CommandLineEntryList, LiteralCommandLineEntryList, DatasetCommandLineEntryList, ParameterCommandLineEntryList, StringListManipulator, Join, PrependEach, AppendEach, AppendListWith, PrependListWith, ToFlag, StringListManipulatorFactory */

  /***/
  function srcModelToolDescriptionTs(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "CommandLineTool", function () {
      return CommandLineTool;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "ExitCode", function () {
      return ExitCode;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "TerminationStatus", function () {
      return TerminationStatus;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "CommandLineEntryList", function () {
      return CommandLineEntryList;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "LiteralCommandLineEntryList", function () {
      return LiteralCommandLineEntryList;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "DatasetCommandLineEntryList", function () {
      return DatasetCommandLineEntryList;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "ParameterCommandLineEntryList", function () {
      return ParameterCommandLineEntryList;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "StringListManipulator", function () {
      return StringListManipulator;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "Join", function () {
      return Join;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "PrependEach", function () {
      return PrependEach;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "AppendEach", function () {
      return AppendEach;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "AppendListWith", function () {
      return AppendListWith;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "PrependListWith", function () {
      return PrependListWith;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "ToFlag", function () {
      return ToFlag;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "StringListManipulatorFactory", function () {
      return StringListManipulatorFactory;
    });
    /* harmony import */


    var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
    /*! tslib */
    "./node_modules/tslib/tslib.es6.js");
    /* harmony import */


    var _activity_description__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
    /*! ./activity-description */
    "./src/model/activity-description.ts");
    /*
     * A command line tool that can be called to execute the activity.
     */


    var CommandLineTool =
    /*#__PURE__*/
    function (_activity_description) {
      _inherits(CommandLineTool, _activity_description);

      function CommandLineTool() {
        var _this;

        _classCallCheck(this, CommandLineTool);

        _this = _possibleConstructorReturn(this, _getPrototypeOf(CommandLineTool).apply(this, arguments));
        _this.commandLineTemplate = [];
        _this.exitCodes = [];
        return _this;
      }

      return CommandLineTool;
    }(_activity_description__WEBPACK_IMPORTED_MODULE_1__["FunctionalEntity"]);

    var ExitCode = function ExitCode() {
      _classCallCheck(this, ExitCode);
    };

    var TerminationStatus;

    (function (TerminationStatus) {
      TerminationStatus["SUCCEEDED"] = "SUCCEEDED";
      TerminationStatus["FAILED"] = "FAILED";
    })(TerminationStatus || (TerminationStatus = {}));
    /*
     * A list of entries for the command line tool.
     * This entry list can be manipulated before being used
     * for the command line.
     * Each item of the final list will be used as a different
     * argument for the command line tool.
     *
     */


    var CommandLineEntryList =
    /*#__PURE__*/
    function () {
      function CommandLineEntryList() {
        _classCallCheck(this, CommandLineEntryList);

        this.manipulators = [];
      }

      _createClass(CommandLineEntryList, [{
        key: "getCommandLineEntries",
        value: function getCommandLineEntries(base) {
          var aux = base;
          var _iteratorNormalCompletion = true;
          var _didIteratorError = false;
          var _iteratorError = undefined;

          try {
            for (var _iterator = this.manipulators[Symbol.iterator](), _step; !(_iteratorNormalCompletion = (_step = _iterator.next()).done); _iteratorNormalCompletion = true) {
              var m = _step.value;
              aux = m.transform(aux);
            }
          } catch (err) {
            _didIteratorError = true;
            _iteratorError = err;
          } finally {
            try {
              if (!_iteratorNormalCompletion && _iterator.return != null) {
                _iterator.return();
              }
            } finally {
              if (_didIteratorError) {
                throw _iteratorError;
              }
            }
          }

          return aux;
        }
      }]);

      return CommandLineEntryList;
    }();

    var ToolNameCommandLineEntry =
    /*#__PURE__*/
    function (_CommandLineEntryList) {
      _inherits(ToolNameCommandLineEntry, _CommandLineEntryList);

      function ToolNameCommandLineEntry() {
        _classCallCheck(this, ToolNameCommandLineEntry);

        return _possibleConstructorReturn(this, _getPrototypeOf(ToolNameCommandLineEntry).apply(this, arguments));
      }

      _createClass(ToolNameCommandLineEntry, [{
        key: "getExample",
        value: function getExample(activity) {
          return "";
        }
      }]);

      return ToolNameCommandLineEntry;
    }(CommandLineEntryList);

    var LiteralCommandLineEntryList =
    /*#__PURE__*/
    function (_CommandLineEntryList2) {
      _inherits(LiteralCommandLineEntryList, _CommandLineEntryList2);

      function LiteralCommandLineEntryList() {
        var _this2;

        _classCallCheck(this, LiteralCommandLineEntryList);

        _this2 = _possibleConstructorReturn(this, _getPrototypeOf(LiteralCommandLineEntryList).apply(this, arguments));
        _this2.literals = [];
        /*invariant OneOrMoreLiterals:
        literals -> size() > 0;*/

        return _this2;
      }

      _createClass(LiteralCommandLineEntryList, [{
        key: "getExample",
        value: function getExample(activity) {
          return this.getCommandLineEntries(this.literals).join(" ");
        }
      }]);

      return LiteralCommandLineEntryList;
    }(CommandLineEntryList);

    var DatasetCommandLineEntryList =
    /*#__PURE__*/
    function (_CommandLineEntryList3) {
      _inherits(DatasetCommandLineEntryList, _CommandLineEntryList3);

      function DatasetCommandLineEntryList() {
        _classCallCheck(this, DatasetCommandLineEntryList);

        return _possibleConstructorReturn(this, _getPrototypeOf(DatasetCommandLineEntryList).apply(this, arguments));
      }

      _createClass(DatasetCommandLineEntryList, [{
        key: "getExample",
        value: function getExample(activity) {
          var _this3 = this;

          if (this.dataset) {
            var aux = activity.inputDatasets.concat(activity.outputDatasets).find(function (e) {
              return e.name == _this3.dataset;
            });
            return this.getCommandLineEntries(aux.getExampleValues()).join(" ");
          } else {
            return "";
          }
        }
      }]);

      return DatasetCommandLineEntryList;
    }(CommandLineEntryList);

    var ParameterCommandLineEntryList =
    /*#__PURE__*/
    function (_CommandLineEntryList4) {
      _inherits(ParameterCommandLineEntryList, _CommandLineEntryList4);

      function ParameterCommandLineEntryList() {
        _classCallCheck(this, ParameterCommandLineEntryList);

        return _possibleConstructorReturn(this, _getPrototypeOf(ParameterCommandLineEntryList).apply(this, arguments));
      }

      _createClass(ParameterCommandLineEntryList, [{
        key: "getExample",
        value: function getExample(activity) {
          var _this4 = this;

          if (this.parameter) {
            var aux = activity.parameters.find(function (e) {
              return e.name == _this4.parameter;
            });
            return this.getCommandLineEntries(aux.getExampleValues()).join(" ");
          } else {
            return "";
          }
        }
      }]);

      return ParameterCommandLineEntryList;
    }(CommandLineEntryList);
    /*
     * Subclasses must implement a closure on lists of strings.
     */


    var StringListManipulator =
    /*#__PURE__*/
    function () {
      function StringListManipulator() {
        _classCallCheck(this, StringListManipulator);
      }

      _createClass(StringListManipulator, [{
        key: "flatten",
        value: function flatten(listOfStringList) {
          var flattened = [];

          for (var i = 0; i < listOfStringList.length; i++) {
            if (Array.isArray(listOfStringList[i])) {
              flattened = flattened.concat(this.flatten(listOfStringList[i]));
            } else {
              flattened.push(listOfStringList[i]);
            }
          }

          return flattened;
        }
      }]);

      return StringListManipulator;
    }();

    var Join =
    /*#__PURE__*/
    function (_StringListManipulato) {
      _inherits(Join, _StringListManipulato);

      function Join() {
        var _this5;

        _classCallCheck(this, Join);

        _this5 = _possibleConstructorReturn(this, _getPrototypeOf(Join).apply(this, arguments));
        _this5.identifier = "Join";
        return _this5;
      }

      _createClass(Join, [{
        key: "transform",
        value: function transform(stringList) {
          return [stringList.join(this.delimiter)];
        }
      }]);

      return Join;
    }(StringListManipulator);

    var PrependEach =
    /*#__PURE__*/
    function (_StringListManipulato2) {
      _inherits(PrependEach, _StringListManipulato2);

      function PrependEach() {
        var _this6;

        _classCallCheck(this, PrependEach);

        _this6 = _possibleConstructorReturn(this, _getPrototypeOf(PrependEach).apply(this, arguments));
        _this6.identifier = "PrependEach";
        return _this6;
      }

      _createClass(PrependEach, [{
        key: "transform",
        value: function transform(stringList) {
          var _this7 = this;

          return this.flatten(stringList.map(function (e) {
            return _this7.value + e;
          }));
        }
      }]);

      return PrependEach;
    }(StringListManipulator);

    var AppendEach =
    /*#__PURE__*/
    function (_StringListManipulato3) {
      _inherits(AppendEach, _StringListManipulato3);

      function AppendEach() {
        var _this8;

        _classCallCheck(this, AppendEach);

        _this8 = _possibleConstructorReturn(this, _getPrototypeOf(AppendEach).apply(this, arguments));
        _this8.identifier = "AppendEach";
        return _this8;
      }

      _createClass(AppendEach, [{
        key: "transform",
        value: function transform(stringList) {
          var _this9 = this;

          return this.flatten(stringList.map(function (e) {
            return e + _this9.value;
          }));
        }
      }]);

      return AppendEach;
    }(StringListManipulator);

    var AppendListWith =
    /*#__PURE__*/
    function (_StringListManipulato4) {
      _inherits(AppendListWith, _StringListManipulato4);

      function AppendListWith() {
        var _this10;

        _classCallCheck(this, AppendListWith);

        _this10 = _possibleConstructorReturn(this, _getPrototypeOf(AppendListWith).apply(this, arguments));
        _this10.identifier = "AppendListWith";
        return _this10;
      }

      _createClass(AppendListWith, [{
        key: "transform",
        value: function transform(stringList) {
          var clone = Object.assign([], stringList);
          return clone.concat(this.value);
        }
      }]);

      return AppendListWith;
    }(StringListManipulator);

    var PrependListWith =
    /*#__PURE__*/
    function (_StringListManipulato5) {
      _inherits(PrependListWith, _StringListManipulato5);

      function PrependListWith() {
        var _this11;

        _classCallCheck(this, PrependListWith);

        _this11 = _possibleConstructorReturn(this, _getPrototypeOf(PrependListWith).apply(this, arguments));
        _this11.identifier = "PrependListWith";
        return _this11;
      }

      _createClass(PrependListWith, [{
        key: "transform",
        value: function transform(stringList) {
          var clone = Object.assign([], stringList);
          return [this.value].concat(clone);
        }
      }]);

      return PrependListWith;
    }(StringListManipulator);

    var ToFlag =
    /*#__PURE__*/
    function (_StringListManipulato6) {
      _inherits(ToFlag, _StringListManipulato6);

      function ToFlag() {
        var _this12;

        _classCallCheck(this, ToFlag);

        _this12 = _possibleConstructorReturn(this, _getPrototypeOf(ToFlag).apply(this, arguments));
        _this12.identifier = "ToFlag";
        return _this12;
      }

      _createClass(ToFlag, [{
        key: "transform",
        value: function transform(stringList) {
          var _this13 = this;

          return stringList.map(function (e) {
            if (e) {
              return _this13.ifTrue;
            } else {
              return _this13.ifFalse;
            }
          });
        }
      }]);

      return ToFlag;
    }(StringListManipulator);

    var StringListManipulatorFactory =
    /*#__PURE__*/
    function () {
      function StringListManipulatorFactory() {
        _classCallCheck(this, StringListManipulatorFactory);
      }

      _createClass(StringListManipulatorFactory, null, [{
        key: "create",
        value: function create(className) {
          switch (className) {
            case "Join":
              {
                return new Join();
              }

            case "PrependEach":
              {
                return new PrependEach();
              }

            case "AppendEach":
              {
                return new AppendEach();
              }

            case "AppendListWith":
              {
                return new AppendListWith();
              }

            case "PrependListWith":
              {
                return new PrependListWith();
              }

            case "ToFlag":
              {
                return new ToFlag();
              }
          }
        }
      }]);

      return StringListManipulatorFactory;
    }();
    /***/

  },

  /***/
  0:
  /*!***************************!*\
    !*** multi ./src/main.ts ***!
    \***************************/

  /*! no static exports found */

  /***/
  function _(module, exports, __webpack_require__) {
    module.exports = __webpack_require__(
    /*! /home/cawal/git/lssb/activity-rest-framework/bootstrap/activityrest-bootstrap/src/main.ts */
    "./src/main.ts");
    /***/
  }
}, [[0, "runtime", "vendor"]]]);
//# sourceMappingURL=main-es5.js.map