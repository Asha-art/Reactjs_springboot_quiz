import axios from "axios";

const QUIZ_REST_API_URL = "http://localhost:8080/api/questions";

class QuizService {
  getQuiz() {
    return axios.get(QUIZ_REST_API_URL);
  }
}

export default new QuizService();
