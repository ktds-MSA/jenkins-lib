def echoTest(){
	echo "test"
}
def call() {
	echo "test outer"
	echoTest
}
