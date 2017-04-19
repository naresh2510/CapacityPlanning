import { BBCGradlePage } from './app.po';

describe('bbc-gradle App', function() {
  let page: BBCGradlePage;

  beforeEach(() => {
    page = new BBCGradlePage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
