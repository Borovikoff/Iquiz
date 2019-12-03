export class Prof {
  idUser: String;
  login: String;
  password: String;
  name: String;
  surname: String;
  email: String;
  idRole: String;
  patronymic: String;

  static cloneBase(prof: Prof): Prof {
    const clonedProf: Prof = new Prof();
    clonedProf.idUser = prof.idUser;
    clonedProf.login = prof.login;
    clonedProf.password = prof.password;
    clonedProf.name = prof.name;
    clonedProf.surname = prof.surname;
    clonedProf.email = prof.email;
    clonedProf.patronymic = prof.patronymic;

    return clonedProf;
  }
}

