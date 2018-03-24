/**
 * A really dumb service that tells subscribers when the global state has changed.
 *
 * We are relying on the server to tell us how the state changed rather than
 * intelligently sharing state on the front end, because the purpose of this
 * project is to get the server just right.
 */
class StateService {
  constructor() {
    this.listeners = [];
  }

  subscribe(listener) {
    this.listeners.push(listener);

    // Return an unsubscribe function
    return () => {
      this.listeners = this.listeners.filter(l => l !== listener);
    };
  }

  notify() {
    this.listeners.forEach(l => l());
  }
}

const service = new StateService();

export default service;
