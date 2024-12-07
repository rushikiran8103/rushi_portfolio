# RUSHIKIRAN PORTFOLIO

## git initial commands
```bash
…or create a new repository on the command line
echo "# rushi_portfolio" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/rushikiran8103/rushi_portfolio.git
git push -u origin main
```

## default endpoint
```java
@GetMapping("/")
	
	public String base_port() 
	{
		return "base_port";
		
	}
```
## resume endpoint
```java
	@GetMapping("/resume")
	public String resume() {
		return "resume";
	}
```
