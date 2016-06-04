import { EveManagerFrontPage } from './app.po';

describe('eve-manager-front App', function() {
  let page: EveManagerFrontPage;

  beforeEach(() => {
    page = new EveManagerFrontPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('eve-manager-front works!');
  });
});
