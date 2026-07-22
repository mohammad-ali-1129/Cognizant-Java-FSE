import "../Stylesheets/mystyle.css";

function CalculateScore() {
  const Name = "John";
  const School = "ABC Public School";
  const Total = 450;
  const Goal = 500;
  const Average = Total / 5;

  return (
    <div className="container">
      <h2>Student Score Calculator</h2>
      <p><strong>Name:</strong> {Name}</p>
      <p><strong>School:</strong> {School}</p>
      <p><strong>Total:</strong> {Total}</p>
      <p><strong>Goal:</strong> {Goal}</p>
      <p><strong>Average Score:</strong> {Average}</p>
    </div>
  );
}

export default CalculateScore;