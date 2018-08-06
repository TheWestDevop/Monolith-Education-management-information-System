/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

   $(document).ready(function(){
   $.ajax({
     type:'Post',
     url:'AllStudent',
     headers:{
         Accept:"application/json; charset=utf-8",
         "Content-Type" : "application/json; charset=utf-8"
     }, 
    // dataType:'json',
     success: function(data){
        var student = $.parseJSON(data);
         var s = '';
         var k = 1;
         for(var a = 0; a<student.length; a++){
             
         s+='<tr>';
         s+='<td>'+ student[a].StudentID +'</td>';
         s+='<td>'+ student[a].StudentFirstName+'&nbsp'+ student[a].StudentLastName+'</td>';
         s+='<td>'+ student[a].StudentClass+'</td>';
         s+='<td><button class="btn btn-primary">Edit</button><button class="btn btn-danger">Delete</button></td>';
         s+='</tr>';
         k++;
     
     }
    $('#Tcontent').append(s);
     
     }
    
             });
     var table = '#TableStudent';
    $('#maxRow').on('change',function(){
        $('.pagination').html('');
        var trnum = 0;
        var maxRows = parseInt($(this).val());
        var totalRows = $(table+'tbody tr').length;
        $(table+'tr:gt(0)').each(function(){
            trnum++;
            if(trnum > maxRows){
                $(this).hide();
            }
            if(trnum <= maxRows){
                $(this).show();
            }
            
        });
        if(totalRows > maxRows){
        var pagenum = Math.ceil(totalRows/maxRows);
        for(var i=1; i<=pagenum;){
            $('.pagination').append('<li data-page="'+ i +'">\<span>'+ i++ + '<span class="sr-only">(current)</span></span>\</li>').show();
            
        }        
            }
            $('.pagination li:first-child').addClass('active');
            $('.pagination li').on('click',function(){
                var pageNum = $(this).attr('data-page');
                var trIndex = 0;
                $('.pagination li').removeClass('active');
                $(this).addClass('active');
                $(table+'tr:gt(0)').each(function(){
                    trIndex++;
                    if(trIndex > (maxRows*pageNum) || trIndex <= ((maxRows*pageNum)- maxRows)){
                        $(this).hide();
                    }else{
                         $(this).show();
                    }
                });
                
            });
    });
     $(function(){
        $('table tr:eq(0)').prepend('<th>No</th>');
        var id = 0;
        $('table tr:gt(0)').each(function(){
            id++;
            $(this).prepend('<td>'+id+'</td>');
        });
    });
 
         });