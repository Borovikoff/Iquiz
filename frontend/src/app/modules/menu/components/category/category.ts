export class Category{
   idCategory: string;
   text: string;
   category: string;
   imgLink: string;

  static cloneBase(category: Category): Category {
    const clonedCategory: Category = new Category();
    clonedCategory.idCategory = category.idCategory;
    clonedCategory.text = category.text;
    clonedCategory.category = category.category;
    clonedCategory.imgLink = category.imgLink;
    return clonedCategory;
  }
}
export class CategoryStr {
}
