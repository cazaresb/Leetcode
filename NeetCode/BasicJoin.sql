CREATE TABLE person (
  personId SERIAL PRIMARY KEY,
  firstName VARCHAR(15),
  lastName  VARCHAR(15)
);

CREATE TABLE address (
  addressId SERIAL PRIMARY KEY,
  personId REFERENCES person(personId),
  city VARCHAR(100),
  state VARCHAR(100)
);

-- Basic left join 

SELECT p.firstName, p.lastName, s.city, s.state
FROM person p
LEFT JOIN address s
ON p.personId = s.personId;
