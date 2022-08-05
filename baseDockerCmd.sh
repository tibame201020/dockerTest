echo cmd : $1

case $1 in
	build)
		echo "docker build -t imageName .";;
	run)
		echo "docker run -d --rm --name Name -p outerport:innerport image";;
	*)
		echo "";;

	esac
