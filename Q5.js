db.getCollection("q5").find({})

var person = {
  object: "value",
  name: "Sheldon Cooper",
  age: 39,
  phone: "(626) 7778-9362",
  height: 1.86,
  email: "sheldoncooper@caltech.edu",
  cpf: "123.456.789-00",
  birthday: ISODate("1980-02-28T00:00:00Z"),
  address: {
    zip: "12345-678",
    street: "North Los Robles",
    complement: "Avenue",
    neighborhood: "Penny",
    city: "Pasadena",
    state: "CA",
    country: "EUA"
  }
};


var db = db.getSiblingDB("Q5");

db.person.insertOne(person);
