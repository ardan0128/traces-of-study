function getUser(id) {
  if (id !== 1) {
    throw `Not found user: ${id}`;
  }

  return {
    id: 1,
    name: `joriter`,
  };
}

try {
  let user = getUser(2);
} catch (error) {
  console.log(error);

  user = getUser(1);
}

console.log(user);
