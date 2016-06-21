$('#autocomplete').select2({
   ajax: {
       url: function (params) {
           return 'https://glacial-brook-71360.herokuapp.com/companies/' + params.term;
       },
       dataType: 'json',
       delay: 250,
       data: function () {
           return {};
       },
       processResults: function (data) {
           return {
               results: data.map(function(company) {
                   return {
                       id: company.name,
                       text: company.name
                   };
               })
           };
       },
       cache: true
   },
   minimumInputLength: 1
});