const DELAY = 1000;

class IndexCtrl {

  constructor($interval, $http) {
    this.currentTime = this.getDate();
    $interval(() => {
      this.currentTime = this.getDate();
    }, DELAY);

    this.$http = $http;

    this.getQuote();
  }

  getDate() {
    const date = new Date();
    return this.addZero(date.getHours()) + ':' + this.addZero(date.getMinutes()) + ':' + this.addZero(date.getSeconds());
  }

  addZero(i) {
    if (i < 10) {
      i = '0' + i;
    }
    return i;
  }

  getQuote() {
    this.$http.get('quote').then(res => this.quote = res.data);
  }
}

IndexCtrl.$inject = ['$interval', '$http'];

export default IndexCtrl;
