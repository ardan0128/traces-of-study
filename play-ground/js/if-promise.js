const myPromise1 = new Promise((resolve, reject) => {
  setTimeout(() => {
    resolve('foo300');
  }, 300);
});

const myPromise2 = new Promise((resolve, reject) => {
  setTimeout(() => {
    resolve('foo1000');
  }, 1000);
});

function promiseTest() {
  if (myPromise2) {
    console.log('2', true);
  }

  if (myPromise1) {
    console.log('1', true);
  }
}

promiseTest();
