declare global {
  function helloWorld(): string;
}

export function hello() {
  return global.helloWorld();
}
