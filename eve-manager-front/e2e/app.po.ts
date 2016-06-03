export class EveManagerFrontPage {
  navigateTo() {
    return browser.get('/');
  }

  getParagraphText() {
    return element(by.css('eve-manager-front-app h1')).getText();
  }
}
