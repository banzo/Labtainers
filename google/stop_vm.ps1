If ($args.Count -ne 1){
    echo "stop_vm.ps1 <user ID>"
    exit
}
$user=$args[0]
$vm=$user+"-labtainervm"
gcloud -q compute instances stop $vm_name 
