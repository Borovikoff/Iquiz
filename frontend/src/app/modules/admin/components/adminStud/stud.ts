export class Stud {
  idUser: String;
  login: String;
  password: String;
  name: String;
  surname: String;
  email: String;
  idRole: String;
  patronymic: String;
  faculty: String;
  groupNumber: String;
  specialty: String;

  static cloneBase(stud: Stud): Stud {
    const clonedStud: Stud = new Stud();
    clonedStud.idUser = stud.idUser;
    clonedStud.login = stud.login;
    clonedStud.password = stud.password;
    clonedStud.name = stud.name;
    clonedStud.surname = stud.surname;
    clonedStud.email = stud.email;
    clonedStud.patronymic = stud.patronymic;
    clonedStud.faculty = stud.faculty;
    clonedStud.groupNumber = stud.groupNumber;
    clonedStud.specialty = stud.specialty;
    return clonedStud;
  }
}
