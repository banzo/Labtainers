If ($args.Count -ne 1){
    echo "restart.ps1 <user ID>"
    exit
}
$user=$args[0]
./checktunnel.sh $user 
echo "Point your browser to http://localhost:6901"
