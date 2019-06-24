(window.webpackJsonp=window.webpackJsonp||[]).push([[0],{15:function(e,t,a){e.exports=a.p+"static/media/no_picture.6428f3d9.png"},25:function(e,t,a){e.exports=a(60)},31:function(e,t,a){},54:function(e,t,a){e.exports=a.p+"static/media/no_img.30e52bcb.svg"},55:function(e,t,a){},60:function(e,t,a){"use strict";a.r(t);var n=a(0),l=a.n(n),c=a(22),o=a.n(c),r=(a(31),a(3)),s=a(4),i=a(6),m=a(5),u=a(7),p=(a(33),a(63)),d=a(64),h=a(61),f=a(2),E=a.n(f),g=function(e){return l.a.createElement("tr",null,l.a.createElement("th",{scope:"row"},e.index),l.a.createElement("td",null,e.title),l.a.createElement("td",null,e.logo),l.a.createElement("td",null,e.success),l.a.createElement("td",null,l.a.createElement("img",{height:"150px",width:"200px",src:e.logo,alt:e.title})),l.a.createElement("td",{className:"d-flex justify-content-between"},e.children))},b=function(e){return l.a.createElement("button",{type:"button",onClick:e.action,className:"btn "+e.type},e.title)},v=a(11),y=function(e){function t(e){var a;return Object(r.a)(this,t),(a=Object(i.a)(this,Object(m.a)(t).call(this,e))).handleChange=function(e){a.setState(Object(v.a)({},e.target.name,e.target.value))},a.handleSubmit=function(e){e.preventDefault(),E.a.post("http://localhost:8081/brands",a.state).then(function(e){console.log(a.props.history),a.props.history.go("/")}).catch(function(e){return console.log(e)})},a.state={title:"",logo:"",category:"",size:0},a}return Object(u.a)(t,e),Object(s.a)(t,[{key:"render",value:function(){var e=this;return l.a.createElement("div",{className:"panel panel-default my-3"},l.a.createElement("div",{className:"panel-heading"},"Create new Brand"),l.a.createElement("div",{className:"panel-body"},l.a.createElement("form",{className:"form-inline",onSubmit:function(t){return e.handleSubmit(t)}},l.a.createElement("div",{className:"form-group mb-2"},l.a.createElement("input",{type:"text",placeholder:"Title",className:"form-control",name:"title",onChange:this.handleChange,required:!0})),l.a.createElement("div",{className:"form-group mb-2"},l.a.createElement("input",{type:"text",placeholder:"Logo",className:"form-control",name:"logo",onChange:this.handleChange,required:!0})),l.a.createElement("div",{className:"form-group mb-2"},l.a.createElement("button",{className:"btn btn-success",type:"submit"},"Save")))))}}]),t}(n.Component),N=(a(54),function(e){function t(e){var a;return Object(r.a)(this,t),(a=Object(i.a)(this,Object(m.a)(t).call(this,e))).getAllData=function(){E.a.get("http://localhost:8081/api/brands").then(function(e){console.log(e.data),a.setState({brands:e.data})}).catch(function(e){console.log(e)})},a.onDeleteClickHandler=function(e){E.a.delete("http://localhost:8081/api/brands/"+e).then(function(e){console.log(e),a.getAllData()}).catch(function(e){console.log(e)})},a.onDetailsClickHandler=function(e){a.props.history.push("/brands/"+e)},a.showAllData=function(){return a.state.brands.map(function(e,t){return l.a.createElement(g,Object.assign({key:e.title,index:t+1,title:e.title,logo:e.logo,success:e.success},a.props),l.a.createElement(b,{title:"Details",action:function(){return a.onDetailsClickHandler(e.title)},type:"btn-success"}),l.a.createElement(b,{title:"Delete",action:function(){return a.onDeleteClickHandler(e.title)},type:"btn-warning"}))})},a.state={brands:[]},a}return Object(u.a)(t,e),Object(s.a)(t,[{key:"componentDidMount",value:function(){this.getAllData()}},{key:"render",value:function(){return l.a.createElement("div",{className:"container"},l.a.createElement("div",{className:"row"},l.a.createElement(y,this.props)),l.a.createElement("div",{className:"row"},l.a.createElement("table",{className:"table table-striped table-dark"},l.a.createElement("thead",null,l.a.createElement("tr",null,l.a.createElement("th",{scope:"col"},"#"),l.a.createElement("th",{scope:"col"},"Title"),l.a.createElement("th",{scope:"col"},"Logo"),l.a.createElement("th",{scope:"col"},"Success"),l.a.createElement("th",{scope:"col"},"Model2"),l.a.createElement("th",{scope:"col"},"Information"))),l.a.createElement("tbody",null,this.showAllData()))))}}]),t}(n.Component)),C=a(65),j=(a(55),function(){return l.a.createElement("div",{className:"navigation"},l.a.createElement("ul",{className:"navigation_ul"},l.a.createElement("li",null,l.a.createElement(C.a,{to:"/"},l.a.createElement("div",null,"Car Brands"))),l.a.createElement("li",null,l.a.createElement(C.a,{to:"/dealers"},l.a.createElement("div",null,"Car Dealers"))),l.a.createElement("li",null,l.a.createElement(C.a,{to:"/cars"},l.a.createElement("div",null,"Cars")))))}),k=function(e){return l.a.createElement("tr",null,l.a.createElement("th",{scope:"row"},e.index),l.a.createElement("td",null,e.title),l.a.createElement("td",null,e.type),l.a.createElement("td",null,e.country),l.a.createElement("td",null,l.a.createElement("img",{height:"150px",width:"200px",src:e.picture,alt:e.title})),l.a.createElement("td",{className:"d-flex justify-content-between"},e.children))},O=function(e){return l.a.createElement("div",null,l.a.createElement("div",{className:"card text-white bg-dark mb-3",style:{width:"18rem"}},l.a.createElement("img",{className:"card-img-top",src:e.logo,alt:e.title}),l.a.createElement("div",{className:"card-body"},l.a.createElement("h5",{className:"card-title"},e.title),l.a.createElement("p",{className:"card-text"},e.logo),l.a.createElement("p",{className:"card-text"},e.success),l.a.createElement("div",{className:"d-flex justify-content-between"},e.children))))},w=a(15),D=a.n(w),x=function(e){function t(e){var a;return Object(r.a)(this,t),(a=Object(i.a)(this,Object(m.a)(t).call(this,e))).getAllPerformers=function(){E.a.get("http://localhost:8081/kodas-java/api/studios/"+a.props.match.params.title+"/all-performers").then(function(e){console.log(e.data),a.setState({performers:e.data})}).catch(function(e){console.log(e)})},a.onClickGoBackHandler=function(){a.props.history.goBack()},a.onClickUpdateHandler=function(){a.props.history.push("/studios/update/"+a.props.match.params.title)},a.onDeleteClickHandler=function(e){E.a.delete("http://localhost:8081/kodas-java/api/studios/"+a.state.service.title+"/"+e).then(function(e){console.log(e),a.getAllPerformers()}).catch(function(e){console.log(e)})},a.showAllData=function(){return a.state.performers.map(function(e,t){var n;return n="null"===e.picture||null===e.picture?D.a:e.picture,l.a.createElement(k,Object.assign({key:e.title,index:t+1,title:e.title,firstName:e.firstName,lastName:e.lastName,genre:e.genre,country:e.country,dob:e.dob,picture:n},a.props),l.a.createElement(b,{title:"Delete",action:function(){return a.onDeleteClickHandler(e.title)},type:"btn-warning"}))})},a.state={studio:"",performers:[]},a}return Object(u.a)(t,e),Object(s.a)(t,[{key:"componentDidMount",value:function(){var e=this;E.a.get("http://localhost:8081/kodas-java/api/studios/"+this.props.match.params.title).then(function(t){console.log(t.data),e.setState({studio:t.data})}).catch(function(e){console.log(e)}),this.getAllPerformers()}},{key:"render",value:function(){var e,t;switch(e="null"===this.state.studio.logo||null===this.state.studio.logo?D.a:this.state.studio.logo,this.state.studio.category){case 0:t="National";break;case 1:t="Home";break;case 2:t="Live"}return l.a.createElement("div",{className:"container my-3"},l.a.createElement("div",{className:"row d-flex justify-content-center"},l.a.createElement(O,{title:this.state.studio.title,category:t,size:this.state.studio.size,logo:e},l.a.createElement(b,{title:"Go Back",type:"btn-warning",action:this.onClickGoBackHandler}),l.a.createElement(b,{title:"Update",type:"btn-warning",action:this.onClickUpdateHandler}))),l.a.createElement("div",null,l.a.createElement("table",{className:"table table-striped table-dark"},l.a.createElement("thead",null,l.a.createElement("tr",null,l.a.createElement("th",{scope:"col"},"#"),l.a.createElement("th",{scope:"col"},"Title"),l.a.createElement("th",{scope:"col"},"First name"),l.a.createElement("th",{scope:"col"},"Last name"),l.a.createElement("th",{scope:"col"},"Genre"),l.a.createElement("th",{scope:"col"},"Country"),l.a.createElement("th",{scope:"col"},"DOB"),l.a.createElement("th",{scope:"col"},"Picture"),l.a.createElement("th",{scope:"col"},"Actions"))),l.a.createElement("tbody",null,this.showAllData()))))}}]),t}(n.Component),S=function(e){function t(e){var a;return Object(r.a)(this,t),(a=Object(i.a)(this,Object(m.a)(t).call(this,e))).handleChange=function(e){a.setState(Object(v.a)({},e.target.name,e.target.value))},a.handleSubmit=function(e){e.preventDefault(),console.log(a.state),E.a.post("http://localhost:8081/api/dealers",a.state).then(function(e){console.log(a.props.history),a.props.history.go("/dealers")}).catch(function(e){return console.log(e)})},a.state={title:"",type:"",country:""},a}return Object(u.a)(t,e),Object(s.a)(t,[{key:"render",value:function(){var e=this;return l.a.createElement("div",{className:"panel panel-default my-3"},l.a.createElement("div",{className:"panel-heading"},"Create new dealer"),l.a.createElement("div",{className:"panel-body"},l.a.createElement("form",{className:"form-inline",onSubmit:function(t){return e.handleSubmit(t)}},l.a.createElement("div",{className:"form-group mb-2"},l.a.createElement("input",{type:"text",placeholder:"Title",className:"form-control",name:"title",onChange:this.handleChange,required:!0})),l.a.createElement("div",{className:"form-group mb-2"},l.a.createElement("input",{type:"text",placeholder:"Type",className:"form-control",name:"firstName",onChange:this.handleChange,required:!0})),l.a.createElement("div",{className:"form-group mb-2"},l.a.createElement("input",{type:"text",placeholder:"Country",className:"form-control",name:"country",onChange:this.handleChange,required:!0})),l.a.createElement("div",{className:"form-group mb-2"},l.a.createElement("input",{type:"date",placeholder:"DOB",className:"form-control",name:"dob",onChange:this.handleChange})),l.a.createElement("div",{className:"form-group mb-2"},l.a.createElement("button",{className:"btn btn-success",type:"submit"},"Save")))))}}]),t}(n.Component),A=(n.Component,function(e){function t(e){var a;return Object(r.a)(this,t),(a=Object(i.a)(this,Object(m.a)(t).call(this,e))).getAllData=function(){E.a.get("http://localhost:8081/api/dealers").then(function(e){a.setState({dealers:e.data})}).catch(function(e){console.log(e)})},a.onDeleteClickHandler=function(e){console.log(e),E.a.delete("http://localhost:8081/api/dealers/"+e).then(function(t){console.log("Deleting: "+e),a.getAllData()}).catch(function(e){console.log(e)})},a.showAllData=function(){return a.state.dealers.map(function(e,t){return l.a.createElement(k,Object.assign({key:e.title,index:t+1,title:e.title,type:e.type,country:e.country},a.props),l.a.createElement(b,{title:"Delete",action:function(){return a.onDeleteClickHandler(e.title)},type:"btn-warning"}))})},a.componentDidMount=function(){a.getAllData()},a.state={dealers:[]},a}return Object(u.a)(t,e),Object(s.a)(t,[{key:"render",value:function(){return l.a.createElement("div",{className:"container"},l.a.createElement("div",{className:"row my-3"},l.a.createElement(S,this.props)),l.a.createElement("div",{className:"row"},l.a.createElement("table",{className:"table table-striped table-dark"},l.a.createElement("thead",null,l.a.createElement("tr",null,l.a.createElement("th",{scope:"col"},"#"),l.a.createElement("th",{scope:"col"},"Title"),l.a.createElement("th",{scope:"col"},"Type"),l.a.createElement("th",{scope:"col"},"Country"),l.a.createElement("th",{scope:"col"},"Town"),l.a.createElement("th",{scope:"col"},"Name"),l.a.createElement("th",{scope:"col"},"DOB"),l.a.createElement("th",{scope:"col"},"Picture"),l.a.createElement("th",{scope:"col"},"Actions"))),l.a.createElement("tbody",null,this.showAllData()))))}}]),t}(n.Component)),B=function(e){return l.a.createElement("tr",null,l.a.createElement("th",{scope:"row"},e.index),l.a.createElement("td",null,e.brand),l.a.createElement("td",null,e.fuel),l.a.createElement("td",null,e.price),l.a.createElement("td",null,l.a.createElement("img",{height:"150px",width:"200px",src:e.picture,alt:e.title})),l.a.createElement("td",{className:"d-flex justify-content-between"},e.children))},H=function(e){function t(e){var a;return Object(r.a)(this,t),(a=Object(i.a)(this,Object(m.a)(t).call(this,e))).handleChange=function(e){a.setState(Object(v.a)({},e.target.name,e.target.value))},a.handleSubmit=function(e){e.preventDefault(),console.log(a.state),E.a.post("http://localhost:8081/api/cars",a.state).then(function(e){console.log(a.props.history),a.props.history.go("/cars")}).catch(function(e){return console.log(e)})},a.state={brand:"",fuel:"",price:""},a}return Object(u.a)(t,e),Object(s.a)(t,[{key:"render",value:function(){var e=this;return l.a.createElement("div",{className:"panel panel-default my-3"},l.a.createElement("div",{className:"panel-heading"},"Add new car"),l.a.createElement("div",{className:"panel-body"},l.a.createElement("form",{className:"form-inline",onSubmit:function(t){return e.handleSubmit(t)}},l.a.createElement("div",{className:"form-group mb-2"},l.a.createElement("input",{type:"text",placeholder:"Brand",className:"form-control",name:"brand",onChange:this.handleChange,required:!0})),l.a.createElement("div",{className:"form-group mb-2"},l.a.createElement("input",{type:"text",placeholder:"Fuel",className:"form-control",name:"fuel",onChange:this.handleChange,required:!0})),l.a.createElement("div",{className:"form-group mb-2"},l.a.createElement("input",{type:"number",placeholder:"Price",className:"form-control",name:"price",onChange:this.handleChange,required:!0})),l.a.createElement("div",{className:"form-group mb-2"},l.a.createElement("button",{className:"btn btn-success",type:"submit"},"Save")))))}}]),t}(n.Component),P=function(e){function t(e){var a;return Object(r.a)(this,t),(a=Object(i.a)(this,Object(m.a)(t).call(this,e))).getAllData=function(){E.a.get("http://localhost:8081/api/cars").then(function(e){a.setState({cars:e.data})}).catch(function(e){console.log(e)})},a.onDeleteClickHandler=function(e){console.log(e),E.a.delete("http://localhost:8081/api/cars/"+e).then(function(t){console.log("Deleting: "+e),a.getAllData()}).catch(function(e){console.log(e)})},a.showAllData=function(){return a.state.cars.map(function(e,t){return l.a.createElement(B,Object.assign({key:e.brand,index:t+1,brand:e.brand,fuel:e.fuel,price:e.price},a.props),l.a.createElement(b,{title:"Delete",action:function(){return a.onDeleteClickHandler(e.brand)},type:"btn-warning"}))})},a.componentDidMount=function(){a.getAllData()},a.state={cars:[]},a}return Object(u.a)(t,e),Object(s.a)(t,[{key:"render",value:function(){return l.a.createElement("div",{className:"container"},l.a.createElement("div",{className:"row my-3"},l.a.createElement(H,this.props)),l.a.createElement("div",{className:"row"},l.a.createElement("table",{className:"table table-striped table-dark"},l.a.createElement("thead",null,l.a.createElement("tr",null,l.a.createElement("th",{scope:"col"},"#"),l.a.createElement("th",{scope:"col"},"Brand"),l.a.createElement("th",{scope:"col"},"Fuel"),l.a.createElement("th",{scope:"col"},"Price"),l.a.createElement("th",{scope:"col"},"Genre"),l.a.createElement("th",{scope:"col"},"Country"),l.a.createElement("th",{scope:"col"},"DOB"),l.a.createElement("th",{scope:"col"},"Picture"),l.a.createElement("th",{scope:"col"},"Actions"))),l.a.createElement("tbody",null,this.showAllData()))))}}]),t}(n.Component),q=function(e){function t(e){var a;return Object(r.a)(this,t),(a=Object(i.a)(this,Object(m.a)(t).call(this,e))).componentDidMount=function(){E.a.get("http://localhost:8081/kodas-java/api/studios/"+a.props.match.params.title).then(function(e){console.log(e.data),a.setState(e.data)}).catch(function(e){return console.log(e)}),E.a.get("http://localhost:8081/kodas-java/api/performers").then(function(e){return a.setState({performers:e.data})}).catch()},a.handleChange=function(e){a.setState(Object(v.a)({},e.target.name,e.target.value))},a.handleSubmit=function(e){e.preventDefault(),E.a.put("http://localhost:8081/kodas-java/api/studios/"+a.props.match.params.title,a.state).then(function(e){a.props.history.goBack()}).catch(function(e){return console.log(e)})},a.goBack=function(){a.props.history.goBack()},a.availablePerformance=function(){return a.state.performers.map(function(e){return l.a.createElement("option",{key:e.title,value:e.title},e.title)})},a.onClickAddPerformer=function(){E.a.put("http://localhost:8081/kodas-java/api/studios/"+a.props.match.params.title+"/"+a.state.performer).then(function(e){return console.log(e)}).catch(function(e){return console.log(e)})},a.state={title:"",logo:"",category:"Home",size:0,performers:[],performer:""},a}return Object(u.a)(t,e),Object(s.a)(t,[{key:"render",value:function(){var e=this;return l.a.createElement("div",{className:"panel panel-default my-3"},l.a.createElement("div",{className:"panel-heading"},"Update Service"),l.a.createElement("div",{className:"panel-body"},l.a.createElement("form",{className:"form-inline",onSubmit:function(t){return e.handleSubmit(t)}},l.a.createElement("div",{className:"form-group mb-2"},l.a.createElement("input",{disabled:!0,type:"text",placeholder:"Title",className:"form-control",name:"title",value:this.state.title,onChange:this.handleChange,required:!0})),l.a.createElement("div",{className:"form-group mb-2"},l.a.createElement("input",{type:"text",placeholder:"Logo",className:"form-control",name:"logo",value:this.state.logo,onChange:this.handleChange,required:!0})),l.a.createElement("div",{className:"form-group mb-2"},l.a.createElement("select",{required:!0,id:"inlineFormCustomSelect",placeholder:"Category",className:"form-control",name:"category",value:this.state.category,onChange:this.handleChange},l.a.createElement("option",{defaultValue:!0,disabled:!0},"Category..."),l.a.createElement("option",{value:"National"},"National"),l.a.createElement("option",{value:"Home"},"Home"),l.a.createElement("option",{value:"Live"},"Live"))),l.a.createElement("div",{className:"form-group mb-2"},l.a.createElement("input",{type:"number",step:"0.01",placeholder:"Size",className:"form-control",name:"size",value:this.state.size,onChange:this.handleChange,required:!0})),l.a.createElement("div",{className:"form-group mb-2"},l.a.createElement("button",{className:"btn btn-success",type:"submit"},"Save"),l.a.createElement("button",{className:"btn btn-warning mx-3",type:"button",onClick:function(){return e.goBack()}},"Back")))),l.a.createElement("div",null,"Add Performer"),l.a.createElement("div",{className:"form-group mb-8"},l.a.createElement("select",{id:"inlineFormCustomSelect",className:"form-control",name:"performer",value:this.state.performers,onChange:this.handleChange},l.a.createElement("option",{defaultValue:!0,hidden:!0},"Choose here"),this.availablePerformance()),l.a.createElement("button",{className:"btn btn-warning",onClick:function(){return e.onClickAddPerformer()}},"Add")))}}]),t}(n.Component),T=function(){return l.a.createElement("div",null,l.a.createElement(p.a,null,l.a.createElement("div",null,l.a.createElement(j,null),l.a.createElement(d.a,null,l.a.createElement(h.a,{path:"/",exact:!0,component:N}),l.a.createElement(h.a,{path:"/studios/:title",component:x,exact:!0}),l.a.createElement(h.a,{path:"/dealers",component:A,exact:!0}),l.a.createElement(h.a,{path:"/cars",component:P,exact:!0}),l.a.createElement(h.a,{path:"/studios/update/:title",component:q,exact:!0})))))},z=function(e){function t(){return Object(r.a)(this,t),Object(i.a)(this,Object(m.a)(t).apply(this,arguments))}return Object(u.a)(t,e),Object(s.a)(t,[{key:"render",value:function(){return l.a.createElement("div",null,l.a.createElement(T,null))}}]),t}(n.Component);Boolean("localhost"===window.location.hostname||"[::1]"===window.location.hostname||window.location.hostname.match(/^127(?:\.(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}$/));o.a.render(l.a.createElement(z,null),document.getElementById("root")),"serviceWorker"in navigator&&navigator.serviceWorker.ready.then(function(e){e.unregister()})}},[[25,2,1]]]);
//# sourceMappingURL=main.d789dbac.chunk.js.map