package befitmamasfinal;

public class Workout {
	
	private int workoutId;

	private String workout;
	
	private String description;
	
	private int intensity;
	
	private double duration;

	public Workout(int workoutId, String workout, String description, int intensity, double duration) {
		super();
		this.workoutId = workoutId;
		this.workout = workout;
		this.description = description;
		this.intensity = intensity;
		this.duration = duration;
	}

	public int getWorkoutId() {
		return workoutId;
	}

	public void setWorkoutId(int workoutId) {
		this.workoutId = workoutId;
	}

	public String getWorkout() {
		return workout;
	}

	public void setWorkout(String workout) {
		this.workout = workout;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getIntensity() {
		return intensity;
	}

	public void setIntensity(int intensity) {
		this.intensity = intensity;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Workout [workoutId=" + workoutId + ", workout=" + workout + ", description=" + description
				+ ", intensity=" + intensity + ", duration=" + duration + "]";
	}
	
	
	
	
	

}
