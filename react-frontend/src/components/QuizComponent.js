import React from "react";
import QuizService from "../services/QuizService";

class QuizComponent extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      quiz: [],
    };
  }

  componentDidMount() {
    QuizService.getQuiz().then((response) => {
      this.setState({ quiz: response.data });
    });
  }

  render() {
    console.log(this.state.quiz);
    return (
      <div>
        <h1 className="text-center">Questions List</h1>
        <table className="table table-striped">
          <thead>
            <tr>
              <td>Quiz ID</td>
              <td>Question</td>
              <td>Answer1</td>
              <td>Answer2</td>
              <td>Answer</td>
              <td>Answer</td>
              <td>Answer</td>
            </tr>
          </thead>
          <tbody>
            {this.state.quiz.map((question) => (
              <tr key={question.id}>
                <td>{question.id}</td>
                <td>{question.question}</td>
                <td>{question.answer1}</td>
                <td>{question.answer2}</td>
                <td>{question.answer3}</td>
                <td>{question.answer4}</td>
                <td>{question.answer5}</td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    );
  }
}

export default QuizComponent;
