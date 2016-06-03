import {
  beforeEachProviders,
  describe,
  expect,
  it,
  inject
} from '@angular/core/testing';
import { EveManagerFrontAppComponent } from '../app/eve-manager-front.component';

beforeEachProviders(() => [EveManagerFrontAppComponent]);

describe('App: EveManagerFront', () => {
  it('should create the app',
      inject([EveManagerFrontAppComponent], (app: EveManagerFrontAppComponent) => {
    expect(app).toBeTruthy();
  }));

  it('should have as title \'eve-manager-front works!\'',
      inject([EveManagerFrontAppComponent], (app: EveManagerFrontAppComponent) => {
    expect(app.title).toEqual('eve-manager-front works!');
  }));
});
