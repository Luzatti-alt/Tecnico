const int trigPin_1 = 9;
const int echoPin_1 = 10;
const int trigPin_2 = 5;
const int echoPin_2 = 6;
long duration_entrada;
int distance_entrada;
long duration_saida;
int distance_saida;
void setup() {
  pinMode(trigPin_1, OUTPUT); //trigPin Output  
  pinMode(echoPin_1, INPUT); //echoPin Input  
  pinMode(trigPin_2, OUTPUT); //trigPin Output  
  pinMode(echoPin_2, INPUT); //echoPin Input  
  Serial.begin(9600);}
  void loop() {  // Clears the trigPin  
  digitalWrite(trigPin_1, LOW);
  delayMicroseconds(2); // Sets the trigPin on HIGH state for 10 micro seconds  
  digitalWrite(trigPin_1, HIGH);
  delayMicroseconds(10);
  digitalWrite(trigPin_1, LOW); // Reads the echoPin, returns the sound wave travel time in microseconds   
  digitalWrite(trigPin_2, LOW);
  delayMicroseconds(2); // Sets the trigPin on HIGH state for 10 micro seconds  digitalWrite(trigPin_2, HIGH);  
  delayMicroseconds(10);
  digitalWrite(trigPin_2, LOW);
  duration_saida = pulseIn(echoPin_2, HIGH);
  distance_saida = duration_saida * 0.034 / 2;//calculo da distancia
  duration_entrada = pulseIn(echoPin_1, HIGH);
  distance_entrada = duration_entrada * 0.034 / 2;//calculo da distancia  
  Serial.print("Distância_ENTRADA: ");
  Serial.println(distance_entrada);  
  Serial.print("Distância_SAÍDA: ");  
  Serial.println(distance_saida);  
  if((duration_entrada>0)&&(duration_saida==0)){
    Serial.println("entrada");
     }else{Serial.println("saida");}}
