@SET /P dockerCmd=docker cmd :
@echo cmd:%dockerCmd%

@SET cmd=""
if "%dockerCmd%"=="build" (
	@SET cmd="docker build -t imageName ."
)
if "%dockerCmd%"=="run" (
	@SET cmd="docker run -d --rm --name Name -p outerport:innerport image"
)
@echo %cmd%

