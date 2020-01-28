export class Deployment {
  service: Service;
  container: ServiceContainer;
  contactInformation: Contact;
}
export class Service {
  name: string;
  apiVersion: string;
  description: string | null;
}
export class ServiceContainer {
  name: string | null;
  description: string | null;
  baseUrl: URL;
}
export class Contact {
  name: string | null;
  email: string;
  url: URL | null;
}
//export class URL { }
