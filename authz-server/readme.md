curl -X POST -d 'grant_type=password&username=user&password=password' --user 'trusted-client:password' http://localhost:8080/oauth/token



curl -H "Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1MzUwMTkyOTEsInVzZXJfbmFtZSI6InVzZXIiLCJhdXRob3JpdGllcyI6WyJST0xFX0FETUlOIl0sImp0aSI6IjdlY2E4OGZjLWZjYTYtNGRmNy1hZTI2LWFlZDA5YzhmZjUyZSIsImNsaWVudF9pZCI6InRydXN0ZWQtY2xpZW50Iiwic2NvcGUiOlsicmVhZCIsIndyaXRlIiwidHJ1c3QiXX0.xvUp9a43Sfe5ZvllmAVb2p-om-NYIk-EBrnLRzEHjUQ"  http://localhost:8080/api/v1/me