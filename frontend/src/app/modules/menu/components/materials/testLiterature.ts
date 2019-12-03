export class TestLiterature{
  idTest: string;
  testName: string;
  idLiterature: string;
  link: string;

  static cloneBase(testLiterature: TestLiterature): TestLiterature {
    const clonedTestLiterature: TestLiterature = new TestLiterature();
    clonedTestLiterature.idTest = testLiterature.idTest;
    clonedTestLiterature.testName = testLiterature.testName;
    clonedTestLiterature.idLiterature = testLiterature.idLiterature;
    clonedTestLiterature.link = testLiterature.link;
    return clonedTestLiterature;
  }
}
